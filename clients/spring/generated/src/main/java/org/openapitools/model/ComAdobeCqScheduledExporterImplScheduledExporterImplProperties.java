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
 * ComAdobeCqScheduledExporterImplScheduledExporterImplProperties
 */

@JsonTypeName("comAdobeCqScheduledExporterImplScheduledExporterImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray includePaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString exporterUser;

  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties includePaths(@Nullable ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
    return this;
  }

  /**
   * Get includePaths
   * @return includePaths
   */
  @Valid 
  @Schema(name = "include.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include.paths")
  public @Nullable ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  @JsonProperty("include.paths")
  public void setIncludePaths(@Nullable ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties exporterUser(@Nullable ConfigNodePropertyString exporterUser) {
    this.exporterUser = exporterUser;
    return this;
  }

  /**
   * Get exporterUser
   * @return exporterUser
   */
  @Valid 
  @Schema(name = "exporter.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exporter.user")
  public @Nullable ConfigNodePropertyString getExporterUser() {
    return exporterUser;
  }

  @JsonProperty("exporter.user")
  public void setExporterUser(@Nullable ConfigNodePropertyString exporterUser) {
    this.exporterUser = exporterUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScheduledExporterImplScheduledExporterImplProperties comAdobeCqScheduledExporterImplScheduledExporterImplProperties = (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties) o;
    return Objects.equals(this.includePaths, comAdobeCqScheduledExporterImplScheduledExporterImplProperties.includePaths) &&
        Objects.equals(this.exporterUser, comAdobeCqScheduledExporterImplScheduledExporterImplProperties.exporterUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includePaths, exporterUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {\n");
    sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
    sb.append("    exporterUser: ").append(toIndentedString(exporterUser)).append("\n");
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

