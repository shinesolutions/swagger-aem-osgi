package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties   {
  
  private ConfigNodePropertyBoolean dmreplicateonmodifyEnabled = null;
  private ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes = null;

  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties () {

  }

  public ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties (ConfigNodePropertyBoolean dmreplicateonmodifyEnabled, ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
    this.dmreplicateonmodifyForcesyncdeletes = dmreplicateonmodifyForcesyncdeletes;
  }

    
  @JsonProperty("dmreplicateonmodify.enabled")
  public ConfigNodePropertyBoolean getDmreplicateonmodifyEnabled() {
    return dmreplicateonmodifyEnabled;
  }
  public void setDmreplicateonmodifyEnabled(ConfigNodePropertyBoolean dmreplicateonmodifyEnabled) {
    this.dmreplicateonmodifyEnabled = dmreplicateonmodifyEnabled;
  }

    
  @JsonProperty("dmreplicateonmodify.forcesyncdeletes")
  public ConfigNodePropertyBoolean getDmreplicateonmodifyForcesyncdeletes() {
    return dmreplicateonmodifyForcesyncdeletes;
  }
  public void setDmreplicateonmodifyForcesyncdeletes(ConfigNodePropertyBoolean dmreplicateonmodifyForcesyncdeletes) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
