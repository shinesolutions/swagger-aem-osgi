package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties   {
  

  private ConfigNodePropertyString name = null;

  private ConfigNodePropertyString endpoint = null;

  private ConfigNodePropertyString transportSecretProviderTarget = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("endpoint")
  public ConfigNodePropertyString getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(ConfigNodePropertyString endpoint) {
    this.endpoint = endpoint;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }
  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
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
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.name) &&
        Objects.equals(endpoint, orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.endpoint) &&
        Objects.equals(transportSecretProviderTarget, orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties.transportSecretProviderTarget);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

