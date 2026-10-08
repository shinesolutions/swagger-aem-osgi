package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
 */

@JsonTypeName("orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hcName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hcMbeanName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString mbeanName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString attributeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString attributeValueConstraint;

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcName(@Nullable ConfigNodePropertyString hcName) {
    this.hcName = hcName;
    return this;
  }

  /**
   * Get hcName
   * @return hcName
   */
  @Valid 
  @Schema(name = "hc.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.name")
  public @Nullable ConfigNodePropertyString getHcName() {
    return hcName;
  }

  @JsonProperty("hc.name")
  public void setHcName(@Nullable ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public @Nullable ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  @JsonProperty("hc.tags")
  public void setHcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties hcMbeanName(@Nullable ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
    return this;
  }

  /**
   * Get hcMbeanName
   * @return hcMbeanName
   */
  @Valid 
  @Schema(name = "hc.mbean.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.mbean.name")
  public @Nullable ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }

  @JsonProperty("hc.mbean.name")
  public void setHcMbeanName(@Nullable ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties mbeanName(@Nullable ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
    return this;
  }

  /**
   * Get mbeanName
   * @return mbeanName
   */
  @Valid 
  @Schema(name = "mbean.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mbean.name")
  public @Nullable ConfigNodePropertyString getMbeanName() {
    return mbeanName;
  }

  @JsonProperty("mbean.name")
  public void setMbeanName(@Nullable ConfigNodePropertyString mbeanName) {
    this.mbeanName = mbeanName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeName(@Nullable ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * Get attributeName
   * @return attributeName
   */
  @Valid 
  @Schema(name = "attribute.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribute.name")
  public @Nullable ConfigNodePropertyString getAttributeName() {
    return attributeName;
  }

  @JsonProperty("attribute.name")
  public void setAttributeName(@Nullable ConfigNodePropertyString attributeName) {
    this.attributeName = attributeName;
  }

  public OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties attributeValueConstraint(@Nullable ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
    return this;
  }

  /**
   * Get attributeValueConstraint
   * @return attributeValueConstraint
   */
  @Valid 
  @Schema(name = "attribute.value.constraint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribute.value.constraint")
  public @Nullable ConfigNodePropertyString getAttributeValueConstraint() {
    return attributeValueConstraint;
  }

  @JsonProperty("attribute.value.constraint")
  public void setAttributeValueConstraint(@Nullable ConfigNodePropertyString attributeValueConstraint) {
    this.attributeValueConstraint = attributeValueConstraint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties = (OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties) o;
    return Objects.equals(this.hcName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcName) &&
        Objects.equals(this.hcTags, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.hcMbeanName) &&
        Objects.equals(this.mbeanName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.mbeanName) &&
        Objects.equals(this.attributeName, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.attributeName) &&
        Objects.equals(this.attributeValueConstraint, orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.attributeValueConstraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, mbeanName, attributeName, attributeValueConstraint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties {\n");
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
    sb.append("    mbeanName: ").append(toIndentedString(mbeanName)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValueConstraint: ").append(toIndentedString(attributeValueConstraint)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

