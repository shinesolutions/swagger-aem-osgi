package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmDesignimporterDesignPackageImporterProperties   {
  
  private ConfigNodePropertyArray extractFilter = null;

  public ComDayCqWcmDesignimporterDesignPackageImporterProperties () {

  }

  public ComDayCqWcmDesignimporterDesignPackageImporterProperties (ConfigNodePropertyArray extractFilter) {
    this.extractFilter = extractFilter;
  }

    
  @JsonProperty("extract.filter")
  public ConfigNodePropertyArray getExtractFilter() {
    return extractFilter;
  }
  public void setExtractFilter(ConfigNodePropertyArray extractFilter) {
    this.extractFilter = extractFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterDesignPackageImporterProperties comDayCqWcmDesignimporterDesignPackageImporterProperties = (ComDayCqWcmDesignimporterDesignPackageImporterProperties) o;
    return Objects.equals(extractFilter, comDayCqWcmDesignimporterDesignPackageImporterProperties.extractFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extractFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterDesignPackageImporterProperties {\n");
    
    sb.append("    extractFilter: ").append(toIndentedString(extractFilter)).append("\n");
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
