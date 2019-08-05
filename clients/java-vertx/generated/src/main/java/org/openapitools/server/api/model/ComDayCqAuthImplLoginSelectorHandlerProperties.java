package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqAuthImplLoginSelectorHandlerProperties   {
  
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyArray authLoginselectorMappings = null;
  private ConfigNodePropertyArray authLoginselectorChangepwMappings = null;
  private ConfigNodePropertyString authLoginselectorDefaultloginpage = null;
  private ConfigNodePropertyString authLoginselectorDefaultchangepwpage = null;
  private ConfigNodePropertyArray authLoginselectorHandle = null;
  private ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions = null;

  public ComDayCqAuthImplLoginSelectorHandlerProperties () {

  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties (ConfigNodePropertyString path, ConfigNodePropertyInteger serviceRanking, ConfigNodePropertyArray authLoginselectorMappings, ConfigNodePropertyArray authLoginselectorChangepwMappings, ConfigNodePropertyString authLoginselectorDefaultloginpage, ConfigNodePropertyString authLoginselectorDefaultchangepwpage, ConfigNodePropertyArray authLoginselectorHandle, ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.path = path;
    this.serviceRanking = serviceRanking;
    this.authLoginselectorMappings = authLoginselectorMappings;
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
    this.authLoginselectorHandle = authLoginselectorHandle;
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

    
  @JsonProperty("auth.loginselector.mappings")
  public ConfigNodePropertyArray getAuthLoginselectorMappings() {
    return authLoginselectorMappings;
  }
  public void setAuthLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
    this.authLoginselectorMappings = authLoginselectorMappings;
  }

    
  @JsonProperty("auth.loginselector.changepw.mappings")
  public ConfigNodePropertyArray getAuthLoginselectorChangepwMappings() {
    return authLoginselectorChangepwMappings;
  }
  public void setAuthLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
  }

    
  @JsonProperty("auth.loginselector.defaultloginpage")
  public ConfigNodePropertyString getAuthLoginselectorDefaultloginpage() {
    return authLoginselectorDefaultloginpage;
  }
  public void setAuthLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
  }

    
  @JsonProperty("auth.loginselector.defaultchangepwpage")
  public ConfigNodePropertyString getAuthLoginselectorDefaultchangepwpage() {
    return authLoginselectorDefaultchangepwpage;
  }
  public void setAuthLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
  }

    
  @JsonProperty("auth.loginselector.handle")
  public ConfigNodePropertyArray getAuthLoginselectorHandle() {
    return authLoginselectorHandle;
  }
  public void setAuthLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
    this.authLoginselectorHandle = authLoginselectorHandle;
  }

    
  @JsonProperty("auth.loginselector.handle.all.extensions")
  public ConfigNodePropertyBoolean getAuthLoginselectorHandleAllExtensions() {
    return authLoginselectorHandleAllExtensions;
  }
  public void setAuthLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAuthImplLoginSelectorHandlerProperties comDayCqAuthImplLoginSelectorHandlerProperties = (ComDayCqAuthImplLoginSelectorHandlerProperties) o;
    return Objects.equals(path, comDayCqAuthImplLoginSelectorHandlerProperties.path) &&
        Objects.equals(serviceRanking, comDayCqAuthImplLoginSelectorHandlerProperties.serviceRanking) &&
        Objects.equals(authLoginselectorMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorMappings) &&
        Objects.equals(authLoginselectorChangepwMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorChangepwMappings) &&
        Objects.equals(authLoginselectorDefaultloginpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultloginpage) &&
        Objects.equals(authLoginselectorDefaultchangepwpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultchangepwpage) &&
        Objects.equals(authLoginselectorHandle, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandle) &&
        Objects.equals(authLoginselectorHandleAllExtensions, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandleAllExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, authLoginselectorMappings, authLoginselectorChangepwMappings, authLoginselectorDefaultloginpage, authLoginselectorDefaultchangepwpage, authLoginselectorHandle, authLoginselectorHandleAllExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAuthImplLoginSelectorHandlerProperties {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    authLoginselectorMappings: ").append(toIndentedString(authLoginselectorMappings)).append("\n");
    sb.append("    authLoginselectorChangepwMappings: ").append(toIndentedString(authLoginselectorChangepwMappings)).append("\n");
    sb.append("    authLoginselectorDefaultloginpage: ").append(toIndentedString(authLoginselectorDefaultloginpage)).append("\n");
    sb.append("    authLoginselectorDefaultchangepwpage: ").append(toIndentedString(authLoginselectorDefaultchangepwpage)).append("\n");
    sb.append("    authLoginselectorHandle: ").append(toIndentedString(authLoginselectorHandle)).append("\n");
    sb.append("    authLoginselectorHandleAllExtensions: ").append(toIndentedString(authLoginselectorHandleAllExtensions)).append("\n");
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
