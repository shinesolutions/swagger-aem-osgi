package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
 */

@JsonTypeName("orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray handlerSchemes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingJcrinstallFolderNameRegexp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray slingJcrinstallSearchPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingJcrinstallNewConfigPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingJcrinstallSignalPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean slingJcrinstallEnableWriteback;

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties handlerSchemes(@Nullable ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
    return this;
  }

  /**
   * Get handlerSchemes
   * @return handlerSchemes
   */
  @Valid 
  @Schema(name = "handler.schemes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("handler.schemes")
  public @Nullable ConfigNodePropertyArray getHandlerSchemes() {
    return handlerSchemes;
  }

  @JsonProperty("handler.schemes")
  public void setHandlerSchemes(@Nullable ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallFolderNameRegexp(@Nullable ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
    return this;
  }

  /**
   * Get slingJcrinstallFolderNameRegexp
   * @return slingJcrinstallFolderNameRegexp
   */
  @Valid 
  @Schema(name = "sling.jcrinstall.folder.name.regexp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.jcrinstall.folder.name.regexp")
  public @Nullable ConfigNodePropertyString getSlingJcrinstallFolderNameRegexp() {
    return slingJcrinstallFolderNameRegexp;
  }

  @JsonProperty("sling.jcrinstall.folder.name.regexp")
  public void setSlingJcrinstallFolderNameRegexp(@Nullable ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallFolderMaxDepth(@Nullable ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
    return this;
  }

  /**
   * Get slingJcrinstallFolderMaxDepth
   * @return slingJcrinstallFolderMaxDepth
   */
  @Valid 
  @Schema(name = "sling.jcrinstall.folder.max.depth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.jcrinstall.folder.max.depth")
  public @Nullable ConfigNodePropertyInteger getSlingJcrinstallFolderMaxDepth() {
    return slingJcrinstallFolderMaxDepth;
  }

  @JsonProperty("sling.jcrinstall.folder.max.depth")
  public void setSlingJcrinstallFolderMaxDepth(@Nullable ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallSearchPath(@Nullable ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
    return this;
  }

  /**
   * Get slingJcrinstallSearchPath
   * @return slingJcrinstallSearchPath
   */
  @Valid 
  @Schema(name = "sling.jcrinstall.search.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.jcrinstall.search.path")
  public @Nullable ConfigNodePropertyArray getSlingJcrinstallSearchPath() {
    return slingJcrinstallSearchPath;
  }

  @JsonProperty("sling.jcrinstall.search.path")
  public void setSlingJcrinstallSearchPath(@Nullable ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallNewConfigPath(@Nullable ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
    return this;
  }

  /**
   * Get slingJcrinstallNewConfigPath
   * @return slingJcrinstallNewConfigPath
   */
  @Valid 
  @Schema(name = "sling.jcrinstall.new.config.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.jcrinstall.new.config.path")
  public @Nullable ConfigNodePropertyString getSlingJcrinstallNewConfigPath() {
    return slingJcrinstallNewConfigPath;
  }

  @JsonProperty("sling.jcrinstall.new.config.path")
  public void setSlingJcrinstallNewConfigPath(@Nullable ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallSignalPath(@Nullable ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
    return this;
  }

  /**
   * Get slingJcrinstallSignalPath
   * @return slingJcrinstallSignalPath
   */
  @Valid 
  @Schema(name = "sling.jcrinstall.signal.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.jcrinstall.signal.path")
  public @Nullable ConfigNodePropertyString getSlingJcrinstallSignalPath() {
    return slingJcrinstallSignalPath;
  }

  @JsonProperty("sling.jcrinstall.signal.path")
  public void setSlingJcrinstallSignalPath(@Nullable ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallEnableWriteback(@Nullable ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
    this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
    return this;
  }

  /**
   * Get slingJcrinstallEnableWriteback
   * @return slingJcrinstallEnableWriteback
   */
  @Valid 
  @Schema(name = "sling.jcrinstall.enable.writeback", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.jcrinstall.enable.writeback")
  public @Nullable ConfigNodePropertyBoolean getSlingJcrinstallEnableWriteback() {
    return slingJcrinstallEnableWriteback;
  }

  @JsonProperty("sling.jcrinstall.enable.writeback")
  public void setSlingJcrinstallEnableWriteback(@Nullable ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
    this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties = (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties) o;
    return Objects.equals(this.handlerSchemes, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.handlerSchemes) &&
        Objects.equals(this.slingJcrinstallFolderNameRegexp, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderNameRegexp) &&
        Objects.equals(this.slingJcrinstallFolderMaxDepth, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderMaxDepth) &&
        Objects.equals(this.slingJcrinstallSearchPath, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSearchPath) &&
        Objects.equals(this.slingJcrinstallNewConfigPath, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallNewConfigPath) &&
        Objects.equals(this.slingJcrinstallSignalPath, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSignalPath) &&
        Objects.equals(this.slingJcrinstallEnableWriteback, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallEnableWriteback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlerSchemes, slingJcrinstallFolderNameRegexp, slingJcrinstallFolderMaxDepth, slingJcrinstallSearchPath, slingJcrinstallNewConfigPath, slingJcrinstallSignalPath, slingJcrinstallEnableWriteback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {\n");
    sb.append("    handlerSchemes: ").append(toIndentedString(handlerSchemes)).append("\n");
    sb.append("    slingJcrinstallFolderNameRegexp: ").append(toIndentedString(slingJcrinstallFolderNameRegexp)).append("\n");
    sb.append("    slingJcrinstallFolderMaxDepth: ").append(toIndentedString(slingJcrinstallFolderMaxDepth)).append("\n");
    sb.append("    slingJcrinstallSearchPath: ").append(toIndentedString(slingJcrinstallSearchPath)).append("\n");
    sb.append("    slingJcrinstallNewConfigPath: ").append(toIndentedString(slingJcrinstallNewConfigPath)).append("\n");
    sb.append("    slingJcrinstallSignalPath: ").append(toIndentedString(slingJcrinstallSignalPath)).append("\n");
    sb.append("    slingJcrinstallEnableWriteback: ").append(toIndentedString(slingJcrinstallEnableWriteback)).append("\n");
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

