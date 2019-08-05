package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties   {
  @JsonProperty("dmreplicateonmodify.enabled")
  private ConfigNodePropertyBoolean dmreplicateonmodifyEnabled = null;

  @JsonProperty("dmreplicateonmodify.forcesyncdeletes")
  private ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes = null;

  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties dmreplicateonmodifyEnabled(ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
    return this;
  }

  /**
   * Get dmreplicateonmodifyEnabled
   * @return dmreplicateonmodifyEnabled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getDmreplicateonmodifyEnabled() {
    return dmreplicateonmodifyEnabled;
  }

  public void setDmreplicateonmodifyEnabled(ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
  }

  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties dmreplicateonmodifyForcesyncdeletes(ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
    this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
    return this;
  }

  /**
   * Get dmreplicateonmodifyForcesyncdeletes
   * @return dmreplicateonmodifyForcesyncdeletes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getDmreplicateonmodifyForcesyncdeletes() {
    return dmreplicateonmodifyForcesyncdeletes;
  }

  public void setDmreplicateonmodifyForcesyncdeletes(ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
    this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

