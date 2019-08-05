package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties   {
  
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyDropDown tokenRequiredAttr = null;
  private ConfigNodePropertyString tokenAlternateUrl = null;
  private ConfigNodePropertyBoolean tokenEncapsulated = null;
  private ConfigNodePropertyArray skipTokenRefresh = null;

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties () {

  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties (ConfigNodePropertyString path, ConfigNodePropertyDropDown tokenRequiredAttr, ConfigNodePropertyString tokenAlternateUrl, ConfigNodePropertyBoolean tokenEncapsulated, ConfigNodePropertyArray skipTokenRefresh) {
    this.path = path;
    this.tokenRequiredAttr = tokenRequiredAttr;
    this.tokenAlternateUrl = tokenAlternateUrl;
    this.tokenEncapsulated = tokenEncapsulated;
    this.skipTokenRefresh = skipTokenRefresh;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("token.required.attr")
  public ConfigNodePropertyDropDown getTokenRequiredAttr() {
    return tokenRequiredAttr;
  }
  public void setTokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
  }

    
  @JsonProperty("token.alternate.url")
  public ConfigNodePropertyString getTokenAlternateUrl() {
    return tokenAlternateUrl;
  }
  public void setTokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
  }

    
  @JsonProperty("token.encapsulated")
  public ConfigNodePropertyBoolean getTokenEncapsulated() {
    return tokenEncapsulated;
  }
  public void setTokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
  }

    
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
