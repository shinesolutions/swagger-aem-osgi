package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    return Objects.equals(name, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.name) &&
        Objects.equals(serviceName, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.serviceName) &&
        Objects.equals(userId, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.userId) &&
        Objects.equals(accessTokenProviderTarget, comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.accessTokenProviderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serviceName, userId, accessTokenProviderTarget);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

