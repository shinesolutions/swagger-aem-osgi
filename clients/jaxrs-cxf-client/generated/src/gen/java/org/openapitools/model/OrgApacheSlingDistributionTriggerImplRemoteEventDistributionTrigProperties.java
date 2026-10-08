package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString endpoint;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString transportSecretProviderTarget;
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties = (OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.name) &&
        Objects.equals(this.endpoint, orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.endpoint) &&
        Objects.equals(this.transportSecretProviderTarget, orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.transportSecretProviderTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, endpoint, transportSecretProviderTarget);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

