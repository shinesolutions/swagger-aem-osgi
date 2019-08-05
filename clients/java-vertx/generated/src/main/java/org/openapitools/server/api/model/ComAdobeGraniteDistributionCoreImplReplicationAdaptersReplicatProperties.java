package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties   {
  
  private ConfigNodePropertyString providerName = null;
  private ConfigNodePropertyBoolean forwardRequests = null;

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties () {

  }

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties (ConfigNodePropertyString providerName, ConfigNodePropertyBoolean forwardRequests) {
    this.providerName = providerName;
    this.forwardRequests = forwardRequests;
  }

    
  @JsonProperty("providerName")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }
  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

    
  @JsonProperty("forward.requests")
  public ConfigNodePropertyBoolean getForwardRequests() {
    return forwardRequests;
  }
  public void setForwardRequests(ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
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
    return Objects.equals(providerName, comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.providerName) &&
        Objects.equals(forwardRequests, comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.forwardRequests);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
