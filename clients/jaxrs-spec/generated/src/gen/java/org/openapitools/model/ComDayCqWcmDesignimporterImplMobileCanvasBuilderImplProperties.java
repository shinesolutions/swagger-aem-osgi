package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties   {
  
  private @Valid ConfigNodePropertyString filepattern = null;
  private @Valid ConfigNodePropertyArray deviceGroups = null;
  private @Valid ConfigNodePropertyBoolean buildPageNodes = null;
  private @Valid ConfigNodePropertyBoolean buildClientLibs = null;
  private @Valid ConfigNodePropertyBoolean buildCanvasComponent = null;

  /**
   **/
  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties filepattern(ConfigNodePropertyString filepattern) {
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
  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties deviceGroups(ConfigNodePropertyArray deviceGroups) {
    this.deviceGroups = deviceGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("device.groups")
  public ConfigNodePropertyArray getDeviceGroups() {
    return deviceGroups;
  }
  public void setDeviceGroups(ConfigNodePropertyArray deviceGroups) {
    this.deviceGroups = deviceGroups;
  }

  /**
   **/
  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties buildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
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
  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties buildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
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
  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties buildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
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
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties = (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties) o;
    return Objects.equals(filepattern, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.filepattern) &&
        Objects.equals(deviceGroups, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.deviceGroups) &&
        Objects.equals(buildPageNodes, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildPageNodes) &&
        Objects.equals(buildClientLibs, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildClientLibs) &&
        Objects.equals(buildCanvasComponent, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildCanvasComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filepattern, deviceGroups, buildPageNodes, buildClientLibs, buildCanvasComponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties {\n");
    
    sb.append("    filepattern: ").append(toIndentedString(filepattern)).append("\n");
    sb.append("    deviceGroups: ").append(toIndentedString(deviceGroups)).append("\n");
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

