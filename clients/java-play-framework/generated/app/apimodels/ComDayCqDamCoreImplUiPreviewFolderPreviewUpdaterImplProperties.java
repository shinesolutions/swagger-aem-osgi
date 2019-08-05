package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties   {
  @JsonProperty("createPreviewEnabled")
  private ConfigNodePropertyBoolean createPreviewEnabled = null;

  @JsonProperty("updatePreviewEnabled")
  private ConfigNodePropertyBoolean updatePreviewEnabled = null;

  @JsonProperty("queueSize")
  private ConfigNodePropertyInteger queueSize = null;

  @JsonProperty("folderPreviewRenditionRegex")
  private ConfigNodePropertyString folderPreviewRenditionRegex = null;

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties createPreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled) {
    this.createPreviewEnabled = createPreviewEnabled;
    return this;
  }

   /**
   * Get createPreviewEnabled
   * @return createPreviewEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getCreatePreviewEnabled() {
    return createPreviewEnabled;
  }

  public void setCreatePreviewEnabled(ConfigNodePropertyBoolean createPreviewEnabled) {
    this.createPreviewEnabled = createPreviewEnabled;
  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties updatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled) {
    this.updatePreviewEnabled = updatePreviewEnabled;
    return this;
  }

   /**
   * Get updatePreviewEnabled
   * @return updatePreviewEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getUpdatePreviewEnabled() {
    return updatePreviewEnabled;
  }

  public void setUpdatePreviewEnabled(ConfigNodePropertyBoolean updatePreviewEnabled) {
    this.updatePreviewEnabled = updatePreviewEnabled;
  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties queueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
    return this;
  }

   /**
   * Get queueSize
   * @return queueSize
  **/
  @Valid
  public ConfigNodePropertyInteger getQueueSize() {
    return queueSize;
  }

  public void setQueueSize(ConfigNodePropertyInteger queueSize) {
    this.queueSize = queueSize;
  }

  public ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties folderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex) {
    this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
    return this;
  }

   /**
   * Get folderPreviewRenditionRegex
   * @return folderPreviewRenditionRegex
  **/
  @Valid
  public ConfigNodePropertyString getFolderPreviewRenditionRegex() {
    return folderPreviewRenditionRegex;
  }

  public void setFolderPreviewRenditionRegex(ConfigNodePropertyString folderPreviewRenditionRegex) {
    this.folderPreviewRenditionRegex = folderPreviewRenditionRegex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties = (ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties) o;
    return Objects.equals(createPreviewEnabled, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.createPreviewEnabled) &&
        Objects.equals(updatePreviewEnabled, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.updatePreviewEnabled) &&
        Objects.equals(queueSize, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.queueSize) &&
        Objects.equals(folderPreviewRenditionRegex, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.folderPreviewRenditionRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createPreviewEnabled, updatePreviewEnabled, queueSize, folderPreviewRenditionRegex);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {\n");
    
    sb.append("    createPreviewEnabled: ").append(toIndentedString(createPreviewEnabled)).append("\n");
    sb.append("    updatePreviewEnabled: ").append(toIndentedString(updatePreviewEnabled)).append("\n");
    sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
    sb.append("    folderPreviewRenditionRegex: ").append(toIndentedString(folderPreviewRenditionRegex)).append("\n");
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

