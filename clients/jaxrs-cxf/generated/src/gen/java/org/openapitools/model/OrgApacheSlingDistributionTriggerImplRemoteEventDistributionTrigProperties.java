package org.openapitools.model;

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

public class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString endpoint = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString transportSecretProviderTarget = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get endpoint
   * @return endpoint
  **/
  @JsonProperty("endpoint")
  public ConfigNodePropertyString getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(ConfigNodePropertyString endpoint) {
    this.endpoint = endpoint;
  }

  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties endpoint(ConfigNodePropertyString endpoint) {
    this.endpoint = endpoint;
    return this;
  }

 /**
   * Get transportSecretProviderTarget
   * @return transportSecretProviderTarget
  **/
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    transportSecretProviderTarget: ").append(toIndentedString(transportSecretProviderTarget)).append("\n");
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

