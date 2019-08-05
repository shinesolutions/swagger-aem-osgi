package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties   {
  @JsonProperty("operation")
  private ConfigNodePropertyString operation = null;

  @JsonProperty("emailEnabled")
  private ConfigNodePropertyBoolean emailEnabled = null;

  public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties operation(ConfigNodePropertyString operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOperation() {
    return operation;
  }

  public void setOperation(ConfigNodePropertyString operation) {
    this.operation = operation;
  }

  public ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

   /**
   * Get emailEnabled
   * @return emailEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

