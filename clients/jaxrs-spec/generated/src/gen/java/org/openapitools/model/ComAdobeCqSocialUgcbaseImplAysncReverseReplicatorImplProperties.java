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



@JsonTypeName("comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties   {
  private ConfigNodePropertyInteger poolSize;
  private ConfigNodePropertyInteger maxPoolSize;
  private ConfigNodePropertyInteger queueSize;
  private ConfigNodePropertyInteger keepAliveTime;

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties poolSize(ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("poolSize")
  @Valid public ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  @JsonProperty("poolSize")
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
  @Valid public ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  @JsonProperty("maxPoolSize")
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
  @Valid public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  @JsonProperty("queueSize")
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
  @Valid public ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  @JsonProperty("keepAliveTime")
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
    return Objects.equals(this.poolSize, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.poolSize) &&
        Objects.equals(this.maxPoolSize, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.maxPoolSize) &&
        Objects.equals(this.queueSize, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.queueSize) &&
        Objects.equals(this.keepAliveTime, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.keepAliveTime);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
