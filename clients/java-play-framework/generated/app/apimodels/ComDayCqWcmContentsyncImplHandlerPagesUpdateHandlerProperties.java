package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties   {
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes = null;

  public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties cqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerImageresourcetypes
   * @return cqPagesupdatehandlerImageresourcetypes
  **/
  @Valid
  public ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }

  public void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties = (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties) o;
    return Objects.equals(cqPagesupdatehandlerImageresourcetypes, comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqPagesupdatehandlerImageresourcetypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties {\n");
    
    sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
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

