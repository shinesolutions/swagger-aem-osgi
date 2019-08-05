package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqAuthImplLoginSelectorHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString path = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceRanking = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray authLoginselectorMappings = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray authLoginselectorChangepwMappings = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authLoginselectorDefaultloginpage = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authLoginselectorDefaultchangepwpage = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray authLoginselectorHandle = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions = null;
 /**
   * Get path
   * @return path
  **/
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get authLoginselectorMappings
   * @return authLoginselectorMappings
  **/
  @JsonProperty("auth.loginselector.mappings")
  public ConfigNodePropertyArray getAuthLoginselectorMappings() {
    return authLoginselectorMappings;
  }

  public void setAuthLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
    this.authLoginselectorMappings = authLoginselectorMappings;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
    this.authLoginselectorMappings = authLoginselectorMappings;
    return this;
  }

 /**
   * Get authLoginselectorChangepwMappings
   * @return authLoginselectorChangepwMappings
  **/
  @JsonProperty("auth.loginselector.changepw.mappings")
  public ConfigNodePropertyArray getAuthLoginselectorChangepwMappings() {
    return authLoginselectorChangepwMappings;
  }

  public void setAuthLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
    return this;
  }

 /**
   * Get authLoginselectorDefaultloginpage
   * @return authLoginselectorDefaultloginpage
  **/
  @JsonProperty("auth.loginselector.defaultloginpage")
  public ConfigNodePropertyString getAuthLoginselectorDefaultloginpage() {
    return authLoginselectorDefaultloginpage;
  }

  public void setAuthLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
    return this;
  }

 /**
   * Get authLoginselectorDefaultchangepwpage
   * @return authLoginselectorDefaultchangepwpage
  **/
  @JsonProperty("auth.loginselector.defaultchangepwpage")
  public ConfigNodePropertyString getAuthLoginselectorDefaultchangepwpage() {
    return authLoginselectorDefaultchangepwpage;
  }

  public void setAuthLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
    return this;
  }

 /**
   * Get authLoginselectorHandle
   * @return authLoginselectorHandle
  **/
  @JsonProperty("auth.loginselector.handle")
  public ConfigNodePropertyArray getAuthLoginselectorHandle() {
    return authLoginselectorHandle;
  }

  public void setAuthLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
    this.authLoginselectorHandle = authLoginselectorHandle;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
    this.authLoginselectorHandle = authLoginselectorHandle;
    return this;
  }

 /**
   * Get authLoginselectorHandleAllExtensions
   * @return authLoginselectorHandleAllExtensions
  **/
  @JsonProperty("auth.loginselector.handle.all.extensions")
  public ConfigNodePropertyBoolean getAuthLoginselectorHandleAllExtensions() {
    return authLoginselectorHandleAllExtensions;
  }

  public void setAuthLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

