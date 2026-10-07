package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown mode;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger port;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString primaryHost;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger interval;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray primaryAllowedClientIpRanges;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean secure;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger standbyReadtimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean standbyAutoclean;
 /**
  * Get orgApacheSlingInstallerConfigurationPersist
  * @return orgApacheSlingInstallerConfigurationPersist
  */
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }

  /**
   * Sets the <code>orgApacheSlingInstallerConfigurationPersist</code> property.
   */
 public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
  }

  /**
   * Sets the <code>orgApacheSlingInstallerConfigurationPersist</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties orgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    return this;
  }

 /**
  * Get mode
  * @return mode
  */
  @JsonProperty("mode")
  public ConfigNodePropertyDropDown getMode() {
    return mode;
  }

  /**
   * Sets the <code>mode</code> property.
   */
 public void setMode(ConfigNodePropertyDropDown mode) {
    this.mode = mode;
  }

  /**
   * Sets the <code>mode</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties mode(ConfigNodePropertyDropDown mode) {
    this.mode = mode;
    return this;
  }

 /**
  * Get port
  * @return port
  */
  @JsonProperty("port")
  public ConfigNodePropertyInteger getPort() {
    return port;
  }

  /**
   * Sets the <code>port</code> property.
   */
 public void setPort(ConfigNodePropertyInteger port) {
    this.port = port;
  }

  /**
   * Sets the <code>port</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties port(ConfigNodePropertyInteger port) {
    this.port = port;
    return this;
  }

 /**
  * Get primaryHost
  * @return primaryHost
  */
  @JsonProperty("primary.host")
  public ConfigNodePropertyString getPrimaryHost() {
    return primaryHost;
  }

  /**
   * Sets the <code>primaryHost</code> property.
   */
 public void setPrimaryHost(ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
  }

  /**
   * Sets the <code>primaryHost</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties primaryHost(ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
    return this;
  }

 /**
  * Get interval
  * @return interval
  */
  @JsonProperty("interval")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  /**
   * Sets the <code>interval</code> property.
   */
 public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  /**
   * Sets the <code>interval</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties interval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

 /**
  * Get primaryAllowedClientIpRanges
  * @return primaryAllowedClientIpRanges
  */
  @JsonProperty("primary.allowed-client-ip-ranges")
  public ConfigNodePropertyArray getPrimaryAllowedClientIpRanges() {
    return primaryAllowedClientIpRanges;
  }

  /**
   * Sets the <code>primaryAllowedClientIpRanges</code> property.
   */
 public void setPrimaryAllowedClientIpRanges(ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
  }

  /**
   * Sets the <code>primaryAllowedClientIpRanges</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties primaryAllowedClientIpRanges(ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
    return this;
  }

 /**
  * Get secure
  * @return secure
  */
  @JsonProperty("secure")
  public ConfigNodePropertyBoolean getSecure() {
    return secure;
  }

  /**
   * Sets the <code>secure</code> property.
   */
 public void setSecure(ConfigNodePropertyBoolean secure) {
    this.secure = secure;
  }

  /**
   * Sets the <code>secure</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties secure(ConfigNodePropertyBoolean secure) {
    this.secure = secure;
    return this;
  }

 /**
  * Get standbyReadtimeout
  * @return standbyReadtimeout
  */
  @JsonProperty("standby.readtimeout")
  public ConfigNodePropertyInteger getStandbyReadtimeout() {
    return standbyReadtimeout;
  }

  /**
   * Sets the <code>standbyReadtimeout</code> property.
   */
 public void setStandbyReadtimeout(ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
  }

  /**
   * Sets the <code>standbyReadtimeout</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties standbyReadtimeout(ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
    return this;
  }

 /**
  * Get standbyAutoclean
  * @return standbyAutoclean
  */
  @JsonProperty("standby.autoclean")
  public ConfigNodePropertyBoolean getStandbyAutoclean() {
    return standbyAutoclean;
  }

  /**
   * Sets the <code>standbyAutoclean</code> property.
   */
 public void setStandbyAutoclean(ConfigNodePropertyBoolean standbyAutoclean) {
    this.standbyAutoclean = standbyAutoclean;
  }

  /**
   * Sets the <code>standbyAutoclean</code> property.
   */
  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties standbyAutoclean(ConfigNodePropertyBoolean standbyAutoclean) {
    this.standbyAutoclean = standbyAutoclean;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

