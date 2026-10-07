package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties   {

    private ConfigNodePropertyString filepattern;
    private ConfigNodePropertyBoolean buildPageNodes;
    private ConfigNodePropertyBoolean buildClientLibs;
    private ConfigNodePropertyBoolean buildCanvasComponent;

    /**
     * Default constructor.
     */
    public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.
     *
     * @param filepattern filepattern
     * @param buildPageNodes buildPageNodes
     * @param buildClientLibs buildClientLibs
     * @param buildCanvasComponent buildCanvasComponent
     */
    public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(
        ConfigNodePropertyString filepattern, 
        ConfigNodePropertyBoolean buildPageNodes, 
        ConfigNodePropertyBoolean buildClientLibs, 
        ConfigNodePropertyBoolean buildCanvasComponent
    ) {
        this.filepattern = filepattern;
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

