package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString providerName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean forwardRequests = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

