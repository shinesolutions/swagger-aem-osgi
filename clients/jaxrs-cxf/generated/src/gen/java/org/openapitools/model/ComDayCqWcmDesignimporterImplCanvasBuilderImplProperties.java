package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString filepattern = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean buildPageNodes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean buildClientLibs = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean buildCanvasComponent = null;
 /**
   * Get filepattern
   * @return filepattern
  **/
  @JsonProperty("filepattern")
  public ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }

  public void setFilepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties filepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
    return this;
  }

 /**
   * Get buildPageNodes
   * @return buildPageNodes
  **/
  @JsonProperty("build.page.nodes")
  public ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }

  public void setBuildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
    return this;
  }

 /**
   * Get buildClientLibs
   * @return buildClientLibs
  **/
  @JsonProperty("build.client.libs")
  public ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }

  public void setBuildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
    return this;
  }

 /**
   * Get buildCanvasComponent
   * @return buildCanvasComponent
  **/
  @JsonProperty("build.canvas.component")
  public ConfigNodePropertyBoolean getBuildCanvasComponent() {
    return buildCanvasComponent;
  }

  public void setBuildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
  }

  public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties buildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
    this.buildCanvasComponent = buildCanvasComponent;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

