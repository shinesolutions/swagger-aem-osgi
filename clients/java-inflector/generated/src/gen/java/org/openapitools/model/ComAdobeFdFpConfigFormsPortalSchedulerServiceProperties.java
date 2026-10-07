package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties   {
  @JsonProperty("formportal.interval")
  private ConfigNodePropertyString formportalInterval;

  /**
   **/
  public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties formportalInterval(ConfigNodePropertyString formportalInterval) {
    this.formportalInterval = formportalInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("formportal.interval")
  public ConfigNodePropertyString getFormportalInterval() {
    return formportalInterval;
  }
  public void setFormportalInterval(ConfigNodePropertyString formportalInterval) {
    this.formportalInterval = formportalInterval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties comAdobeFdFpConfigFormsPortalSchedulerServiceProperties = (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties) o;
    return Objects.equals(formportalInterval, comAdobeFdFpConfigFormsPortalSchedulerServiceProperties.formportalInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formportalInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties {\n");
    
    sb.append("    formportalInterval: ").append(toIndentedString(formportalInterval)).append("\n");
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

