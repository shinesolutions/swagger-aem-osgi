package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties   {
  
  private ConfigNodePropertyString jasperCompilerTargetVM = null;
  private ConfigNodePropertyString jasperCompilerSourceVM = null;
  private ConfigNodePropertyBoolean jasperClassdebuginfo = null;
  private ConfigNodePropertyBoolean jasperEnablePooling = null;
  private ConfigNodePropertyString jasperIeClassId = null;
  private ConfigNodePropertyBoolean jasperGenStringAsCharArray = null;
  private ConfigNodePropertyBoolean jasperKeepgenerated = null;
  private ConfigNodePropertyBoolean jasperMappedfile = null;
  private ConfigNodePropertyBoolean jasperTrimSpaces = null;
  private ConfigNodePropertyBoolean jasperDisplaySourceFragments = null;
  private ConfigNodePropertyBoolean defaultIsSession = null;

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties () {

  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties (ConfigNodePropertyString jasperCompilerTargetVM, ConfigNodePropertyString jasperCompilerSourceVM, ConfigNodePropertyBoolean jasperClassdebuginfo, ConfigNodePropertyBoolean jasperEnablePooling, ConfigNodePropertyString jasperIeClassId, ConfigNodePropertyBoolean jasperGenStringAsCharArray, ConfigNodePropertyBoolean jasperKeepgenerated, ConfigNodePropertyBoolean jasperMappedfile, ConfigNodePropertyBoolean jasperTrimSpaces, ConfigNodePropertyBoolean jasperDisplaySourceFragments, ConfigNodePropertyBoolean defaultIsSession) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
    this.jasperClassdebuginfo = jasperClassdebuginfo;
    this.jasperEnablePooling = jasperEnablePooling;
    this.jasperIeClassId = jasperIeClassId;
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
    this.jasperKeepgenerated = jasperKeepgenerated;
    this.jasperMappedfile = jasperMappedfile;
    this.jasperTrimSpaces = jasperTrimSpaces;
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
    this.defaultIsSession = defaultIsSession;
  }

    
  @JsonProperty("jasper.compilerTargetVM")
  public ConfigNodePropertyString getJasperCompilerTargetVM() {
    return jasperCompilerTargetVM;
  }
  public void setJasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
  }

    
  @JsonProperty("jasper.compilerSourceVM")
  public ConfigNodePropertyString getJasperCompilerSourceVM() {
    return jasperCompilerSourceVM;
  }
  public void setJasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
  }

    
  @JsonProperty("jasper.classdebuginfo")
  public ConfigNodePropertyBoolean getJasperClassdebuginfo() {
    return jasperClassdebuginfo;
  }
  public void setJasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
  }

    
  @JsonProperty("jasper.enablePooling")
  public ConfigNodePropertyBoolean getJasperEnablePooling() {
    return jasperEnablePooling;
  }
  public void setJasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
  }

    
  @JsonProperty("jasper.ieClassId")
  public ConfigNodePropertyString getJasperIeClassId() {
    return jasperIeClassId;
  }
  public void setJasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
  }

    
  @JsonProperty("jasper.genStringAsCharArray")
  public ConfigNodePropertyBoolean getJasperGenStringAsCharArray() {
    return jasperGenStringAsCharArray;
  }
  public void setJasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
  }

    
  @JsonProperty("jasper.keepgenerated")
  public ConfigNodePropertyBoolean getJasperKeepgenerated() {
    return jasperKeepgenerated;
  }
  public void setJasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
  }

    
  @JsonProperty("jasper.mappedfile")
  public ConfigNodePropertyBoolean getJasperMappedfile() {
    return jasperMappedfile;
  }
  public void setJasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
  }

    
  @JsonProperty("jasper.trimSpaces")
  public ConfigNodePropertyBoolean getJasperTrimSpaces() {
    return jasperTrimSpaces;
  }
  public void setJasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
  }

    
  @JsonProperty("jasper.displaySourceFragments")
  public ConfigNodePropertyBoolean getJasperDisplaySourceFragments() {
    return jasperDisplaySourceFragments;
  }
  public void setJasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
  }

    
  @JsonProperty("default.is.session")
  public ConfigNodePropertyBoolean getDefaultIsSession() {
    return defaultIsSession;
  }
  public void setDefaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
