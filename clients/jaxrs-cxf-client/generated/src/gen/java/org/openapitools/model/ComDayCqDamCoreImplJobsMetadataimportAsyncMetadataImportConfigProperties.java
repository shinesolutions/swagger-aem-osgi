package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString operation;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString operationIcon;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString topicName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean emailEnabled;
 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public ConfigNodePropertyString getOperation() {
    return operation;
  }

  public void setOperation(ConfigNodePropertyString operation) {
    this.operation = operation;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties operation(ConfigNodePropertyString operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get operationIcon
   * @return operationIcon
  **/
  @JsonProperty("operationIcon")
  public ConfigNodePropertyString getOperationIcon() {
    return operationIcon;
  }

  public void setOperationIcon(ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties operationIcon(ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
    return this;
  }

 /**
   * Get topicName
   * @return topicName
  **/
  @JsonProperty("topicName")
  public ConfigNodePropertyString getTopicName() {
    return topicName;
  }

  public void setTopicName(ConfigNodePropertyString topicName) {
    this.topicName = topicName;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties topicName(ConfigNodePropertyString topicName) {
    this.topicName = topicName;
    return this;
  }

 /**
   * Get emailEnabled
   * @return emailEnabled
  **/
  @JsonProperty("emailEnabled")
  public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties = (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties) o;
    return Objects.equals(this.operation, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.operation) &&
        Objects.equals(this.operationIcon, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.operationIcon) &&
        Objects.equals(this.topicName, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.topicName) &&
        Objects.equals(this.emailEnabled, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, operationIcon, topicName, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    operationIcon: ").append(toIndentedString(operationIcon)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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

