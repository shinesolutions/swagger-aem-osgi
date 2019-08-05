package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties   {
  
  private ConfigNodePropertyString providerName = null;
  private ConfigNodePropertyBoolean forwardRequests = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("forward.requests")
  public ConfigNodePropertyBoolean getForwardRequests() {
    return forwardRequests;
  }
  public void setForwardRequests(ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

