package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties   {
  
  private ConfigNodePropertyString formportalInterval = null;

  public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties () {

  }

  public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties (ConfigNodePropertyString formportalInterval) {
    this.formportalInterval = formportalInterval;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
