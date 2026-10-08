package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties   {
  private ConfigNodePropertyString operation;
  private ConfigNodePropertyBoolean emailEnabled;

  public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties() {
  }

  /**
   **/
  public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties operation(ConfigNodePropertyString operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operation")
  @Valid public ConfigNodePropertyString getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(ConfigNodePropertyString operation) {
    this.operation = operation;
  }

  /**
   **/
  public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("emailEnabled")
  @Valid public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  @JsonProperty("emailEnabled")
  public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties = (ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties) o;
    return Objects.equals(this.operation, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.operation) &&
        Objects.equals(this.emailEnabled, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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
