package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties   {
  
  private ConfigNodePropertyArray includePaths = null;
  private ConfigNodePropertyString exporterUser = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("include.paths")
  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }
  public void setIncludePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exporter.user")
  public ConfigNodePropertyString getExporterUser() {
    return exporterUser;
  }
  public void setExporterUser(ConfigNodePropertyString exporterUser) {
    this.exporterUser = exporterUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScheduledExporterImplScheduledExporterImplProperties comAdobeCqScheduledExporterImplScheduledExporterImplProperties = (ComAdobeCqScheduledExporterImplScheduledExporterImplProperties) o;
    return Objects.equals(includePaths, comAdobeCqScheduledExporterImplScheduledExporterImplProperties.includePaths) &&
        Objects.equals(exporterUser, comAdobeCqScheduledExporterImplScheduledExporterImplProperties.exporterUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includePaths, exporterUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {\n");
    
    sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
    sb.append("    exporterUser: ").append(toIndentedString(exporterUser)).append("\n");
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

