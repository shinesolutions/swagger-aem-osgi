package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties   {
  
  private ConfigNodePropertyBoolean forcelocation;

  public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties () {

  }

  public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties (ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
  }

    
  @JsonProperty("forcelocation")
  public ConfigNodePropertyBoolean getForcelocation() {
    return forcelocation;
  }
  public void setForcelocation(ConfigNodePropertyBoolean forcelocation) {
    this.forcelocation = forcelocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties = (ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties) o;
    return Objects.equals(forcelocation, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.forcelocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forcelocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {\n");
    
    sb.append("    forcelocation: ").append(toIndentedString(forcelocation)).append("\n");
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
