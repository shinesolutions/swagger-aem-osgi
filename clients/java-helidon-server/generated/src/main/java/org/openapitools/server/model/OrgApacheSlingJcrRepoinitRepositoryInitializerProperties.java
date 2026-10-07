package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties   {

    private ConfigNodePropertyArray references;
    private ConfigNodePropertyArray scripts;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.
     *
     * @param references references
     * @param scripts scripts
     */
    public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(
        ConfigNodePropertyArray references, 
        ConfigNodePropertyArray scripts
    ) {
        this.references = references;
        this.scripts = scripts;
    }



    /**
     * Get references
     * @return references
     */
    public ConfigNodePropertyArray getReferences() {
        return references;
    }

    public void setReferences(ConfigNodePropertyArray references) {
        this.references = references;
    }

    /**
     * Get scripts
     * @return scripts
     */
    public ConfigNodePropertyArray getScripts() {
        return scripts;
    }

    public void setScripts(ConfigNodePropertyArray scripts) {
        this.scripts = scripts;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {\n");
        
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
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

