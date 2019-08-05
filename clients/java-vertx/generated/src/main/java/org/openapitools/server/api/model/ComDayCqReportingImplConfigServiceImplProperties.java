package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqReportingImplConfigServiceImplProperties   {
  
  private ConfigNodePropertyString repconfTimezone = null;
  private ConfigNodePropertyString repconfLocale = null;
  private ConfigNodePropertyString repconfSnapshots = null;
  private ConfigNodePropertyString repconfRepdir = null;
  private ConfigNodePropertyInteger repconfHourofday = null;
  private ConfigNodePropertyInteger repconfMinofhour = null;
  private ConfigNodePropertyInteger repconfMaxrows = null;
  private ConfigNodePropertyBoolean repconfFakedata = null;
  private ConfigNodePropertyString repconfSnapshotuser = null;
  private ConfigNodePropertyBoolean repconfEnforcesnapshotuser = null;

  public ComDayCqReportingImplConfigServiceImplProperties () {

  }

  public ComDayCqReportingImplConfigServiceImplProperties (ConfigNodePropertyString repconfTimezone, ConfigNodePropertyString repconfLocale, ConfigNodePropertyString repconfSnapshots, ConfigNodePropertyString repconfRepdir, ConfigNodePropertyInteger repconfHourofday, ConfigNodePropertyInteger repconfMinofhour, ConfigNodePropertyInteger repconfMaxrows, ConfigNodePropertyBoolean repconfFakedata, ConfigNodePropertyString repconfSnapshotuser, ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
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

    
  @JsonProperty("repconf.timezone")
  public ConfigNodePropertyString getRepconfTimezone() {
    return repconfTimezone;
  }
  public void setRepconfTimezone(ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
  }

    
  @JsonProperty("repconf.locale")
  public ConfigNodePropertyString getRepconfLocale() {
    return repconfLocale;
  }
  public void setRepconfLocale(ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
  }

    
  @JsonProperty("repconf.snapshots")
  public ConfigNodePropertyString getRepconfSnapshots() {
    return repconfSnapshots;
  }
  public void setRepconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
  }

    
  @JsonProperty("repconf.repdir")
  public ConfigNodePropertyString getRepconfRepdir() {
    return repconfRepdir;
  }
  public void setRepconfRepdir(ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
  }

    
  @JsonProperty("repconf.hourofday")
  public ConfigNodePropertyInteger getRepconfHourofday() {
    return repconfHourofday;
  }
  public void setRepconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
  }

    
  @JsonProperty("repconf.minofhour")
  public ConfigNodePropertyInteger getRepconfMinofhour() {
    return repconfMinofhour;
  }
  public void setRepconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
  }

    
  @JsonProperty("repconf.maxrows")
  public ConfigNodePropertyInteger getRepconfMaxrows() {
    return repconfMaxrows;
  }
  public void setRepconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
  }

    
  @JsonProperty("repconf.fakedata")
  public ConfigNodePropertyBoolean getRepconfFakedata() {
    return repconfFakedata;
  }
  public void setRepconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
  }

    
  @JsonProperty("repconf.snapshotuser")
  public ConfigNodePropertyString getRepconfSnapshotuser() {
    return repconfSnapshotuser;
  }
  public void setRepconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
  }

    
  @JsonProperty("repconf.enforcesnapshotuser")
  public ConfigNodePropertyBoolean getRepconfEnforcesnapshotuser() {
    return repconfEnforcesnapshotuser;
  }
  public void setRepconfEnforcesnapshotuser(ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
    this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReportingImplConfigServiceImplProperties comDayCqReportingImplConfigServiceImplProperties = (ComDayCqReportingImplConfigServiceImplProperties) o;
    return Objects.equals(repconfTimezone, comDayCqReportingImplConfigServiceImplProperties.repconfTimezone) &&
        Objects.equals(repconfLocale, comDayCqReportingImplConfigServiceImplProperties.repconfLocale) &&
        Objects.equals(repconfSnapshots, comDayCqReportingImplConfigServiceImplProperties.repconfSnapshots) &&
        Objects.equals(repconfRepdir, comDayCqReportingImplConfigServiceImplProperties.repconfRepdir) &&
        Objects.equals(repconfHourofday, comDayCqReportingImplConfigServiceImplProperties.repconfHourofday) &&
        Objects.equals(repconfMinofhour, comDayCqReportingImplConfigServiceImplProperties.repconfMinofhour) &&
        Objects.equals(repconfMaxrows, comDayCqReportingImplConfigServiceImplProperties.repconfMaxrows) &&
        Objects.equals(repconfFakedata, comDayCqReportingImplConfigServiceImplProperties.repconfFakedata) &&
        Objects.equals(repconfSnapshotuser, comDayCqReportingImplConfigServiceImplProperties.repconfSnapshotuser) &&
        Objects.equals(repconfEnforcesnapshotuser, comDayCqReportingImplConfigServiceImplProperties.repconfEnforcesnapshotuser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repconfTimezone, repconfLocale, repconfSnapshots, repconfRepdir, repconfHourofday, repconfMinofhour, repconfMaxrows, repconfFakedata, repconfSnapshotuser, repconfEnforcesnapshotuser);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
