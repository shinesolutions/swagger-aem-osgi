package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString javaNamingFactoryInitial = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString javaNamingProviderUrl = null;
 /**
   * Get javaNamingFactoryInitial
   * @return javaNamingFactoryInitial
  **/
  @JsonProperty("java.naming.factory.initial")
  public ConfigNodePropertyString getJavaNamingFactoryInitial() {
    return javaNamingFactoryInitial;
  }

  public void setJavaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
  }

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
    return this;
  }

 /**
   * Get javaNamingProviderUrl
   * @return javaNamingProviderUrl
  **/
  @JsonProperty("java.naming.provider.url")
  public ConfigNodePropertyString getJavaNamingProviderUrl() {
    return javaNamingProviderUrl;
  }

  public void setJavaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
  }

  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {\n");
    
    sb.append("    javaNamingFactoryInitial: ").append(toIndentedString(javaNamingFactoryInitial)).append("\n");
    sb.append("    javaNamingProviderUrl: ").append(toIndentedString(javaNamingProviderUrl)).append("\n");
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

