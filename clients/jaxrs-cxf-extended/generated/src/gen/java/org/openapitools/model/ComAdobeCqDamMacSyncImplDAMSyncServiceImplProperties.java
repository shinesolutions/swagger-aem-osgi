package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform;
 /**
  * Get comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
  * @return comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths
  */
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")
  public ConfigNodePropertyArray getComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths() {
    return comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths</code> property.
   */
 public void setComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) {
    this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths</code> property.
   */
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths(ConfigNodePropertyArray comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths) {
    this.comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths = comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths;
    return this;
  }

 /**
  * Get comAdobeCqDamMacSyncDamsyncserviceSyncRenditions
  * @return comAdobeCqDamMacSyncDamsyncserviceSyncRenditions
  */
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")
  public ConfigNodePropertyBoolean getComAdobeCqDamMacSyncDamsyncserviceSyncRenditions() {
    return comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncserviceSyncRenditions</code> property.
   */
 public void setComAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) {
    this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncserviceSyncRenditions</code> property.
   */
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceSyncRenditions(ConfigNodePropertyBoolean comAdobeCqDamMacSyncDamsyncserviceSyncRenditions) {
    this.comAdobeCqDamMacSyncDamsyncserviceSyncRenditions = comAdobeCqDamMacSyncDamsyncserviceSyncRenditions;
    return this;
  }

 /**
  * Get comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
  * @return comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs
  */
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")
  public ConfigNodePropertyInteger getComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs() {
    return comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs</code> property.
   */
 public void setComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) {
    this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs</code> property.
   */
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs(ConfigNodePropertyInteger comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs) {
    this.comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs = comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs;
    return this;
  }

 /**
  * Get comAdobeCqDamMacSyncDamsyncservicePlatform
  * @return comAdobeCqDamMacSyncDamsyncservicePlatform
  */
  @JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.platform")
  public ConfigNodePropertyDropDown getComAdobeCqDamMacSyncDamsyncservicePlatform() {
    return comAdobeCqDamMacSyncDamsyncservicePlatform;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncservicePlatform</code> property.
   */
 public void setComAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform) {
    this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
  }

  /**
   * Sets the <code>comAdobeCqDamMacSyncDamsyncservicePlatform</code> property.
   */
  public ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties comAdobeCqDamMacSyncDamsyncservicePlatform(ConfigNodePropertyDropDown comAdobeCqDamMacSyncDamsyncservicePlatform) {
    this.comAdobeCqDamMacSyncDamsyncservicePlatform = comAdobeCqDamMacSyncDamsyncservicePlatform;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

