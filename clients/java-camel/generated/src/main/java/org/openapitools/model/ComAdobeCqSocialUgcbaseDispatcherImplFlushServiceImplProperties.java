package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {

  private ConfigNodePropertyInteger threadPoolSize;

  private ConfigNodePropertyInteger delayTime;

  private ConfigNodePropertyInteger workerSleepTime;

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties threadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
    return this;
  }

  /**
   * Get threadPoolSize
   * @return threadPoolSize
   */
  @Valid 
  @Schema(name = "threadPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threadPoolSize")
  public ConfigNodePropertyInteger getThreadPoolSize() {
    return threadPoolSize;
  }

  public void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
  }

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties delayTime(ConfigNodePropertyInteger delayTime) {
    this.delayTime = delayTime;
    return this;
  }

  /**
   * Get delayTime
   * @return delayTime
   */
  @Valid 
  @Schema(name = "delayTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delayTime")
  public ConfigNodePropertyInteger getDelayTime() {
    return delayTime;
  }

  public void setDelayTime(ConfigNodePropertyInteger delayTime) {
    this.delayTime = delayTime;
  }

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties workerSleepTime(ConfigNodePropertyInteger workerSleepTime) {
    this.workerSleepTime = workerSleepTime;
    return this;
  }

  /**
   * Get workerSleepTime
   * @return workerSleepTime
   */
  @Valid 
  @Schema(name = "workerSleepTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

