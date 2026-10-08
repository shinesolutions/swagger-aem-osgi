package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties   {
  @JsonProperty("providerName")
  private ConfigNodePropertyString providerName;

  @JsonProperty("forward.requests")
  private ConfigNodePropertyBoolean forwardRequests;

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("providerName")
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }
  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  /**
   **/
  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties forwardRequests(ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

