package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyFloat;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixEventadminImplEventAdminProperties   {

    private ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize;
    private ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio;
    private ConfigNodePropertyInteger orgApacheFelixEventadminTimeout;
    private ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic;
    private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout;
    private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic;

    /**
     * Default constructor.
     */
    public OrgApacheFelixEventadminImplEventAdminProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixEventadminImplEventAdminProperties.
     *
     * @param orgApacheFelixEventadminThreadPoolSize orgApacheFelixEventadminThreadPoolSize
     * @param orgApacheFelixEventadminAsyncToSyncThreadRatio orgApacheFelixEventadminAsyncToSyncThreadRatio
     * @param orgApacheFelixEventadminTimeout orgApacheFelixEventadminTimeout
     * @param orgApacheFelixEventadminRequireTopic orgApacheFelixEventadminRequireTopic
     * @param orgApacheFelixEventadminIgnoreTimeout orgApacheFelixEventadminIgnoreTimeout
     * @param orgApacheFelixEventadminIgnoreTopic orgApacheFelixEventadminIgnoreTopic
     */
    public OrgApacheFelixEventadminImplEventAdminProperties(
        ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize, 
        ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio, 
        ConfigNodePropertyInteger orgApacheFelixEventadminTimeout, 
        ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic, 
        ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout, 
        ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic
    ) {
        this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
        this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
        this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
        this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
        this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
        this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
    }



    /**
     * Get orgApacheFelixEventadminThreadPoolSize
     * @return orgApacheFelixEventadminThreadPoolSize
     */
    public ConfigNodePropertyInteger getOrgApacheFelixEventadminThreadPoolSize() {
        return orgApacheFelixEventadminThreadPoolSize;
    }

    public void setOrgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
        this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
    }

    /**
     * Get orgApacheFelixEventadminAsyncToSyncThreadRatio
     * @return orgApacheFelixEventadminAsyncToSyncThreadRatio
     */
    public ConfigNodePropertyFloat getOrgApacheFelixEventadminAsyncToSyncThreadRatio() {
        return orgApacheFelixEventadminAsyncToSyncThreadRatio;
    }

    public void setOrgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
        this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
    }

    /**
     * Get orgApacheFelixEventadminTimeout
     * @return orgApacheFelixEventadminTimeout
     */
    public ConfigNodePropertyInteger getOrgApacheFelixEventadminTimeout() {
        return orgApacheFelixEventadminTimeout;
    }

    public void setOrgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
        this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
    }

    /**
     * Get orgApacheFelixEventadminRequireTopic
     * @return orgApacheFelixEventadminRequireTopic
     */
    public ConfigNodePropertyBoolean getOrgApacheFelixEventadminRequireTopic() {
        return orgApacheFelixEventadminRequireTopic;
    }

    public void setOrgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
        this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
    }

    /**
     * Get orgApacheFelixEventadminIgnoreTimeout
     * @return orgApacheFelixEventadminIgnoreTimeout
     */
    public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTimeout() {
        return orgApacheFelixEventadminIgnoreTimeout;
    }

    public void setOrgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
        this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
    }

    /**
     * Get orgApacheFelixEventadminIgnoreTopic
     * @return orgApacheFelixEventadminIgnoreTopic
     */
    public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTopic() {
        return orgApacheFelixEventadminIgnoreTopic;
    }

    public void setOrgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
        this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixEventadminImplEventAdminProperties {\n");
        
        sb.append("    orgApacheFelixEventadminThreadPoolSize: ").append(toIndentedString(orgApacheFelixEventadminThreadPoolSize)).append("\n");
        sb.append("    orgApacheFelixEventadminAsyncToSyncThreadRatio: ").append(toIndentedString(orgApacheFelixEventadminAsyncToSyncThreadRatio)).append("\n");
        sb.append("    orgApacheFelixEventadminTimeout: ").append(toIndentedString(orgApacheFelixEventadminTimeout)).append("\n");
        sb.append("    orgApacheFelixEventadminRequireTopic: ").append(toIndentedString(orgApacheFelixEventadminRequireTopic)).append("\n");
        sb.append("    orgApacheFelixEventadminIgnoreTimeout: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTimeout)).append("\n");
        sb.append("    orgApacheFelixEventadminIgnoreTopic: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTopic)).append("\n");
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

