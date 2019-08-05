package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties   {
  
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist = null;
  private ConfigNodePropertyDropDown mode = null;
  private ConfigNodePropertyInteger port = null;
  private ConfigNodePropertyString primaryHost = null;
  private ConfigNodePropertyInteger interval = null;
  private ConfigNodePropertyArray primaryAllowedClientIpRanges = null;
  private ConfigNodePropertyBoolean secure = null;
  private ConfigNodePropertyInteger standbyReadtimeout = null;
  private ConfigNodePropertyBoolean standbyAutoclean = null;

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties () {

  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties (ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist, ConfigNodePropertyDropDown mode, ConfigNodePropertyInteger port, ConfigNodePropertyString primaryHost, ConfigNodePropertyInteger interval, ConfigNodePropertyArray primaryAllowedClientIpRanges, ConfigNodePropertyBoolean secure, ConfigNodePropertyInteger standbyReadtimeout, ConfigNodePropertyBoolean standbyAutoclean) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    this.mode = mode;
    this.port = port;
    this.primaryHost = primaryHost;
    this.interval = interval;
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
    this.secure = secure;
    this.standbyReadtimeout = standbyReadtimeout;
    this.standbyAutoclean = standbyAutoclean;
  }

    
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }
  public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
  }

    
  @JsonProperty("mode")
  public ConfigNodePropertyDropDown getMode() {
    return mode;
  }
  public void setMode(ConfigNodePropertyDropDown mode) {
    this.mode = mode;
  }

    
  @JsonProperty("port")
  public ConfigNodePropertyInteger getPort() {
    return port;
  }
  public void setPort(ConfigNodePropertyInteger port) {
    this.port = port;
  }

    
  @JsonProperty("primary.host")
  public ConfigNodePropertyString getPrimaryHost() {
    return primaryHost;
  }
  public void setPrimaryHost(ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
  }

    
  @JsonProperty("interval")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }
  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

    
  @JsonProperty("primary.allowed-client-ip-ranges")
  public ConfigNodePropertyArray getPrimaryAllowedClientIpRanges() {
    return primaryAllowedClientIpRanges;
  }
  public void setPrimaryAllowedClientIpRanges(ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
  }

    
  @JsonProperty("secure")
  public ConfigNodePropertyBoolean getSecure() {
    return secure;
  }
  public void setSecure(ConfigNodePropertyBoolean secure) {
    this.secure = secure;
  }

    
  @JsonProperty("standby.readtimeout")
  public ConfigNodePropertyInteger getStandbyReadtimeout() {
    return standbyReadtimeout;
  }
  public void setStandbyReadtimeout(ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
  }

    
  @JsonProperty("standby.autoclean")
  public ConfigNodePropertyBoolean getStandbyAutoclean() {
    return standbyAutoclean;
  }
  public void setStandbyAutoclean(ConfigNodePropertyBoolean standbyAutoclean) {
    this.standbyAutoclean = standbyAutoclean;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties = (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties) o;
    return Objects.equals(orgApacheSlingInstallerConfigurationPersist, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.orgApacheSlingInstallerConfigurationPersist) &&
        Objects.equals(mode, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.mode) &&
        Objects.equals(port, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.port) &&
        Objects.equals(primaryHost, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.primaryHost) &&
        Objects.equals(interval, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.interval) &&
        Objects.equals(primaryAllowedClientIpRanges, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.primaryAllowedClientIpRanges) &&
        Objects.equals(secure, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.secure) &&
        Objects.equals(standbyReadtimeout, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.standbyReadtimeout) &&
        Objects.equals(standbyAutoclean, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.standbyAutoclean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingInstallerConfigurationPersist, mode, port, primaryHost, interval, primaryAllowedClientIpRanges, secure, standbyReadtimeout, standbyAutoclean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {\n");
    
    sb.append("    orgApacheSlingInstallerConfigurationPersist: ").append(toIndentedString(orgApacheSlingInstallerConfigurationPersist)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    primaryHost: ").append(toIndentedString(primaryHost)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    primaryAllowedClientIpRanges: ").append(toIndentedString(primaryAllowedClientIpRanges)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    standbyReadtimeout: ").append(toIndentedString(standbyReadtimeout)).append("\n");
    sb.append("    standbyAutoclean: ").append(toIndentedString(standbyAutoclean)).append("\n");
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
