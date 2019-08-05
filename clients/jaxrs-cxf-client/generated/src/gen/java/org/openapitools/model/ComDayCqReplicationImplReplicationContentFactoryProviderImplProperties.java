package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean replicationContentUseFileStorage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger replicationContentMaxCommitAttempts = null;
 /**
   * Get replicationContentUseFileStorage
   * @return replicationContentUseFileStorage
  **/
  @JsonProperty("replication.content.useFileStorage")
  public ConfigNodePropertyBoolean getReplicationContentUseFileStorage() {
    return replicationContentUseFileStorage;
  }

  public void setReplicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
  }

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentUseFileStorage(ConfigNodePropertyBoolean replicationContentUseFileStorage) {
    this.replicationContentUseFileStorage = replicationContentUseFileStorage;
    return this;
  }

 /**
   * Get replicationContentMaxCommitAttempts
   * @return replicationContentMaxCommitAttempts
  **/
  @JsonProperty("replication.content.maxCommitAttempts")
  public ConfigNodePropertyInteger getReplicationContentMaxCommitAttempts() {
    return replicationContentMaxCommitAttempts;
  }

  public void setReplicationContentMaxCommitAttempts(ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
    this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
  }

  public ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties replicationContentMaxCommitAttempts(ConfigNodePropertyInteger replicationContentMaxCommitAttempts) {
    this.replicationContentMaxCommitAttempts = replicationContentMaxCommitAttempts;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

