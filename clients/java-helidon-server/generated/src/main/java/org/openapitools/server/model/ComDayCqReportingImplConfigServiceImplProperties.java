package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReportingImplConfigServiceImplProperties   {

    private ConfigNodePropertyString repconfTimezone;
    private ConfigNodePropertyString repconfLocale;
    private ConfigNodePropertyString repconfSnapshots;
    private ConfigNodePropertyString repconfRepdir;
    private ConfigNodePropertyInteger repconfHourofday;
    private ConfigNodePropertyInteger repconfMinofhour;
    private ConfigNodePropertyInteger repconfMaxrows;
    private ConfigNodePropertyBoolean repconfFakedata;
    private ConfigNodePropertyString repconfSnapshotuser;
    private ConfigNodePropertyBoolean repconfEnforcesnapshotuser;

    /**
     * Default constructor.
     */
    public ComDayCqReportingImplConfigServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReportingImplConfigServiceImplProperties.
     *
     * @param repconfTimezone repconfTimezone
     * @param repconfLocale repconfLocale
     * @param repconfSnapshots repconfSnapshots
     * @param repconfRepdir repconfRepdir
     * @param repconfHourofday repconfHourofday
     * @param repconfMinofhour repconfMinofhour
     * @param repconfMaxrows repconfMaxrows
     * @param repconfFakedata repconfFakedata
     * @param repconfSnapshotuser repconfSnapshotuser
     * @param repconfEnforcesnapshotuser repconfEnforcesnapshotuser
     */
    public ComDayCqReportingImplConfigServiceImplProperties(
        ConfigNodePropertyString repconfTimezone, 
        ConfigNodePropertyString repconfLocale, 
        ConfigNodePropertyString repconfSnapshots, 
        ConfigNodePropertyString repconfRepdir, 
        ConfigNodePropertyInteger repconfHourofday, 
        ConfigNodePropertyInteger repconfMinofhour, 
        ConfigNodePropertyInteger repconfMaxrows, 
        ConfigNodePropertyBoolean repconfFakedata, 
        ConfigNodePropertyString repconfSnapshotuser, 
        ConfigNodePropertyBoolean repconfEnforcesnapshotuser
    ) {
        this.repconfTimezone = repconfTimezone;
        this.repconfLocale = repconfLocale;
        this.repconfSnapshots = repconfSnapshots;
        this.repconfRepdir = repconfRepdir;
        this.repconfHourofday = repconfHourofday;
        this.repconfMinofhour = repconfMinofhour;
        this.repconfMaxrows = repconfMaxrows;
        this.repconfFakedata = repconfFakedata;
        this.repconfSnapshotuser = repconfSnapshotuser;
        this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
    }



    /**
     * Get repconfTimezone
     * @return repconfTimezone
     */
    public ConfigNodePropertyString getRepconfTimezone() {
        return repconfTimezone;
    }

    public void setRepconfTimezone(ConfigNodePropertyString repconfTimezone) {
        this.repconfTimezone = repconfTimezone;
    }

    /**
     * Get repconfLocale
     * @return repconfLocale
     */
    public ConfigNodePropertyString getRepconfLocale() {
        return repconfLocale;
    }

    public void setRepconfLocale(ConfigNodePropertyString repconfLocale) {
        this.repconfLocale = repconfLocale;
    }

    /**
     * Get repconfSnapshots
     * @return repconfSnapshots
     */
    public ConfigNodePropertyString getRepconfSnapshots() {
        return repconfSnapshots;
    }

    public void setRepconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
        this.repconfSnapshots = repconfSnapshots;
    }

    /**
     * Get repconfRepdir
     * @return repconfRepdir
     */
    public ConfigNodePropertyString getRepconfRepdir() {
        return repconfRepdir;
    }

    public void setRepconfRepdir(ConfigNodePropertyString repconfRepdir) {
        this.repconfRepdir = repconfRepdir;
    }

    /**
     * Get repconfHourofday
     * @return repconfHourofday
     */
    public ConfigNodePropertyInteger getRepconfHourofday() {
        return repconfHourofday;
    }

    public void setRepconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
        this.repconfHourofday = repconfHourofday;
    }

    /**
     * Get repconfMinofhour
     * @return repconfMinofhour
     */
    public ConfigNodePropertyInteger getRepconfMinofhour() {
        return repconfMinofhour;
    }

    public void setRepconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
        this.repconfMinofhour = repconfMinofhour;
    }

    /**
     * Get repconfMaxrows
     * @return repconfMaxrows
     */
    public ConfigNodePropertyInteger getRepconfMaxrows() {
        return repconfMaxrows;
    }

    public void setRepconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
        this.repconfMaxrows = repconfMaxrows;
    }

    /**
     * Get repconfFakedata
     * @return repconfFakedata
     */
    public ConfigNodePropertyBoolean getRepconfFakedata() {
        return repconfFakedata;
    }

    public void setRepconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
        this.repconfFakedata = repconfFakedata;
    }

    /**
     * Get repconfSnapshotuser
     * @return repconfSnapshotuser
     */
    public ConfigNodePropertyString getRepconfSnapshotuser() {
        return repconfSnapshotuser;
    }

    public void setRepconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
        this.repconfSnapshotuser = repconfSnapshotuser;
    }

    /**
     * Get repconfEnforcesnapshotuser
     * @return repconfEnforcesnapshotuser
     */
    public ConfigNodePropertyBoolean getRepconfEnforcesnapshotuser() {
        return repconfEnforcesnapshotuser;
    }

    public void setRepconfEnforcesnapshotuser(ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
        this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReportingImplConfigServiceImplProperties {\n");
        
        sb.append("    repconfTimezone: ").append(toIndentedString(repconfTimezone)).append("\n");
        sb.append("    repconfLocale: ").append(toIndentedString(repconfLocale)).append("\n");
        sb.append("    repconfSnapshots: ").append(toIndentedString(repconfSnapshots)).append("\n");
        sb.append("    repconfRepdir: ").append(toIndentedString(repconfRepdir)).append("\n");
        sb.append("    repconfHourofday: ").append(toIndentedString(repconfHourofday)).append("\n");
        sb.append("    repconfMinofhour: ").append(toIndentedString(repconfMinofhour)).append("\n");
        sb.append("    repconfMaxrows: ").append(toIndentedString(repconfMaxrows)).append("\n");
        sb.append("    repconfFakedata: ").append(toIndentedString(repconfFakedata)).append("\n");
        sb.append("    repconfSnapshotuser: ").append(toIndentedString(repconfSnapshotuser)).append("\n");
        sb.append("    repconfEnforcesnapshotuser: ").append(toIndentedString(repconfEnforcesnapshotuser)).append("\n");
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

