package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmDesignimporterDesignPackageImporterProperties   {
  @JsonProperty("extract.filter")
  private ConfigNodePropertyArray extractFilter;

  /**
   **/
  public ComDayCqWcmDesignimporterDesignPackageImporterProperties extractFilter(ConfigNodePropertyArray extractFilter) {
    this.extractFilter = extractFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

