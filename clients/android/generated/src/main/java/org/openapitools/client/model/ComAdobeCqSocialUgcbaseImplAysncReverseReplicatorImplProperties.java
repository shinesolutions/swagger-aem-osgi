/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {
  
  @SerializedName("poolSize")
  private ConfigNodePropertyInteger poolSize = null;
  @SerializedName("maxPoolSize")
  private ConfigNodePropertyInteger maxPoolSize = null;
  @SerializedName("queueSize")
  private ConfigNodePropertyInteger queueSize = null;
  @SerializedName("keepAliveTime")
  private ConfigNodePropertyInteger keepAliveTime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }
  public void setPoolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }
  public void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }
  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }
  public void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties = (ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties) o;
    return (this.poolSize == null ? comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.poolSize == null : this.poolSize.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.poolSize)) &&
        (this.maxPoolSize == null ? comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.maxPoolSize == null : this.maxPoolSize.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.maxPoolSize)) &&
        (this.queueSize == null ? comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.queueSize == null : this.queueSize.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.queueSize)) &&
        (this.keepAliveTime == null ? comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.keepAliveTime == null : this.keepAliveTime.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.keepAliveTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.poolSize == null ? 0: this.poolSize.hashCode());
    result = 31 * result + (this.maxPoolSize == null ? 0: this.maxPoolSize.hashCode());
    result = 31 * result + (this.queueSize == null ? 0: this.queueSize.hashCode());
    result = 31 * result + (this.keepAliveTime == null ? 0: this.keepAliveTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {\n");
    
    sb.append("  poolSize: ").append(poolSize).append("\n");
    sb.append("  maxPoolSize: ").append(maxPoolSize).append("\n");
    sb.append("  queueSize: ").append(queueSize).append("\n");
    sb.append("  keepAliveTime: ").append(keepAliveTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}