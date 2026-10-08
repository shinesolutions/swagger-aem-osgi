package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("handler.schemes")
  private ConfigNodePropertyArray handlerSchemes;

  @JsonProperty("sling.jcrinstall.folder.name.regexp")
  private ConfigNodePropertyString slingJcrinstallFolderNameRegexp;

  @JsonProperty("sling.jcrinstall.folder.max.depth")
  private ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth;

  @JsonProperty("sling.jcrinstall.search.path")
  private ConfigNodePropertyArray slingJcrinstallSearchPath;

  @JsonProperty("sling.jcrinstall.new.config.path")
  private ConfigNodePropertyString slingJcrinstallNewConfigPath;

  @JsonProperty("sling.jcrinstall.signal.path")
  private ConfigNodePropertyString slingJcrinstallSignalPath;

  @JsonProperty("sling.jcrinstall.enable.writeback")
  private ConfigNodePropertyBoolean slingJcrinstallEnableWriteback;

  /**
   * 
   * @return handlerSchemes
   */
  public ConfigNodePropertyArray getHandlerSchemes() {
    return handlerSchemes;
  }

  public void setHandlerSchemes(ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
  }

  /**
   * 
   * @return slingJcrinstallFolderNameRegexp
   */
  public ConfigNodePropertyString getSlingJcrinstallFolderNameRegexp() {
    return slingJcrinstallFolderNameRegexp;
  }

  public void setSlingJcrinstallFolderNameRegexp(ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
  }

  /**
   * 
   * @return slingJcrinstallFolderMaxDepth
   */
  public ConfigNodePropertyInteger getSlingJcrinstallFolderMaxDepth() {
    return slingJcrinstallFolderMaxDepth;
  }

  public void setSlingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
  }

  /**
   * 
   * @return slingJcrinstallSearchPath
   */
  public ConfigNodePropertyArray getSlingJcrinstallSearchPath() {
    return slingJcrinstallSearchPath;
  }

  public void setSlingJcrinstallSearchPath(ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
  }

  /**
   * 
   * @return slingJcrinstallNewConfigPath
   */
  public ConfigNodePropertyString getSlingJcrinstallNewConfigPath() {
    return slingJcrinstallNewConfigPath;
  }

  public void setSlingJcrinstallNewConfigPath(ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
  }

  /**
   * 
   * @return slingJcrinstallSignalPath
   */
  public ConfigNodePropertyString getSlingJcrinstallSignalPath() {
    return slingJcrinstallSignalPath;
  }

  public void setSlingJcrinstallSignalPath(ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
  }

  /**
   * 
   * @return slingJcrinstallEnableWriteback
   */
  public ConfigNodePropertyBoolean getSlingJcrinstallEnableWriteback() {
    return slingJcrinstallEnableWriteback;
  }

  public void setSlingJcrinstallEnableWriteback(ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
