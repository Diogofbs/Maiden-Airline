package com.MaidenAirlineProject.security.jsonWT;

import com.MaidenAirlineProject.security.models.BackofficeDetailsModel;
import com.MaidenAirlineProject.security.models.ClientDetailsModel;
import com.MaidenAirlineProject.security.tibcoToDB.UsersDetails_services;
import com.auth0.jwt.JWT;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.auth0.jwt.algorithms.Algorithm.HMAC512;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

    private UsersDetails_services users;

    public JwtAuthorizationFilter(AuthenticationManager authenticationManager, UsersDetails_services users) {
        super(authenticationManager);
        this.users = users;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Read the Authorization header, where the JWT token should be
        String header = request.getHeader(JwtProperties.HEADER_STRING);

        // If header does not contain BEARER(PREFIX) or is null delegate to Spring impl and exit
        if (header == null || !header.startsWith(JwtProperties.TOKEN_PREFIX)) {
            chain.doFilter(request, response);
            return;
        }

        // If header is present, try grab BackofficeDetailsModel from database and perform authorization
        Authentication authentication = getUsernamePasswordAuthentication(request);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Continue filter execution
        chain.doFilter(request, response);

    }

    private Authentication getUsernamePasswordAuthentication(HttpServletRequest request) {

        //remove PREFIX from token
        String token = request.getHeader(JwtProperties.HEADER_STRING)
                .replace(JwtProperties.TOKEN_PREFIX,"");

        if (token != null) {
            // parse the token and validate it
            String userName = JWT.require(HMAC512(JwtProperties.SECRET.getBytes()))
                    .build()
                    .verify(token)
                    .getSubject();

            if (userName != null) {

                if(userName.contains("@")){
                    ClientDetailsModel client = (ClientDetailsModel) this.users.loadUserByUsername(userName);
                    UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userName, null, client.getAuthorities());
                    return auth;
                }else{
                    BackofficeDetailsModel employee = (BackofficeDetailsModel) this.users.loadUserByUsername(userName);
                    UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userName, null, employee.getAuthorities());
                    return auth;
                }
            }
        }
        return null;
    }
}
