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
 * ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
 */

@JsonTypeName("comAdobeGraniteWorkflowCorePayloadMapCacheProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties {

  private ConfigNodePropertyArray getSystemWorkflowModels;

  private ConfigNodePropertyString getPackageRootPath;

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
    return this;
  }

  /**
   * Get getSystemWorkflowModels
   * @return getSystemWorkflowModels
   */
  @Valid 
  @Schema(name = "getSystemWorkflowModels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("getSystemWorkflowModels")
  public ConfigNodePropertyArray getGetSystemWorkflowModels() {
    return getSystemWorkflowModels;
  }

  public void setGetSystemWorkflowModels(ConfigNodePropertyArray getSystemWorkflowModels) {
    this.getSystemWorkflowModels = getSystemWorkflowModels;
  }

  public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties getPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
    return this;
  }

  /**
   * Get getPackageRootPath
   * @return getPackageRootPath
   */
  @Valid 
  @Schema(name = "getPackageRootPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("getPackageRootPath")
  public ConfigNodePropertyString getGetPackageRootPath() {
    return getPackageRootPath;
  }

  public void setGetPackageRootPath(ConfigNodePropertyString getPackageRootPath) {
    this.getPackageRootPath = getPackageRootPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties comAdobeGraniteWorkflowCorePayloadMapCacheProperties = (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties) o;
    return Objects.equals(this.getSystemWorkflowModels, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getSystemWorkflowModels) &&
        Objects.equals(this.getPackageRootPath, comAdobeGraniteWorkflowCorePayloadMapCacheProperties.getPackageRootPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getSystemWorkflowModels, getPackageRootPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties {\n");
    sb.append("    getSystemWorkflowModels: ").append(toIndentedString(getSystemWorkflowModels)).append("\n");
    sb.append("    getPackageRootPath: ").append(toIndentedString(getPackageRootPath)).append("\n");
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

