package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties   {
  
  private ConfigNodePropertyString filepattern = null;
  private ConfigNodePropertyBoolean buildPageNodes = null;
  private ConfigNodePropertyBoolean buildClientLibs = null;
  private ConfigNodePropertyBoolean buildCanvasComponent = null;

  /**
   **/
  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties filepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filepattern")
  public ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }
  public void setFilepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
  }

  /**
   **/
  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("build.page.nodes")
  public ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }
  public void setBuildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
  }

  /**
   **/
  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("build.client.libs")
  public ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }
  public void setBuildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
  }

  /**
   **/
  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("build.canvas.component")
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
    return Objects.equals(filepattern, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.filepattern) &&
        Objects.equals(buildPageNodes, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildPageNodes) &&
        Objects.equals(buildClientLibs, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildClientLibs) &&
        Objects.equals(buildCanvasComponent, comDayCqWcmDesignimporterImplCanvasBuilderImplProperties.buildCanvasComponent);
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

