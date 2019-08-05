package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties   {
  
  private @Valid ConfigNodePropertyString formportalInterval = null;

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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

