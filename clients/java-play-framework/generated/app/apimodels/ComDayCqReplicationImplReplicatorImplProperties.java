package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqReplicationImplReplicatorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplReplicatorImplProperties   {
  @JsonProperty("distribute_events")
  @Valid

  private ConfigNodePropertyBoolean distributeEvents;

  public ComDayCqReplicationImplReplicatorImplProperties distributeEvents(ConfigNodePropertyBoolean distributeEvents) {
    this.distributeEvents = distributeEvents;
    return this;
  }

   /**
   * Get distributeEvents
   * @return distributeEvents
  **/
  public ConfigNodePropertyBoolean getDistributeEvents() {
    return distributeEvents;
  }

  public void setDistributeEvents(ConfigNodePropertyBoolean distributeEvents) {
    this.distributeEvents = distributeEvents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplReplicatorImplProperties comDayCqReplicationImplReplicatorImplProperties = (ComDayCqReplicationImplReplicatorImplProperties) o;
    return Objects.equals(distributeEvents, comDayCqReplicationImplReplicatorImplProperties.distributeEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributeEvents);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplReplicatorImplProperties {\n");
    
    sb.append("    distributeEvents: ").append(toIndentedString(distributeEvents)).append("\n");
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

