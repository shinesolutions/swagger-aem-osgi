package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties   {

    private ConfigNodePropertyBoolean notifyOnupdate;
    private ConfigNodePropertyBoolean notifyOncomplete;

    /**
     * Default constructor.
     */
    public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.
     *
     * @param notifyOnupdate notifyOnupdate
     * @param notifyOncomplete notifyOncomplete
     */
    public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(
        ConfigNodePropertyBoolean notifyOnupdate, 
        ConfigNodePropertyBoolean notifyOncomplete
    ) {
        this.notifyOnupdate = notifyOnupdate;
        this.notifyOncomplete = notifyOncomplete;
    }



    /**
     * Get notifyOnupdate
     * @return notifyOnupdate
     */
    public ConfigNodePropertyBoolean getNotifyOnupdate() {
        return notifyOnupdate;
    }

    public void setNotifyOnupdate(ConfigNodePropertyBoolean notifyOnupdate) {
        this.notifyOnupdate = notifyOnupdate;
    }

    /**
     * Get notifyOncomplete
     * @return notifyOncomplete
     */
    public ConfigNodePropertyBoolean getNotifyOncomplete() {
        return notifyOncomplete;
    }

    public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
        this.notifyOncomplete = notifyOncomplete;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {\n");
        
        sb.append("    notifyOnupdate: ").append(toIndentedString(notifyOnupdate)).append("\n");
        sb.append("    notifyOncomplete: ").append(toIndentedString(notifyOncomplete)).append("\n");
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

