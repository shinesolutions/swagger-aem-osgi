package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqHistoryImplHistoryServiceImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqHistoryImplHistoryServiceImplProperties   {
  @JsonProperty("history.service.resourceTypes")
  private ConfigNodePropertyArray historyServiceResourceTypes = null;

  @JsonProperty("history.service.pathFilter")
  private ConfigNodePropertyArray historyServicePathFilter = null;

  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
    return this;
  }

   /**
   * Get historyServiceResourceTypes
   * @return historyServiceResourceTypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHistoryServiceResourceTypes() {
    return historyServiceResourceTypes;
  }

  public void setHistoryServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
  }

  public ComAdobeCqHistoryImplHistoryServiceImplProperties historyServicePathFilter(ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
    return this;
  }

   /**
   * Get historyServicePathFilter
   * @return historyServicePathFilter
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.historyServiceResourceTypes, comAdobeCqHistoryImplHistoryServiceImplProperties.historyServiceResourceTypes) &&
        Objects.equals(this.historyServicePathFilter, comAdobeCqHistoryImplHistoryServiceImplProperties.historyServicePathFilter);
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

