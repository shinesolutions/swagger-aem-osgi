package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties   {
  
  private ConfigNodePropertyBoolean dmreplicateonmodifyEnabled = null;

  private ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes = null;


  /**
   **/
  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties dmreplicateonmodifyEnabled(ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dmreplicateonmodify.enabled")
  public ConfigNodePropertyBoolean getDmreplicateonmodifyEnabled() {
    return dmreplicateonmodifyEnabled;
  }
  public void setDmreplicateonmodifyEnabled(ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
  }


  /**
   **/
  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties dmreplicateonmodifyForcesyncdeletes(ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
    this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dmreplicateonmodify.forcesyncdeletes")
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
    return Objects.equals(dmreplicateonmodifyEnabled, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.dmreplicateonmodifyEnabled) &&
        Objects.equals(dmreplicateonmodifyForcesyncdeletes, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.dmreplicateonmodifyForcesyncdeletes);
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

