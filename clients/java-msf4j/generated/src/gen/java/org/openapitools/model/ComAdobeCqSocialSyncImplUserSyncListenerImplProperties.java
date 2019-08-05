package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties   {
  @JsonProperty("nodetypes")
  private ConfigNodePropertyArray nodetypes = null;

  @JsonProperty("ignorableprops")
  private ConfigNodePropertyArray ignorableprops = null;

  @JsonProperty("ignorablenodes")
  private ConfigNodePropertyArray ignorablenodes = null;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("distfolders")
  private ConfigNodePropertyArray distfolders = null;

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties nodetypes(ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
    return this;
  }

   /**
   * Get nodetypes
   * @return nodetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getNodetypes() {
    return nodetypes;
  }

  public void setNodetypes(ConfigNodePropertyArray nodetypes) {
    this.nodetypes = nodetypes;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorableprops(ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
    return this;
  }

   /**
   * Get ignorableprops
   * @return ignorableprops
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getIgnorableprops() {
    return ignorableprops;
  }

  public void setIgnorableprops(ConfigNodePropertyArray ignorableprops) {
    this.ignorableprops = ignorableprops;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties ignorablenodes(ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
    return this;
  }

   /**
   * Get ignorablenodes
   * @return ignorablenodes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getIgnorablenodes() {
    return ignorablenodes;
  }

  public void setIgnorablenodes(ConfigNodePropertyArray ignorablenodes) {
    this.ignorablenodes = ignorablenodes;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeCqSocialSyncImplUserSyncListenerImplProperties distfolders(ConfigNodePropertyArray distfolders) {
    this.distfolders = distfolders;
    return this;
  }

   /**
   * Get distfolders
   * @return distfolders
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.nodetypes, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.nodetypes) &&
        Objects.equals(this.ignorableprops, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.ignorableprops) &&
        Objects.equals(this.ignorablenodes, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.ignorablenodes) &&
        Objects.equals(this.enabled, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.enabled) &&
        Objects.equals(this.distfolders, comAdobeCqSocialSyncImplUserSyncListenerImplProperties.distfolders);
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

