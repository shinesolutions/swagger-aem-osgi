package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties   {
  @JsonProperty("formportal.interval")
  private ConfigNodePropertyString formportalInterval = null;

  public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties formportalInterval(ConfigNodePropertyString formportalInterval) {
    this.formportalInterval = formportalInterval;
    return this;
  }

   /**
   * Get formportalInterval
   * @return formportalInterval
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.formportalInterval, comAdobeFdFpConfigFormsPortalSchedulerServiceProperties.formportalInterval);
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

