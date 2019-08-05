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

public class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger poolSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxPoolSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger queueSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger keepAliveTime = null;
 /**
   * Get poolSize
   * @return poolSize
  **/
  @JsonProperty("poolSize")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

 /**
   * Get maxPoolSize
   * @return maxPoolSize
  **/
  @JsonProperty("maxPoolSize")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties maxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

 /**
   * Get queueSize
   * @return queueSize
  **/
  @JsonProperty("queueSize")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

 /**
   * Get keepAliveTime
   * @return keepAliveTime
  **/
  @JsonProperty("keepAliveTime")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties keepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

