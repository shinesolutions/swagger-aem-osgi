package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties   {
  
  private ConfigNodePropertyString operation;
  private ConfigNodePropertyString operationIcon;
  private ConfigNodePropertyString topicName;
  private ConfigNodePropertyBoolean emailEnabled;

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties () {

  }

  public ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties (ConfigNodePropertyString operation, ConfigNodePropertyString operationIcon, ConfigNodePropertyString topicName, ConfigNodePropertyBoolean emailEnabled) {
    this.operation = operation;
    this.operationIcon = operationIcon;
    this.topicName = topicName;
    this.emailEnabled = emailEnabled;
  }

    
  @JsonProperty("operation")
  public ConfigNodePropertyString getOperation() {
    return operation;
  }
  public void setOperation(ConfigNodePropertyString operation) {
    this.operation = operation;
  }

    
  @JsonProperty("operationIcon")
  public ConfigNodePropertyString getOperationIcon() {
    return operationIcon;
  }
  public void setOperationIcon(ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
  }

    
  @JsonProperty("topicName")
  public ConfigNodePropertyString getTopicName() {
    return topicName;
  }
  public void setTopicName(ConfigNodePropertyString topicName) {
    this.topicName = topicName;
  }

    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
