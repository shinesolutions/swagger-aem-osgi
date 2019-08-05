package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties   {
  @JsonProperty("jasper.compilerTargetVM")
  private ConfigNodePropertyString jasperCompilerTargetVM = null;

  @JsonProperty("jasper.compilerSourceVM")
  private ConfigNodePropertyString jasperCompilerSourceVM = null;

  @JsonProperty("jasper.classdebuginfo")
  private ConfigNodePropertyBoolean jasperClassdebuginfo = null;

  @JsonProperty("jasper.enablePooling")
  private ConfigNodePropertyBoolean jasperEnablePooling = null;

  @JsonProperty("jasper.ieClassId")
  private ConfigNodePropertyString jasperIeClassId = null;

  @JsonProperty("jasper.genStringAsCharArray")
  private ConfigNodePropertyBoolean jasperGenStringAsCharArray = null;

  @JsonProperty("jasper.keepgenerated")
  private ConfigNodePropertyBoolean jasperKeepgenerated = null;

  @JsonProperty("jasper.mappedfile")
  private ConfigNodePropertyBoolean jasperMappedfile = null;

  @JsonProperty("jasper.trimSpaces")
  private ConfigNodePropertyBoolean jasperTrimSpaces = null;

  @JsonProperty("jasper.displaySourceFragments")
  private ConfigNodePropertyBoolean jasperDisplaySourceFragments = null;

  @JsonProperty("default.is.session")
  private ConfigNodePropertyBoolean defaultIsSession = null;

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.compilerTargetVM")
  public ConfigNodePropertyString getJasperCompilerTargetVM() {
    return jasperCompilerTargetVM;
  }
  public void setJasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.compilerSourceVM")
  public ConfigNodePropertyString getJasperCompilerSourceVM() {
    return jasperCompilerSourceVM;
  }
  public void setJasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.classdebuginfo")
  public ConfigNodePropertyBoolean getJasperClassdebuginfo() {
    return jasperClassdebuginfo;
  }
  public void setJasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.enablePooling")
  public ConfigNodePropertyBoolean getJasperEnablePooling() {
    return jasperEnablePooling;
  }
  public void setJasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.ieClassId")
  public ConfigNodePropertyString getJasperIeClassId() {
    return jasperIeClassId;
  }
  public void setJasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.genStringAsCharArray")
  public ConfigNodePropertyBoolean getJasperGenStringAsCharArray() {
    return jasperGenStringAsCharArray;
  }
  public void setJasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.keepgenerated")
  public ConfigNodePropertyBoolean getJasperKeepgenerated() {
    return jasperKeepgenerated;
  }
  public void setJasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.mappedfile")
  public ConfigNodePropertyBoolean getJasperMappedfile() {
    return jasperMappedfile;
  }
  public void setJasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.trimSpaces")
  public ConfigNodePropertyBoolean getJasperTrimSpaces() {
    return jasperTrimSpaces;
  }
  public void setJasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jasper.displaySourceFragments")
  public ConfigNodePropertyBoolean getJasperDisplaySourceFragments() {
    return jasperDisplaySourceFragments;
  }
  public void setJasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
  }

  /**
   **/
  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties defaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("default.is.session")
  public ConfigNodePropertyBoolean getDefaultIsSession() {
    return defaultIsSession;
  }
  public void setDefaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties orgApacheSlingScriptingJspJspScriptEngineFactoryProperties = (OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties) o;
    return Objects.equals(jasperCompilerTargetVM, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperCompilerTargetVM) &&
        Objects.equals(jasperCompilerSourceVM, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperCompilerSourceVM) &&
        Objects.equals(jasperClassdebuginfo, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperClassdebuginfo) &&
        Objects.equals(jasperEnablePooling, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperEnablePooling) &&
        Objects.equals(jasperIeClassId, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperIeClassId) &&
        Objects.equals(jasperGenStringAsCharArray, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperGenStringAsCharArray) &&
        Objects.equals(jasperKeepgenerated, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperKeepgenerated) &&
        Objects.equals(jasperMappedfile, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperMappedfile) &&
        Objects.equals(jasperTrimSpaces, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperTrimSpaces) &&
        Objects.equals(jasperDisplaySourceFragments, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.jasperDisplaySourceFragments) &&
        Objects.equals(defaultIsSession, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.defaultIsSession);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

