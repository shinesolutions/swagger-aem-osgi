package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown mode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger port;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString primaryHost;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger interval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray primaryAllowedClientIpRanges;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean secure;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger standbyReadtimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean standbyAutoclean;

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties orgApacheSlingInstallerConfigurationPersist(@Nullable ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    return this;
  }

  /**
   * Get orgApacheSlingInstallerConfigurationPersist
   * @return orgApacheSlingInstallerConfigurationPersist
   */
  @Valid 
  @Schema(name = "org.apache.sling.installer.configuration.persist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }

  @JsonProperty("org.apache.sling.installer.configuration.persist")
  public void setOrgApacheSlingInstallerConfigurationPersist(@Nullable ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties mode(@Nullable ConfigNodePropertyDropDown mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   */
  @Valid 
  @Schema(name = "mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mode")
  public @Nullable ConfigNodePropertyDropDown getMode() {
    return mode;
  }

  @JsonProperty("mode")
  public void setMode(@Nullable ConfigNodePropertyDropDown mode) {
    this.mode = mode;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties port(@Nullable ConfigNodePropertyInteger port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   */
  @Valid 
  @Schema(name = "port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("port")
  public @Nullable ConfigNodePropertyInteger getPort() {
    return port;
  }

  @JsonProperty("port")
  public void setPort(@Nullable ConfigNodePropertyInteger port) {
    this.port = port;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties primaryHost(@Nullable ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
    return this;
  }

  /**
   * Get primaryHost
   * @return primaryHost
   */
  @Valid 
  @Schema(name = "primary.host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primary.host")
  public @Nullable ConfigNodePropertyString getPrimaryHost() {
    return primaryHost;
  }

  @JsonProperty("primary.host")
  public void setPrimaryHost(@Nullable ConfigNodePropertyString primaryHost) {
    this.primaryHost = primaryHost;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties interval(@Nullable ConfigNodePropertyInteger interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   */
  @Valid 
  @Schema(name = "interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interval")
  public @Nullable ConfigNodePropertyInteger getInterval() {
    return interval;
  }

  @JsonProperty("interval")
  public void setInterval(@Nullable ConfigNodePropertyInteger interval) {
    this.interval = interval;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties primaryAllowedClientIpRanges(@Nullable ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
    return this;
  }

  /**
   * Get primaryAllowedClientIpRanges
   * @return primaryAllowedClientIpRanges
   */
  @Valid 
  @Schema(name = "primary.allowed-client-ip-ranges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primary.allowed-client-ip-ranges")
  public @Nullable ConfigNodePropertyArray getPrimaryAllowedClientIpRanges() {
    return primaryAllowedClientIpRanges;
  }

  @JsonProperty("primary.allowed-client-ip-ranges")
  public void setPrimaryAllowedClientIpRanges(@Nullable ConfigNodePropertyArray primaryAllowedClientIpRanges) {
    this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties secure(@Nullable ConfigNodePropertyBoolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * Get secure
   * @return secure
   */
  @Valid 
  @Schema(name = "secure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secure")
  public @Nullable ConfigNodePropertyBoolean getSecure() {
    return secure;
  }

  @JsonProperty("secure")
  public void setSecure(@Nullable ConfigNodePropertyBoolean secure) {
    this.secure = secure;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties standbyReadtimeout(@Nullable ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
    return this;
  }

  /**
   * Get standbyReadtimeout
   * @return standbyReadtimeout
   */
  @Valid 
  @Schema(name = "standby.readtimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standby.readtimeout")
  public @Nullable ConfigNodePropertyInteger getStandbyReadtimeout() {
    return standbyReadtimeout;
  }

  @JsonProperty("standby.readtimeout")
  public void setStandbyReadtimeout(@Nullable ConfigNodePropertyInteger standbyReadtimeout) {
    this.standbyReadtimeout = standbyReadtimeout;
  }

  public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties standbyAutoclean(@Nullable ConfigNodePropertyBoolean standbyAutoclean) {
    this.standbyAutoclean = standbyAutoclean;
    return this;
  }

  /**
   * Get standbyAutoclean
   * @return standbyAutoclean
   */
  @Valid 
  @Schema(name = "standby.autoclean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standby.autoclean")
  public @Nullable ConfigNodePropertyBoolean getStandbyAutoclean() {
    return standbyAutoclean;
  }

  @JsonProperty("standby.autoclean")
  public void setStandbyAutoclean(@Nullable ConfigNodePropertyBoolean standbyAutoclean) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

