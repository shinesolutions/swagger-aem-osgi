package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqHistoryImplHistoryServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

