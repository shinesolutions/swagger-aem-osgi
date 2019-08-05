package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties   {
  
  private ConfigNodePropertyArray handlerSchemes = null;
  private ConfigNodePropertyString slingJcrinstallFolderNameRegexp = null;
  private ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth = null;
  private ConfigNodePropertyArray slingJcrinstallSearchPath = null;
  private ConfigNodePropertyString slingJcrinstallNewConfigPath = null;
  private ConfigNodePropertyString slingJcrinstallSignalPath = null;
  private ConfigNodePropertyBoolean slingJcrinstallEnableWriteback = null;

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties () {

  }

  public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties (ConfigNodePropertyArray handlerSchemes, ConfigNodePropertyString slingJcrinstallFolderNameRegexp, ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth, ConfigNodePropertyArray slingJcrinstallSearchPath, ConfigNodePropertyString slingJcrinstallNewConfigPath, ConfigNodePropertyString slingJcrinstallSignalPath, ConfigNodePropertyBoolean slingJcrinstallEnableWriteback) {
    this.handlerSchemes = handlerSchemes;
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
    this.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback;
  }

    
  @JsonProperty("handler.schemes")
  public ConfigNodePropertyArray getHandlerSchemes() {
    return handlerSchemes;
  }
  public void setHandlerSchemes(ConfigNodePropertyArray handlerSchemes) {
    this.handlerSchemes = handlerSchemes;
  }

    
  @JsonProperty("sling.jcrinstall.folder.name.regexp")
  public ConfigNodePropertyString getSlingJcrinstallFolderNameRegexp() {
    return slingJcrinstallFolderNameRegexp;
  }
  public void setSlingJcrinstallFolderNameRegexp(ConfigNodePropertyString slingJcrinstallFolderNameRegexp) {
    this.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp;
  }

    
  @JsonProperty("sling.jcrinstall.folder.max.depth")
  public ConfigNodePropertyInteger getSlingJcrinstallFolderMaxDepth() {
    return slingJcrinstallFolderMaxDepth;
  }
  public void setSlingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger slingJcrinstallFolderMaxDepth) {
    this.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth;
  }

    
  @JsonProperty("sling.jcrinstall.search.path")
  public ConfigNodePropertyArray getSlingJcrinstallSearchPath() {
    return slingJcrinstallSearchPath;
  }
  public void setSlingJcrinstallSearchPath(ConfigNodePropertyArray slingJcrinstallSearchPath) {
    this.slingJcrinstallSearchPath = slingJcrinstallSearchPath;
  }

    
  @JsonProperty("sling.jcrinstall.new.config.path")
  public ConfigNodePropertyString getSlingJcrinstallNewConfigPath() {
    return slingJcrinstallNewConfigPath;
  }
  public void setSlingJcrinstallNewConfigPath(ConfigNodePropertyString slingJcrinstallNewConfigPath) {
    this.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath;
  }

    
  @JsonProperty("sling.jcrinstall.signal.path")
  public ConfigNodePropertyString getSlingJcrinstallSignalPath() {
    return slingJcrinstallSignalPath;
  }
  public void setSlingJcrinstallSignalPath(ConfigNodePropertyString slingJcrinstallSignalPath) {
    this.slingJcrinstallSignalPath = slingJcrinstallSignalPath;
  }

    
  @JsonProperty("sling.jcrinstall.enable.writeback")
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
    return Objects.equals(handlerSchemes, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.handlerSchemes) &&
        Objects.equals(slingJcrinstallFolderNameRegexp, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderNameRegexp) &&
        Objects.equals(slingJcrinstallFolderMaxDepth, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderMaxDepth) &&
        Objects.equals(slingJcrinstallSearchPath, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSearchPath) &&
        Objects.equals(slingJcrinstallNewConfigPath, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallNewConfigPath) &&
        Objects.equals(slingJcrinstallSignalPath, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSignalPath) &&
        Objects.equals(slingJcrinstallEnableWriteback, orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallEnableWriteback);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
