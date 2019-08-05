package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties   {
  
  private ConfigNodePropertyArray nodetypes = null;

  private ConfigNodePropertyArray ignorableprops = null;

  private ConfigNodePropertyString ignorablenodes = null;

  private ConfigNodePropertyBoolean enabled = null;

  private ConfigNodePropertyString distfolders = null;


  /**
   **/
  public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties nodetypes(ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nodetypes")
  public ConfigNodePropertyArray getNodetypes() {
    return nodetypes;
  }
  public void setNodetypes(ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
  }


  /**
   **/
  public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties ignorableprops(ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ignorableprops")
  public ConfigNodePropertyArray getIgnorableprops() {
    return ignorableprops;
  }
  public void setIgnorableprops(ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
  }


  /**
   **/
  public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties ignorablenodes(ConfigNodePropertyString ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ignorablenodes")
  public ConfigNodePropertyString getIgnorablenodes() {
    return ignorablenodes;
  }
  public void setIgnorablenodes(ConfigNodePropertyString ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
  }


  /**
   **/
  public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties distfolders(ConfigNodePropertyString distfolders) {
    this.distfolders = distfolders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("distfolders")
  public ConfigNodePropertyString getDistfolders() {
    return distfolders;
  }
  public void setDistfolders(ConfigNodePropertyString distfolders) {
    this.distfolders = distfolders;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties comAdobeCqSocialSyncImplGroupSyncListenerImplProperties = (ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties) o;
    return Objects.equals(nodetypes, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties.nodetypes) &&
        Objects.equals(ignorableprops, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties.ignorableprops) &&
        Objects.equals(ignorablenodes, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties.ignorablenodes) &&
        Objects.equals(enabled, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties.enabled) &&
        Objects.equals(distfolders, comAdobeCqSocialSyncImplGroupSyncListenerImplProperties.distfolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodetypes, ignorableprops, ignorablenodes, enabled, distfolders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {\n");
    
    sb.append("    nodetypes: ").append(toIndentedString(nodetypes)).append("\n");
    sb.append("    ignorableprops: ").append(toIndentedString(ignorableprops)).append("\n");
    sb.append("    ignorablenodes: ").append(toIndentedString(ignorablenodes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    distfolders: ").append(toIndentedString(distfolders)).append("\n");
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

