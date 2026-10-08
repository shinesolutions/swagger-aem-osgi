package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties   {
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  @Valid

  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist;

  @JsonProperty("mode")
  @Valid

  private ConfigNodePropertyDropDown mode;

  @JsonProperty("port")
  @Valid

  private ConfigNodePropertyInteger port;

  @JsonProperty("primary.host")
  @Valid

  private ConfigNodePropertyString primaryHost;

  @JsonProperty("interval")
  @Valid

  private ConfigNodePropertyInteger interval;

  @JsonProperty("primary.allowed-client-ip-ranges")
  @Valid

  private ConfigNodePropertyArray primaryAllowedClientIpRanges;

  @JsonProperty("secure")
  @Valid

  private ConfigNodePropertyBoolean secure;

  @JsonProperty("standby.readtimeout")
  @Valid

  private ConfigNodePropertyInteger standbyReadtimeout;

  @JsonProperty("standby.autoclean")
  @Valid

  private ConfigNodePropertyBoolean standbyAutoclean;

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties orgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    return this;
  }

   /**
   * Get orgApacheSlingInstallerConfigurationPersist
   * @return orgApacheSlingInstallerConfigurationPersist
  **/
  public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }

  public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties mode(ConfigNodePropertyDropDown mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  public ConfigNodePropertyDropDown getMode() {
    return mode;
  }

  public void setMode(ConfigNodePropertyDropDown mode) {
    this.mode = mode;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties port(ConfigNodePropertyInteger port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  public ConfigNodePropertyInteger getPort() {
    return port;
  }

  public void setPort(ConfigNodePropertyInteger port) {
    this.port = port;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties primaryHost(ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
    return this;
  }

   /**
   * Get primaryHost
   * @return primaryHost
  **/
  public ConfigNodePropertyString getPrimaryHost() {
    return primaryHost;
  }

  public void setPrimaryHost(ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties interval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties primaryAllowedClientIpRanges(ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
    return this;
  }

   /**
   * Get primaryAllowedClientIpRanges
   * @return primaryAllowedClientIpRanges
  **/
  public ConfigNodePropertyArray getPrimaryAllowedClientIpRanges() {
    return primaryAllowedClientIpRanges;
  }

  public void setPrimaryAllowedClientIpRanges(ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties secure(ConfigNodePropertyBoolean secure) {
    this.secure = secure;
    return this;
  }

   /**
   * Get secure
   * @return secure
  **/
  public ConfigNodePropertyBoolean getSecure() {
    return secure;
  }

  public void setSecure(ConfigNodePropertyBoolean secure) {
    this.secure = secure;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties standbyReadtimeout(ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
    return this;
  }

   /**
   * Get standbyReadtimeout
   * @return standbyReadtimeout
  **/
  public ConfigNodePropertyInteger getStandbyReadtimeout() {
    return standbyReadtimeout;
  }

  public void setStandbyReadtimeout(ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties standbyAutoclean(ConfigNodePropertyBoolean standbyAutoclean) {
    this.standbyAutoclean = standbyAutoclean;
    return this;
  }

   /**
   * Get standbyAutoclean
   * @return standbyAutoclean
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

