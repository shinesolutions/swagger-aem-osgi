package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties   {
  @JsonProperty("filepattern")
  private ConfigNodePropertyString filepattern = null;

  @JsonProperty("build.page.nodes")
  private ConfigNodePropertyBoolean buildPageNodes = null;

  @JsonProperty("build.client.libs")
  private ConfigNodePropertyBoolean buildClientLibs = null;

  @JsonProperty("build.canvas.component")
  private ConfigNodePropertyBoolean buildCanvasComponent = null;

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties filepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
    return this;
  }

   /**
   * Get filepattern
   * @return filepattern
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }

  public void setFilepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
    return this;
  }

   /**
   * Get buildPageNodes
   * @return buildPageNodes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }

  public void setBuildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
    return this;
  }

   /**
   * Get buildClientLibs
   * @return buildClientLibs
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }

  public void setBuildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
    return this;
  }

   /**
   * Get buildCanvasComponent
   * @return buildCanvasComponent
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getBuildCanvasComponent() {
    return buildCanvasComponent;
  }

  public void setBuildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

