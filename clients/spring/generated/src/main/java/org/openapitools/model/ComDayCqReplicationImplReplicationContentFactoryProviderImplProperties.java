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
 * ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
 */

@JsonTypeName("comDayCqReplicationImplReplicationContentFactoryProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean replicationContentUseFileStorage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger replicationContentMaxCommitAttempts;

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentUseFileStorage(@Nullable ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
    return this;
  }

  /**
   * Get replicationContentUseFileStorage
   * @return replicationContentUseFileStorage
   */
  @Valid 
  @Schema(name = "replication.content.useFileStorage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replication.content.useFileStorage")
  public @Nullable ConfigNodePropertyBoolean getReplicationContentUseFileStorage() {
    return replicationContentUseFileStorage;
  }

  @JsonProperty("replication.content.useFileStorage")
  public void setReplicationContentUseFileStorage(@Nullable ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
  }

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentMaxCommitAttempts(@Nullable ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
    this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
    return this;
  }

  /**
   * Get replicationContentMaxCommitAttempts
   * @return replicationContentMaxCommitAttempts
   */
  @Valid 
  @Schema(name = "replication.content.maxCommitAttempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replication.content.maxCommitAttempts")
  public @Nullable ConfigNodePropertyInteger getReplicationContentMaxCommitAttempts() {
    return replicationContentMaxCommitAttempts;
  }

  @JsonProperty("replication.content.maxCommitAttempts")
  public void setReplicationContentMaxCommitAttempts(@Nullable ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
    this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties comDayCqReplicationImplReplicationContentFactoryProviderImplProperties = (ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties) o;
    return Objects.equals(this.replicationContentUseFileStorage, comDayCqReplicationImplReplicationContentFactoryProviderImplProperties.replicationContentUseFileStorage) &&
        Objects.equals(this.replicationContentMaxCommitAttempts, comDayCqReplicationImplReplicationContentFactoryProviderImplProperties.replicationContentMaxCommitAttempts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationContentUseFileStorage, replicationContentMaxCommitAttempts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {\n");
    sb.append("    replicationContentUseFileStorage: ").append(toIndentedString(replicationContentUseFileStorage)).append("\n");
    sb.append("    replicationContentMaxCommitAttempts: ").append(toIndentedString(replicationContentMaxCommitAttempts)).append("\n");
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

