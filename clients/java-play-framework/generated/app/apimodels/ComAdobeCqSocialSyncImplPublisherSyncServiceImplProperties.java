package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties   {
  @JsonProperty("activeRunModes")
  private ConfigNodePropertyArray activeRunModes = null;

  public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties activeRunModes(ConfigNodePropertyArray activeRunModes) {
    this.activeRunModes = activeRunModes;
    return this;
  }

   /**
   * Get activeRunModes
   * @return activeRunModes
  **/
  @Valid
  public ConfigNodePropertyArray getActiveRunModes() {
    return activeRunModes;
  }

  public void setActiveRunModes(ConfigNodePropertyArray activeRunModes) {
    this.activeRunModes = activeRunModes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties = (ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties) o;
    return Objects.equals(activeRunModes, comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.activeRunModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeRunModes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties {\n");
    
    sb.append("    activeRunModes: ").append(toIndentedString(activeRunModes)).append("\n");
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

