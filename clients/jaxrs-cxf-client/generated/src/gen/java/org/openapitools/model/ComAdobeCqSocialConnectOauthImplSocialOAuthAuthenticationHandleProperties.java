package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray path = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger serviceRanking = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyArray getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyArray path) {
    this.path = path;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties path(ConfigNodePropertyArray path) {
    this.path = path;
    return this;
  }

 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

