package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties   {
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")
  private ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = null;

  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")
  private ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = null;

  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")
  private ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = null;

  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.platform")
  private ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform = null;

  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) {
    this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
    return this;
  }

   /**
   * Get comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
   * @return comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths() {
    return comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
  }

  public void setComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) {
    this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
  }

  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) {
    this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
    return this;
  }

   /**
   * Get comAdobeCqDamMacSyncDamsyncserviceSyncRenditions
   * @return comAdobeCqDamMacSyncDamsyncserviceSyncRenditions
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getComAdobeCqDamMacSyncDamsyncserviceSyncRenditions() {
    return comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
  }

  public void setComAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) {
    this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
  }

  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) {
    this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
    return this;
  }

   /**
   * Get comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
   * @return comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs() {
    return comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
  }

  public void setComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) {
    this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
  }

  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform) {
    this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
    return this;
  }

   /**
   * Get comAdobeCqDamMacSyncDamsyncservicePlatform
   * @return comAdobeCqDamMacSyncDamsyncservicePlatform
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getComAdobeCqDamMacSyncDamsyncservicePlatform() {
    return comAdobeCqDamMacSyncDamsyncservicePlatform;
  }

  public void setComAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform) {
    this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

