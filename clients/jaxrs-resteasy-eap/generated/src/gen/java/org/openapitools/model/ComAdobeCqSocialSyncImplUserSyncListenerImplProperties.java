package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties   {
  

  private ConfigNodePropertyArray nodetypes = null;

  private ConfigNodePropertyArray ignorableprops = null;

  private ConfigNodePropertyArray ignorablenodes = null;

  private ConfigNodePropertyBoolean enabled = null;

  private ConfigNodePropertyArray distfolders = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("ignorablenodes")
  public ConfigNodePropertyArray getIgnorablenodes() {
    return ignorablenodes;
  }
  public void setIgnorablenodes(ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("distfolders")
  public ConfigNodePropertyArray getDistfolders() {
    return distfolders;
  }
  public void setDistfolders(ConfigNodePropertyArray distfolders) {
    this.distfolders = distfolders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties comAdobeCqSocialSyncImplUserSyncListenerImplProperties = (ComAdobeCqSocialSyncImplUserSyncListenerImplProperties) o;
    return Objects.equals(nodetypes, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.nodetypes) &&
        Objects.equals(ignorableprops, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.ignorableprops) &&
        Objects.equals(ignorablenodes, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.ignorablenodes) &&
        Objects.equals(enabled, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.enabled) &&
        Objects.equals(distfolders, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.distfolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodetypes, ignorableprops, ignorablenodes, enabled, distfolders);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

