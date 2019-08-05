package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties   {
  @JsonProperty("poolSize")
  private ConfigNodePropertyInteger poolSize = null;

  @JsonProperty("maxPoolSize")
  private ConfigNodePropertyInteger maxPoolSize = null;

  @JsonProperty("queueSize")
  private ConfigNodePropertyInteger queueSize = null;

  @JsonProperty("keepAliveTime")
  private ConfigNodePropertyInteger keepAliveTime = null;

  /**
   **/
  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("poolSize")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }
  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }
  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }
  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties = (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties) o;
    return Objects.equals(poolSize, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.poolSize) &&
        Objects.equals(maxPoolSize, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.maxPoolSize) &&
        Objects.equals(queueSize, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.queueSize) &&
        Objects.equals(keepAliveTime, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.keepAliveTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolSize, maxPoolSize, queueSize, keepAliveTime);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

