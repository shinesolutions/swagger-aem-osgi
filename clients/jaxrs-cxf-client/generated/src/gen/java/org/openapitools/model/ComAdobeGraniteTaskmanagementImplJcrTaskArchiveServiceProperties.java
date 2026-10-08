package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean archivingEnabled;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString schedulerExpression;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger archiveSinceDaysCompleted;
 /**
   * Get archivingEnabled
   * @return archivingEnabled
  **/
  @JsonProperty("archiving.enabled")
  public ConfigNodePropertyBoolean getArchivingEnabled() {
    return archivingEnabled;
  }

  public void setArchivingEnabled(ConfigNodePropertyBoolean archivingEnabled) {
    this.archivingEnabled = archivingEnabled;
  }

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties archivingEnabled(ConfigNodePropertyBoolean archivingEnabled) {
    this.archivingEnabled = archivingEnabled;
    return this;
  }

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

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

 /**
   * Get archiveSinceDaysCompleted
   * @return archiveSinceDaysCompleted
  **/
  @JsonProperty("archive.since.days.completed")
  public ConfigNodePropertyInteger getArchiveSinceDaysCompleted() {
    return archiveSinceDaysCompleted;
  }

  public void setArchiveSinceDaysCompleted(ConfigNodePropertyInteger archiveSinceDaysCompleted) {
    this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
  }

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties archiveSinceDaysCompleted(ConfigNodePropertyInteger archiveSinceDaysCompleted) {
    this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
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
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties = (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties) o;
    return Objects.equals(this.archivingEnabled, comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.archivingEnabled) &&
        Objects.equals(this.schedulerExpression, comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.schedulerExpression) &&
        Objects.equals(this.archiveSinceDaysCompleted, comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.archiveSinceDaysCompleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archivingEnabled, schedulerExpression, archiveSinceDaysCompleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties {\n");
    
    sb.append("    archivingEnabled: ").append(toIndentedString(archivingEnabled)).append("\n");
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    archiveSinceDaysCompleted: ").append(toIndentedString(archiveSinceDaysCompleted)).append("\n");
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

