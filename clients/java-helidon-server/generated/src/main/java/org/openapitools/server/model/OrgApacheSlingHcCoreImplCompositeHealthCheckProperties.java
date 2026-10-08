package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties   {

    private ConfigNodePropertyString hcName;
    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyString hcMbeanName;
    private ConfigNodePropertyArray filterTags;
    private ConfigNodePropertyBoolean filterCombineTagsWithOr;

    /**
     * Default constructor.
     */
    public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
     *
     * @param hcName hcName
     * @param hcTags hcTags
     * @param hcMbeanName hcMbeanName
     * @param filterTags filterTags
     * @param filterCombineTagsWithOr filterCombineTagsWithOr
     */
    public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(
        ConfigNodePropertyString hcName, 
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyString hcMbeanName, 
        ConfigNodePropertyArray filterTags, 
        ConfigNodePropertyBoolean filterCombineTagsWithOr
    ) {
        this.hcName = hcName;
        this.hcTags = hcTags;
        this.hcMbeanName = hcMbeanName;
        this.filterTags = filterTags;
        this.filterCombineTagsWithOr = filterCombineTagsWithOr;
    }



    /**
     * Get hcName
     * @return hcName
     */
    public ConfigNodePropertyString getHcName() {
        return hcName;
    }

    public void setHcName(ConfigNodePropertyString hcName) {
        this.hcName = hcName;
    }

    /**
     * Get hcTags
     * @return hcTags
     */
    public ConfigNodePropertyArray getHcTags() {
        return hcTags;
    }

    public void setHcTags(ConfigNodePropertyArray hcTags) {
        this.hcTags = hcTags;
    }

    /**
     * Get hcMbeanName
     * @return hcMbeanName
     */
    public ConfigNodePropertyString getHcMbeanName() {
        return hcMbeanName;
    }

    public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
        this.hcMbeanName = hcMbeanName;
    }

    /**
     * Get filterTags
     * @return filterTags
     */
    public ConfigNodePropertyArray getFilterTags() {
        return filterTags;
    }

    public void setFilterTags(ConfigNodePropertyArray filterTags) {
        this.filterTags = filterTags;
    }

    /**
     * Get filterCombineTagsWithOr
     * @return filterCombineTagsWithOr
     */
    public ConfigNodePropertyBoolean getFilterCombineTagsWithOr() {
        return filterCombineTagsWithOr;
    }

    public void setFilterCombineTagsWithOr(ConfigNodePropertyBoolean filterCombineTagsWithOr) {
        this.filterCombineTagsWithOr = filterCombineTagsWithOr;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {\n");
        
        sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
        sb.append("    filterTags: ").append(toIndentedString(filterTags)).append("\n");
        sb.append("    filterCombineTagsWithOr: ").append(toIndentedString(filterCombineTagsWithOr)).append("\n");
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

