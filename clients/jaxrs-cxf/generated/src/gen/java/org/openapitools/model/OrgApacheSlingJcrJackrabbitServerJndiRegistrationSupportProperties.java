package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString javaNamingFactoryInitial;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString javaNamingProviderUrl;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties = (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties) o;
    return Objects.equals(this.javaNamingFactoryInitial, orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.javaNamingFactoryInitial) &&
        Objects.equals(this.javaNamingProviderUrl, orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.javaNamingProviderUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(javaNamingFactoryInitial, javaNamingProviderUrl);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

