package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties   {
  @JsonProperty("granite.maintenance.mandatory")
  private ConfigNodePropertyBoolean graniteMaintenanceMandatory = null;

  @JsonProperty("job.topics")
  private ConfigNodePropertyString jobTopics = null;

  public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties graniteMaintenanceMandatory(ConfigNodePropertyBoolean graniteMaintenanceMandatory) {
    this.graniteMaintenanceMandatory = graniteMaintenanceMandatory;
    return this;
  }

  /**
   * Get graniteMaintenanceMandatory
   * @return graniteMaintenanceMandatory
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties = (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties) o;
    return Objects.equals(this.graniteMaintenanceMandatory, comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.graniteMaintenanceMandatory) &&
        Objects.equals(this.jobTopics, comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.jobTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteMaintenanceMandatory, jobTopics);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

