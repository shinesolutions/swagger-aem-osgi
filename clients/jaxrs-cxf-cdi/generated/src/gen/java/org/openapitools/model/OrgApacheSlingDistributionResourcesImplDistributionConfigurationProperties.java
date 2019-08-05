package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties   {
  
  private ConfigNodePropertyString providerRoots = null;

  private ConfigNodePropertyString kind = null;


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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties = (OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties) o;
    return Objects.equals(providerRoots, orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.providerRoots) &&
        Objects.equals(kind, orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties.kind);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

