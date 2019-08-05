package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqReportingImplConfigServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReportingImplConfigServiceImplProperties   {
  @JsonProperty("repconf.timezone")
  private ConfigNodePropertyString repconfTimezone = null;

  @JsonProperty("repconf.locale")
  private ConfigNodePropertyString repconfLocale = null;

  @JsonProperty("repconf.snapshots")
  private ConfigNodePropertyString repconfSnapshots = null;

  @JsonProperty("repconf.repdir")
  private ConfigNodePropertyString repconfRepdir = null;

  @JsonProperty("repconf.hourofday")
  private ConfigNodePropertyInteger repconfHourofday = null;

  @JsonProperty("repconf.minofhour")
  private ConfigNodePropertyInteger repconfMinofhour = null;

  @JsonProperty("repconf.maxrows")
  private ConfigNodePropertyInteger repconfMaxrows = null;

  @JsonProperty("repconf.fakedata")
  private ConfigNodePropertyBoolean repconfFakedata = null;

  @JsonProperty("repconf.snapshotuser")
  private ConfigNodePropertyString repconfSnapshotuser = null;

  @JsonProperty("repconf.enforcesnapshotuser")
  private ConfigNodePropertyBoolean repconfEnforcesnapshotuser = null;

  public ComDayCqReportingImplConfigServiceImplProperties repconfTimezone(ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
    return this;
  }

   /**
   * Get repconfTimezone
   * @return repconfTimezone
  **/
  @Valid
  public ConfigNodePropertyString getRepconfTimezone() {
    return repconfTimezone;
  }

  public void setRepconfTimezone(ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfLocale(ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
    return this;
  }

   /**
   * Get repconfLocale
   * @return repconfLocale
  **/
  @Valid
  public ConfigNodePropertyString getRepconfLocale() {
    return repconfLocale;
  }

  public void setRepconfLocale(ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
    return this;
  }

   /**
   * Get repconfSnapshots
   * @return repconfSnapshots
  **/
  @Valid
  public ConfigNodePropertyString getRepconfSnapshots() {
    return repconfSnapshots;
  }

  public void setRepconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfRepdir(ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
    return this;
  }

   /**
   * Get repconfRepdir
   * @return repconfRepdir
  **/
  @Valid
  public ConfigNodePropertyString getRepconfRepdir() {
    return repconfRepdir;
  }

  public void setRepconfRepdir(ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
    return this;
  }

   /**
   * Get repconfHourofday
   * @return repconfHourofday
  **/
  @Valid
  public ConfigNodePropertyInteger getRepconfHourofday() {
    return repconfHourofday;
  }

  public void setRepconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
    return this;
  }

   /**
   * Get repconfMinofhour
   * @return repconfMinofhour
  **/
  @Valid
  public ConfigNodePropertyInteger getRepconfMinofhour() {
    return repconfMinofhour;
  }

  public void setRepconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
    return this;
  }

   /**
   * Get repconfMaxrows
   * @return repconfMaxrows
  **/
  @Valid
  public ConfigNodePropertyInteger getRepconfMaxrows() {
    return repconfMaxrows;
  }

  public void setRepconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
    return this;
  }

   /**
   * Get repconfFakedata
   * @return repconfFakedata
  **/
  @Valid
  public ConfigNodePropertyBoolean getRepconfFakedata() {
    return repconfFakedata;
  }

  public void setRepconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
    return this;
  }

   /**
   * Get repconfSnapshotuser
   * @return repconfSnapshotuser
  **/
  @Valid
  public ConfigNodePropertyString getRepconfSnapshotuser() {
    return repconfSnapshotuser;
  }

  public void setRepconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfEnforcesnapshotuser(ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
    this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
    return this;
  }

   /**
   * Get repconfEnforcesnapshotuser
   * @return repconfEnforcesnapshotuser
  **/
  @Valid
  public ConfigNodePropertyBoolean getRepconfEnforcesnapshotuser() {
    return repconfEnforcesnapshotuser;
  }

  public void setRepconfEnforcesnapshotuser(ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
    this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

