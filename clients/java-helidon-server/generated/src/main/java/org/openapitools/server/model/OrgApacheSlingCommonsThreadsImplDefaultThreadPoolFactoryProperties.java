package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyInteger minPoolSize;
    private ConfigNodePropertyInteger maxPoolSize;
    private ConfigNodePropertyInteger queueSize;
    private ConfigNodePropertyInteger maxThreadAge;
    private ConfigNodePropertyInteger keepAliveTime;
    private ConfigNodePropertyDropDown blockPolicy;
    private ConfigNodePropertyBoolean shutdownGraceful;
    private ConfigNodePropertyBoolean daemon;
    private ConfigNodePropertyInteger shutdownWaitTime;
    private ConfigNodePropertyDropDown priority;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.
     *
     * @param name name
     * @param minPoolSize minPoolSize
     * @param maxPoolSize maxPoolSize
     * @param queueSize queueSize
     * @param maxThreadAge maxThreadAge
     * @param keepAliveTime keepAliveTime
     * @param blockPolicy blockPolicy
     * @param shutdownGraceful shutdownGraceful
     * @param daemon daemon
     * @param shutdownWaitTime shutdownWaitTime
     * @param priority priority
     */
    public OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyInteger minPoolSize, 
        ConfigNodePropertyInteger maxPoolSize, 
        ConfigNodePropertyInteger queueSize, 
        ConfigNodePropertyInteger maxThreadAge, 
        ConfigNodePropertyInteger keepAliveTime, 
        ConfigNodePropertyDropDown blockPolicy, 
        ConfigNodePropertyBoolean shutdownGraceful, 
        ConfigNodePropertyBoolean daemon, 
        ConfigNodePropertyInteger shutdownWaitTime, 
        ConfigNodePropertyDropDown priority
    ) {
        this.name = name;
        this.minPoolSize = minPoolSize;
        this.maxPoolSize = maxPoolSize;
        this.queueSize = queueSize;
        this.maxThreadAge = maxThreadAge;
        this.keepAliveTime = keepAliveTime;
        this.blockPolicy = blockPolicy;
        this.shutdownGraceful = shutdownGraceful;
        this.daemon = daemon;
        this.shutdownWaitTime = shutdownWaitTime;
        this.priority = priority;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get minPoolSize
     * @return minPoolSize
     */
    public ConfigNodePropertyInteger getMinPoolSize() {
        return minPoolSize;
    }

    public void setMinPoolSize(ConfigNodePropertyInteger minPoolSize) {
        this.minPoolSize = minPoolSize;
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
     * Get maxThreadAge
     * @return maxThreadAge
     */
    public ConfigNodePropertyInteger getMaxThreadAge() {
        return maxThreadAge;
    }

    public void setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge) {
        this.maxThreadAge = maxThreadAge;
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
     * Get blockPolicy
     * @return blockPolicy
     */
    public ConfigNodePropertyDropDown getBlockPolicy() {
        return blockPolicy;
    }

    public void setBlockPolicy(ConfigNodePropertyDropDown blockPolicy) {
        this.blockPolicy = blockPolicy;
    }

    /**
     * Get shutdownGraceful
     * @return shutdownGraceful
     */
    public ConfigNodePropertyBoolean getShutdownGraceful() {
        return shutdownGraceful;
    }

    public void setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful) {
        this.shutdownGraceful = shutdownGraceful;
    }

    /**
     * Get daemon
     * @return daemon
     */
    public ConfigNodePropertyBoolean getDaemon() {
        return daemon;
    }

    public void setDaemon(ConfigNodePropertyBoolean daemon) {
        this.daemon = daemon;
    }

    /**
     * Get shutdownWaitTime
     * @return shutdownWaitTime
     */
    public ConfigNodePropertyInteger getShutdownWaitTime() {
        return shutdownWaitTime;
    }

    public void setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime) {
        this.shutdownWaitTime = shutdownWaitTime;
    }

    /**
     * Get priority
     * @return priority
     */
    public ConfigNodePropertyDropDown getPriority() {
        return priority;
    }

    public void setPriority(ConfigNodePropertyDropDown priority) {
        this.priority = priority;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    minPoolSize: ").append(toIndentedString(minPoolSize)).append("\n");
        sb.append("    maxPoolSize: ").append(toIndentedString(maxPoolSize)).append("\n");
        sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
        sb.append("    maxThreadAge: ").append(toIndentedString(maxThreadAge)).append("\n");
        sb.append("    keepAliveTime: ").append(toIndentedString(keepAliveTime)).append("\n");
        sb.append("    blockPolicy: ").append(toIndentedString(blockPolicy)).append("\n");
        sb.append("    shutdownGraceful: ").append(toIndentedString(shutdownGraceful)).append("\n");
        sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
        sb.append("    shutdownWaitTime: ").append(toIndentedString(shutdownWaitTime)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

