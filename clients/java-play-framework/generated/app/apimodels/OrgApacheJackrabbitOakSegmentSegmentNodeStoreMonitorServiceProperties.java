package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties   {
  @JsonProperty("commitsTrackerWriterGroups")
  private ConfigNodePropertyArray commitsTrackerWriterGroups = null;

  public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties commitsTrackerWriterGroups(ConfigNodePropertyArray commitsTrackerWriterGroups) {
    this.commitsTrackerWriterGroups = commitsTrackerWriterGroups;
    return this;
  }

   /**
   * Get commitsTrackerWriterGroups
   * @return commitsTrackerWriterGroups
  **/
  @Valid
  public ConfigNodePropertyArray getCommitsTrackerWriterGroups() {
    return commitsTrackerWriterGroups;
  }

  public void setCommitsTrackerWriterGroups(ConfigNodePropertyArray commitsTrackerWriterGroups) {
    this.commitsTrackerWriterGroups = commitsTrackerWriterGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties = (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties) o;
    return Objects.equals(commitsTrackerWriterGroups, orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.commitsTrackerWriterGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitsTrackerWriterGroups);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties {\n");
    
    sb.append("    commitsTrackerWriterGroups: ").append(toIndentedString(commitsTrackerWriterGroups)).append("\n");
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

