package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties   {
  @JsonProperty("job.topics")
  private ConfigNodePropertyArray jobTopics = null;

  @JsonProperty("allow.self.process.termination")
  private ConfigNodePropertyBoolean allowSelfProcessTermination = null;

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties jobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

   /**
   * Get jobTopics
   * @return jobTopics
  **/
  @Valid
  public ConfigNodePropertyArray getJobTopics() {
    return jobTopics;
  }

  public void setJobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
  }

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties allowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
    return this;
  }

   /**
   * Get allowSelfProcessTermination
   * @return allowSelfProcessTermination
  **/
  @Valid
  public ConfigNodePropertyBoolean getAllowSelfProcessTermination() {
    return allowSelfProcessTermination;
  }

  public void setAllowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties comAdobeGraniteWorkflowCoreJobJobHandlerProperties = (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties) o;
    return Objects.equals(jobTopics, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.jobTopics) &&
        Objects.equals(allowSelfProcessTermination, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.allowSelfProcessTermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTopics, allowSelfProcessTermination);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {\n");
    
    sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
    sb.append("    allowSelfProcessTermination: ").append(toIndentedString(allowSelfProcessTermination)).append("\n");
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

