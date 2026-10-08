package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties   {

    private ConfigNodePropertyInteger poolSize;
    private ConfigNodePropertyInteger maxPoolSize;
    private ConfigNodePropertyInteger queueSize;
    private ConfigNodePropertyInteger keepAliveTime;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.
     *
     * @param poolSize poolSize
     * @param maxPoolSize maxPoolSize
     * @param queueSize queueSize
     * @param keepAliveTime keepAliveTime
     */
    public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(
        ConfigNodePropertyInteger poolSize, 
        ConfigNodePropertyInteger maxPoolSize, 
        ConfigNodePropertyInteger queueSize, 
        ConfigNodePropertyInteger keepAliveTime
    ) {
        this.poolSize = poolSize;
        this.maxPoolSize = maxPoolSize;
        this.queueSize = queueSize;
        this.keepAliveTime = keepAliveTime;
    }



    /**
     * Get poolSize
     * @return poolSize
     */
    public ConfigNodePropertyInteger getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(ConfigNodePropertyInteger poolSize) {
        this.poolSize = poolSize;
    }

    /**
     * Get maxPoolSize
     * @return maxPoolSize
     */
    public ConfigNodePropertyInteger getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    /**
     * Get queueSize
     * @return queueSize
     */
    public ConfigNodePropertyInteger getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(ConfigNodePropertyInteger queueSize) {
        this.queueSize = queueSize;
    }

    /**
     * Get keepAliveTime
     * @return keepAliveTime
     */
    public ConfigNodePropertyInteger getKeepAliveTime() {
        return keepAliveTime;
    }

    public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {\n");
        
        sb.append("    poolSize: ").append(toIndentedString(poolSize)).append("\n");
        sb.append("    maxPoolSize: ").append(toIndentedString(maxPoolSize)).append("\n");
        sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
        sb.append("    keepAliveTime: ").append(toIndentedString(keepAliveTime)).append("\n");
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

