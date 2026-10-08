package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties   {

    private ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage;
    private ConfigNodePropertyInteger referencesearchservletMaxPages;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.
     *
     * @param referencesearchservletMaxReferencesPerPage referencesearchservletMaxReferencesPerPage
     * @param referencesearchservletMaxPages referencesearchservletMaxPages
     */
    public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(
        ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage, 
        ConfigNodePropertyInteger referencesearchservletMaxPages
    ) {
        this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
        this.referencesearchservletMaxPages = referencesearchservletMaxPages;
    }



    /**
     * Get referencesearchservletMaxReferencesPerPage
     * @return referencesearchservletMaxReferencesPerPage
     */
    public ConfigNodePropertyInteger getReferencesearchservletMaxReferencesPerPage() {
        return referencesearchservletMaxReferencesPerPage;
    }

    public void setReferencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletMaxReferencesPerPage) {
        this.referencesearchservletMaxReferencesPerPage = referencesearchservletMaxReferencesPerPage;
    }

    /**
     * Get referencesearchservletMaxPages
     * @return referencesearchservletMaxPages
     */
    public ConfigNodePropertyInteger getReferencesearchservletMaxPages() {
        return referencesearchservletMaxPages;
    }

    public void setReferencesearchservletMaxPages(ConfigNodePropertyInteger referencesearchservletMaxPages) {
        this.referencesearchservletMaxPages = referencesearchservletMaxPages;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {\n");
        
        sb.append("    referencesearchservletMaxReferencesPerPage: ").append(toIndentedString(referencesearchservletMaxReferencesPerPage)).append("\n");
        sb.append("    referencesearchservletMaxPages: ").append(toIndentedString(referencesearchservletMaxPages)).append("\n");
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

