package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqHistoryImplHistoryServiceImplProperties   {
  
  private ConfigNodePropertyArray historyServiceResourceTypes = null;
  private ConfigNodePropertyArray historyServicePathFilter = null;

  public ComAdobeCqHistoryImplHistoryServiceImplProperties () {

  }

  public ComAdobeCqHistoryImplHistoryServiceImplProperties (ConfigNodePropertyArray historyServiceResourceTypes, ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
    this.historyServicePathFilter = historyServicePathFilter;
  }

    
  @JsonProperty("history.service.resourceTypes")
  public ConfigNodePropertyArray getHistoryServiceResourceTypes() {
    return historyServiceResourceTypes;
  }
  public void setHistoryServiceResourceTypes(ConfigNodePropertyArray historyServiceResourceTypes) {
    this.historyServiceResourceTypes = historyServiceResourceTypes;
  }

    
  @JsonProperty("history.service.pathFilter")
  public ConfigNodePropertyArray getHistoryServicePathFilter() {
    return historyServicePathFilter;
  }
  public void setHistoryServicePathFilter(ConfigNodePropertyArray historyServicePathFilter) {
    this.historyServicePathFilter = historyServicePathFilter;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
