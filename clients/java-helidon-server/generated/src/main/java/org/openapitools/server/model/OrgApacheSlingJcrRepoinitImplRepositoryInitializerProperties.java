package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties   {

    private ConfigNodePropertyArray references;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.
     *
     * @param references references
     */
    public OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(
        ConfigNodePropertyArray references
    ) {
        this.references = references;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties {\n");
        
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
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

