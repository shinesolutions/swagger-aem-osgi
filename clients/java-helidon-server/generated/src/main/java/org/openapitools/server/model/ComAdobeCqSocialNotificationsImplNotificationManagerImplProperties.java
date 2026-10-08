package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties   {

    private ConfigNodePropertyInteger maxUnreadNotificationCount;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.
     *
     * @param maxUnreadNotificationCount maxUnreadNotificationCount
     */
    public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(
        ConfigNodePropertyInteger maxUnreadNotificationCount
    ) {
        this.maxUnreadNotificationCount = maxUnreadNotificationCount;
    }



    /**
     * Get maxUnreadNotificationCount
     * @return maxUnreadNotificationCount
     */
    public ConfigNodePropertyInteger getMaxUnreadNotificationCount() {
        return maxUnreadNotificationCount;
    }

    public void setMaxUnreadNotificationCount(ConfigNodePropertyInteger maxUnreadNotificationCount) {
        this.maxUnreadNotificationCount = maxUnreadNotificationCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties {\n");
        
        sb.append("    maxUnreadNotificationCount: ").append(toIndentedString(maxUnreadNotificationCount)).append("\n");
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

