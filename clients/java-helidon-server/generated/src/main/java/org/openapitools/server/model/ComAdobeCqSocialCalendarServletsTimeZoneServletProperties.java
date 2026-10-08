package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties   {

    private ConfigNodePropertyInteger timezonesExpirytime;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCalendarServletsTimeZoneServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.
     *
     * @param timezonesExpirytime timezonesExpirytime
     */
    public ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(
        ConfigNodePropertyInteger timezonesExpirytime
    ) {
        this.timezonesExpirytime = timezonesExpirytime;
    }



    /**
     * Get timezonesExpirytime
     * @return timezonesExpirytime
     */
    public ConfigNodePropertyInteger getTimezonesExpirytime() {
        return timezonesExpirytime;
    }

    public void setTimezonesExpirytime(ConfigNodePropertyInteger timezonesExpirytime) {
        this.timezonesExpirytime = timezonesExpirytime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties {\n");
        
        sb.append("    timezonesExpirytime: ").append(toIndentedString(timezonesExpirytime)).append("\n");
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

