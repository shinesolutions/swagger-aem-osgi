package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties   {
  
  private ConfigNodePropertyBoolean archivingEnabled = null;
  private ConfigNodePropertyString schedulerExpression = null;
  private ConfigNodePropertyInteger archiveSinceDaysCompleted = null;

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties () {

  }

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties (ConfigNodePropertyBoolean archivingEnabled, ConfigNodePropertyString schedulerExpression, ConfigNodePropertyInteger archiveSinceDaysCompleted) {
    this.archivingEnabled = archivingEnabled;
    this.schedulerExpression = schedulerExpression;
    this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
  }

    
  @JsonProperty("archiving.enabled")
  public ConfigNodePropertyBoolean getArchivingEnabled() {
    return archivingEnabled;
  }
  public void setArchivingEnabled(ConfigNodePropertyBoolean archivingEnabled) {
    this.archivingEnabled = archivingEnabled;
  }

    
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

    
  @JsonProperty("archive.since.days.completed")
  public ConfigNodePropertyInteger getArchiveSinceDaysCompleted() {
    return archiveSinceDaysCompleted;
  }
  public void setArchiveSinceDaysCompleted(ConfigNodePropertyInteger archiveSinceDaysCompleted) {
    this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
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
    return Objects.equals(archivingEnabled, comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.archivingEnabled) &&
        Objects.equals(schedulerExpression, comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.schedulerExpression) &&
        Objects.equals(archiveSinceDaysCompleted, comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.archiveSinceDaysCompleted);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
