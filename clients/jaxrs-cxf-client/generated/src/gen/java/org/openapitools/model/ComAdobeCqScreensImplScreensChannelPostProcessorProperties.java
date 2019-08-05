package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqScreensImplScreensChannelPostProcessorProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray screensChannelsPropertiesToRemove = null;
 /**
   * Get screensChannelsPropertiesToRemove
   * @return screensChannelsPropertiesToRemove
  **/
  @JsonProperty("screens.channels.properties.to.remove")
  public ConfigNodePropertyArray getScreensChannelsPropertiesToRemove() {
    return screensChannelsPropertiesToRemove;
  }

  public void setScreensChannelsPropertiesToRemove(ConfigNodePropertyArray screensChannelsPropertiesToRemove) {
    this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
  }

  public ComAdobeCqScreensImplScreensChannelPostProcessorProperties screensChannelsPropertiesToRemove(ConfigNodePropertyArray screensChannelsPropertiesToRemove) {
    this.screensChannelsPropertiesToRemove = screensChannelsPropertiesToRemove;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplScreensChannelPostProcessorProperties {\n");
    
    sb.append("    screensChannelsPropertiesToRemove: ").append(toIndentedString(screensChannelsPropertiesToRemove)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

