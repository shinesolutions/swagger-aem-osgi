package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqHistoryImplHistoryRequestFilterProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray historyRequestFilterExcludedSelectors;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray historyRequestFilterExcludedExtensions;
 /**
   * Get historyRequestFilterExcludedSelectors
   * @return historyRequestFilterExcludedSelectors
  **/
  @JsonProperty("history.requestFilter.excludedSelectors")
  public ConfigNodePropertyArray getHistoryRequestFilterExcludedSelectors() {
    return historyRequestFilterExcludedSelectors;
  }

  public void setHistoryRequestFilterExcludedSelectors(ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
  }

  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedSelectors(ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
    return this;
  }

 /**
   * Get historyRequestFilterExcludedExtensions
   * @return historyRequestFilterExcludedExtensions
  **/
  @JsonProperty("history.requestFilter.excludedExtensions")
  public ConfigNodePropertyArray getHistoryRequestFilterExcludedExtensions() {
    return historyRequestFilterExcludedExtensions;
  }

  public void setHistoryRequestFilterExcludedExtensions(ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
    this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
  }

  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedExtensions(ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
    this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqHistoryImplHistoryRequestFilterProperties comAdobeCqHistoryImplHistoryRequestFilterProperties = (ComAdobeCqHistoryImplHistoryRequestFilterProperties) o;
    return Objects.equals(this.historyRequestFilterExcludedSelectors, comAdobeCqHistoryImplHistoryRequestFilterProperties.historyRequestFilterExcludedSelectors) &&
        Objects.equals(this.historyRequestFilterExcludedExtensions, comAdobeCqHistoryImplHistoryRequestFilterProperties.historyRequestFilterExcludedExtensions);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

