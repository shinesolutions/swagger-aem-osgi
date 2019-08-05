package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties   {
  @JsonProperty("handler.schemes")
  private ConfigNodePropertyArray handlerSchemes = null;

  @JsonProperty("sling.jcrinstall.folder.name.regexp")
  private ConfigNodePropertyString slingJcrinstallFolderNameRegexp = null;

  @JsonProperty("sling.jcrinstall.folder.max.depth")
  private ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth = null;

  @JsonProperty("sling.jcrinstall.search.path")
  private ConfigNodePropertyArray slingJcrinstallSearchPath = null;

  @JsonProperty("sling.jcrinstall.new.config.path")
  private ConfigNodePropertyString slingJcrinstallNewConfigPath = null;

  @JsonProperty("sling.jcrinstall.signal.path")
  private ConfigNodePropertyString slingJcrinstallSignalPath = null;

  @JsonProperty("sling.jcrinstall.enable.writeback")
  private ConfigNodePropertyBoolean slingJcrinstallEnableWriteback = null;

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties handlerSchemes(ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
    return this;
  }

   /**
   * Get handlerSchemes
   * @return handlerSchemes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHandlerSchemes() {
    return handlerSchemes;
  }

  public void setHandlerSchemes(ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallFolderNameRegexp(ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
    return this;
  }

   /**
   * Get slingJcrinstallFolderNameRegexp
   * @return slingJcrinstallFolderNameRegexp
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingJcrinstallFolderNameRegexp() {
    return slingJcrinstallFolderNameRegexp;
  }

  public void setSlingJcrinstallFolderNameRegexp(ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
    return this;
  }

   /**
   * Get slingJcrinstallFolderMaxDepth
   * @return slingJcrinstallFolderMaxDepth
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSlingJcrinstallFolderMaxDepth() {
    return slingJcrinstallFolderMaxDepth;
  }

  public void setSlingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallSearchPath(ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
    return this;
  }

   /**
   * Get slingJcrinstallSearchPath
   * @return slingJcrinstallSearchPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getSlingJcrinstallSearchPath() {
    return slingJcrinstallSearchPath;
  }

  public void setSlingJcrinstallSearchPath(ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallNewConfigPath(ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
    return this;
  }

   /**
   * Get slingJcrinstallNewConfigPath
   * @return slingJcrinstallNewConfigPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingJcrinstallNewConfigPath() {
    return slingJcrinstallNewConfigPath;
  }

  public void setSlingJcrinstallNewConfigPath(ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallSignalPath(ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
    return this;
  }

   /**
   * Get slingJcrinstallSignalPath
   * @return slingJcrinstallSignalPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingJcrinstallSignalPath() {
    return slingJcrinstallSignalPath;
  }

  public void setSlingJcrinstallSignalPath(ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallEnableWriteback(ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
    this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
    return this;
  }

   /**
   * Get slingJcrinstallEnableWriteback
   * @return slingJcrinstallEnableWriteback
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSlingJcrinstallEnableWriteback() {
    return slingJcrinstallEnableWriteback;
  }

  public void setSlingJcrinstallEnableWriteback(ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
    this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

