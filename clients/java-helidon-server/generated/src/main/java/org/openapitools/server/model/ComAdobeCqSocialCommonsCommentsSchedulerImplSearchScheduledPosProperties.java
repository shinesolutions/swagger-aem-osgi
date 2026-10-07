package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties   {

    private ConfigNodePropertyBoolean enableScheduledPostsSearch;
    private ConfigNodePropertyInteger numberOfMinutes;
    private ConfigNodePropertyInteger maxSearchLimit;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.
     *
     * @param enableScheduledPostsSearch enableScheduledPostsSearch
     * @param numberOfMinutes numberOfMinutes
     * @param maxSearchLimit maxSearchLimit
     */
    public ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(
        ConfigNodePropertyBoolean enableScheduledPostsSearch, 
        ConfigNodePropertyInteger numberOfMinutes, 
        ConfigNodePropertyInteger maxSearchLimit
    ) {
        this.enableScheduledPostsSearch = enableScheduledPostsSearch;
        this.numberOfMinutes = numberOfMinutes;
        this.maxSearchLimit = maxSearchLimit;
    }



    /**
     * Get enableScheduledPostsSearch
     * @return enableScheduledPostsSearch
     */
    public ConfigNodePropertyBoolean getEnableScheduledPostsSearch() {
        return enableScheduledPostsSearch;
    }

    public void setEnableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch) {
        this.enableScheduledPostsSearch = enableScheduledPostsSearch;
    }

    /**
     * Get numberOfMinutes
     * @return numberOfMinutes
     */
    public ConfigNodePropertyInteger getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(ConfigNodePropertyInteger numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    /**
     * Get maxSearchLimit
     * @return maxSearchLimit
     */
    public ConfigNodePropertyInteger getMaxSearchLimit() {
        return maxSearchLimit;
    }

    public void setMaxSearchLimit(ConfigNodePropertyInteger maxSearchLimit) {
        this.maxSearchLimit = maxSearchLimit;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {\n");
        
        sb.append("    enableScheduledPostsSearch: ").append(toIndentedString(enableScheduledPostsSearch)).append("\n");
        sb.append("    numberOfMinutes: ").append(toIndentedString(numberOfMinutes)).append("\n");
        sb.append("    maxSearchLimit: ").append(toIndentedString(maxSearchLimit)).append("\n");
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

