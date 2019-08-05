package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties   {
  
  private ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = null;
  private ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = null;

  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties () {

  }

  public ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties (ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }

    
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")
  public ConfigNodePropertyArray getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }
  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }

    
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency")
  public ConfigNodePropertyString getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }
  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency(ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
