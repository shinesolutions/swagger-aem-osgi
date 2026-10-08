package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo   {
  private String pid;
  private String title;
  private String description;
  private ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties properties;

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo() {
  }

  /**
   **/
  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  @JsonProperty("pid")
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   **/
  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo properties(ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  @Valid public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties properties) {
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
    ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo = (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo) o;
    return Objects.equals(this.pid, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.pid) &&
        Objects.equals(this.title, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.title) &&
        Objects.equals(this.description, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.description) &&
        Objects.equals(this.properties, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo {\n");
    
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
