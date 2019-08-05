package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqReplicationImplReplicatorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplReplicatorImplProperties   {
  @JsonProperty("distribute_events")
  private ConfigNodePropertyBoolean distributeEvents = null;

  public ComDayCqReplicationImplReplicatorImplProperties distributeEvents(ConfigNodePropertyBoolean distributeEvents) {
    this.distributeEvents = distributeEvents;
    return this;
  }

   /**
   * Get distributeEvents
   * @return distributeEvents
  **/
  @Valid
  public ConfigNodePropertyBoolean getDistributeEvents() {
    return distributeEvents;
  }

  public void setDistributeEvents(ConfigNodePropertyBoolean distributeEvents) {
    this.distributeEvents = distributeEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

