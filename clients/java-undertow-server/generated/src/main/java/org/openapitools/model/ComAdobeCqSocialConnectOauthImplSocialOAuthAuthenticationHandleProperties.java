package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties   {
  
  private ConfigNodePropertyArray path = null;
  private ConfigNodePropertyInteger serviceRanking = null;

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties path(ConfigNodePropertyArray path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyArray getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

  /**
   **/
  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

