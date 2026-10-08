package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties   {
  
  private ConfigNodePropertyString filepattern;
  private ConfigNodePropertyArray deviceGroups;
  private ConfigNodePropertyBoolean buildPageNodes;
  private ConfigNodePropertyBoolean buildClientLibs;
  private ConfigNodePropertyBoolean buildCanvasComponent;

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties () {

  }

  public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties (ConfigNodePropertyString filepattern, ConfigNodePropertyArray deviceGroups, ConfigNodePropertyBoolean buildPageNodes, ConfigNodePropertyBoolean buildClientLibs, ConfigNodePropertyBoolean buildCanvasComponent) {
    this.filepattern = filepattern;
    this.deviceGroups = deviceGroups;
    this.buildPageNodes = buildPageNodes;
    this.buildClientLibs = buildClientLibs;
    this.buildCanvasComponent = buildCanvasComponent;
  }

    
  @JsonProperty("filepattern")
  public ConfigNodePropertyString getFilepattern() {
    return filepattern;
  }
  public void setFilepattern(ConfigNodePropertyString filepattern) {
    this.filepattern = filepattern;
  }

    
  @JsonProperty("device.groups")
  public ConfigNodePropertyArray getDeviceGroups() {
    return deviceGroups;
  }
  public void setDeviceGroups(ConfigNodePropertyArray deviceGroups) {
    this.deviceGroups = deviceGroups;
  }

    
  @JsonProperty("build.page.nodes")
  public ConfigNodePropertyBoolean getBuildPageNodes() {
    return buildPageNodes;
  }
  public void setBuildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
    this.buildPageNodes = buildPageNodes;
  }

    
  @JsonProperty("build.client.libs")
  public ConfigNodePropertyBoolean getBuildClientLibs() {
    return buildClientLibs;
  }
  public void setBuildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
    this.buildClientLibs = buildClientLibs;
  }

    
  @JsonProperty("build.canvas.component")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
