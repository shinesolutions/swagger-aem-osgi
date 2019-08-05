package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties   {
  
  private ConfigNodePropertyString schedulerExpression = null;

  public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties () {

  }

  public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties (ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

    
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
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
    return Objects.equals(schedulerExpression, comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.schedulerExpression);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
