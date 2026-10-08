package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties   {
  
  private ConfigNodePropertyString javaNamingFactoryInitial;

  private ConfigNodePropertyString javaNamingProviderUrl;

  /**
   **/
  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("java.naming.factory.initial")
  public ConfigNodePropertyString getJavaNamingFactoryInitial() {
    return javaNamingFactoryInitial;
  }
  public void setJavaNamingFactoryInitial(ConfigNodePropertyString javaNamingFactoryInitial) {
    this.javaNamingFactoryInitial = javaNamingFactoryInitial;
  }


  /**
   **/
  public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties javaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("java.naming.provider.url")
  public ConfigNodePropertyString getJavaNamingProviderUrl() {
    return javaNamingProviderUrl;
  }
  public void setJavaNamingProviderUrl(ConfigNodePropertyString javaNamingProviderUrl) {
    this.javaNamingProviderUrl = javaNamingProviderUrl;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

