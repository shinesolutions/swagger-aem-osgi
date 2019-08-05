package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties   {
  @JsonProperty("threadPoolSize")
  private ConfigNodePropertyInteger threadPoolSize = null;

  @JsonProperty("delayTime")
  private ConfigNodePropertyInteger delayTime = null;

  @JsonProperty("workerSleepTime")
  private ConfigNodePropertyInteger workerSleepTime = null;

  public ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties threadPoolSize(ConfigNodePropertyInteger threadPoolSize) {
    this.threadPoolSize = threadPoolSize;
    return this;
  }

   /**
   * Get threadPoolSize
   * @return threadPoolSize
  **/
  @Valid
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
  **/
  @Valid
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
  **/
  @Valid
  public ConfigNodePropertyInteger getWorkerSleepTime() {
    return workerSleepTime;
  }

  public void setWorkerSleepTime(ConfigNodePropertyInteger workerSleepTime) {
    this.workerSleepTime = workerSleepTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

