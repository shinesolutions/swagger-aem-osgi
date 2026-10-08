package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
 */

@JsonTypeName("orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString checkpathPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jcrPath;

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties path(@Nullable ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties checkpathPrefix(@Nullable ConfigNodePropertyString checkpathPrefix) {
    this.checkpathPrefix = checkpathPrefix;
    return this;
  }

  /**
   * Get checkpathPrefix
   * @return checkpathPrefix
   */
  @Valid 
  @Schema(name = "checkpath.prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkpath.prefix")
  public @Nullable ConfigNodePropertyString getCheckpathPrefix() {
    return checkpathPrefix;
  }

  @JsonProperty("checkpath.prefix")
  public void setCheckpathPrefix(@Nullable ConfigNodePropertyString checkpathPrefix) {
    this.checkpathPrefix = checkpathPrefix;
  }

  public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties jcrPath(@Nullable ConfigNodePropertyString jcrPath) {
    this.jcrPath = jcrPath;
    return this;
  }

  /**
   * Get jcrPath
   * @return jcrPath
   */
  @Valid 
  @Schema(name = "jcrPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jcrPath")
  public @Nullable ConfigNodePropertyString getJcrPath() {
    return jcrPath;
  }

  @JsonProperty("jcrPath")
  public void setJcrPath(@Nullable ConfigNodePropertyString jcrPath) {
    this.jcrPath = jcrPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties = (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties) o;
    return Objects.equals(this.path, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.path) &&
        Objects.equals(this.checkpathPrefix, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.checkpathPrefix) &&
        Objects.equals(this.jcrPath, orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.jcrPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, checkpathPrefix, jcrPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    checkpathPrefix: ").append(toIndentedString(checkpathPrefix)).append("\n");
    sb.append("    jcrPath: ").append(toIndentedString(jcrPath)).append("\n");
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

