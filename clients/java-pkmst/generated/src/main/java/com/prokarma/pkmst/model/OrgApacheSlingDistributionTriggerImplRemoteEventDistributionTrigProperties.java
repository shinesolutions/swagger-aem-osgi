package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("endpoint")
  private ConfigNodePropertyString endpoint = null;

  @JsonProperty("transportSecretProvider.target")
  private ConfigNodePropertyString transportSecretProviderTarget = null;

  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties endpoint(ConfigNodePropertyString endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(ConfigNodePropertyString endpoint) {
    this.endpoint = endpoint;
  }

  public OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

   /**
   * Get transportSecretProviderTarget
   * @return transportSecretProviderTarget
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

