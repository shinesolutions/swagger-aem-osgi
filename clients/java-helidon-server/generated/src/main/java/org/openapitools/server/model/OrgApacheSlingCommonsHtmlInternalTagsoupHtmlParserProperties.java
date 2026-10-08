package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties   {

    private ConfigNodePropertyArray parserFeatures;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.
     *
     * @param parserFeatures parserFeatures
     */
    public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties(
        ConfigNodePropertyArray parserFeatures
    ) {
        this.parserFeatures = parserFeatures;
    }



    /**
     * Get parserFeatures
     * @return parserFeatures
     */
    public ConfigNodePropertyArray getParserFeatures() {
        return parserFeatures;
    }

    public void setParserFeatures(ConfigNodePropertyArray parserFeatures) {
        this.parserFeatures = parserFeatures;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties {\n");
        
        sb.append("    parserFeatures: ").append(toIndentedString(parserFeatures)).append("\n");
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

