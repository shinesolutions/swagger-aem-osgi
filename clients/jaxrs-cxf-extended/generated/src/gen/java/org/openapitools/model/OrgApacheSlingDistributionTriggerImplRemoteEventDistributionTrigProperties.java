package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString endpoint;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString transportSecretProviderTarget;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get endpoint
  * @return endpoint
  */
  @JsonProperty("endpoint")
  public ConfigNodePropertyString getEndpoint() {
    return endpoint;
  }

  /**
   * Sets the <code>endpoint</code> property.
   */
 public void setEndpoint(ConfigNodePropertyString endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * Sets the <code>endpoint</code> property.
   */
  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties endpoint(ConfigNodePropertyString endpoint) {
    this.endpoint = endpoint;
    return this;
  }

 /**
  * Get transportSecretProviderTarget
  * @return transportSecretProviderTarget
  */
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  /**
   * Sets the <code>transportSecretProviderTarget</code> property.
   */
 public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  /**
   * Sets the <code>transportSecretProviderTarget</code> property.
   */
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

