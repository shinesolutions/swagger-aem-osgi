package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties   {
  
  private ConfigNodePropertyString providerRoots;

  private ConfigNodePropertyString kind;

  /**
   **/
  public OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties providerRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("provider.roots")
  public ConfigNodePropertyString getProviderRoots() {
    return providerRoots;
  }
  public void setProviderRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
  }


  /**
   **/
  public OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties kind(ConfigNodePropertyString kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("kind")
  public ConfigNodePropertyString getKind() {
    return kind;
  }
  public void setKind(ConfigNodePropertyString kind) {
    this.kind = kind;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties = (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties) o;
    return Objects.equals(this.providerRoots, orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.providerRoots) &&
        Objects.equals(this.kind, orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoots, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties {\n");
    
    sb.append("    providerRoots: ").append(toIndentedString(providerRoots)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

