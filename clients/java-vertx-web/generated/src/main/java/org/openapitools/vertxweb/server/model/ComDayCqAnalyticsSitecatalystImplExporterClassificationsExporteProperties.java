package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyArray;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties   {
  
  private ConfigNodePropertyArray allowedPaths;
  private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize;

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties () {

  }

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties (ConfigNodePropertyArray allowedPaths, ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.allowedPaths = allowedPaths;
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
  }

    
  @JsonProperty("allowed.paths")
  public ConfigNodePropertyArray getAllowedPaths() {
    return allowedPaths;
  }
  public void setAllowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
  }

    
  @JsonProperty("cq.analytics.saint.exporter.pagesize")
  public ConfigNodePropertyInteger getCqAnalyticsSaintExporterPagesize() {
    return cqAnalyticsSaintExporterPagesize;
  }
  public void setCqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties = (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties) o;
    return Objects.equals(allowedPaths, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.allowedPaths) &&
        Objects.equals(cqAnalyticsSaintExporterPagesize, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties.cqAnalyticsSaintExporterPagesize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaths, cqAnalyticsSaintExporterPagesize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {\n");
    
    sb.append("    allowedPaths: ").append(toIndentedString(allowedPaths)).append("\n");
    sb.append("    cqAnalyticsSaintExporterPagesize: ").append(toIndentedString(cqAnalyticsSaintExporterPagesize)).append("\n");
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
