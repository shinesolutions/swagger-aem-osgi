package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqReportingImplConfigServiceImplProperties
 */

@JsonTypeName("comDayCqReportingImplConfigServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReportingImplConfigServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repconfTimezone;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repconfLocale;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repconfSnapshots;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repconfRepdir;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger repconfHourofday;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger repconfMinofhour;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger repconfMaxrows;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean repconfFakedata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString repconfSnapshotuser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean repconfEnforcesnapshotuser;

  public ComDayCqReportingImplConfigServiceImplProperties repconfTimezone(@Nullable ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
    return this;
  }

  /**
   * Get repconfTimezone
   * @return repconfTimezone
   */
  @Valid 
  @Schema(name = "repconf.timezone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.timezone")
  public @Nullable ConfigNodePropertyString getRepconfTimezone() {
    return repconfTimezone;
  }

  @JsonProperty("repconf.timezone")
  public void setRepconfTimezone(@Nullable ConfigNodePropertyString repconfTimezone) {
    this.repconfTimezone = repconfTimezone;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfLocale(@Nullable ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
    return this;
  }

  /**
   * Get repconfLocale
   * @return repconfLocale
   */
  @Valid 
  @Schema(name = "repconf.locale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.locale")
  public @Nullable ConfigNodePropertyString getRepconfLocale() {
    return repconfLocale;
  }

  @JsonProperty("repconf.locale")
  public void setRepconfLocale(@Nullable ConfigNodePropertyString repconfLocale) {
    this.repconfLocale = repconfLocale;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshots(@Nullable ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
    return this;
  }

  /**
   * Get repconfSnapshots
   * @return repconfSnapshots
   */
  @Valid 
  @Schema(name = "repconf.snapshots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.snapshots")
  public @Nullable ConfigNodePropertyString getRepconfSnapshots() {
    return repconfSnapshots;
  }

  @JsonProperty("repconf.snapshots")
  public void setRepconfSnapshots(@Nullable ConfigNodePropertyString repconfSnapshots) {
    this.repconfSnapshots = repconfSnapshots;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfRepdir(@Nullable ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
    return this;
  }

  /**
   * Get repconfRepdir
   * @return repconfRepdir
   */
  @Valid 
  @Schema(name = "repconf.repdir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.repdir")
  public @Nullable ConfigNodePropertyString getRepconfRepdir() {
    return repconfRepdir;
  }

  @JsonProperty("repconf.repdir")
  public void setRepconfRepdir(@Nullable ConfigNodePropertyString repconfRepdir) {
    this.repconfRepdir = repconfRepdir;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfHourofday(@Nullable ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
    return this;
  }

  /**
   * Get repconfHourofday
   * @return repconfHourofday
   */
  @Valid 
  @Schema(name = "repconf.hourofday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.hourofday")
  public @Nullable ConfigNodePropertyInteger getRepconfHourofday() {
    return repconfHourofday;
  }

  @JsonProperty("repconf.hourofday")
  public void setRepconfHourofday(@Nullable ConfigNodePropertyInteger repconfHourofday) {
    this.repconfHourofday = repconfHourofday;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfMinofhour(@Nullable ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
    return this;
  }

  /**
   * Get repconfMinofhour
   * @return repconfMinofhour
   */
  @Valid 
  @Schema(name = "repconf.minofhour", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.minofhour")
  public @Nullable ConfigNodePropertyInteger getRepconfMinofhour() {
    return repconfMinofhour;
  }

  @JsonProperty("repconf.minofhour")
  public void setRepconfMinofhour(@Nullable ConfigNodePropertyInteger repconfMinofhour) {
    this.repconfMinofhour = repconfMinofhour;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfMaxrows(@Nullable ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
    return this;
  }

  /**
   * Get repconfMaxrows
   * @return repconfMaxrows
   */
  @Valid 
  @Schema(name = "repconf.maxrows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.maxrows")
  public @Nullable ConfigNodePropertyInteger getRepconfMaxrows() {
    return repconfMaxrows;
  }

  @JsonProperty("repconf.maxrows")
  public void setRepconfMaxrows(@Nullable ConfigNodePropertyInteger repconfMaxrows) {
    this.repconfMaxrows = repconfMaxrows;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfFakedata(@Nullable ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
    return this;
  }

  /**
   * Get repconfFakedata
   * @return repconfFakedata
   */
  @Valid 
  @Schema(name = "repconf.fakedata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.fakedata")
  public @Nullable ConfigNodePropertyBoolean getRepconfFakedata() {
    return repconfFakedata;
  }

  @JsonProperty("repconf.fakedata")
  public void setRepconfFakedata(@Nullable ConfigNodePropertyBoolean repconfFakedata) {
    this.repconfFakedata = repconfFakedata;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfSnapshotuser(@Nullable ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
    return this;
  }

  /**
   * Get repconfSnapshotuser
   * @return repconfSnapshotuser
   */
  @Valid 
  @Schema(name = "repconf.snapshotuser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.snapshotuser")
  public @Nullable ConfigNodePropertyString getRepconfSnapshotuser() {
    return repconfSnapshotuser;
  }

  @JsonProperty("repconf.snapshotuser")
  public void setRepconfSnapshotuser(@Nullable ConfigNodePropertyString repconfSnapshotuser) {
    this.repconfSnapshotuser = repconfSnapshotuser;
  }

  public ComDayCqReportingImplConfigServiceImplProperties repconfEnforcesnapshotuser(@Nullable ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
    this.repconfEnforcesnapshotuser = repconfEnforcesnapshotuser;
    return this;
  }

  /**
   * Get repconfEnforcesnapshotuser
   * @return repconfEnforcesnapshotuser
   */
  @Valid 
  @Schema(name = "repconf.enforcesnapshotuser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repconf.enforcesnapshotuser")
  public @Nullable ConfigNodePropertyBoolean getRepconfEnforcesnapshotuser() {
    return repconfEnforcesnapshotuser;
  }

  @JsonProperty("repconf.enforcesnapshotuser")
  public void setRepconfEnforcesnapshotuser(@Nullable ConfigNodePropertyBoolean repconfEnforcesnapshotuser) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

