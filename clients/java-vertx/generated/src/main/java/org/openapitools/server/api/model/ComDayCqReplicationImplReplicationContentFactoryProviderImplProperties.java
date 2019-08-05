package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties   {
  
  private ConfigNodePropertyBoolean replicationContentUseFileStorage = null;
  private ConfigNodePropertyInteger replicationContentMaxCommitAttempts = null;

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties () {

  }

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties (ConfigNodePropertyBoolean replicationContentUseFileStorage, ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
    this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
  }

    
  @JsonProperty("replication.content.useFileStorage")
  public ConfigNodePropertyBoolean getReplicationContentUseFileStorage() {
    return replicationContentUseFileStorage;
  }
  public void setReplicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
  }

    
  @JsonProperty("replication.content.maxCommitAttempts")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
