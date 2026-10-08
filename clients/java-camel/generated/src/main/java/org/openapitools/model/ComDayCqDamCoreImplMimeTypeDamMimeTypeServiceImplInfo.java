package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo
 */

@JsonTypeName("comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo {

  private String pid;

  private String title;

  private String description;

  private ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties properties;

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  
  @Schema(name = "pid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo properties(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @Valid 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo = (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo) o;
    return Objects.equals(this.pid, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.pid) &&
        Objects.equals(this.title, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.title) &&
        Objects.equals(this.description, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.description) &&
        Objects.equals(this.properties, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo {\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

