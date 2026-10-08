package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger poolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxPoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger queueSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger keepAliveTime;

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties poolSize(@Nullable ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
    return this;
  }

  /**
   * Get poolSize
   * @return poolSize
   */
  @Valid 
  @Schema(name = "poolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poolSize")
  public @Nullable ConfigNodePropertyInteger getPoolSize() {
    return poolSize;
  }

  @JsonProperty("poolSize")
  public void setPoolSize(@Nullable ConfigNodePropertyInteger poolSize) {
    this.poolSize = poolSize;
  }

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties maxPoolSize(@Nullable ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
    return this;
  }

  /**
   * Get maxPoolSize
   * @return maxPoolSize
   */
  @Valid 
  @Schema(name = "maxPoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPoolSize")
  public @Nullable ConfigNodePropertyInteger getMaxPoolSize() {
    return maxPoolSize;
  }

  @JsonProperty("maxPoolSize")
  public void setMaxPoolSize(@Nullable ConfigNodePropertyInteger maxPoolSize) {
    this.maxPoolSize = maxPoolSize;
  }

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties queueSize(@Nullable ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

  /**
   * Get queueSize
   * @return queueSize
   */
  @Valid 
  @Schema(name = "queueSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queueSize")
  public @Nullable ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  @JsonProperty("queueSize")
  public void setQueueSize(@Nullable ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties keepAliveTime(@Nullable ConfigNodePropertyInteger keepAliveTime) {
    this.keepAliveTime = keepAliveTime;
    return this;
  }

  /**
   * Get keepAliveTime
   * @return keepAliveTime
   */
  @Valid 
  @Schema(name = "keepAliveTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keepAliveTime")
  public @Nullable ConfigNodePropertyInteger getKeepAliveTime() {
    return keepAliveTime;
  }

  @JsonProperty("keepAliveTime")
  public void setKeepAliveTime(@Nullable ConfigNodePropertyInteger keepAliveTime) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

