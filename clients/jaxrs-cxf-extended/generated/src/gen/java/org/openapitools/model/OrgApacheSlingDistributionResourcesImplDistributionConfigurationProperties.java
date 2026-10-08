package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString providerRoots;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString kind;
 /**
  * Get providerRoots
  * @return providerRoots
  */
  @JsonProperty("provider.roots")
  public ConfigNodePropertyString getProviderRoots() {
    return providerRoots;
  }

  /**
   * Sets the <code>providerRoots</code> property.
   */
 public void setProviderRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
  }

  /**
   * Sets the <code>providerRoots</code> property.
   */
  public OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties providerRoots(ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
    return this;
  }

 /**
  * Get kind
  * @return kind
  */
  @JsonProperty("kind")
  public ConfigNodePropertyString getKind() {
    return kind;
  }

  /**
   * Sets the <code>kind</code> property.
   */
 public void setKind(ConfigNodePropertyString kind) {
    this.kind = kind;
  }

  /**
   * Sets the <code>kind</code> property.
   */
  public OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties kind(ConfigNodePropertyString kind) {
    this.kind = kind;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

