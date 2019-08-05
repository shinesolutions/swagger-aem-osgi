package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyDropDown;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties   {
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes = null;

  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems = null;

  @JsonProperty("cq.wcm.msm.action.excludedprops")
  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops = null;

  @JsonProperty("contentcopyaction.order.style")
  private ConfigNodePropertyDropDown contentcopyactionOrderStyle = null;

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludednodetypes
   * @return cqWcmMsmActionExcludednodetypes
  **/
  @Valid
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }

  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedparagraphitems
   * @return cqWcmMsmActionExcludedparagraphitems
  **/
  @Valid
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }

  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedprops
   * @return cqWcmMsmActionExcludedprops
  **/
  @Valid
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }

  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties contentcopyactionOrderStyle(ConfigNodePropertyDropDown contentcopyactionOrderStyle) {
    this.contentcopyactionOrderStyle = contentcopyactionOrderStyle;
    return this;
  }

   /**
   * Get contentcopyactionOrderStyle
   * @return contentcopyactionOrderStyle
  **/
  @Valid
  public ConfigNodePropertyDropDown getContentcopyactionOrderStyle() {
    return contentcopyactionOrderStyle;
  }

  public void setContentcopyactionOrderStyle(ConfigNodePropertyDropDown contentcopyactionOrderStyle) {
    this.contentcopyactionOrderStyle = contentcopyactionOrderStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties = (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties) o;
    return Objects.equals(cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(contentcopyactionOrderStyle, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.contentcopyactionOrderStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmMsmActionExcludednodetypes, cqWcmMsmActionExcludedparagraphitems, cqWcmMsmActionExcludedprops, contentcopyactionOrderStyle);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {\n");
    
    sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
    sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
    sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
    sb.append("    contentcopyactionOrderStyle: ").append(toIndentedString(contentcopyactionOrderStyle)).append("\n");
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

