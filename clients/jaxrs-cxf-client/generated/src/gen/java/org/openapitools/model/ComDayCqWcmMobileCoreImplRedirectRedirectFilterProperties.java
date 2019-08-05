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

public class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean redirectEnabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean redirectStatsEnabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray redirectExtensions = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray redirectPaths = null;
 /**
   * Get redirectEnabled
   * @return redirectEnabled
  **/
  @JsonProperty("redirect.enabled")
  public ConfigNodePropertyBoolean getRedirectEnabled() {
    return redirectEnabled;
  }

  public void setRedirectEnabled(ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectEnabled(ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
    return this;
  }

 /**
   * Get redirectStatsEnabled
   * @return redirectStatsEnabled
  **/
  @JsonProperty("redirect.stats.enabled")
  public ConfigNodePropertyBoolean getRedirectStatsEnabled() {
    return redirectStatsEnabled;
  }

  public void setRedirectStatsEnabled(ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectStatsEnabled(ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
    return this;
  }

 /**
   * Get redirectExtensions
   * @return redirectExtensions
  **/
  @JsonProperty("redirect.extensions")
  public ConfigNodePropertyArray getRedirectExtensions() {
    return redirectExtensions;
  }

  public void setRedirectExtensions(ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectExtensions(ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
    return this;
  }

 /**
   * Get redirectPaths
   * @return redirectPaths
  **/
  @JsonProperty("redirect.paths")
  public ConfigNodePropertyArray getRedirectPaths() {
    return redirectPaths;
  }

  public void setRedirectPaths(ConfigNodePropertyArray redirectPaths) {
    this.redirectPaths = redirectPaths;
  }

  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectPaths(ConfigNodePropertyArray redirectPaths) {
    this.redirectPaths = redirectPaths;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {\n");
    
    sb.append("    redirectEnabled: ").append(toIndentedString(redirectEnabled)).append("\n");
    sb.append("    redirectStatsEnabled: ").append(toIndentedString(redirectStatsEnabled)).append("\n");
    sb.append("    redirectExtensions: ").append(toIndentedString(redirectExtensions)).append("\n");
    sb.append("    redirectPaths: ").append(toIndentedString(redirectPaths)).append("\n");
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

