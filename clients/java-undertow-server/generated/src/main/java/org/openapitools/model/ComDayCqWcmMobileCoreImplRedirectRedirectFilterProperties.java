package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties   {
  
  private ConfigNodePropertyBoolean redirectEnabled = null;
  private ConfigNodePropertyBoolean redirectStatsEnabled = null;
  private ConfigNodePropertyArray redirectExtensions = null;
  private ConfigNodePropertyArray redirectPaths = null;

  /**
   **/
  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectEnabled(ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("redirect.enabled")
  public ConfigNodePropertyBoolean getRedirectEnabled() {
    return redirectEnabled;
  }
  public void setRedirectEnabled(ConfigNodePropertyBoolean redirectEnabled) {
    this.redirectEnabled = redirectEnabled;
  }

  /**
   **/
  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectStatsEnabled(ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("redirect.stats.enabled")
  public ConfigNodePropertyBoolean getRedirectStatsEnabled() {
    return redirectStatsEnabled;
  }
  public void setRedirectStatsEnabled(ConfigNodePropertyBoolean redirectStatsEnabled) {
    this.redirectStatsEnabled = redirectStatsEnabled;
  }

  /**
   **/
  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectExtensions(ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("redirect.extensions")
  public ConfigNodePropertyArray getRedirectExtensions() {
    return redirectExtensions;
  }
  public void setRedirectExtensions(ConfigNodePropertyArray redirectExtensions) {
    this.redirectExtensions = redirectExtensions;
  }

  /**
   **/
  public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties redirectPaths(ConfigNodePropertyArray redirectPaths) {
    this.redirectPaths = redirectPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("redirect.paths")
  public ConfigNodePropertyArray getRedirectPaths() {
    return redirectPaths;
  }
  public void setRedirectPaths(ConfigNodePropertyArray redirectPaths) {
    this.redirectPaths = redirectPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties = (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties) o;
    return Objects.equals(redirectEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectEnabled) &&
        Objects.equals(redirectStatsEnabled, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectStatsEnabled) &&
        Objects.equals(redirectExtensions, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectExtensions) &&
        Objects.equals(redirectPaths, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.redirectPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectEnabled, redirectStatsEnabled, redirectExtensions, redirectPaths);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

