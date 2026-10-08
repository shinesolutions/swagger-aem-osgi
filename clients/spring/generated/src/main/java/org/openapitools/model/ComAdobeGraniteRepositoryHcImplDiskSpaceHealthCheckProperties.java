package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
 */

@JsonTypeName("comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger diskSpaceWarnThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger diskSpaceErrorThreshold;

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
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

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties diskSpaceWarnThreshold(@Nullable ConfigNodePropertyInteger diskSpaceWarnThreshold) {
    this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
    return this;
  }

  /**
   * Get diskSpaceWarnThreshold
   * @return diskSpaceWarnThreshold
   */
  @Valid 
  @Schema(name = "disk.space.warn.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disk.space.warn.threshold")
  public @Nullable ConfigNodePropertyInteger getDiskSpaceWarnThreshold() {
    return diskSpaceWarnThreshold;
  }

  @JsonProperty("disk.space.warn.threshold")
  public void setDiskSpaceWarnThreshold(@Nullable ConfigNodePropertyInteger diskSpaceWarnThreshold) {
    this.diskSpaceWarnThreshold = diskSpaceWarnThreshold;
  }

  public ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties diskSpaceErrorThreshold(@Nullable ConfigNodePropertyInteger diskSpaceErrorThreshold) {
    this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
    return this;
  }

  /**
   * Get diskSpaceErrorThreshold
   * @return diskSpaceErrorThreshold
   */
  @Valid 
  @Schema(name = "disk.space.error.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disk.space.error.threshold")
  public @Nullable ConfigNodePropertyInteger getDiskSpaceErrorThreshold() {
    return diskSpaceErrorThreshold;
  }

  @JsonProperty("disk.space.error.threshold")
  public void setDiskSpaceErrorThreshold(@Nullable ConfigNodePropertyInteger diskSpaceErrorThreshold) {
    this.diskSpaceErrorThreshold = diskSpaceErrorThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties = (ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.hcTags) &&
        Objects.equals(this.diskSpaceWarnThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceWarnThreshold) &&
        Objects.equals(this.diskSpaceErrorThreshold, comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.diskSpaceErrorThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, diskSpaceWarnThreshold, diskSpaceErrorThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    diskSpaceWarnThreshold: ").append(toIndentedString(diskSpaceWarnThreshold)).append("\n");
    sb.append("    diskSpaceErrorThreshold: ").append(toIndentedString(diskSpaceErrorThreshold)).append("\n");
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

