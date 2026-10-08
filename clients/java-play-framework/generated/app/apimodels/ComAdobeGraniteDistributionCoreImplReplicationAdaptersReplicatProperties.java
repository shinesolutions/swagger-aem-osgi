package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties   {
  @JsonProperty("providerName")
  @Valid

  private ConfigNodePropertyString providerName;

  @JsonProperty("forward.requests")
  @Valid

  private ConfigNodePropertyBoolean forwardRequests;

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties providerName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  public ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  public void setProviderName(ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties forwardRequests(ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
    return this;
  }

   /**
   * Get forwardRequests
   * @return forwardRequests
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

