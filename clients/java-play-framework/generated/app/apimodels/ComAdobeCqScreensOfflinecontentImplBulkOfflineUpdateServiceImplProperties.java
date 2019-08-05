package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties   {
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")
  private ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = null;

  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency")
  private ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = null;

  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
    return this;
  }

   /**
   * Get comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
   * @return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath
  **/
  @Valid
  public ConfigNodePropertyArray getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }

  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }

  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
    return this;
  }

   /**
   * Get comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
   * @return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
  **/
  @Valid
  public ConfigNodePropertyString getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }

  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties = (ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties) o;
    return Objects.equals(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) &&
        Objects.equals(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {\n");
    
    sb.append("    comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath: ").append(toIndentedString(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath)).append("\n");
    sb.append("    comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency: ").append(toIndentedString(comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency)).append("\n");
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

