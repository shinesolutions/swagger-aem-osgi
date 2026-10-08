package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqReplicationImplReplicationReceiverImplProperties
 */

@JsonTypeName("comDayCqReplicationImplReplicationReceiverImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplReplicationReceiverImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger receiverTmpfileThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean receiverPackagesUseInstall;

  public ComDayCqReplicationImplReplicationReceiverImplProperties receiverTmpfileThreshold(@Nullable ConfigNodePropertyInteger receiverTmpfileThreshold) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
    return this;
  }

  /**
   * Get receiverTmpfileThreshold
   * @return receiverTmpfileThreshold
   */
  @Valid 
  @Schema(name = "receiver.tmpfile.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receiver.tmpfile.threshold")
  public @Nullable ConfigNodePropertyInteger getReceiverTmpfileThreshold() {
    return receiverTmpfileThreshold;
  }

  @JsonProperty("receiver.tmpfile.threshold")
  public void setReceiverTmpfileThreshold(@Nullable ConfigNodePropertyInteger receiverTmpfileThreshold) {
    this.receiverTmpfileThreshold = receiverTmpfileThreshold;
  }

  public ComDayCqReplicationImplReplicationReceiverImplProperties receiverPackagesUseInstall(@Nullable ConfigNodePropertyBoolean receiverPackagesUseInstall) {
    this.receiverPackagesUseInstall = receiverPackagesUseInstall;
    return this;
  }

  /**
   * Get receiverPackagesUseInstall
   * @return receiverPackagesUseInstall
   */
  @Valid 
  @Schema(name = "receiver.packages.use.install", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receiver.packages.use.install")
  public @Nullable ConfigNodePropertyBoolean getReceiverPackagesUseInstall() {
    return receiverPackagesUseInstall;
  }

  @JsonProperty("receiver.packages.use.install")
  public void setReceiverPackagesUseInstall(@Nullable ConfigNodePropertyBoolean receiverPackagesUseInstall) {
    this.receiverPackagesUseInstall = receiverPackagesUseInstall;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplReplicationReceiverImplProperties comDayCqReplicationImplReplicationReceiverImplProperties = (ComDayCqReplicationImplReplicationReceiverImplProperties) o;
    return Objects.equals(this.receiverTmpfileThreshold, comDayCqReplicationImplReplicationReceiverImplProperties.receiverTmpfileThreshold) &&
        Objects.equals(this.receiverPackagesUseInstall, comDayCqReplicationImplReplicationReceiverImplProperties.receiverPackagesUseInstall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiverTmpfileThreshold, receiverPackagesUseInstall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplReplicationReceiverImplProperties {\n");
    sb.append("    receiverTmpfileThreshold: ").append(toIndentedString(receiverTmpfileThreshold)).append("\n");
    sb.append("    receiverPackagesUseInstall: ").append(toIndentedString(receiverPackagesUseInstall)).append("\n");
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

