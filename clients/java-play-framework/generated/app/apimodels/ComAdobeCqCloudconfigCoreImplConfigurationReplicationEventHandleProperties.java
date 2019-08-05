package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties   {
  @JsonProperty("flush.agents")
  private ConfigNodePropertyArray flushAgents = null;

  public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties flushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
    return this;
  }

   /**
   * Get flushAgents
   * @return flushAgents
  **/
  @Valid
  public ConfigNodePropertyArray getFlushAgents() {
    return flushAgents;
  }

  public void setFlushAgents(ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties = (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties) o;
    return Objects.equals(flushAgents, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.flushAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flushAgents);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {\n");
    
    sb.append("    flushAgents: ").append(toIndentedString(flushAgents)).append("\n");
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

