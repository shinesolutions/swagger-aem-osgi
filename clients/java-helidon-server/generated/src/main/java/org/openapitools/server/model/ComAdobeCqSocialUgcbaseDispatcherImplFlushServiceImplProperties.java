package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties   {

    private ConfigNodePropertyInteger threadPoolSize;
    private ConfigNodePropertyInteger delayTime;
    private ConfigNodePropertyInteger workerSleepTime;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.
     *
     * @param threadPoolSize threadPoolSize
     * @param delayTime delayTime
     * @param workerSleepTime workerSleepTime
     */
    public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(
        ConfigNodePropertyInteger threadPoolSize, 
        ConfigNodePropertyInteger delayTime, 
        ConfigNodePropertyInteger workerSleepTime
    ) {
        this.threadPoolSize = threadPoolSize;
        this.delayTime = delayTime;
        this.workerSleepTime = workerSleepTime;
    }



    /**
     * Get threadPoolSize
     * @return threadPoolSize
     */
    public ConfigNodePropertyInteger getThreadPoolSize() {
        return threadPoolSize;
    }

    public void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
        this.threadPoolSize = threadPoolSize;
    }

    /**
     * Get delayTime
     * @return delayTime
     */
    public ConfigNodePropertyInteger getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(ConfigNodePropertyInteger delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * Get workerSleepTime
     * @return workerSleepTime
     */
    public ConfigNodePropertyInteger getWorkerSleepTime() {
        return workerSleepTime;
    }

    public void setWorkerSleepTime(ConfigNodePropertyInteger workerSleepTime) {
        this.workerSleepTime = workerSleepTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {\n");
        
        sb.append("    threadPoolSize: ").append(toIndentedString(threadPoolSize)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    workerSleepTime: ").append(toIndentedString(workerSleepTime)).append("\n");
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

