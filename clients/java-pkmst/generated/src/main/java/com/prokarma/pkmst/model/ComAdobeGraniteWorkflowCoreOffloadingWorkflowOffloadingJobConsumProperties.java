package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties   {
  @JsonProperty("job.topics")
  private ConfigNodePropertyString jobTopics = null;

  public ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties jobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

   /**
   * Get jobTopics
   * @return jobTopics
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getJobTopics() {
    return jobTopics;
  }

  public void setJobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

