package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties
 */

@JsonTypeName("orgApacheSlingScriptingJspJspScriptEngineFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {

  private ConfigNodePropertyString jasperCompilerTargetVM;

  private ConfigNodePropertyString jasperCompilerSourceVM;

  private ConfigNodePropertyBoolean jasperClassdebuginfo;

  private ConfigNodePropertyBoolean jasperEnablePooling;

  private ConfigNodePropertyString jasperIeClassId;

  private ConfigNodePropertyBoolean jasperGenStringAsCharArray;

  private ConfigNodePropertyBoolean jasperKeepgenerated;

  private ConfigNodePropertyBoolean jasperMappedfile;

  private ConfigNodePropertyBoolean jasperTrimSpaces;

  private ConfigNodePropertyBoolean jasperDisplaySourceFragments;

  private ConfigNodePropertyBoolean defaultIsSession;

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
    return this;
  }

  /**
   * Get jasperCompilerTargetVM
   * @return jasperCompilerTargetVM
   */
  @Valid 
  @Schema(name = "jasper.compilerTargetVM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.compilerTargetVM")
  public ConfigNodePropertyString getJasperCompilerTargetVM() {
    return jasperCompilerTargetVM;
  }

  public void setJasperCompilerTargetVM(ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
    return this;
  }

  /**
   * Get jasperCompilerSourceVM
   * @return jasperCompilerSourceVM
   */
  @Valid 
  @Schema(name = "jasper.compilerSourceVM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.compilerSourceVM")
  public ConfigNodePropertyString getJasperCompilerSourceVM() {
    return jasperCompilerSourceVM;
  }

  public void setJasperCompilerSourceVM(ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
    return this;
  }

  /**
   * Get jasperClassdebuginfo
   * @return jasperClassdebuginfo
   */
  @Valid 
  @Schema(name = "jasper.classdebuginfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.classdebuginfo")
  public ConfigNodePropertyBoolean getJasperClassdebuginfo() {
    return jasperClassdebuginfo;
  }

  public void setJasperClassdebuginfo(ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
    return this;
  }

  /**
   * Get jasperEnablePooling
   * @return jasperEnablePooling
   */
  @Valid 
  @Schema(name = "jasper.enablePooling", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.enablePooling")
  public ConfigNodePropertyBoolean getJasperEnablePooling() {
    return jasperEnablePooling;
  }

  public void setJasperEnablePooling(ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
    return this;
  }

  /**
   * Get jasperIeClassId
   * @return jasperIeClassId
   */
  @Valid 
  @Schema(name = "jasper.ieClassId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.ieClassId")
  public ConfigNodePropertyString getJasperIeClassId() {
    return jasperIeClassId;
  }

  public void setJasperIeClassId(ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
    return this;
  }

  /**
   * Get jasperGenStringAsCharArray
   * @return jasperGenStringAsCharArray
   */
  @Valid 
  @Schema(name = "jasper.genStringAsCharArray", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.genStringAsCharArray")
  public ConfigNodePropertyBoolean getJasperGenStringAsCharArray() {
    return jasperGenStringAsCharArray;
  }

  public void setJasperGenStringAsCharArray(ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
    return this;
  }

  /**
   * Get jasperKeepgenerated
   * @return jasperKeepgenerated
   */
  @Valid 
  @Schema(name = "jasper.keepgenerated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.keepgenerated")
  public ConfigNodePropertyBoolean getJasperKeepgenerated() {
    return jasperKeepgenerated;
  }

  public void setJasperKeepgenerated(ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
    return this;
  }

  /**
   * Get jasperMappedfile
   * @return jasperMappedfile
   */
  @Valid 
  @Schema(name = "jasper.mappedfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.mappedfile")
  public ConfigNodePropertyBoolean getJasperMappedfile() {
    return jasperMappedfile;
  }

  public void setJasperMappedfile(ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
    return this;
  }

  /**
   * Get jasperTrimSpaces
   * @return jasperTrimSpaces
   */
  @Valid 
  @Schema(name = "jasper.trimSpaces", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.trimSpaces")
  public ConfigNodePropertyBoolean getJasperTrimSpaces() {
    return jasperTrimSpaces;
  }

  public void setJasperTrimSpaces(ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
    return this;
  }

  /**
   * Get jasperDisplaySourceFragments
   * @return jasperDisplaySourceFragments
   */
  @Valid 
  @Schema(name = "jasper.displaySourceFragments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jasper.displaySourceFragments")
  public ConfigNodePropertyBoolean getJasperDisplaySourceFragments() {
    return jasperDisplaySourceFragments;
  }

  public void setJasperDisplaySourceFragments(ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties defaultIsSession(ConfigNodePropertyBoolean defaultIsSession) {
    this.defaultIsSession = defaultIsSession;
    return this;
  }

  /**
   * Get defaultIsSession
   * @return defaultIsSession
   */
  @Valid 
  @Schema(name = "default.is.session", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

