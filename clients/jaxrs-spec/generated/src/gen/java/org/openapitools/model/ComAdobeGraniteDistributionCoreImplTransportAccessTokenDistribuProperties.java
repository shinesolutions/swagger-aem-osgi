package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties   {
  private ConfigNodePropertyString name;
  private ConfigNodePropertyString serviceName;
  private ConfigNodePropertyString userId;
  private ConfigNodePropertyString accessTokenProviderTarget;

  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties() {
  }

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  @Valid public ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceName")
  @Valid public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("serviceName")
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties userId(ConfigNodePropertyString userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  @Valid public ConfigNodePropertyString getUserId() {
    return userId;
  }

  @JsonProperty("userId")
  public void setUserId(ConfigNodePropertyString userId) {
    this.userId = userId;
  }

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties accessTokenProviderTarget(ConfigNodePropertyString accessTokenProviderTarget) {
    this.accessTokenProviderTarget = accessTokenProviderTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accessTokenProvider.target")
  @Valid public ConfigNodePropertyString getAccessTokenProviderTarget() {
    return accessTokenProviderTarget;
  }

  @JsonProperty("accessTokenProvider.target")
  public void setAccessTokenProviderTarget(ConfigNodePropertyString accessTokenProviderTarget) {
    this.accessTokenProviderTarget = accessTokenProviderTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties = (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties) o;
    return Objects.equals(this.name, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.name) &&
        Objects.equals(this.serviceName, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.serviceName) &&
        Objects.equals(this.userId, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.userId) &&
        Objects.equals(this.accessTokenProviderTarget, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.accessTokenProviderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serviceName, userId, accessTokenProviderTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accessTokenProviderTarget: ").append(toIndentedString(accessTokenProviderTarget)).append("\n");
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
