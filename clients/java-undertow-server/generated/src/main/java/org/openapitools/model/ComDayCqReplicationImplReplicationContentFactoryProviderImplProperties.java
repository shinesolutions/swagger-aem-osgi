/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties   {
  
  private ConfigNodePropertyBoolean replicationContentUseFileStorage;
  private ConfigNodePropertyInteger replicationContentMaxCommitAttempts;

  /**
   */
  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("replication.content.useFileStorage")
  public ConfigNodePropertyBoolean getReplicationContentUseFileStorage() {
    return replicationContentUseFileStorage;
  }
  public void setReplicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
  }

  /**
   */
  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentMaxCommitAttempts(ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
    this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

