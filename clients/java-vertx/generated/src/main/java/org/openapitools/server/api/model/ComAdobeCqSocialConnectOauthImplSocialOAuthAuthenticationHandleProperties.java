package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties   {
  
  private ConfigNodePropertyArray path = null;
  private ConfigNodePropertyInteger serviceRanking = null;

  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties () {

  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties (ConfigNodePropertyArray path, ConfigNodePropertyInteger serviceRanking) {
    this.path = path;
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyArray getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties = (ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties) o;
    return Objects.equals(path, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.path) &&
        Objects.equals(serviceRanking, comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.serviceRanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
