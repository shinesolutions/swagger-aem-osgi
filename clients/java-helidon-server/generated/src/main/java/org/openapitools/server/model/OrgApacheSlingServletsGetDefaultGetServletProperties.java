package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingServletsGetDefaultGetServletProperties   {

    private ConfigNodePropertyArray aliases;
    private ConfigNodePropertyBoolean index;
    private ConfigNodePropertyArray indexFiles;
    private ConfigNodePropertyBoolean enableHtml;
    private ConfigNodePropertyBoolean enableJson;
    private ConfigNodePropertyBoolean enableTxt;
    private ConfigNodePropertyBoolean enableXml;
    private ConfigNodePropertyInteger jsonMaximumresults;
    private ConfigNodePropertyBoolean ecmaSuport;

    /**
     * Default constructor.
     */
    public OrgApacheSlingServletsGetDefaultGetServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingServletsGetDefaultGetServletProperties.
     *
     * @param aliases aliases
     * @param index index
     * @param indexFiles indexFiles
     * @param enableHtml enableHtml
     * @param enableJson enableJson
     * @param enableTxt enableTxt
     * @param enableXml enableXml
     * @param jsonMaximumresults jsonMaximumresults
     * @param ecmaSuport ecmaSuport
     */
    public OrgApacheSlingServletsGetDefaultGetServletProperties(
        ConfigNodePropertyArray aliases, 
        ConfigNodePropertyBoolean index, 
        ConfigNodePropertyArray indexFiles, 
        ConfigNodePropertyBoolean enableHtml, 
        ConfigNodePropertyBoolean enableJson, 
        ConfigNodePropertyBoolean enableTxt, 
        ConfigNodePropertyBoolean enableXml, 
        ConfigNodePropertyInteger jsonMaximumresults, 
        ConfigNodePropertyBoolean ecmaSuport
    ) {
        this.aliases = aliases;
        this.index = index;
        this.indexFiles = indexFiles;
        this.enableHtml = enableHtml;
        this.enableJson = enableJson;
        this.enableTxt = enableTxt;
        this.enableXml = enableXml;
        this.jsonMaximumresults = jsonMaximumresults;
        this.ecmaSuport = ecmaSuport;
    }



    /**
     * Get aliases
     * @return aliases
     */
    public ConfigNodePropertyArray getAliases() {
        return aliases;
    }

    public void setAliases(ConfigNodePropertyArray aliases) {
        this.aliases = aliases;
    }

    /**
     * Get index
     * @return index
     */
    public ConfigNodePropertyBoolean getIndex() {
        return index;
    }

    public void setIndex(ConfigNodePropertyBoolean index) {
        this.index = index;
    }

    /**
     * Get indexFiles
     * @return indexFiles
     */
    public ConfigNodePropertyArray getIndexFiles() {
        return indexFiles;
    }

    public void setIndexFiles(ConfigNodePropertyArray indexFiles) {
        this.indexFiles = indexFiles;
    }

    /**
     * Get enableHtml
     * @return enableHtml
     */
    public ConfigNodePropertyBoolean getEnableHtml() {
        return enableHtml;
    }

    public void setEnableHtml(ConfigNodePropertyBoolean enableHtml) {
        this.enableHtml = enableHtml;
    }

    /**
     * Get enableJson
     * @return enableJson
     */
    public ConfigNodePropertyBoolean getEnableJson() {
        return enableJson;
    }

    public void setEnableJson(ConfigNodePropertyBoolean enableJson) {
        this.enableJson = enableJson;
    }

    /**
     * Get enableTxt
     * @return enableTxt
     */
    public ConfigNodePropertyBoolean getEnableTxt() {
        return enableTxt;
    }

    public void setEnableTxt(ConfigNodePropertyBoolean enableTxt) {
        this.enableTxt = enableTxt;
    }

    /**
     * Get enableXml
     * @return enableXml
     */
    public ConfigNodePropertyBoolean getEnableXml() {
        return enableXml;
    }

    public void setEnableXml(ConfigNodePropertyBoolean enableXml) {
        this.enableXml = enableXml;
    }

    /**
     * Get jsonMaximumresults
     * @return jsonMaximumresults
     */
    public ConfigNodePropertyInteger getJsonMaximumresults() {
        return jsonMaximumresults;
    }

    public void setJsonMaximumresults(ConfigNodePropertyInteger jsonMaximumresults) {
        this.jsonMaximumresults = jsonMaximumresults;
    }

    /**
     * Get ecmaSuport
     * @return ecmaSuport
     */
    public ConfigNodePropertyBoolean getEcmaSuport() {
        return ecmaSuport;
    }

    public void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
        this.ecmaSuport = ecmaSuport;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingServletsGetDefaultGetServletProperties {\n");
        
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    indexFiles: ").append(toIndentedString(indexFiles)).append("\n");
        sb.append("    enableHtml: ").append(toIndentedString(enableHtml)).append("\n");
        sb.append("    enableJson: ").append(toIndentedString(enableJson)).append("\n");
        sb.append("    enableTxt: ").append(toIndentedString(enableTxt)).append("\n");
        sb.append("    enableXml: ").append(toIndentedString(enableXml)).append("\n");
        sb.append("    jsonMaximumresults: ").append(toIndentedString(jsonMaximumresults)).append("\n");
        sb.append("    ecmaSuport: ").append(toIndentedString(ecmaSuport)).append("\n");
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

