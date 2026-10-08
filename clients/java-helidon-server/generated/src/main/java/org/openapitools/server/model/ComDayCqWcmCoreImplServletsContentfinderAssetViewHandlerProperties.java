package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties   {

    private ConfigNodePropertyBoolean damShowexpired;
    private ConfigNodePropertyBoolean damShowhidden;
    private ConfigNodePropertyBoolean tagTitleSearch;
    private ConfigNodePropertyString guessTotal;
    private ConfigNodePropertyString damExpiryProperty;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.
     *
     * @param damShowexpired damShowexpired
     * @param damShowhidden damShowhidden
     * @param tagTitleSearch tagTitleSearch
     * @param guessTotal guessTotal
     * @param damExpiryProperty damExpiryProperty
     */
    public ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(
        ConfigNodePropertyBoolean damShowexpired, 
        ConfigNodePropertyBoolean damShowhidden, 
        ConfigNodePropertyBoolean tagTitleSearch, 
        ConfigNodePropertyString guessTotal, 
        ConfigNodePropertyString damExpiryProperty
    ) {
        this.damShowexpired = damShowexpired;
        this.damShowhidden = damShowhidden;
        this.tagTitleSearch = tagTitleSearch;
        this.guessTotal = guessTotal;
        this.damExpiryProperty = damExpiryProperty;
    }



    /**
     * Get damShowexpired
     * @return damShowexpired
     */
    public ConfigNodePropertyBoolean getDamShowexpired() {
        return damShowexpired;
    }

    public void setDamShowexpired(ConfigNodePropertyBoolean damShowexpired) {
        this.damShowexpired = damShowexpired;
    }

    /**
     * Get damShowhidden
     * @return damShowhidden
     */
    public ConfigNodePropertyBoolean getDamShowhidden() {
        return damShowhidden;
    }

    public void setDamShowhidden(ConfigNodePropertyBoolean damShowhidden) {
        this.damShowhidden = damShowhidden;
    }

    /**
     * Get tagTitleSearch
     * @return tagTitleSearch
     */
    public ConfigNodePropertyBoolean getTagTitleSearch() {
        return tagTitleSearch;
    }

    public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
        this.tagTitleSearch = tagTitleSearch;
    }

    /**
     * Get guessTotal
     * @return guessTotal
     */
    public ConfigNodePropertyString getGuessTotal() {
        return guessTotal;
    }

    public void setGuessTotal(ConfigNodePropertyString guessTotal) {
        this.guessTotal = guessTotal;
    }

    /**
     * Get damExpiryProperty
     * @return damExpiryProperty
     */
    public ConfigNodePropertyString getDamExpiryProperty() {
        return damExpiryProperty;
    }

    public void setDamExpiryProperty(ConfigNodePropertyString damExpiryProperty) {
        this.damExpiryProperty = damExpiryProperty;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties {\n");
        
        sb.append("    damShowexpired: ").append(toIndentedString(damShowexpired)).append("\n");
        sb.append("    damShowhidden: ").append(toIndentedString(damShowhidden)).append("\n");
        sb.append("    tagTitleSearch: ").append(toIndentedString(tagTitleSearch)).append("\n");
        sb.append("    guessTotal: ").append(toIndentedString(guessTotal)).append("\n");
        sb.append("    damExpiryProperty: ").append(toIndentedString(damExpiryProperty)).append("\n");
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

