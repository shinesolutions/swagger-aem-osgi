package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties   {
  
  private ConfigNodePropertyArray nodetypes = null;
  private ConfigNodePropertyArray ignorableprops = null;
  private ConfigNodePropertyArray ignorablenodes = null;
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyArray distfolders = null;

  /**
   **/
  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties nodetypes(ConfigNodePropertyArray nodetypes) {
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
  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorableprops(ConfigNodePropertyArray ignorableprops) {
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
  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorablenodes(ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
    return this;
  }

  
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
  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties enabled(ConfigNodePropertyBoolean enabled) {
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
  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties distfolders(ConfigNodePropertyArray distfolders) {
    this.distfolders = distfolders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("distfolders")
  public ConfigNodePropertyArray getDistfolders() {
    return distfolders;
  }
  public void setDistfolders(ConfigNodePropertyArray distfolders) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

