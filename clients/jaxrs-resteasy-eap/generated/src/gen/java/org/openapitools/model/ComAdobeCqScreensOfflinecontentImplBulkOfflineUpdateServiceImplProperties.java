package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties   {
  
  private ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  private ConfigNodePropertyString comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")
  public ConfigNodePropertyArray getComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath() {
    return comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }
  public void setComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath(ConfigNodePropertyArray comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) {
    this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath = comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath) &&
        Objects.equals(this.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency, comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

