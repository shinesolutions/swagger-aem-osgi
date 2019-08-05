package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties   {
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist = null;

  @JsonProperty("mode")
  private ConfigNodePropertyDropDown mode = null;

  @JsonProperty("port")
  private ConfigNodePropertyInteger port = null;

  @JsonProperty("primary.host")
  private ConfigNodePropertyString primaryHost = null;

  @JsonProperty("interval")
  private ConfigNodePropertyInteger interval = null;

  @JsonProperty("primary.allowed-client-ip-ranges")
  private ConfigNodePropertyArray primaryAllowedClientIpRanges = null;

  @JsonProperty("secure")
  private ConfigNodePropertyBoolean secure = null;

  @JsonProperty("standby.readtimeout")
  private ConfigNodePropertyInteger standbyReadtimeout = null;

  @JsonProperty("standby.autoclean")
  private ConfigNodePropertyBoolean standbyAutoclean = null;

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties orgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    return this;
  }

  /**
   * Get orgApacheSlingInstallerConfigurationPersist
   * @return orgApacheSlingInstallerConfigurationPersist
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getStandbyAutoclean() {
    return standbyAutoclean;
  }

  public void setStandbyAutoclean(ConfigNodePropertyBoolean standbyAutoclean) {
    this.standbyAutoclean = standbyAutoclean;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties = (OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties) o;
    return Objects.equals(this.orgApacheSlingInstallerConfigurationPersist, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.orgApacheSlingInstallerConfigurationPersist) &&
        Objects.equals(this.mode, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.mode) &&
        Objects.equals(this.port, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.port) &&
        Objects.equals(this.primaryHost, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.primaryHost) &&
        Objects.equals(this.interval, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.interval) &&
        Objects.equals(this.primaryAllowedClientIpRanges, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.primaryAllowedClientIpRanges) &&
        Objects.equals(this.secure, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.secure) &&
        Objects.equals(this.standbyReadtimeout, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.standbyReadtimeout) &&
        Objects.equals(this.standbyAutoclean, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.standbyAutoclean);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

