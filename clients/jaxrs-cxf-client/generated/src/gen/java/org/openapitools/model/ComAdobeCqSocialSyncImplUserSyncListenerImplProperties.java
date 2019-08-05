package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray nodetypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray ignorableprops = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray ignorablenodes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean enabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray distfolders = null;
 /**
   * Get nodetypes
   * @return nodetypes
  **/
  @JsonProperty("nodetypes")
  public ConfigNodePropertyArray getNodetypes() {
    return nodetypes;
  }

  public void setNodetypes(ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties nodetypes(ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
    return this;
  }

 /**
   * Get ignorableprops
   * @return ignorableprops
  **/
  @JsonProperty("ignorableprops")
  public ConfigNodePropertyArray getIgnorableprops() {
    return ignorableprops;
  }

  public void setIgnorableprops(ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorableprops(ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
    return this;
  }

 /**
   * Get ignorablenodes
   * @return ignorablenodes
  **/
  @JsonProperty("ignorablenodes")
  public ConfigNodePropertyArray getIgnorablenodes() {
    return ignorablenodes;
  }

  public void setIgnorablenodes(ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorablenodes(ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
    return this;
  }

 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get distfolders
   * @return distfolders
  **/
  @JsonProperty("distfolders")
  public ConfigNodePropertyArray getDistfolders() {
    return distfolders;
  }

  public void setDistfolders(ConfigNodePropertyArray distfolders) {
    this.distfolders = distfolders;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties distfolders(ConfigNodePropertyArray distfolders) {
    this.distfolders = distfolders;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

