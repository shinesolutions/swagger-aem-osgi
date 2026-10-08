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
 * ComAdobeCqHcContentPackagesHealthCheckProperties
 */

@JsonTypeName("comAdobeCqHcContentPackagesHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqHcContentPackagesHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hcName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hcMbeanName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray packageNames;

  public ComAdobeCqHcContentPackagesHealthCheckProperties hcName(@Nullable ConfigNodePropertyString hcName) {
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

  public ComAdobeCqHcContentPackagesHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
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

  public ComAdobeCqHcContentPackagesHealthCheckProperties hcMbeanName(@Nullable ConfigNodePropertyString hcMbeanName) {
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

  public ComAdobeCqHcContentPackagesHealthCheckProperties packageNames(@Nullable ConfigNodePropertyArray packageNames) {
    this.packageNames = packageNames;
    return this;
  }

  /**
   * Get packageNames
   * @return packageNames
   */
  @Valid 
  @Schema(name = "package.names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("package.names")
  public @Nullable ConfigNodePropertyArray getPackageNames() {
    return packageNames;
  }

  @JsonProperty("package.names")
  public void setPackageNames(@Nullable ConfigNodePropertyArray packageNames) {
    this.packageNames = packageNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqHcContentPackagesHealthCheckProperties comAdobeCqHcContentPackagesHealthCheckProperties = (ComAdobeCqHcContentPackagesHealthCheckProperties) o;
    return Objects.equals(this.hcName, comAdobeCqHcContentPackagesHealthCheckProperties.hcName) &&
        Objects.equals(this.hcTags, comAdobeCqHcContentPackagesHealthCheckProperties.hcTags) &&
        Objects.equals(this.hcMbeanName, comAdobeCqHcContentPackagesHealthCheckProperties.hcMbeanName) &&
        Objects.equals(this.packageNames, comAdobeCqHcContentPackagesHealthCheckProperties.packageNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName, packageNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqHcContentPackagesHealthCheckProperties {\n");
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
    sb.append("    packageNames: ").append(toIndentedString(packageNames)).append("\n");
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

