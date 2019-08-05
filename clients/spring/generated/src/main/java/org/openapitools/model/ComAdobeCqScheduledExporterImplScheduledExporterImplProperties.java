package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqScheduledExporterImplScheduledExporterImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties   {
  @JsonProperty("include.paths")
  private ConfigNodePropertyArray includePaths = null;

  @JsonProperty("exporter.user")
  private ConfigNodePropertyString exporterUser = null;

  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
    return this;
  }

  /**
   * Get includePaths
   * @return includePaths
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  public void setIncludePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties exporterUser(ConfigNodePropertyString exporterUser) {
    this.exporterUser = exporterUser;
    return this;
  }

  /**
   * Get exporterUser
   * @return exporterUser
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.includePaths, comAdobeCqScheduledExporterImplScheduledExporterImplProperties.includePaths) &&
        Objects.equals(this.exporterUser, comAdobeCqScheduledExporterImplScheduledExporterImplProperties.exporterUser);
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

