package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jasperCompilerTargetVM;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jasperCompilerSourceVM;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jasperClassdebuginfo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jasperEnablePooling;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jasperIeClassId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jasperGenStringAsCharArray;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jasperKeepgenerated;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jasperMappedfile;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jasperTrimSpaces;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean jasperDisplaySourceFragments;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean defaultIsSession;

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerTargetVM(@Nullable ConfigNodePropertyString jasperCompilerTargetVM) {
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
  public @Nullable ConfigNodePropertyString getJasperCompilerTargetVM() {
    return jasperCompilerTargetVM;
  }

  @JsonProperty("jasper.compilerTargetVM")
  public void setJasperCompilerTargetVM(@Nullable ConfigNodePropertyString jasperCompilerTargetVM) {
    this.jasperCompilerTargetVM = jasperCompilerTargetVM;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperCompilerSourceVM(@Nullable ConfigNodePropertyString jasperCompilerSourceVM) {
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
  public @Nullable ConfigNodePropertyString getJasperCompilerSourceVM() {
    return jasperCompilerSourceVM;
  }

  @JsonProperty("jasper.compilerSourceVM")
  public void setJasperCompilerSourceVM(@Nullable ConfigNodePropertyString jasperCompilerSourceVM) {
    this.jasperCompilerSourceVM = jasperCompilerSourceVM;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperClassdebuginfo(@Nullable ConfigNodePropertyBoolean jasperClassdebuginfo) {
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
  public @Nullable ConfigNodePropertyBoolean getJasperClassdebuginfo() {
    return jasperClassdebuginfo;
  }

  @JsonProperty("jasper.classdebuginfo")
  public void setJasperClassdebuginfo(@Nullable ConfigNodePropertyBoolean jasperClassdebuginfo) {
    this.jasperClassdebuginfo = jasperClassdebuginfo;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperEnablePooling(@Nullable ConfigNodePropertyBoolean jasperEnablePooling) {
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
  public @Nullable ConfigNodePropertyBoolean getJasperEnablePooling() {
    return jasperEnablePooling;
  }

  @JsonProperty("jasper.enablePooling")
  public void setJasperEnablePooling(@Nullable ConfigNodePropertyBoolean jasperEnablePooling) {
    this.jasperEnablePooling = jasperEnablePooling;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperIeClassId(@Nullable ConfigNodePropertyString jasperIeClassId) {
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
  public @Nullable ConfigNodePropertyString getJasperIeClassId() {
    return jasperIeClassId;
  }

  @JsonProperty("jasper.ieClassId")
  public void setJasperIeClassId(@Nullable ConfigNodePropertyString jasperIeClassId) {
    this.jasperIeClassId = jasperIeClassId;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperGenStringAsCharArray(@Nullable ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
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
  public @Nullable ConfigNodePropertyBoolean getJasperGenStringAsCharArray() {
    return jasperGenStringAsCharArray;
  }

  @JsonProperty("jasper.genStringAsCharArray")
  public void setJasperGenStringAsCharArray(@Nullable ConfigNodePropertyBoolean jasperGenStringAsCharArray) {
    this.jasperGenStringAsCharArray = jasperGenStringAsCharArray;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperKeepgenerated(@Nullable ConfigNodePropertyBoolean jasperKeepgenerated) {
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
  public @Nullable ConfigNodePropertyBoolean getJasperKeepgenerated() {
    return jasperKeepgenerated;
  }

  @JsonProperty("jasper.keepgenerated")
  public void setJasperKeepgenerated(@Nullable ConfigNodePropertyBoolean jasperKeepgenerated) {
    this.jasperKeepgenerated = jasperKeepgenerated;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperMappedfile(@Nullable ConfigNodePropertyBoolean jasperMappedfile) {
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
  public @Nullable ConfigNodePropertyBoolean getJasperMappedfile() {
    return jasperMappedfile;
  }

  @JsonProperty("jasper.mappedfile")
  public void setJasperMappedfile(@Nullable ConfigNodePropertyBoolean jasperMappedfile) {
    this.jasperMappedfile = jasperMappedfile;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperTrimSpaces(@Nullable ConfigNodePropertyBoolean jasperTrimSpaces) {
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
  public @Nullable ConfigNodePropertyBoolean getJasperTrimSpaces() {
    return jasperTrimSpaces;
  }

  @JsonProperty("jasper.trimSpaces")
  public void setJasperTrimSpaces(@Nullable ConfigNodePropertyBoolean jasperTrimSpaces) {
    this.jasperTrimSpaces = jasperTrimSpaces;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties jasperDisplaySourceFragments(@Nullable ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
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
  public @Nullable ConfigNodePropertyBoolean getJasperDisplaySourceFragments() {
    return jasperDisplaySourceFragments;
  }

  @JsonProperty("jasper.displaySourceFragments")
  public void setJasperDisplaySourceFragments(@Nullable ConfigNodePropertyBoolean jasperDisplaySourceFragments) {
    this.jasperDisplaySourceFragments = jasperDisplaySourceFragments;
  }

  public OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties defaultIsSession(@Nullable ConfigNodePropertyBoolean defaultIsSession) {
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
  public @Nullable ConfigNodePropertyBoolean getDefaultIsSession() {
    return defaultIsSession;
  }

  @JsonProperty("default.is.session")
  public void setDefaultIsSession(@Nullable ConfigNodePropertyBoolean defaultIsSession) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

