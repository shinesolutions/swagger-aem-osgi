package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqHistoryImplHistoryServiceImplProperties   {
  
  private ConfigNodePropertyArray historyServiceResourceTypes = null;

  private ConfigNodePropertyArray historyServicePathFilter = null;


  /**
   **/
  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("history.service.resourceTypes")
  public ConfigNodePropertyArray getHistoryServiceResourceTypes() {
    return historyServiceResourceTypes;
  }
  public void setHistoryServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
  }


  /**
   **/
  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServicePathFilter(ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("history.service.pathFilter")
  public ConfigNodePropertyArray getHistoryServicePathFilter() {
    return historyServicePathFilter;
  }
  public void setHistoryServicePathFilter(ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqHistoryImplHistoryServiceImplProperties comAdobeCqHistoryImplHistoryServiceImplProperties = (ComAdobeCqHistoryImplHistoryServiceImplProperties) o;
    return Objects.equals(historyServiceResourceTypes, comAdobeCqHistoryImplHistoryServiceImplProperties.historyServiceResourceTypes) &&
        Objects.equals(historyServicePathFilter, comAdobeCqHistoryImplHistoryServiceImplProperties.historyServicePathFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyServiceResourceTypes, historyServicePathFilter);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

