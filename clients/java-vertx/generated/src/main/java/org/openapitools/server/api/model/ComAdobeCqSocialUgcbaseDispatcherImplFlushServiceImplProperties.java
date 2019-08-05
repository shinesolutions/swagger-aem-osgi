package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties   {
  
  private ConfigNodePropertyInteger threadPoolSize = null;
  private ConfigNodePropertyInteger delayTime = null;
  private ConfigNodePropertyInteger workerSleepTime = null;

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties () {

  }

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties (ConfigNodePropertyInteger threadPoolSize, ConfigNodePropertyInteger delayTime, ConfigNodePropertyInteger workerSleepTime) {
    this.threadPoolSize = threadPoolSize;
    this.delayTime = delayTime;
    this.workerSleepTime = workerSleepTime;
  }

    
  @JsonProperty("threadPoolSize")
  public ConfigNodePropertyInteger getThreadPoolSize() {
    return threadPoolSize;
  }
  public void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
  }

    
  @JsonProperty("delayTime")
  public ConfigNodePropertyInteger getDelayTime() {
    return delayTime;
  }
  public void setDelayTime(ConfigNodePropertyInteger delayTime) {
    this.delayTime = delayTime;
  }

    
  @JsonProperty("workerSleepTime")
  public ConfigNodePropertyInteger getWorkerSleepTime() {
    return workerSleepTime;
  }
  public void setWorkerSleepTime(ConfigNodePropertyInteger workerSleepTime) {
    this.workerSleepTime = workerSleepTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties = (ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties) o;
    return Objects.equals(threadPoolSize, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.threadPoolSize) &&
        Objects.equals(delayTime, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.delayTime) &&
        Objects.equals(workerSleepTime, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.workerSleepTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threadPoolSize, delayTime, workerSleepTime);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
