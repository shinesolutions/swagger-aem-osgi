package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqReportingImplConfigServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString repconfTimezone = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString repconfLocale = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString repconfSnapshots = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString repconfRepdir = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger repconfHourofday = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger repconfMinofhour = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger repconfMaxrows = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean repconfFakedata = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString repconfSnapshotuser = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean repconfEnforcesnapshotuser = null;
 /**
   * Get repconfTimezone
   * @return repconfTimezone
  **/
  @JsonProperty("repconf.timezone")
  public ConfigNodePropertyString getRepconfTimezone() {
    return repconfTimezone;
  }

  public void setRepconfTimezone(ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfTimezone(ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
    return this;
  }

 /**
   * Get repconfLocale
   * @return repconfLocale
  **/
  @JsonProperty("repconf.locale")
  public ConfigNodePropertyString getRepconfLocale() {
    return repconfLocale;
  }

  public void setRepconfLocale(ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfLocale(ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
    return this;
  }

 /**
   * Get repconfSnapshots
   * @return repconfSnapshots
  **/
  @JsonProperty("repconf.snapshots")
  public ConfigNodePropertyString getRepconfSnapshots() {
    return repconfSnapshots;
  }

  public void setRepconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
    return this;
  }

 /**
   * Get repconfRepdir
   * @return repconfRepdir
  **/
  @JsonProperty("repconf.repdir")
  public ConfigNodePropertyString getRepconfRepdir() {
    return repconfRepdir;
  }

  public void setRepconfRepdir(ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfRepdir(ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
    return this;
  }

 /**
   * Get repconfHourofday
   * @return repconfHourofday
  **/
  @JsonProperty("repconf.hourofday")
  public ConfigNodePropertyInteger getRepconfHourofday() {
    return repconfHourofday;
  }

  public void setRepconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
    return this;
  }

 /**
   * Get repconfMinofhour
   * @return repconfMinofhour
  **/
  @JsonProperty("repconf.minofhour")
  public ConfigNodePropertyInteger getRepconfMinofhour() {
    return repconfMinofhour;
  }

  public void setRepconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
    return this;
  }

 /**
   * Get repconfMaxrows
   * @return repconfMaxrows
  **/
  @JsonProperty("repconf.maxrows")
  public ConfigNodePropertyInteger getRepconfMaxrows() {
    return repconfMaxrows;
  }

  public void setRepconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
    return this;
  }

 /**
   * Get repconfFakedata
   * @return repconfFakedata
  **/
  @JsonProperty("repconf.fakedata")
  public ConfigNodePropertyBoolean getRepconfFakedata() {
    return repconfFakedata;
  }

  public void setRepconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
    return this;
  }

 /**
   * Get repconfSnapshotuser
   * @return repconfSnapshotuser
  **/
  @JsonProperty("repconf.snapshotuser")
  public ConfigNodePropertyString getRepconfSnapshotuser() {
    return repconfSnapshotuser;
  }

  public void setRepconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
    return this;
  }

 /**
   * Get repconfEnforcesnapshotuser
   * @return repconfEnforcesnapshotuser
  **/
  @JsonProperty("repconf.enforcesnapshotuser")
  public ConfigNodePropertyBoolean getRepconfEnforcesnapshotuser() {
    return repconfEnforcesnapshotuser;
  }

  public void setRepconfEnforcesnapshotuser(ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
    this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfEnforcesnapshotuser(ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
    this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

