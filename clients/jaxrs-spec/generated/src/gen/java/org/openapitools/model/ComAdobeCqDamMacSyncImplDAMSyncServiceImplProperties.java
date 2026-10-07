package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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



@JsonTypeName("comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties   {
  private ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
  private ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
  private ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
  private ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform;

  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties() {
  }

  /**
   **/
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) {
    this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")
  @Valid public ConfigNodePropertyArray getComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths() {
    return comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
  }

  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")
  public void setComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) {
    this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
  }

  /**
   **/
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) {
    this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")
  @Valid public ConfigNodePropertyBoolean getComAdobeCqDamMacSyncDamsyncserviceSyncRenditions() {
    return comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
  }

  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")
  public void setComAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) {
    this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
  }

  /**
   **/
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) {
    this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")
  @Valid public ConfigNodePropertyInteger getComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs() {
    return comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
  }

  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")
  public void setComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) {
    this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
  }

  /**
   **/
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform) {
    this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.platform")
  @Valid public ConfigNodePropertyDropDown getComAdobeCqDamMacSyncDamsyncservicePlatform() {
    return comAdobeCqDamMacSyncDamsyncservicePlatform;
  }

  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.platform")
  public void setComAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform) {
    this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties = (ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties) o;
    return Objects.equals(this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) &&
        Objects.equals(this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) &&
        Objects.equals(this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) &&
        Objects.equals(this.comAdobeCqDamMacSyncDamsyncservicePlatform, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.comAdobeCqDamMacSyncDamsyncservicePlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths, comAdobeCqDamMacSyncDamsyncserviceSyncRenditions, comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs, comAdobeCqDamMacSyncDamsyncservicePlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {\n");
    
    sb.append("    comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths)).append("\n");
    sb.append("    comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncserviceSyncRenditions)).append("\n");
    sb.append("    comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs)).append("\n");
    sb.append("    comAdobeCqDamMacSyncDamsyncservicePlatform: ").append(toIndentedString(comAdobeCqDamMacSyncDamsyncservicePlatform)).append("\n");
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
