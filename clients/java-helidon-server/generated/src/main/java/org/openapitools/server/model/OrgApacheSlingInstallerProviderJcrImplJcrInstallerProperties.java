package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties   {

    private ConfigNodePropertyArray handlerSchemes;
    private ConfigNodePropertyString slingJcrinstallFolderNameRegexp;
    private ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth;
    private ConfigNodePropertyArray slingJcrinstallSearchPath;
    private ConfigNodePropertyString slingJcrinstallNewConfigPath;
    private ConfigNodePropertyString slingJcrinstallSignalPath;
    private ConfigNodePropertyBoolean slingJcrinstallEnableWriteback;

    /**
     * Default constructor.
     */
    public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.
     *
     * @param handlerSchemes handlerSchemes
     * @param slingJcrinstallFolderNameRegexp slingJcrinstallFolderNameRegexp
     * @param slingJcrinstallFolderMaxDepth slingJcrinstallFolderMaxDepth
     * @param slingJcrinstallSearchPath slingJcrinstallSearchPath
     * @param slingJcrinstallNewConfigPath slingJcrinstallNewConfigPath
     * @param slingJcrinstallSignalPath slingJcrinstallSignalPath
     * @param slingJcrinstallEnableWriteback slingJcrinstallEnableWriteback
     */
    public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(
        ConfigNodePropertyArray handlerSchemes, 
        ConfigNodePropertyString slingJcrinstallFolderNameRegexp, 
        ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth, 
        ConfigNodePropertyArray slingJcrinstallSearchPath, 
        ConfigNodePropertyString slingJcrinstallNewConfigPath, 
        ConfigNodePropertyString slingJcrinstallSignalPath, 
        ConfigNodePropertyBoolean slingJcrinstallEnableWriteback
    ) {
        this.handlerSchemes = handlerSchemes;
        this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
        this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
        this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
        this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
        this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
        this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
    }



    /**
     * Get handlerSchemes
     * @return handlerSchemes
     */
    public ConfigNodePropertyArray getHandlerSchemes() {
        return handlerSchemes;
    }

    public void setHandlerSchemes(ConfigNodePropertyArray handlerSchemes) {
        this.handlerSchemes = handlerSchemes;
    }

    /**
     * Get slingJcrinstallFolderNameRegexp
     * @return slingJcrinstallFolderNameRegexp
     */
    public ConfigNodePropertyString getSlingJcrinstallFolderNameRegexp() {
        return slingJcrinstallFolderNameRegexp;
    }

    public void setSlingJcrinstallFolderNameRegexp(ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
        this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
    }

    /**
     * Get slingJcrinstallFolderMaxDepth
     * @return slingJcrinstallFolderMaxDepth
     */
    public ConfigNodePropertyInteger getSlingJcrinstallFolderMaxDepth() {
        return slingJcrinstallFolderMaxDepth;
    }

    public void setSlingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
        this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
    }

    /**
     * Get slingJcrinstallSearchPath
     * @return slingJcrinstallSearchPath
     */
    public ConfigNodePropertyArray getSlingJcrinstallSearchPath() {
        return slingJcrinstallSearchPath;
    }

    public void setSlingJcrinstallSearchPath(ConfigNodePropertyArray slingJcrinstallSearchPath) {
        this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
    }

    /**
     * Get slingJcrinstallNewConfigPath
     * @return slingJcrinstallNewConfigPath
     */
    public ConfigNodePropertyString getSlingJcrinstallNewConfigPath() {
        return slingJcrinstallNewConfigPath;
    }

    public void setSlingJcrinstallNewConfigPath(ConfigNodePropertyString slingJcrinstallNewConfigPath) {
        this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
    }

    /**
     * Get slingJcrinstallSignalPath
     * @return slingJcrinstallSignalPath
     */
    public ConfigNodePropertyString getSlingJcrinstallSignalPath() {
        return slingJcrinstallSignalPath;
    }

    public void setSlingJcrinstallSignalPath(ConfigNodePropertyString slingJcrinstallSignalPath) {
        this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
    }

    /**
     * Get slingJcrinstallEnableWriteback
     * @return slingJcrinstallEnableWriteback
     */
    public ConfigNodePropertyBoolean getSlingJcrinstallEnableWriteback() {
        return slingJcrinstallEnableWriteback;
    }

    public void setSlingJcrinstallEnableWriteback(ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
        this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {\n");
        
        sb.append("    handlerSchemes: ").append(toIndentedString(handlerSchemes)).append("\n");
        sb.append("    slingJcrinstallFolderNameRegexp: ").append(toIndentedString(slingJcrinstallFolderNameRegexp)).append("\n");
        sb.append("    slingJcrinstallFolderMaxDepth: ").append(toIndentedString(slingJcrinstallFolderMaxDepth)).append("\n");
        sb.append("    slingJcrinstallSearchPath: ").append(toIndentedString(slingJcrinstallSearchPath)).append("\n");
        sb.append("    slingJcrinstallNewConfigPath: ").append(toIndentedString(slingJcrinstallNewConfigPath)).append("\n");
        sb.append("    slingJcrinstallSignalPath: ").append(toIndentedString(slingJcrinstallSignalPath)).append("\n");
        sb.append("    slingJcrinstallEnableWriteback: ").append(toIndentedString(slingJcrinstallEnableWriteback)).append("\n");
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

