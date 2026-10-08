package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("operation")
  private ConfigNodePropertyString operation;

  @JsonProperty("operationIcon")
  private ConfigNodePropertyString operationIcon;

  @JsonProperty("topicName")
  private ConfigNodePropertyString topicName;

  @JsonProperty("emailEnabled")
  private ConfigNodePropertyBoolean emailEnabled;

  /**
   * 
   * @return operation
   */
  public ConfigNodePropertyString getOperation() {
    return operation;
  }

  public void setOperation(ConfigNodePropertyString operation) {
    this.operation = operation;
  }

  /**
   * 
   * @return operationIcon
   */
  public ConfigNodePropertyString getOperationIcon() {
    return operationIcon;
  }

  public void setOperationIcon(ConfigNodePropertyString operationIcon) {
    this.operationIcon = operationIcon;
  }

  /**
   * 
   * @return topicName
   */
  public ConfigNodePropertyString getTopicName() {
    return topicName;
  }

  public void setTopicName(ConfigNodePropertyString topicName) {
    this.topicName = topicName;
  }

  /**
   * 
   * @return emailEnabled
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
