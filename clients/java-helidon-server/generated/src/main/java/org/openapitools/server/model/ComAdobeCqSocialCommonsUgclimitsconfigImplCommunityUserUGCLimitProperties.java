package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties   {

    private ConfigNodePropertyBoolean enable;
    private ConfigNodePropertyInteger ugCLimit;
    private ConfigNodePropertyInteger ugcLimitDuration;
    private ConfigNodePropertyArray domains;
    private ConfigNodePropertyArray toList;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.
     *
     * @param enable enable
     * @param ugCLimit ugCLimit
     * @param ugcLimitDuration ugcLimitDuration
     * @param domains domains
     * @param toList toList
     */
    public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(
        ConfigNodePropertyBoolean enable, 
        ConfigNodePropertyInteger ugCLimit, 
        ConfigNodePropertyInteger ugcLimitDuration, 
        ConfigNodePropertyArray domains, 
        ConfigNodePropertyArray toList
    ) {
        this.enable = enable;
        this.ugCLimit = ugCLimit;
        this.ugcLimitDuration = ugcLimitDuration;
        this.domains = domains;
        this.toList = toList;
    }



    /**
     * Get enable
     * @return enable
     */
    public ConfigNodePropertyBoolean getEnable() {
        return enable;
    }

    public void setEnable(ConfigNodePropertyBoolean enable) {
        this.enable = enable;
    }

    /**
     * Get ugCLimit
     * @return ugCLimit
     */
    public ConfigNodePropertyInteger getUgCLimit() {
        return ugCLimit;
    }

    public void setUgCLimit(ConfigNodePropertyInteger ugCLimit) {
        this.ugCLimit = ugCLimit;
    }

    /**
     * Get ugcLimitDuration
     * @return ugcLimitDuration
     */
    public ConfigNodePropertyInteger getUgcLimitDuration() {
        return ugcLimitDuration;
    }

    public void setUgcLimitDuration(ConfigNodePropertyInteger ugcLimitDuration) {
        this.ugcLimitDuration = ugcLimitDuration;
    }

    /**
     * Get domains
     * @return domains
     */
    public ConfigNodePropertyArray getDomains() {
        return domains;
    }

    public void setDomains(ConfigNodePropertyArray domains) {
        this.domains = domains;
    }

    /**
     * Get toList
     * @return toList
     */
    public ConfigNodePropertyArray getToList() {
        return toList;
    }

    public void setToList(ConfigNodePropertyArray toList) {
        this.toList = toList;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {\n");
        
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    ugCLimit: ").append(toIndentedString(ugCLimit)).append("\n");
        sb.append("    ugcLimitDuration: ").append(toIndentedString(ugcLimitDuration)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    toList: ").append(toIndentedString(toList)).append("\n");
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

