package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeFormsCommonServletTempCleanUpTaskProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString schedulerExpression = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString durationForTemporaryStorage = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString durationForAnonymousStorage = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

