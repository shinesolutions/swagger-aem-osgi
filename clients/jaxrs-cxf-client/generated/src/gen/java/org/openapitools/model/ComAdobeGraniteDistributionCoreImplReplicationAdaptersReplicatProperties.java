package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString providerName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean forwardRequests;
 /**
   * Get providerName
   * @return providerName
  **/
  @JsonProperty("providerName")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

 /**
   * Get forwardRequests
   * @return forwardRequests
  **/
  @JsonProperty("forward.requests")
  public ConfigNodePropertyBoolean getForwardRequests() {
    return forwardRequests;
  }

  public void setForwardRequests(ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
  }

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties forwardRequests(ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
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
    ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties = (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties) o;
    return Objects.equals(this.providerName, comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.providerName) &&
        Objects.equals(this.forwardRequests, comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.forwardRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, forwardRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {\n");
    
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    forwardRequests: ").append(toIndentedString(forwardRequests)).append("\n");
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

