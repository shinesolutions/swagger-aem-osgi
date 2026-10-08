package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties   {
  private ConfigNodePropertyInteger threadPoolSize;
  private ConfigNodePropertyInteger delayTime;
  private ConfigNodePropertyInteger workerSleepTime;

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties threadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("threadPoolSize")
  @Valid public ConfigNodePropertyInteger getThreadPoolSize() {
    return threadPoolSize;
  }

  @JsonProperty("threadPoolSize")
  public void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties delayTime(ConfigNodePropertyInteger delayTime) {
    this.delayTime = delayTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delayTime")
  @Valid public ConfigNodePropertyInteger getDelayTime() {
    return delayTime;
  }

  @JsonProperty("delayTime")
  public void setDelayTime(ConfigNodePropertyInteger delayTime) {
    this.delayTime = delayTime;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties workerSleepTime(ConfigNodePropertyInteger workerSleepTime) {
    this.workerSleepTime = workerSleepTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("workerSleepTime")
  @Valid public ConfigNodePropertyInteger getWorkerSleepTime() {
    return workerSleepTime;
  }

  @JsonProperty("workerSleepTime")
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
    return Objects.equals(this.threadPoolSize, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.threadPoolSize) &&
        Objects.equals(this.delayTime, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.delayTime) &&
        Objects.equals(this.workerSleepTime, comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.workerSleepTime);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
