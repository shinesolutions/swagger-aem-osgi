package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties   {
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes = null;

  @JsonProperty("cq.pagesupdatehandler.productresourcetypes")
  private ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes = null;

  @JsonProperty("cq.pagesupdatehandler.videoresourcetypes")
  private ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes = null;

  @JsonProperty("cq.pagesupdatehandler.dynamicsequenceresourcetypes")
  private ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes = null;

  @JsonProperty("cq.pagesupdatehandler.previewmodepaths")
  private ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths = null;

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
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

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerProductresourcetypes
   * @return cqPagesupdatehandlerProductresourcetypes
  **/
  @Valid
  public ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() {
    return cqPagesupdatehandlerProductresourcetypes;
  }

  public void setCqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerVideoresourcetypes
   * @return cqPagesupdatehandlerVideoresourcetypes
  **/
  @Valid
  public ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() {
    return cqPagesupdatehandlerVideoresourcetypes;
  }

  public void setCqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerDynamicsequenceresourcetypes
   * @return cqPagesupdatehandlerDynamicsequenceresourcetypes
  **/
  @Valid
  public ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() {
    return cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  public void setCqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerPreviewmodepaths
   * @return cqPagesupdatehandlerPreviewmodepaths
  **/
  @Valid
  public ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() {
    return cqPagesupdatehandlerPreviewmodepaths;
  }

  public void setCqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties = (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties) o;
    return Objects.equals(cqPagesupdatehandlerImageresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerProductresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerProductresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerVideoresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerVideoresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerDynamicsequenceresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerDynamicsequenceresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerPreviewmodepaths, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerPreviewmodepaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqPagesupdatehandlerImageresourcetypes, cqPagesupdatehandlerProductresourcetypes, cqPagesupdatehandlerVideoresourcetypes, cqPagesupdatehandlerDynamicsequenceresourcetypes, cqPagesupdatehandlerPreviewmodepaths);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {\n");
    
    sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerProductresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerProductresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerVideoresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerVideoresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerDynamicsequenceresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerDynamicsequenceresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerPreviewmodepaths: ").append(toIndentedString(cqPagesupdatehandlerPreviewmodepaths)).append("\n");
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
