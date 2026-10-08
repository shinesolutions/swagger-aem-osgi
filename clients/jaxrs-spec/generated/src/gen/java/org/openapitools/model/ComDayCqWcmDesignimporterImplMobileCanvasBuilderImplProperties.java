package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties   {
  private ConfigNodePropertyString filepattern;
  private ConfigNodePropertyArray deviceGroups;
  private ConfigNodePropertyBoolean buildPageNodes;
  private ConfigNodePropertyBoolean buildClientLibs;
  private ConfigNodePropertyBoolean buildCanvasComponent;

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties() {
  }

  /**
   **/
  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties filepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("filepattern")
  @Valid public ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }

  @JsonProperty("filepattern")
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
  @Valid public ConfigNodePropertyArray getDeviceGroups() {
    return deviceGroups;
  }

  @JsonProperty("device.groups")
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
  @Valid public ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }

  @JsonProperty("build.page.nodes")
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
  @Valid public ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }

  @JsonProperty("build.client.libs")
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
  @Valid public ConfigNodePropertyBoolean getBuildCanvasComponent() {
    return buildCanvasComponent;
  }

  @JsonProperty("build.canvas.component")
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
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties = (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties) o;
    return Objects.equals(this.filepattern, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.filepattern) &&
        Objects.equals(this.deviceGroups, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.deviceGroups) &&
        Objects.equals(this.buildPageNodes, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildPageNodes) &&
        Objects.equals(this.buildClientLibs, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildClientLibs) &&
        Objects.equals(this.buildCanvasComponent, comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.buildCanvasComponent);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
