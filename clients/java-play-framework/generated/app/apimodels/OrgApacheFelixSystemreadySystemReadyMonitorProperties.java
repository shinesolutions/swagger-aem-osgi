package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheFelixSystemreadySystemReadyMonitorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheFelixSystemreadySystemReadyMonitorProperties   {
  @JsonProperty("poll.interval")
  private ConfigNodePropertyInteger pollInterval = null;

  public OrgApacheFelixSystemreadySystemReadyMonitorProperties pollInterval(ConfigNodePropertyInteger pollInterval) {
    this.pollInterval = pollInterval;
    return this;
  }

   /**
   * Get pollInterval
   * @return pollInterval
  **/
  @Valid
  public ConfigNodePropertyInteger getPollInterval() {
    return pollInterval;
  }

  public void setPollInterval(ConfigNodePropertyInteger pollInterval) {
    this.pollInterval = pollInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixSystemreadySystemReadyMonitorProperties orgApacheFelixSystemreadySystemReadyMonitorProperties = (OrgApacheFelixSystemreadySystemReadyMonitorProperties) o;
    return Objects.equals(pollInterval, orgApacheFelixSystemreadySystemReadyMonitorProperties.pollInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pollInterval);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadySystemReadyMonitorProperties {\n");
    
    sb.append("    pollInterval: ").append(toIndentedString(pollInterval)).append("\n");
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

