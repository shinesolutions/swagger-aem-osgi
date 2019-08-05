package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger threadPoolSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger delayTime = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger workerSleepTime = null;
 /**
   * Get threadPoolSize
   * @return threadPoolSize
  **/
  @JsonProperty("threadPoolSize")
  public ConfigNodePropertyInteger getThreadPoolSize() {
    return threadPoolSize;
  }

  public void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
  }

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties threadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
    return this;
  }

 /**
   * Get delayTime
   * @return delayTime
  **/
  @JsonProperty("delayTime")
  public ConfigNodePropertyInteger getDelayTime() {
    return delayTime;
  }

  public void setDelayTime(ConfigNodePropertyInteger delayTime) {
    this.delayTime = delayTime;
  }

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties delayTime(ConfigNodePropertyInteger delayTime) {
    this.delayTime = delayTime;
    return this;
  }

 /**
   * Get workerSleepTime
   * @return workerSleepTime
  **/
  @JsonProperty("workerSleepTime")
  public ConfigNodePropertyInteger getWorkerSleepTime() {
    return workerSleepTime;
  }

  public void setWorkerSleepTime(ConfigNodePropertyInteger workerSleepTime) {
    this.workerSleepTime = workerSleepTime;
  }

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties workerSleepTime(ConfigNodePropertyInteger workerSleepTime) {
    this.workerSleepTime = workerSleepTime;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

