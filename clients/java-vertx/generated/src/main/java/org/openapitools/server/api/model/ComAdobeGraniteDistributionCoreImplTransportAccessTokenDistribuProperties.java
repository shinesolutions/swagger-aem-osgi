package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString userId = null;
  private ConfigNodePropertyString accessTokenProviderTarget = null;

  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties () {

  }

  public ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties (ConfigNodePropertyString name, ConfigNodePropertyString serviceName, ConfigNodePropertyString userId, ConfigNodePropertyString accessTokenProviderTarget) {
    this.name = name;
    this.serviceName = serviceName;
    this.userId = userId;
    this.accessTokenProviderTarget = accessTokenProviderTarget;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("userId")
  public ConfigNodePropertyString getUserId() {
    return userId;
  }
  public void setUserId(ConfigNodePropertyString userId) {
    this.userId = userId;
  }

    
  @JsonProperty("accessTokenProvider.target")
  public ConfigNodePropertyString getAccessTokenProviderTarget() {
    return accessTokenProviderTarget;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
