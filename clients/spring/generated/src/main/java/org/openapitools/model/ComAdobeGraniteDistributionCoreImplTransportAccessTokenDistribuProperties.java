package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("userId")
  private ConfigNodePropertyString userId = null;

  @JsonProperty("accessTokenProvider.target")
  private ConfigNodePropertyString accessTokenProviderTarget = null;

  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties userId(ConfigNodePropertyString userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getUserId() {
    return userId;
  }

  public void setUserId(ConfigNodePropertyString userId) {
    this.userId = userId;
  }

  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties accessTokenProviderTarget(ConfigNodePropertyString accessTokenProviderTarget) {
    this.accessTokenProviderTarget = accessTokenProviderTarget;
    return this;
  }

  /**
   * Get accessTokenProviderTarget
   * @return accessTokenProviderTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

