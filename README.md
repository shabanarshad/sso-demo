  In this demo, i will explain you how i configured the SSO using Spring Security OAuth and Spring Boot, using Keycloak as the Authorization Server.
  I have used 4 separate applications:
    
    - An Authorization Server(KeyClock) – which is the central authentication mechanism
    - A Resource Server – the provider of rest api's
    - Two Client Applications – the applications using SSO
  when users try to access a resource via one Client app, they’ll be redirected to authenticate through the Authorization Server. Keycloak will sign the user in, and while still being logged in the first app,
  if the second Client app is accessed using the same browser, the user will not need to enter their credentials again.
  
  I am going to use the Authorization Code grant type out of OAuth2 to drive the delegation of authentication.
