package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("include.paths")
  private ConfigNodePropertyArray includePaths;

  @JsonProperty("exporter.user")
  private ConfigNodePropertyString exporterUser;

  /**
   * 
   * @return includePaths
   */
  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  public void setIncludePaths(ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  /**
   * 
   * @return exporterUser
   */
  public ConfigNodePropertyString getExporterUser() {
    return exporterUser;
  }

  public void setExporterUser(ConfigNodePropertyString exporterUser) {
    this.exporterUser = exporterUser;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
