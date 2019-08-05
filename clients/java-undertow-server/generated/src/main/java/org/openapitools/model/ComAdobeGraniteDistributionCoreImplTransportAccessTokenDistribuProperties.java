package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString userId = null;
  private ConfigNodePropertyString accessTokenProviderTarget = null;

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
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
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
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
  public ConfigNodePropertyString getUserId() {
    return userId;
  }
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
  public ConfigNodePropertyString getAccessTokenProviderTarget() {
    return accessTokenProviderTarget;
  }
  public void setAccessTokenProviderTarget(ConfigNodePropertyString accessTokenProviderTarget) {
    this.accessTokenProviderTarget = accessTokenProviderTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties = (ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties) o;
    return Objects.equals(name, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.name) &&
        Objects.equals(serviceName, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.serviceName) &&
        Objects.equals(userId, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.userId) &&
        Objects.equals(accessTokenProviderTarget, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.accessTokenProviderTarget);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

