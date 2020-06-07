package com.javainterviewpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	/*
	 * @Autowired private DataSource dataSource;
	 */

	/*
	 * @Bean
	 * 
	 * @ConfigurationProperties("spring.datasource") public DataSource ds() { return
	 * DataSourceBuilder.create().build(); }
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.httpBasic().and().authorizeRequests().anyRequest().authenticated(); }
	 * 
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 * throws Exception { auth.jdbcAuthentication().dataSource(dataSource)
	 * .authoritiesByUsernameQuery("select USERNAME, ROLE from EMPLOYEE where USERNAME=?"
	 * )
	 * .usersByUsernameQuery("select USERNAME, PASSWORD, 1 as enabled  from EMPLOYEE where USERNAME=?"
	 * ); }
	 * 
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 */
	
	private UserPrincipalDetailsService userPrincipalDetailsService;

    public SpringSecurityConfig(UserPrincipalDetailsService userPrincipalDetailsService) {
        this.userPrincipalDetailsService = userPrincipalDetailsService;
    }
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) {
	        auth.authenticationProvider(authenticationProvider());
	    }

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .authorizeRequests()
	                .antMatchers("/index.html").permitAll()
	                .antMatchers("/profile/**").authenticated()
	                .antMatchers("/admin/**").hasRole("ADMIN")
	                .antMatchers("/user").hasRole("USER")
	                .antMatchers("/management/**").hasAnyRole("ADMIN", "MANAGER")
	                .antMatchers("/api/public/test1").hasAuthority("ACCESS_TEST1")
	                .antMatchers("/api/public/test2").hasAuthority("ACCESS_TEST2")
	                .antMatchers("/api/public/users").hasRole("ADMIN")
	                .and()
	                .httpBasic();
	    }

	    @Bean
	    DaoAuthenticationProvider authenticationProvider(){
	        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
	        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
	        daoAuthenticationProvider.setUserDetailsService(this.userPrincipalDetailsService);

	        return daoAuthenticationProvider;
	    }

	    @Bean
	    PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

}