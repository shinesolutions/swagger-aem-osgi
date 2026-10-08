package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyFloat;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEventJobsQueueConfigurationProperties   {

    private ConfigNodePropertyString queueName;
    private ConfigNodePropertyArray queueTopics;
    private ConfigNodePropertyDropDown queueType;
    private ConfigNodePropertyDropDown queuePriority;
    private ConfigNodePropertyInteger queueRetries;
    private ConfigNodePropertyInteger queueRetrydelay;
    private ConfigNodePropertyFloat queueMaxparallel;
    private ConfigNodePropertyBoolean queueKeepJobs;
    private ConfigNodePropertyBoolean queuePreferRunOnCreationInstance;
    private ConfigNodePropertyInteger queueThreadPoolSize;
    private ConfigNodePropertyInteger serviceRanking;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEventJobsQueueConfigurationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEventJobsQueueConfigurationProperties.
     *
     * @param queueName queueName
     * @param queueTopics queueTopics
     * @param queueType queueType
     * @param queuePriority queuePriority
     * @param queueRetries queueRetries
     * @param queueRetrydelay queueRetrydelay
     * @param queueMaxparallel queueMaxparallel
     * @param queueKeepJobs queueKeepJobs
     * @param queuePreferRunOnCreationInstance queuePreferRunOnCreationInstance
     * @param queueThreadPoolSize queueThreadPoolSize
     * @param serviceRanking serviceRanking
     */
    public OrgApacheSlingEventJobsQueueConfigurationProperties(
        ConfigNodePropertyString queueName, 
        ConfigNodePropertyArray queueTopics, 
        ConfigNodePropertyDropDown queueType, 
        ConfigNodePropertyDropDown queuePriority, 
        ConfigNodePropertyInteger queueRetries, 
        ConfigNodePropertyInteger queueRetrydelay, 
        ConfigNodePropertyFloat queueMaxparallel, 
        ConfigNodePropertyBoolean queueKeepJobs, 
        ConfigNodePropertyBoolean queuePreferRunOnCreationInstance, 
        ConfigNodePropertyInteger queueThreadPoolSize, 
        ConfigNodePropertyInteger serviceRanking
    ) {
        this.queueName = queueName;
        this.queueTopics = queueTopics;
        this.queueType = queueType;
        this.queuePriority = queuePriority;
        this.queueRetries = queueRetries;
        this.queueRetrydelay = queueRetrydelay;
        this.queueMaxparallel = queueMaxparallel;
        this.queueKeepJobs = queueKeepJobs;
        this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
        this.queueThreadPoolSize = queueThreadPoolSize;
        this.serviceRanking = serviceRanking;
    }



    /**
     * Get queueName
     * @return queueName
     */
    public ConfigNodePropertyString getQueueName() {
        return queueName;
    }

    public void setQueueName(ConfigNodePropertyString queueName) {
        this.queueName = queueName;
    }

    /**
     * Get queueTopics
     * @return queueTopics
     */
    public ConfigNodePropertyArray getQueueTopics() {
        return queueTopics;
    }

    public void setQueueTopics(ConfigNodePropertyArray queueTopics) {
        this.queueTopics = queueTopics;
    }

    /**
     * Get queueType
     * @return queueType
     */
    public ConfigNodePropertyDropDown getQueueType() {
        return queueType;
    }

    public void setQueueType(ConfigNodePropertyDropDown queueType) {
        this.queueType = queueType;
    }

    /**
     * Get queuePriority
     * @return queuePriority
     */
    public ConfigNodePropertyDropDown getQueuePriority() {
        return queuePriority;
    }

    public void setQueuePriority(ConfigNodePropertyDropDown queuePriority) {
        this.queuePriority = queuePriority;
    }

    /**
     * Get queueRetries
     * @return queueRetries
     */
    public ConfigNodePropertyInteger getQueueRetries() {
        return queueRetries;
    }

    public void setQueueRetries(ConfigNodePropertyInteger queueRetries) {
        this.queueRetries = queueRetries;
    }

    /**
     * Get queueRetrydelay
     * @return queueRetrydelay
     */
    public ConfigNodePropertyInteger getQueueRetrydelay() {
        return queueRetrydelay;
    }

    public void setQueueRetrydelay(ConfigNodePropertyInteger queueRetrydelay) {
        this.queueRetrydelay = queueRetrydelay;
    }

    /**
     * Get queueMaxparallel
     * @return queueMaxparallel
     */
    public ConfigNodePropertyFloat getQueueMaxparallel() {
        return queueMaxparallel;
    }

    public void setQueueMaxparallel(ConfigNodePropertyFloat queueMaxparallel) {
        this.queueMaxparallel = queueMaxparallel;
    }

    /**
     * Get queueKeepJobs
     * @return queueKeepJobs
     */
    public ConfigNodePropertyBoolean getQueueKeepJobs() {
        return queueKeepJobs;
    }

    public void setQueueKeepJobs(ConfigNodePropertyBoolean queueKeepJobs) {
        this.queueKeepJobs = queueKeepJobs;
    }

    /**
     * Get queuePreferRunOnCreationInstance
     * @return queuePreferRunOnCreationInstance
     */
    public ConfigNodePropertyBoolean getQueuePreferRunOnCreationInstance() {
        return queuePreferRunOnCreationInstance;
    }

    public void setQueuePreferRunOnCreationInstance(ConfigNodePropertyBoolean queuePreferRunOnCreationInstance) {
        this.queuePreferRunOnCreationInstance = queuePreferRunOnCreationInstance;
    }

    /**
     * Get queueThreadPoolSize
     * @return queueThreadPoolSize
     */
    public ConfigNodePropertyInteger getQueueThreadPoolSize() {
        return queueThreadPoolSize;
    }

    public void setQueueThreadPoolSize(ConfigNodePropertyInteger queueThreadPoolSize) {
        this.queueThreadPoolSize = queueThreadPoolSize;
    }

    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEventJobsQueueConfigurationProperties {\n");
        
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    queueTopics: ").append(toIndentedString(queueTopics)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    queuePriority: ").append(toIndentedString(queuePriority)).append("\n");
        sb.append("    queueRetries: ").append(toIndentedString(queueRetries)).append("\n");
        sb.append("    queueRetrydelay: ").append(toIndentedString(queueRetrydelay)).append("\n");
        sb.append("    queueMaxparallel: ").append(toIndentedString(queueMaxparallel)).append("\n");
        sb.append("    queueKeepJobs: ").append(toIndentedString(queueKeepJobs)).append("\n");
        sb.append("    queuePreferRunOnCreationInstance: ").append(toIndentedString(queuePreferRunOnCreationInstance)).append("\n");
        sb.append("    queueThreadPoolSize: ").append(toIndentedString(queueThreadPoolSize)).append("\n");
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
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

