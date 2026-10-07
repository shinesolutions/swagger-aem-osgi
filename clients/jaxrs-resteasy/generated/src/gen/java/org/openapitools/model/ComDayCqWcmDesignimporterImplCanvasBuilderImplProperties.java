package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties   {
  
  private ConfigNodePropertyString filepattern;
  private ConfigNodePropertyBoolean buildPageNodes;
  private ConfigNodePropertyBoolean buildClientLibs;
  private ConfigNodePropertyBoolean buildCanvasComponent;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filepattern")
  @Valid
  public ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }
  public void setFilepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("build.page.nodes")
  @Valid
  public ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }
  public void setBuildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("build.client.libs")
  @Valid
  public ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }
  public void setBuildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("build.canvas.component")
  @Valid
  public ConfigNodePropertyBoolean getBuildCanvasComponent() {
    return buildCanvasComponent;
  }
  public void setBuildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties comDayCqWcmDesignimporterImplCanvasBuilderImplProperties = (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties) o;
    return Objects.equals(this.filepattern, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.filepattern) &&
        Objects.equals(this.buildPageNodes, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildPageNodes) &&
        Objects.equals(this.buildClientLibs, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildClientLibs) &&
        Objects.equals(this.buildCanvasComponent, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildCanvasComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filepattern, buildPageNodes, buildClientLibs, buildCanvasComponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {\n");
    
    sb.append("    filepattern: ").append(toIndentedString(filepattern)).append("\n");
    sb.append("    buildPageNodes: ").append(toIndentedString(buildPageNodes)).append("\n");
    sb.append("    buildClientLibs: ").append(toIndentedString(buildClientLibs)).append("\n");
    sb.append("    buildCanvasComponent: ").append(toIndentedString(buildCanvasComponent)).append("\n");
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

