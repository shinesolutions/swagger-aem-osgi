package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties   {

    private ConfigNodePropertyBoolean showPlaceholder;
    private ConfigNodePropertyInteger maximumCacheEntries;
    private ConfigNodePropertyDropDown afScriptingCompatversion;
    private ConfigNodePropertyBoolean makeFileNameUnique;
    private ConfigNodePropertyBoolean generatingCompliantData;

    /**
     * Default constructor.
     */
    public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.
     *
     * @param showPlaceholder showPlaceholder
     * @param maximumCacheEntries maximumCacheEntries
     * @param afScriptingCompatversion afScriptingCompatversion
     * @param makeFileNameUnique makeFileNameUnique
     * @param generatingCompliantData generatingCompliantData
     */
    public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(
        ConfigNodePropertyBoolean showPlaceholder, 
        ConfigNodePropertyInteger maximumCacheEntries, 
        ConfigNodePropertyDropDown afScriptingCompatversion, 
        ConfigNodePropertyBoolean makeFileNameUnique, 
        ConfigNodePropertyBoolean generatingCompliantData
    ) {
        this.showPlaceholder = showPlaceholder;
        this.maximumCacheEntries = maximumCacheEntries;
        this.afScriptingCompatversion = afScriptingCompatversion;
        this.makeFileNameUnique = makeFileNameUnique;
        this.generatingCompliantData = generatingCompliantData;
    }



    /**
     * Get showPlaceholder
     * @return showPlaceholder
     */
    public ConfigNodePropertyBoolean getShowPlaceholder() {
        return showPlaceholder;
    }

    public void setShowPlaceholder(ConfigNodePropertyBoolean showPlaceholder) {
        this.showPlaceholder = showPlaceholder;
    }

    /**
     * Get maximumCacheEntries
     * @return maximumCacheEntries
     */
    public ConfigNodePropertyInteger getMaximumCacheEntries() {
        return maximumCacheEntries;
    }

    public void setMaximumCacheEntries(ConfigNodePropertyInteger maximumCacheEntries) {
        this.maximumCacheEntries = maximumCacheEntries;
    }

    /**
     * Get afScriptingCompatversion
     * @return afScriptingCompatversion
     */
    public ConfigNodePropertyDropDown getAfScriptingCompatversion() {
        return afScriptingCompatversion;
    }

    public void setAfScriptingCompatversion(ConfigNodePropertyDropDown afScriptingCompatversion) {
        this.afScriptingCompatversion = afScriptingCompatversion;
    }

    /**
     * Get makeFileNameUnique
     * @return makeFileNameUnique
     */
    public ConfigNodePropertyBoolean getMakeFileNameUnique() {
        return makeFileNameUnique;
    }

    public void setMakeFileNameUnique(ConfigNodePropertyBoolean makeFileNameUnique) {
        this.makeFileNameUnique = makeFileNameUnique;
    }

    /**
     * Get generatingCompliantData
     * @return generatingCompliantData
     */
    public ConfigNodePropertyBoolean getGeneratingCompliantData() {
        return generatingCompliantData;
    }

    public void setGeneratingCompliantData(ConfigNodePropertyBoolean generatingCompliantData) {
        this.generatingCompliantData = generatingCompliantData;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {\n");
        
        sb.append("    showPlaceholder: ").append(toIndentedString(showPlaceholder)).append("\n");
        sb.append("    maximumCacheEntries: ").append(toIndentedString(maximumCacheEntries)).append("\n");
        sb.append("    afScriptingCompatversion: ").append(toIndentedString(afScriptingCompatversion)).append("\n");
        sb.append("    makeFileNameUnique: ").append(toIndentedString(makeFileNameUnique)).append("\n");
        sb.append("    generatingCompliantData: ").append(toIndentedString(generatingCompliantData)).append("\n");
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

