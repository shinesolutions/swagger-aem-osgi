package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo
 */

@JsonTypeName("comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo {

  private String pid;

  private String title;

  private String description;

  private ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties properties;

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo pid(String pid) {
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

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo title(String title) {
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

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo description(String description) {
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

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo properties(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties properties) {
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
  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties properties) {
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
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo = (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo) o;
    return Objects.equals(this.pid, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.pid) &&
        Objects.equals(this.title, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.title) &&
        Objects.equals(this.description, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.description) &&
        Objects.equals(this.properties, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo {\n");
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

