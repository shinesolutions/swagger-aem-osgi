package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties   {
  
  private ConfigNodePropertyArray codeupgradetasks = null;
  private ConfigNodePropertyArray codeupgradetaskfilters = null;

  public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties () {

  }

  public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties (ConfigNodePropertyArray codeupgradetasks, ConfigNodePropertyArray codeupgradetaskfilters) {
    this.codeupgradetasks = codeupgradetasks;
    this.codeupgradetaskfilters = codeupgradetaskfilters;
  }

    
  @JsonProperty("codeupgradetasks")
  public ConfigNodePropertyArray getCodeupgradetasks() {
    return codeupgradetasks;
  }
  public void setCodeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
    this.codeupgradetasks = codeupgradetasks;
  }

    
  @JsonProperty("codeupgradetaskfilters")
  public ConfigNodePropertyArray getCodeupgradetaskfilters() {
    return codeupgradetaskfilters;
  }
  public void setCodeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters) {
    this.codeupgradetaskfilters = codeupgradetaskfilters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties = (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties) o;
    return Objects.equals(codeupgradetasks, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.codeupgradetasks) &&
        Objects.equals(codeupgradetaskfilters, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.codeupgradetaskfilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeupgradetasks, codeupgradetaskfilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {\n");
    
    sb.append("    codeupgradetasks: ").append(toIndentedString(codeupgradetasks)).append("\n");
    sb.append("    codeupgradetaskfilters: ").append(toIndentedString(codeupgradetaskfilters)).append("\n");
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
