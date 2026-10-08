package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



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
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfTimezone(ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.timezone")
  public ConfigNodePropertyString getRepconfTimezone() {
    return repconfTimezone;
  }
  public void setRepconfTimezone(ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfLocale(ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.locale")
  public ConfigNodePropertyString getRepconfLocale() {
    return repconfLocale;
  }
  public void setRepconfLocale(ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.snapshots")
  public ConfigNodePropertyString getRepconfSnapshots() {
    return repconfSnapshots;
  }
  public void setRepconfSnapshots(ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfRepdir(ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.repdir")
  public ConfigNodePropertyString getRepconfRepdir() {
    return repconfRepdir;
  }
  public void setRepconfRepdir(ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.hourofday")
  public ConfigNodePropertyInteger getRepconfHourofday() {
    return repconfHourofday;
  }
  public void setRepconfHourofday(ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.minofhour")
  public ConfigNodePropertyInteger getRepconfMinofhour() {
    return repconfMinofhour;
  }
  public void setRepconfMinofhour(ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.maxrows")
  public ConfigNodePropertyInteger getRepconfMaxrows() {
    return repconfMaxrows;
  }
  public void setRepconfMaxrows(ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.fakedata")
  public ConfigNodePropertyBoolean getRepconfFakedata() {
    return repconfFakedata;
  }
  public void setRepconfFakedata(ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("repconf.snapshotuser")
  public ConfigNodePropertyString getRepconfSnapshotuser() {
    return repconfSnapshotuser;
  }
  public void setRepconfSnapshotuser(ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
  }


  /**
   **/
  public ComDayCqReportingImplConfigServiceImplProperties repconfEnforcesnapshotuser(ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
    this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.repconfTimezone, comDayCqReportingImplConfigServiceImplProperties.repconfTimezone) &&
        Objects.equals(this.repconfLocale, comDayCqReportingImplConfigServiceImplProperties.repconfLocale) &&
        Objects.equals(this.repconfSnapshots, comDayCqReportingImplConfigServiceImplProperties.repconfSnapshots) &&
        Objects.equals(this.repconfRepdir, comDayCqReportingImplConfigServiceImplProperties.repconfRepdir) &&
        Objects.equals(this.repconfHourofday, comDayCqReportingImplConfigServiceImplProperties.repconfHourofday) &&
        Objects.equals(this.repconfMinofhour, comDayCqReportingImplConfigServiceImplProperties.repconfMinofhour) &&
        Objects.equals(this.repconfMaxrows, comDayCqReportingImplConfigServiceImplProperties.repconfMaxrows) &&
        Objects.equals(this.repconfFakedata, comDayCqReportingImplConfigServiceImplProperties.repconfFakedata) &&
        Objects.equals(this.repconfSnapshotuser, comDayCqReportingImplConfigServiceImplProperties.repconfSnapshotuser) &&
        Objects.equals(this.repconfEnforcesnapshotuser, comDayCqReportingImplConfigServiceImplProperties.repconfEnforcesnapshotuser);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

