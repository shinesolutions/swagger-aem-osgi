package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
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

