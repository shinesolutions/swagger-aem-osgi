package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }
  public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("mode")
  public ConfigNodePropertyDropDown getMode() {
    return mode;
  }
  public void setMode(ConfigNodePropertyDropDown mode) {
    this.mode = mode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("port")
  public ConfigNodePropertyInteger getPort() {
    return port;
  }
  public void setPort(ConfigNodePropertyInteger port) {
    this.port = port;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("primary.host")
  public ConfigNodePropertyString getPrimaryHost() {
    return primaryHost;
  }
  public void setPrimaryHost(ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("interval")
  public ConfigNodePropertyInteger getInterval() {
    return interval;
  }
  public void setInterval(ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("primary.allowed-client-ip-ranges")
  public ConfigNodePropertyArray getPrimaryAllowedClientIpRanges() {
    return primaryAllowedClientIpRanges;
  }
  public void setPrimaryAllowedClientIpRanges(ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("secure")
  public ConfigNodePropertyBoolean getSecure() {
    return secure;
  }
  public void setSecure(ConfigNodePropertyBoolean secure) {
    this.secure = secure;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("standby.readtimeout")
  public ConfigNodePropertyInteger getStandbyReadtimeout() {
    return standbyReadtimeout;
  }
  public void setStandbyReadtimeout(ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

