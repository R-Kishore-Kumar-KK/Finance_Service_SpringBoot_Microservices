package com.kk.finance.api_gateway.security;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class JwtFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		String path = exchange.getRequest().getURI().getPath();

        // Skip auth for login & register
        if (path.contains("/login") || path.contains("/register")) {
            return chain.filter(exchange);
        }

        String authHeader = exchange.getRequest().getHeaders().getFirst("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            throw new RuntimeException("Missing Authorization Header");
        }

        String token = authHeader.substring(7);

        try {
            JwtUtil.validateToken(token);
        } catch (Exception e) {
            throw new RuntimeException("Invalid Token");
        }

        return chain.filter(exchange);
	}

	
}
