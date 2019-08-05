package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties   {
  @JsonProperty("archiving.enabled")
  private ConfigNodePropertyBoolean archivingEnabled = null;

  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  @JsonProperty("archive.since.days.completed")
  private ConfigNodePropertyInteger archiveSinceDaysCompleted = null;

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties archivingEnabled(ConfigNodePropertyBoolean archivingEnabled) {
    this.archivingEnabled = archivingEnabled;
    return this;
  }

   /**
   * Get archivingEnabled
   * @return archivingEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getArchivingEnabled() {
    return archivingEnabled;
  }

  public void setArchivingEnabled(ConfigNodePropertyBoolean archivingEnabled) {
    this.archivingEnabled = archivingEnabled;
  }

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

   /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @Valid
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties archiveSinceDaysCompleted(ConfigNodePropertyInteger archiveSinceDaysCompleted) {
    this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
    return this;
  }

   /**
   * Get archiveSinceDaysCompleted
   * @return archiveSinceDaysCompleted
  **/
  @Valid
  public ConfigNodePropertyInteger getArchiveSinceDaysCompleted() {
    return archiveSinceDaysCompleted;
  }

  public void setArchiveSinceDaysCompleted(ConfigNodePropertyInteger archiveSinceDaysCompleted) {
    this.archiveSinceDaysCompleted = archiveSinceDaysCompleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

