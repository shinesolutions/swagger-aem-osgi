package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray handlerSchemes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingJcrinstallFolderNameRegexp = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray slingJcrinstallSearchPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingJcrinstallNewConfigPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingJcrinstallSignalPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean slingJcrinstallEnableWriteback = null;
 /**
   * Get handlerSchemes
   * @return handlerSchemes
  **/
  @JsonProperty("handler.schemes")
  public ConfigNodePropertyArray getHandlerSchemes() {
    return handlerSchemes;
  }

  public void setHandlerSchemes(ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties handlerSchemes(ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
    return this;
  }

 /**
   * Get slingJcrinstallFolderNameRegexp
   * @return slingJcrinstallFolderNameRegexp
  **/
  @JsonProperty("sling.jcrinstall.folder.name.regexp")
  public ConfigNodePropertyString getSlingJcrinstallFolderNameRegexp() {
    return slingJcrinstallFolderNameRegexp;
  }

  public void setSlingJcrinstallFolderNameRegexp(ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallFolderNameRegexp(ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
    return this;
  }

 /**
   * Get slingJcrinstallFolderMaxDepth
   * @return slingJcrinstallFolderMaxDepth
  **/
  @JsonProperty("sling.jcrinstall.folder.max.depth")
  public ConfigNodePropertyInteger getSlingJcrinstallFolderMaxDepth() {
    return slingJcrinstallFolderMaxDepth;
  }

  public void setSlingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
    return this;
  }

 /**
   * Get slingJcrinstallSearchPath
   * @return slingJcrinstallSearchPath
  **/
  @JsonProperty("sling.jcrinstall.search.path")
  public ConfigNodePropertyArray getSlingJcrinstallSearchPath() {
    return slingJcrinstallSearchPath;
  }

  public void setSlingJcrinstallSearchPath(ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallSearchPath(ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
    return this;
  }

 /**
   * Get slingJcrinstallNewConfigPath
   * @return slingJcrinstallNewConfigPath
  **/
  @JsonProperty("sling.jcrinstall.new.config.path")
  public ConfigNodePropertyString getSlingJcrinstallNewConfigPath() {
    return slingJcrinstallNewConfigPath;
  }

  public void setSlingJcrinstallNewConfigPath(ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallNewConfigPath(ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
    return this;
  }

 /**
   * Get slingJcrinstallSignalPath
   * @return slingJcrinstallSignalPath
  **/
  @JsonProperty("sling.jcrinstall.signal.path")
  public ConfigNodePropertyString getSlingJcrinstallSignalPath() {
    return slingJcrinstallSignalPath;
  }

  public void setSlingJcrinstallSignalPath(ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallSignalPath(ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
    return this;
  }

 /**
   * Get slingJcrinstallEnableWriteback
   * @return slingJcrinstallEnableWriteback
  **/
  @JsonProperty("sling.jcrinstall.enable.writeback")
  public ConfigNodePropertyBoolean getSlingJcrinstallEnableWriteback() {
    return slingJcrinstallEnableWriteback;
  }

  public void setSlingJcrinstallEnableWriteback(ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
    this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties slingJcrinstallEnableWriteback(ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
    this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

