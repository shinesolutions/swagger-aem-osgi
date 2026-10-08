package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
 */

@JsonTypeName("comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString rootPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean fixInconsistencies;

  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties rootPath(@Nullable ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
    return this;
  }

  /**
   * Get rootPath
   * @return rootPath
   */
  @Valid 
  @Schema(name = "root.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("root.path")
  public @Nullable ConfigNodePropertyString getRootPath() {
    return rootPath;
  }

  @JsonProperty("root.path")
  public void setRootPath(@Nullable ConfigNodePropertyString rootPath) {
    this.rootPath = rootPath;
  }

  public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties fixInconsistencies(@Nullable ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
    return this;
  }

  /**
   * Get fixInconsistencies
   * @return fixInconsistencies
   */
  @Valid 
  @Schema(name = "fix.inconsistencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fix.inconsistencies")
  public @Nullable ConfigNodePropertyBoolean getFixInconsistencies() {
    return fixInconsistencies;
  }

  @JsonProperty("fix.inconsistencies")
  public void setFixInconsistencies(@Nullable ConfigNodePropertyBoolean fixInconsistencies) {
    this.fixInconsistencies = fixInconsistencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties = (ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties) o;
    return Objects.equals(this.rootPath, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.rootPath) &&
        Objects.equals(this.fixInconsistencies, comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.fixInconsistencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootPath, fixInconsistencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {\n");
    sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
    sb.append("    fixInconsistencies: ").append(toIndentedString(fixInconsistencies)).append("\n");
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

