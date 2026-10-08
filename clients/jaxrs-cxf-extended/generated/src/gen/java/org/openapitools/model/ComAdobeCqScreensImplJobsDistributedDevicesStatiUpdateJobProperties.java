package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString schedulerExpression;
 /**
  * Get schedulerExpression
  * @return schedulerExpression
  */
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  /**
   * Sets the <code>schedulerExpression</code> property.
   */
 public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   * Sets the <code>schedulerExpression</code> property.
   */
  public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
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
    ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties = (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties) o;
    return Objects.equals(this.schedulerExpression, comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.schedulerExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties {\n");
    
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
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

