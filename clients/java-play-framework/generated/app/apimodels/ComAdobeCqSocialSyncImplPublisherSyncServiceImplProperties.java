package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties   {
  @JsonProperty("activeRunModes")
  @Valid

  private ConfigNodePropertyArray activeRunModes;

  public ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties activeRunModes(ConfigNodePropertyArray activeRunModes) {
    this.activeRunModes = activeRunModes;
    return this;
  }

   /**
   * Get activeRunModes
   * @return activeRunModes
  **/
  public ConfigNodePropertyArray getActiveRunModes() {
    return activeRunModes;
  }

  public void setActiveRunModes(ConfigNodePropertyArray activeRunModes) {
    this.activeRunModes = activeRunModes;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

