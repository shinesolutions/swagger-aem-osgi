package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties   {
  

  private ConfigNodePropertyString operation = null;

  private ConfigNodePropertyString operationIcon = null;

  private ConfigNodePropertyString topicName = null;

  private ConfigNodePropertyBoolean emailEnabled = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("operation")
  public ConfigNodePropertyString getOperation() {
    return operation;
  }
  public void setOperation(ConfigNodePropertyString operation) {
    this.operation = operation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("operationIcon")
  public ConfigNodePropertyString getOperationIcon() {
    return operationIcon;
  }
  public void setOperationIcon(ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("topicName")
  public ConfigNodePropertyString getTopicName() {
    return topicName;
  }
  public void setTopicName(ConfigNodePropertyString topicName) {
    this.topicName = topicName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("emailEnabled")
  public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }
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
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties = (ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties) o;
    return Objects.equals(operation, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.operation) &&
        Objects.equals(operationIcon, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.operationIcon) &&
        Objects.equals(topicName, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.topicName) &&
        Objects.equals(emailEnabled, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.emailEnabled);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

