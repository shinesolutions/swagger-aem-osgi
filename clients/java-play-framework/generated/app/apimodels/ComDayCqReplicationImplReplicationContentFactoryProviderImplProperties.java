package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties   {
  @JsonProperty("replication.content.useFileStorage")
  @Valid

  private ConfigNodePropertyBoolean replicationContentUseFileStorage;

  @JsonProperty("replication.content.maxCommitAttempts")
  @Valid

  private ConfigNodePropertyInteger replicationContentMaxCommitAttempts;

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
    return this;
  }

   /**
   * Get replicationContentUseFileStorage
   * @return replicationContentUseFileStorage
  **/
  public ConfigNodePropertyBoolean getReplicationContentUseFileStorage() {
    return replicationContentUseFileStorage;
  }

  public void setReplicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
  }

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentMaxCommitAttempts(ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
    this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
    return this;
  }

   /**
   * Get replicationContentMaxCommitAttempts
   * @return replicationContentMaxCommitAttempts
  **/
  public ConfigNodePropertyInteger getReplicationContentMaxCommitAttempts() {
    return replicationContentMaxCommitAttempts;
  }

  public void setReplicationContentMaxCommitAttempts(ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
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
    return Objects.equals(replicationContentUseFileStorage, comDayCqReplicationImplReplicationContentFactoryProviderImplProperties.replicationContentUseFileStorage) &&
        Objects.equals(replicationContentMaxCommitAttempts, comDayCqReplicationImplReplicationContentFactoryProviderImplProperties.replicationContentMaxCommitAttempts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicationContentUseFileStorage, replicationContentMaxCommitAttempts);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

