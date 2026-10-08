package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
 */

@JsonTypeName("comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean dmreplicateonmodifyEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes;

  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties dmreplicateonmodifyEnabled(@Nullable ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
    return this;
  }

  /**
   * Get dmreplicateonmodifyEnabled
   * @return dmreplicateonmodifyEnabled
   */
  @Valid 
  @Schema(name = "dmreplicateonmodify.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dmreplicateonmodify.enabled")
  public @Nullable ConfigNodePropertyBoolean getDmreplicateonmodifyEnabled() {
    return dmreplicateonmodifyEnabled;
  }

  @JsonProperty("dmreplicateonmodify.enabled")
  public void setDmreplicateonmodifyEnabled(@Nullable ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
  }

  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties dmreplicateonmodifyForcesyncdeletes(@Nullable ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
    this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
    return this;
  }

  /**
   * Get dmreplicateonmodifyForcesyncdeletes
   * @return dmreplicateonmodifyForcesyncdeletes
   */
  @Valid 
  @Schema(name = "dmreplicateonmodify.forcesyncdeletes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dmreplicateonmodify.forcesyncdeletes")
  public @Nullable ConfigNodePropertyBoolean getDmreplicateonmodifyForcesyncdeletes() {
    return dmreplicateonmodifyForcesyncdeletes;
  }

  @JsonProperty("dmreplicateonmodify.forcesyncdeletes")
  public void setDmreplicateonmodifyForcesyncdeletes(@Nullable ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
    this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties = (ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties) o;
    return Objects.equals(this.dmreplicateonmodifyEnabled, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.dmreplicateonmodifyEnabled) &&
        Objects.equals(this.dmreplicateonmodifyForcesyncdeletes, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.dmreplicateonmodifyForcesyncdeletes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dmreplicateonmodifyEnabled, dmreplicateonmodifyForcesyncdeletes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {\n");
    sb.append("    dmreplicateonmodifyEnabled: ").append(toIndentedString(dmreplicateonmodifyEnabled)).append("\n");
    sb.append("    dmreplicateonmodifyForcesyncdeletes: ").append(toIndentedString(dmreplicateonmodifyForcesyncdeletes)).append("\n");
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

