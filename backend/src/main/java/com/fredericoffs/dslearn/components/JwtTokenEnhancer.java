package com.fredericoffs.dslearn.components;

import com.fredericoffs.dslearn.entities.User;
import com.fredericoffs.dslearn.repositories.UserRepository;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenEnhancer implements TokenEnhancer {

  @Autowired
  private UserRepository userRepository;

  @Override
  public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken,
      OAuth2Authentication oAuth2Authentication) {

    User user = userRepository.findByEmail(oAuth2Authentication.getName());

    Map<String, Object> map = new HashMap<>();
    map.put("userId", user.getId());
    map.put(("userName"), user.getName());

    DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) oAuth2AccessToken;
    token.setAdditionalInformation(map);
    return oAuth2AccessToken;
  }
}
