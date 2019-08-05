package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties   {
  

  private ConfigNodePropertyArray codeupgradetasks = null;

  private ConfigNodePropertyArray codeupgradetaskfilters = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codeupgradetasks")
  public ConfigNodePropertyArray getCodeupgradetasks() {
    return codeupgradetasks;
  }
  public void setCodeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
    this.codeupgradetasks = codeupgradetasks;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

