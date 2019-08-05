package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jasperCompilerTargetVM = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jasperCompilerSourceVM = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperClassdebuginfo = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperEnablePooling = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jasperIeClassId = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperGenStringAsCharArray = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperKeepgenerated = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperMappedfile = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperTrimSpaces = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperDisplaySourceFragments = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean defaultIsSession = null;
 /**
   * Get jasperCompilerTargetVM
   * @return jasperCompilerTargetVM
  **/
  @JsonProperty("jasper.compilerTargetVM")
  public ConfigNodePropertyString getJasperCompilerTargetVM() {
    return jasperCompilerTargetVM;
  }

  public void setJasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
    return this;
  }

 /**
   * Get jasperCompilerSourceVM
   * @return jasperCompilerSourceVM
  **/
  @JsonProperty("jasper.compilerSourceVM")
  public ConfigNodePropertyString getJasperCompilerSourceVM() {
    return jasperCompilerSourceVM;
  }

  public void setJasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
    return this;
  }

 /**
   * Get jasperClassdebuginfo
   * @return jasperClassdebuginfo
  **/
  @JsonProperty("jasper.classdebuginfo")
  public ConfigNodePropertyBoolean getJasperClassdebuginfo() {
    return jasperClassdebuginfo;
  }

  public void setJasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
    return this;
  }

 /**
   * Get jasperEnablePooling
   * @return jasperEnablePooling
  **/
  @JsonProperty("jasper.enablePooling")
  public ConfigNodePropertyBoolean getJasperEnablePooling() {
    return jasperEnablePooling;
  }

  public void setJasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
    return this;
  }

 /**
   * Get jasperIeClassId
   * @return jasperIeClassId
  **/
  @JsonProperty("jasper.ieClassId")
  public ConfigNodePropertyString getJasperIeClassId() {
    return jasperIeClassId;
  }

  public void setJasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
    return this;
  }

 /**
   * Get jasperGenStringAsCharArray
   * @return jasperGenStringAsCharArray
  **/
  @JsonProperty("jasper.genStringAsCharArray")
  public ConfigNodePropertyBoolean getJasperGenStringAsCharArray() {
    return jasperGenStringAsCharArray;
  }

  public void setJasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
    return this;
  }

 /**
   * Get jasperKeepgenerated
   * @return jasperKeepgenerated
  **/
  @JsonProperty("jasper.keepgenerated")
  public ConfigNodePropertyBoolean getJasperKeepgenerated() {
    return jasperKeepgenerated;
  }

  public void setJasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
    return this;
  }

 /**
   * Get jasperMappedfile
   * @return jasperMappedfile
  **/
  @JsonProperty("jasper.mappedfile")
  public ConfigNodePropertyBoolean getJasperMappedfile() {
    return jasperMappedfile;
  }

  public void setJasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
    return this;
  }

 /**
   * Get jasperTrimSpaces
   * @return jasperTrimSpaces
  **/
  @JsonProperty("jasper.trimSpaces")
  public ConfigNodePropertyBoolean getJasperTrimSpaces() {
    return jasperTrimSpaces;
  }

  public void setJasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
    return this;
  }

 /**
   * Get jasperDisplaySourceFragments
   * @return jasperDisplaySourceFragments
  **/
  @JsonProperty("jasper.displaySourceFragments")
  public ConfigNodePropertyBoolean getJasperDisplaySourceFragments() {
    return jasperDisplaySourceFragments;
  }

  public void setJasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
    return this;
  }

 /**
   * Get defaultIsSession
   * @return defaultIsSession
  **/
  @JsonProperty("default.is.session")
  public ConfigNodePropertyBoolean getDefaultIsSession() {
    return defaultIsSession;
  }

  public void setDefaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties defaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {\n");
    
    sb.append("    jasperCompilerTargetVM: ").append(toIndentedString(jasperCompilerTargetVM)).append("\n");
    sb.append("    jasperCompilerSourceVM: ").append(toIndentedString(jasperCompilerSourceVM)).append("\n");
    sb.append("    jasperClassdebuginfo: ").append(toIndentedString(jasperClassdebuginfo)).append("\n");
    sb.append("    jasperEnablePooling: ").append(toIndentedString(jasperEnablePooling)).append("\n");
    sb.append("    jasperIeClassId: ").append(toIndentedString(jasperIeClassId)).append("\n");
    sb.append("    jasperGenStringAsCharArray: ").append(toIndentedString(jasperGenStringAsCharArray)).append("\n");
    sb.append("    jasperKeepgenerated: ").append(toIndentedString(jasperKeepgenerated)).append("\n");
    sb.append("    jasperMappedfile: ").append(toIndentedString(jasperMappedfile)).append("\n");
    sb.append("    jasperTrimSpaces: ").append(toIndentedString(jasperTrimSpaces)).append("\n");
    sb.append("    jasperDisplaySourceFragments: ").append(toIndentedString(jasperDisplaySourceFragments)).append("\n");
    sb.append("    defaultIsSession: ").append(toIndentedString(defaultIsSession)).append("\n");
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

