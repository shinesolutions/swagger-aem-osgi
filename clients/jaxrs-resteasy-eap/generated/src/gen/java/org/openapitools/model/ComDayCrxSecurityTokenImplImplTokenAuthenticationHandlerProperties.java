package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties   {
  

  private ConfigNodePropertyString path = null;

  private ConfigNodePropertyDropDown tokenRequiredAttr = null;

  private ConfigNodePropertyString tokenAlternateUrl = null;

  private ConfigNodePropertyBoolean tokenEncapsulated = null;

  private ConfigNodePropertyArray skipTokenRefresh = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("token.required.attr")
  public ConfigNodePropertyDropDown getTokenRequiredAttr() {
    return tokenRequiredAttr;
  }
  public void setTokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("token.alternate.url")
  public ConfigNodePropertyString getTokenAlternateUrl() {
    return tokenAlternateUrl;
  }
  public void setTokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("token.encapsulated")
  public ConfigNodePropertyBoolean getTokenEncapsulated() {
    return tokenEncapsulated;
  }
  public void setTokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("skip.token.refresh")
  public ConfigNodePropertyArray getSkipTokenRefresh() {
    return skipTokenRefresh;
  }
  public void setSkipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
    this.skipTokenRefresh = skipTokenRefresh;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties) o;
    return Objects.equals(path, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.path) &&
        Objects.equals(tokenRequiredAttr, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenRequiredAttr) &&
        Objects.equals(tokenAlternateUrl, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenAlternateUrl) &&
        Objects.equals(tokenEncapsulated, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenEncapsulated) &&
        Objects.equals(skipTokenRefresh, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.skipTokenRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, tokenRequiredAttr, tokenAlternateUrl, tokenEncapsulated, skipTokenRefresh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    tokenRequiredAttr: ").append(toIndentedString(tokenRequiredAttr)).append("\n");
    sb.append("    tokenAlternateUrl: ").append(toIndentedString(tokenAlternateUrl)).append("\n");
    sb.append("    tokenEncapsulated: ").append(toIndentedString(tokenEncapsulated)).append("\n");
    sb.append("    skipTokenRefresh: ").append(toIndentedString(skipTokenRefresh)).append("\n");
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

