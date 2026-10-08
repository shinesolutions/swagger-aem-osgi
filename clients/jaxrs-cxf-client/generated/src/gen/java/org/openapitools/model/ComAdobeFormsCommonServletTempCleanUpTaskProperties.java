package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeFormsCommonServletTempCleanUpTaskProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString schedulerExpression;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString durationForTemporaryStorage;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString durationForAnonymousStorage;
 /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComAdobeFormsCommonServletTempCleanUpTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

 /**
   * Get durationForTemporaryStorage
   * @return durationForTemporaryStorage
  **/
  @JsonProperty("Duration for Temporary Storage")
  public ConfigNodePropertyString getDurationForTemporaryStorage() {
    return durationForTemporaryStorage;
  }

  public void setDurationForTemporaryStorage(ConfigNodePropertyString durationForTemporaryStorage) {
    this.durationForTemporaryStorage = durationForTemporaryStorage;
  }

  public ComAdobeFormsCommonServletTempCleanUpTaskProperties durationForTemporaryStorage(ConfigNodePropertyString durationForTemporaryStorage) {
    this.durationForTemporaryStorage = durationForTemporaryStorage;
    return this;
  }

 /**
   * Get durationForAnonymousStorage
   * @return durationForAnonymousStorage
  **/
  @JsonProperty("Duration for Anonymous Storage")
  public ConfigNodePropertyString getDurationForAnonymousStorage() {
    return durationForAnonymousStorage;
  }

  public void setDurationForAnonymousStorage(ConfigNodePropertyString durationForAnonymousStorage) {
    this.durationForAnonymousStorage = durationForAnonymousStorage;
  }

  public ComAdobeFormsCommonServletTempCleanUpTaskProperties durationForAnonymousStorage(ConfigNodePropertyString durationForAnonymousStorage) {
    this.durationForAnonymousStorage = durationForAnonymousStorage;
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
    ComAdobeFormsCommonServletTempCleanUpTaskProperties comAdobeFormsCommonServletTempCleanUpTaskProperties = (ComAdobeFormsCommonServletTempCleanUpTaskProperties) o;
    return Objects.equals(this.schedulerExpression, comAdobeFormsCommonServletTempCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(this.durationForTemporaryStorage, comAdobeFormsCommonServletTempCleanUpTaskProperties.durationForTemporaryStorage) &&
        Objects.equals(this.durationForAnonymousStorage, comAdobeFormsCommonServletTempCleanUpTaskProperties.durationForAnonymousStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, durationForTemporaryStorage, durationForAnonymousStorage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFormsCommonServletTempCleanUpTaskProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    durationForTemporaryStorage: ").append(toIndentedString(durationForTemporaryStorage)).append("\n");
    sb.append("    durationForAnonymousStorage: ").append(toIndentedString(durationForAnonymousStorage)).append("\n");
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

