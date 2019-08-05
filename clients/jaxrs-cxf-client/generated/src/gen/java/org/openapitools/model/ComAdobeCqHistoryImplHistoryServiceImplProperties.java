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

public class ComAdobeCqHistoryImplHistoryServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray historyServiceResourceTypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray historyServicePathFilter = null;
 /**
   * Get historyServiceResourceTypes
   * @return historyServiceResourceTypes
  **/
  @JsonProperty("history.service.resourceTypes")
  public ConfigNodePropertyArray getHistoryServiceResourceTypes() {
    return historyServiceResourceTypes;
  }

  public void setHistoryServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
  }

  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
    return this;
  }

 /**
   * Get historyServicePathFilter
   * @return historyServicePathFilter
  **/
  @JsonProperty("history.service.pathFilter")
  public ConfigNodePropertyArray getHistoryServicePathFilter() {
    return historyServicePathFilter;
  }

  public void setHistoryServicePathFilter(ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
  }

  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServicePathFilter(ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqHistoryImplHistoryServiceImplProperties {\n");
    
    sb.append("    historyServiceResourceTypes: ").append(toIndentedString(historyServiceResourceTypes)).append("\n");
    sb.append("    historyServicePathFilter: ").append(toIndentedString(historyServicePathFilter)).append("\n");
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

