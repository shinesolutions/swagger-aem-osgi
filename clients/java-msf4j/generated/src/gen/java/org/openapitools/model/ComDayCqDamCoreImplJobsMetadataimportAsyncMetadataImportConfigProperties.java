package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties   {
  @JsonProperty("operation")
  private ConfigNodePropertyString operation = null;

  @JsonProperty("operationIcon")
  private ConfigNodePropertyString operationIcon = null;

  @JsonProperty("topicName")
  private ConfigNodePropertyString topicName = null;

  @JsonProperty("emailEnabled")
  private ConfigNodePropertyBoolean emailEnabled = null;

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties operation(ConfigNodePropertyString operation) {
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

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties operationIcon(ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
    return this;
  }

   /**
   * Get operationIcon
   * @return operationIcon
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOperationIcon() {
    return operationIcon;
  }

  public void setOperationIcon(ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties topicName(ConfigNodePropertyString topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTopicName() {
    return topicName;
  }

  public void setTopicName(ConfigNodePropertyString topicName) {
    this.topicName = topicName;
  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

