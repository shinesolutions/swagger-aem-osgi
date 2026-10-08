package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties   {
  @JsonProperty("granite.maintenance.mandatory")
  @Valid

  private ConfigNodePropertyBoolean graniteMaintenanceMandatory;

  @JsonProperty("job.topics")
  @Valid

  private ConfigNodePropertyString jobTopics;

  public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties graniteMaintenanceMandatory(ConfigNodePropertyBoolean graniteMaintenanceMandatory) {
    this.graniteMaintenanceMandatory = graniteMaintenanceMandatory;
    return this;
  }

   /**
   * Get graniteMaintenanceMandatory
   * @return graniteMaintenanceMandatory
  **/
  public ConfigNodePropertyBoolean getGraniteMaintenanceMandatory() {
    return graniteMaintenanceMandatory;
  }

  public void setGraniteMaintenanceMandatory(ConfigNodePropertyBoolean graniteMaintenanceMandatory) {
    this.graniteMaintenanceMandatory = graniteMaintenanceMandatory;
  }

  public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties jobTopics(ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

   /**
   * Get jobTopics
   * @return jobTopics
  **/
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
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties = (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties) o;
    return Objects.equals(graniteMaintenanceMandatory, comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.graniteMaintenanceMandatory) &&
        Objects.equals(jobTopics, comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.jobTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteMaintenanceMandatory, jobTopics);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {\n");
    
    sb.append("    graniteMaintenanceMandatory: ").append(toIndentedString(graniteMaintenanceMandatory)).append("\n");
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

