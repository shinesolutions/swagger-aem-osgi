package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties   {

    private ConfigNodePropertyString filepattern;
    private ConfigNodePropertyArray deviceGroups;
    private ConfigNodePropertyBoolean buildPageNodes;
    private ConfigNodePropertyBoolean buildClientLibs;
    private ConfigNodePropertyBoolean buildCanvasComponent;

    /**
     * Default constructor.
     */
    public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.
     *
     * @param filepattern filepattern
     * @param deviceGroups deviceGroups
     * @param buildPageNodes buildPageNodes
     * @param buildClientLibs buildClientLibs
     * @param buildCanvasComponent buildCanvasComponent
     */
    public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(
        ConfigNodePropertyString filepattern, 
        ConfigNodePropertyArray deviceGroups, 
        ConfigNodePropertyBoolean buildPageNodes, 
        ConfigNodePropertyBoolean buildClientLibs, 
        ConfigNodePropertyBoolean buildCanvasComponent
    ) {
        this.filepattern = filepattern;
        this.deviceGroups = deviceGroups;
        this.buildPageNodes = buildPageNodes;
        this.buildClientLibs = buildClientLibs;
        this.buildCanvasComponent = buildCanvasComponent;
    }



    /**
     * Get filepattern
     * @return filepattern
     */
    public ConfigNodePropertyString getFilepattern() {
        return filepattern;
    }

    public void setFilepattern(ConfigNodePropertyString filepattern) {
        this.filepattern = filepattern;
    }

    /**
     * Get deviceGroups
     * @return deviceGroups
     */
    public ConfigNodePropertyArray getDeviceGroups() {
        return deviceGroups;
    }

    public void setDeviceGroups(ConfigNodePropertyArray deviceGroups) {
        this.deviceGroups = deviceGroups;
    }

    /**
     * Get buildPageNodes
     * @return buildPageNodes
     */
    public ConfigNodePropertyBoolean getBuildPageNodes() {
        return buildPageNodes;
    }

    public void setBuildPageNodes(ConfigNodePropertyBoolean buildPageNodes) {
        this.buildPageNodes = buildPageNodes;
    }

    /**
     * Get buildClientLibs
     * @return buildClientLibs
     */
    public ConfigNodePropertyBoolean getBuildClientLibs() {
        return buildClientLibs;
    }

    public void setBuildClientLibs(ConfigNodePropertyBoolean buildClientLibs) {
        this.buildClientLibs = buildClientLibs;
    }

    /**
     * Get buildCanvasComponent
     * @return buildCanvasComponent
     */
    public ConfigNodePropertyBoolean getBuildCanvasComponent() {
        return buildCanvasComponent;
    }

    public void setBuildCanvasComponent(ConfigNodePropertyBoolean buildCanvasComponent) {
        this.buildCanvasComponent = buildCanvasComponent;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

