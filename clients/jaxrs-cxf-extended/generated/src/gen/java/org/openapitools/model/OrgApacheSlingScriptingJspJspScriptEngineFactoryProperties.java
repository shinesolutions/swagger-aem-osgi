package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jasperCompilerTargetVM;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jasperCompilerSourceVM;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperClassdebuginfo;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperEnablePooling;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jasperIeClassId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperGenStringAsCharArray;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperKeepgenerated;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperMappedfile;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperTrimSpaces;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean jasperDisplaySourceFragments;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean defaultIsSession;
 /**
  * Get jasperCompilerTargetVM
  * @return jasperCompilerTargetVM
  */
  @JsonProperty("jasper.compilerTargetVM")
  public ConfigNodePropertyString getJasperCompilerTargetVM() {
    return jasperCompilerTargetVM;
  }

  /**
   * Sets the <code>jasperCompilerTargetVM</code> property.
   */
 public void setJasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
  }

  /**
   * Sets the <code>jasperCompilerTargetVM</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
    return this;
  }

 /**
  * Get jasperCompilerSourceVM
  * @return jasperCompilerSourceVM
  */
  @JsonProperty("jasper.compilerSourceVM")
  public ConfigNodePropertyString getJasperCompilerSourceVM() {
    return jasperCompilerSourceVM;
  }

  /**
   * Sets the <code>jasperCompilerSourceVM</code> property.
   */
 public void setJasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
  }

  /**
   * Sets the <code>jasperCompilerSourceVM</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
    return this;
  }

 /**
  * Get jasperClassdebuginfo
  * @return jasperClassdebuginfo
  */
  @JsonProperty("jasper.classdebuginfo")
  public ConfigNodePropertyBoolean getJasperClassdebuginfo() {
    return jasperClassdebuginfo;
  }

  /**
   * Sets the <code>jasperClassdebuginfo</code> property.
   */
 public void setJasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
  }

  /**
   * Sets the <code>jasperClassdebuginfo</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
    return this;
  }

 /**
  * Get jasperEnablePooling
  * @return jasperEnablePooling
  */
  @JsonProperty("jasper.enablePooling")
  public ConfigNodePropertyBoolean getJasperEnablePooling() {
    return jasperEnablePooling;
  }

  /**
   * Sets the <code>jasperEnablePooling</code> property.
   */
 public void setJasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
  }

  /**
   * Sets the <code>jasperEnablePooling</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
    return this;
  }

 /**
  * Get jasperIeClassId
  * @return jasperIeClassId
  */
  @JsonProperty("jasper.ieClassId")
  public ConfigNodePropertyString getJasperIeClassId() {
    return jasperIeClassId;
  }

  /**
   * Sets the <code>jasperIeClassId</code> property.
   */
 public void setJasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
  }

  /**
   * Sets the <code>jasperIeClassId</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
    return this;
  }

 /**
  * Get jasperGenStringAsCharArray
  * @return jasperGenStringAsCharArray
  */
  @JsonProperty("jasper.genStringAsCharArray")
  public ConfigNodePropertyBoolean getJasperGenStringAsCharArray() {
    return jasperGenStringAsCharArray;
  }

  /**
   * Sets the <code>jasperGenStringAsCharArray</code> property.
   */
 public void setJasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
  }

  /**
   * Sets the <code>jasperGenStringAsCharArray</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
    return this;
  }

 /**
  * Get jasperKeepgenerated
  * @return jasperKeepgenerated
  */
  @JsonProperty("jasper.keepgenerated")
  public ConfigNodePropertyBoolean getJasperKeepgenerated() {
    return jasperKeepgenerated;
  }

  /**
   * Sets the <code>jasperKeepgenerated</code> property.
   */
 public void setJasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
  }

  /**
   * Sets the <code>jasperKeepgenerated</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
    return this;
  }

 /**
  * Get jasperMappedfile
  * @return jasperMappedfile
  */
  @JsonProperty("jasper.mappedfile")
  public ConfigNodePropertyBoolean getJasperMappedfile() {
    return jasperMappedfile;
  }

  /**
   * Sets the <code>jasperMappedfile</code> property.
   */
 public void setJasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
  }

  /**
   * Sets the <code>jasperMappedfile</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
    return this;
  }

 /**
  * Get jasperTrimSpaces
  * @return jasperTrimSpaces
  */
  @JsonProperty("jasper.trimSpaces")
  public ConfigNodePropertyBoolean getJasperTrimSpaces() {
    return jasperTrimSpaces;
  }

  /**
   * Sets the <code>jasperTrimSpaces</code> property.
   */
 public void setJasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
  }

  /**
   * Sets the <code>jasperTrimSpaces</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
    return this;
  }

 /**
  * Get jasperDisplaySourceFragments
  * @return jasperDisplaySourceFragments
  */
  @JsonProperty("jasper.displaySourceFragments")
  public ConfigNodePropertyBoolean getJasperDisplaySourceFragments() {
    return jasperDisplaySourceFragments;
  }

  /**
   * Sets the <code>jasperDisplaySourceFragments</code> property.
   */
 public void setJasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
  }

  /**
   * Sets the <code>jasperDisplaySourceFragments</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
    return this;
  }

 /**
  * Get defaultIsSession
  * @return defaultIsSession
  */
  @JsonProperty("default.is.session")
  public ConfigNodePropertyBoolean getDefaultIsSession() {
    return defaultIsSession;
  }

  /**
   * Sets the <code>defaultIsSession</code> property.
   */
 public void setDefaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
  }

  /**
   * Sets the <code>defaultIsSession</code> property.
   */
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties defaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties orgApacheSlingScriptingJspJspScriptEngineFactoryProperties = (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties) o;
    return Objects.equals(this.jasperCompilerTargetVM, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperCompilerTargetVM) &&
        Objects.equals(this.jasperCompilerSourceVM, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperCompilerSourceVM) &&
        Objects.equals(this.jasperClassdebuginfo, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperClassdebuginfo) &&
        Objects.equals(this.jasperEnablePooling, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperEnablePooling) &&
        Objects.equals(this.jasperIeClassId, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperIeClassId) &&
        Objects.equals(this.jasperGenStringAsCharArray, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperGenStringAsCharArray) &&
        Objects.equals(this.jasperKeepgenerated, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperKeepgenerated) &&
        Objects.equals(this.jasperMappedfile, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperMappedfile) &&
        Objects.equals(this.jasperTrimSpaces, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperTrimSpaces) &&
        Objects.equals(this.jasperDisplaySourceFragments, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperDisplaySourceFragments) &&
        Objects.equals(this.defaultIsSession, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.defaultIsSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jasperCompilerTargetVM, jasperCompilerSourceVM, jasperClassdebuginfo, jasperEnablePooling, jasperIeClassId, jasperGenStringAsCharArray, jasperKeepgenerated, jasperMappedfile, jasperTrimSpaces, jasperDisplaySourceFragments, defaultIsSession);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

