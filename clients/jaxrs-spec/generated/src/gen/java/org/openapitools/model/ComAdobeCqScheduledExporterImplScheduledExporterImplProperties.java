package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties   {
  
  private @Valid ConfigNodePropertyArray includePaths = null;
  private @Valid ConfigNodePropertyString exporterUser = null;

  /**
   **/
  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
    return this;
  }

  
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
  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties exporterUser(ConfigNodePropertyString exporterUser) {
    this.exporterUser = exporterUser;
    return this;
  }

  
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

