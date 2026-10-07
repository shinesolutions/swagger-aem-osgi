package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
 */

@JsonTypeName("comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean graniteMaintenanceMandatory;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString jobTopics;

  public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties graniteMaintenanceMandatory(@Nullable ConfigNodePropertyBoolean graniteMaintenanceMandatory) {
    this.graniteMaintenanceMandatory = graniteMaintenanceMandatory;
    return this;
  }

  /**
   * Get graniteMaintenanceMandatory
   * @return graniteMaintenanceMandatory
   */
  @Valid 
  @Schema(name = "granite.maintenance.mandatory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("granite.maintenance.mandatory")
  public @Nullable ConfigNodePropertyBoolean getGraniteMaintenanceMandatory() {
    return graniteMaintenanceMandatory;
  }

  @JsonProperty("granite.maintenance.mandatory")
  public void setGraniteMaintenanceMandatory(@Nullable ConfigNodePropertyBoolean graniteMaintenanceMandatory) {
    this.graniteMaintenanceMandatory = graniteMaintenanceMandatory;
  }

  public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties jobTopics(@Nullable ConfigNodePropertyString jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

  /**
   * Get jobTopics
   * @return jobTopics
   */
  @Valid 
  @Schema(name = "job.topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job.topics")
  public @Nullable ConfigNodePropertyString getJobTopics() {
    return jobTopics;
  }

  @JsonProperty("job.topics")
  public void setJobTopics(@Nullable ConfigNodePropertyString jobTopics) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

