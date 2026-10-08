package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheFelixScrScrServiceProperties
 */

@JsonTypeName("orgApacheFelixScrScrServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixScrScrServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown dsLoglevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean dsFactoryEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean dsDelayedKeepInstances;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger dsLockTimeoutMilliseconds;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger dsStopTimeoutMilliseconds;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean dsGlobalExtender;

  public OrgApacheFelixScrScrServiceProperties dsLoglevel(@Nullable ConfigNodePropertyDropDown dsLoglevel) {
    this.dsLoglevel = dsLoglevel;
    return this;
  }

  /**
   * Get dsLoglevel
   * @return dsLoglevel
   */
  @Valid 
  @Schema(name = "ds.loglevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ds.loglevel")
  public @Nullable ConfigNodePropertyDropDown getDsLoglevel() {
    return dsLoglevel;
  }

  @JsonProperty("ds.loglevel")
  public void setDsLoglevel(@Nullable ConfigNodePropertyDropDown dsLoglevel) {
    this.dsLoglevel = dsLoglevel;
  }

  public OrgApacheFelixScrScrServiceProperties dsFactoryEnabled(@Nullable ConfigNodePropertyBoolean dsFactoryEnabled) {
    this.dsFactoryEnabled = dsFactoryEnabled;
    return this;
  }

  /**
   * Get dsFactoryEnabled
   * @return dsFactoryEnabled
   */
  @Valid 
  @Schema(name = "ds.factory.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ds.factory.enabled")
  public @Nullable ConfigNodePropertyBoolean getDsFactoryEnabled() {
    return dsFactoryEnabled;
  }

  @JsonProperty("ds.factory.enabled")
  public void setDsFactoryEnabled(@Nullable ConfigNodePropertyBoolean dsFactoryEnabled) {
    this.dsFactoryEnabled = dsFactoryEnabled;
  }

  public OrgApacheFelixScrScrServiceProperties dsDelayedKeepInstances(@Nullable ConfigNodePropertyBoolean dsDelayedKeepInstances) {
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
    return this;
  }

  /**
   * Get dsDelayedKeepInstances
   * @return dsDelayedKeepInstances
   */
  @Valid 
  @Schema(name = "ds.delayed.keepInstances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ds.delayed.keepInstances")
  public @Nullable ConfigNodePropertyBoolean getDsDelayedKeepInstances() {
    return dsDelayedKeepInstances;
  }

  @JsonProperty("ds.delayed.keepInstances")
  public void setDsDelayedKeepInstances(@Nullable ConfigNodePropertyBoolean dsDelayedKeepInstances) {
    this.dsDelayedKeepInstances = dsDelayedKeepInstances;
  }

  public OrgApacheFelixScrScrServiceProperties dsLockTimeoutMilliseconds(@Nullable ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
    return this;
  }

  /**
   * Get dsLockTimeoutMilliseconds
   * @return dsLockTimeoutMilliseconds
   */
  @Valid 
  @Schema(name = "ds.lock.timeout.milliseconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ds.lock.timeout.milliseconds")
  public @Nullable ConfigNodePropertyInteger getDsLockTimeoutMilliseconds() {
    return dsLockTimeoutMilliseconds;
  }

  @JsonProperty("ds.lock.timeout.milliseconds")
  public void setDsLockTimeoutMilliseconds(@Nullable ConfigNodePropertyInteger dsLockTimeoutMilliseconds) {
    this.dsLockTimeoutMilliseconds = dsLockTimeoutMilliseconds;
  }

  public OrgApacheFelixScrScrServiceProperties dsStopTimeoutMilliseconds(@Nullable ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
    return this;
  }

  /**
   * Get dsStopTimeoutMilliseconds
   * @return dsStopTimeoutMilliseconds
   */
  @Valid 
  @Schema(name = "ds.stop.timeout.milliseconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ds.stop.timeout.milliseconds")
  public @Nullable ConfigNodePropertyInteger getDsStopTimeoutMilliseconds() {
    return dsStopTimeoutMilliseconds;
  }

  @JsonProperty("ds.stop.timeout.milliseconds")
  public void setDsStopTimeoutMilliseconds(@Nullable ConfigNodePropertyInteger dsStopTimeoutMilliseconds) {
    this.dsStopTimeoutMilliseconds = dsStopTimeoutMilliseconds;
  }

  public OrgApacheFelixScrScrServiceProperties dsGlobalExtender(@Nullable ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsGlobalExtender = dsGlobalExtender;
    return this;
  }

  /**
   * Get dsGlobalExtender
   * @return dsGlobalExtender
   */
  @Valid 
  @Schema(name = "ds.global.extender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ds.global.extender")
  public @Nullable ConfigNodePropertyBoolean getDsGlobalExtender() {
    return dsGlobalExtender;
  }

  @JsonProperty("ds.global.extender")
  public void setDsGlobalExtender(@Nullable ConfigNodePropertyBoolean dsGlobalExtender) {
    this.dsGlobalExtender = dsGlobalExtender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixScrScrServiceProperties orgApacheFelixScrScrServiceProperties = (OrgApacheFelixScrScrServiceProperties) o;
    return Objects.equals(this.dsLoglevel, orgApacheFelixScrScrServiceProperties.dsLoglevel) &&
        Objects.equals(this.dsFactoryEnabled, orgApacheFelixScrScrServiceProperties.dsFactoryEnabled) &&
        Objects.equals(this.dsDelayedKeepInstances, orgApacheFelixScrScrServiceProperties.dsDelayedKeepInstances) &&
        Objects.equals(this.dsLockTimeoutMilliseconds, orgApacheFelixScrScrServiceProperties.dsLockTimeoutMilliseconds) &&
        Objects.equals(this.dsStopTimeoutMilliseconds, orgApacheFelixScrScrServiceProperties.dsStopTimeoutMilliseconds) &&
        Objects.equals(this.dsGlobalExtender, orgApacheFelixScrScrServiceProperties.dsGlobalExtender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dsLoglevel, dsFactoryEnabled, dsDelayedKeepInstances, dsLockTimeoutMilliseconds, dsStopTimeoutMilliseconds, dsGlobalExtender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixScrScrServiceProperties {\n");
    sb.append("    dsLoglevel: ").append(toIndentedString(dsLoglevel)).append("\n");
    sb.append("    dsFactoryEnabled: ").append(toIndentedString(dsFactoryEnabled)).append("\n");
    sb.append("    dsDelayedKeepInstances: ").append(toIndentedString(dsDelayedKeepInstances)).append("\n");
    sb.append("    dsLockTimeoutMilliseconds: ").append(toIndentedString(dsLockTimeoutMilliseconds)).append("\n");
    sb.append("    dsStopTimeoutMilliseconds: ").append(toIndentedString(dsStopTimeoutMilliseconds)).append("\n");
    sb.append("    dsGlobalExtender: ").append(toIndentedString(dsGlobalExtender)).append("\n");
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

