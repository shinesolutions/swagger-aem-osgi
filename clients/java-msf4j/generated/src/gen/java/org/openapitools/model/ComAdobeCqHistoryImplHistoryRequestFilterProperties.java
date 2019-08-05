package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComAdobeCqHistoryImplHistoryRequestFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqHistoryImplHistoryRequestFilterProperties   {
  @JsonProperty("history.requestFilter.excludedSelectors")
  private ConfigNodePropertyArray historyRequestFilterExcludedSelectors = null;

  @JsonProperty("history.requestFilter.excludedExtensions")
  private ConfigNodePropertyArray historyRequestFilterExcludedExtensions = null;

  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedSelectors(ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
    return this;
  }

   /**
   * Get historyRequestFilterExcludedSelectors
   * @return historyRequestFilterExcludedSelectors
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHistoryRequestFilterExcludedSelectors() {
    return historyRequestFilterExcludedSelectors;
  }

  public void setHistoryRequestFilterExcludedSelectors(ConfigNodePropertyArray historyRequestFilterExcludedSelectors) {
    this.historyRequestFilterExcludedSelectors = historyRequestFilterExcludedSelectors;
  }

  public ComAdobeCqHistoryImplHistoryRequestFilterProperties historyRequestFilterExcludedExtensions(ConfigNodePropertyArray historyRequestFilterExcludedExtensions) {
    this.historyRequestFilterExcludedExtensions = historyRequestFilterExcludedExtensions;
    return this;
  }

   /**
   * Get historyRequestFilterExcludedExtensions
   * @return historyRequestFilterExcludedExtensions
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

