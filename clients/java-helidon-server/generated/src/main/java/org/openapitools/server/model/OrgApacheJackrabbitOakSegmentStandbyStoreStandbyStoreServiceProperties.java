package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties   {

    private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist;
    private ConfigNodePropertyDropDown mode;
    private ConfigNodePropertyInteger port;
    private ConfigNodePropertyString primaryHost;
    private ConfigNodePropertyInteger interval;
    private ConfigNodePropertyArray primaryAllowedClientIpRanges;
    private ConfigNodePropertyBoolean secure;
    private ConfigNodePropertyInteger standbyReadtimeout;
    private ConfigNodePropertyBoolean standbyAutoclean;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.
     *
     * @param orgApacheSlingInstallerConfigurationPersist orgApacheSlingInstallerConfigurationPersist
     * @param mode mode
     * @param port port
     * @param primaryHost primaryHost
     * @param interval interval
     * @param primaryAllowedClientIpRanges primaryAllowedClientIpRanges
     * @param secure secure
     * @param standbyReadtimeout standbyReadtimeout
     * @param standbyAutoclean standbyAutoclean
     */
    public OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(
        ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist, 
        ConfigNodePropertyDropDown mode, 
        ConfigNodePropertyInteger port, 
        ConfigNodePropertyString primaryHost, 
        ConfigNodePropertyInteger interval, 
        ConfigNodePropertyArray primaryAllowedClientIpRanges, 
        ConfigNodePropertyBoolean secure, 
        ConfigNodePropertyInteger standbyReadtimeout, 
        ConfigNodePropertyBoolean standbyAutoclean
    ) {
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



    /**
     * Get orgApacheSlingInstallerConfigurationPersist
     * @return orgApacheSlingInstallerConfigurationPersist
     */
    public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
        return orgApacheSlingInstallerConfigurationPersist;
    }

    public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
        this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    }

    /**
     * Get mode
     * @return mode
     */
    public ConfigNodePropertyDropDown getMode() {
        return mode;
    }

    public void setMode(ConfigNodePropertyDropDown mode) {
        this.mode = mode;
    }

    /**
     * Get port
     * @return port
     */
    public ConfigNodePropertyInteger getPort() {
        return port;
    }

    public void setPort(ConfigNodePropertyInteger port) {
        this.port = port;
    }

    /**
     * Get primaryHost
     * @return primaryHost
     */
    public ConfigNodePropertyString getPrimaryHost() {
        return primaryHost;
    }

    public void setPrimaryHost(ConfigNodePropertyString primaryHost) {
        this.primaryHost = primaryHost;
    }

    /**
     * Get interval
     * @return interval
     */
    public ConfigNodePropertyInteger getInterval() {
        return interval;
    }

    public void setInterval(ConfigNodePropertyInteger interval) {
        this.interval = interval;
    }

    /**
     * Get primaryAllowedClientIpRanges
     * @return primaryAllowedClientIpRanges
     */
    public ConfigNodePropertyArray getPrimaryAllowedClientIpRanges() {
        return primaryAllowedClientIpRanges;
    }

    public void setPrimaryAllowedClientIpRanges(ConfigNodePropertyArray primaryAllowedClientIpRanges) {
        this.primaryAllowedClientIpRanges = primaryAllowedClientIpRanges;
    }

    /**
     * Get secure
     * @return secure
     */
    public ConfigNodePropertyBoolean getSecure() {
        return secure;
    }

    public void setSecure(ConfigNodePropertyBoolean secure) {
        this.secure = secure;
    }

    /**
     * Get standbyReadtimeout
     * @return standbyReadtimeout
     */
    public ConfigNodePropertyInteger getStandbyReadtimeout() {
        return standbyReadtimeout;
    }

    public void setStandbyReadtimeout(ConfigNodePropertyInteger standbyReadtimeout) {
        this.standbyReadtimeout = standbyReadtimeout;
    }

    /**
     * Get standbyAutoclean
     * @return standbyAutoclean
     */
    public ConfigNodePropertyBoolean getStandbyAutoclean() {
        return standbyAutoclean;
    }

    public void setStandbyAutoclean(ConfigNodePropertyBoolean standbyAutoclean) {
        this.standbyAutoclean = standbyAutoclean;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

