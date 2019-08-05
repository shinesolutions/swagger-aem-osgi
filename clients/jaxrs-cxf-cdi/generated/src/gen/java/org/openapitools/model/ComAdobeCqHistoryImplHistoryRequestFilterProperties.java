package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqHistoryImplHistoryRequestFilterProperties   {
  
  private ConfigNodePropertyArray historyRequestFilterExcludedSelectors = null;

  private ConfigNodePropertyArray historyRequestFilterExcludedExtensions = null;


  /**
   **/
  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedSelectors(ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("history.requestFilter.excludedSelectors")
  public ConfigNodePropertyArray getHistoryRequestFilterExcludedSelectors() {
    return historyRequestFilterExcludedSelectors;
  }
  public void setHistoryRequestFilterExcludedSelectors(ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
  }


  /**
   **/
  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedExtensions(ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
    this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("history.requestFilter.excludedExtensions")
  public ConfigNodePropertyArray getHistoryRequestFilterExcludedExtensions() {
    return historyRequestFilterExcludedExtensions;
  }
  public void setHistoryRequestFilterExcludedExtensions(ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
    this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqHistoryImplHistoryRequestFilterProperties comAdobeCqHistoryImplHistoryRequestFilterProperties = (ComAdobeCqHistoryImplHistoryRequestFilterProperties) o;
    return Objects.equals(historyRequestFilterExcludedSelectors, comAdobeCqHistoryImplHistoryRequestFilterProperties.historyRequestFilterExcludedSelectors) &&
        Objects.equals(historyRequestFilterExcludedExtensions, comAdobeCqHistoryImplHistoryRequestFilterProperties.historyRequestFilterExcludedExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historyRequestFilterExcludedSelectors, historyRequestFilterExcludedExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqHistoryImplHistoryRequestFilterProperties {\n");
    
    sb.append("    historyRequestFilterExcludedSelectors: ").append(toIndentedString(historyRequestFilterExcludedSelectors)).append("\n");
    sb.append("    historyRequestFilterExcludedExtensions: ").append(toIndentedString(historyRequestFilterExcludedExtensions)).append("\n");
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

