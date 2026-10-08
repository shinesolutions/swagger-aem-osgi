package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("job.topics")
  private ConfigNodePropertyString jobTopics;

  /**
   * 
   * @return jobTopics
   */
  public ConfigNodePropertyString getJobTopics() {
    return jobTopics;
  }

  public void setJobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties = (ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties) o;
    return Objects.equals(this.jobTopics, comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.jobTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties {\n");
    
    sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
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
