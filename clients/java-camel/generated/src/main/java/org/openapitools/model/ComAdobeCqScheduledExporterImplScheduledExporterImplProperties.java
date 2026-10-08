package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {

  private ConfigNodePropertyArray includePaths;

  private ConfigNodePropertyString exporterUser;

  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
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
  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  public void setIncludePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties exporterUser(ConfigNodePropertyString exporterUser) {
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
  public ConfigNodePropertyString getExporterUser() {
    return exporterUser;
  }

  public void setExporterUser(ConfigNodePropertyString exporterUser) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

