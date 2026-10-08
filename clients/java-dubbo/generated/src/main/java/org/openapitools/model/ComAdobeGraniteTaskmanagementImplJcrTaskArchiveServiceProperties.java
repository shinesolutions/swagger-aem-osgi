package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("archiving.enabled")
  private ConfigNodePropertyBoolean archivingEnabled;

  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression;

  @JsonProperty("archive.since.days.completed")
  private ConfigNodePropertyInteger archiveSinceDaysCompleted;

  /**
   * 
   * @return archivingEnabled
   */
  public ConfigNodePropertyBoolean getArchivingEnabled() {
    return archivingEnabled;
  }

  public void setArchivingEnabled(ConfigNodePropertyBoolean archivingEnabled) {
    this.archivingEnabled = archivingEnabled;
  }

  /**
   * 
   * @return schedulerExpression
   */
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   * 
   * @return archiveSinceDaysCompleted
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
