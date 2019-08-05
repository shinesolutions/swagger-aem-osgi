package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties   {
  @JsonProperty("codeupgradetasks")
  private ConfigNodePropertyArray codeupgradetasks = null;

  @JsonProperty("codeupgradetaskfilters")
  private ConfigNodePropertyArray codeupgradetaskfilters = null;

  public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties codeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
    this.codeupgradetasks = codeupgradetasks;
    return this;
  }

   /**
   * Get codeupgradetasks
   * @return codeupgradetasks
  **/
  @Valid
  public ConfigNodePropertyArray getCodeupgradetasks() {
    return codeupgradetasks;
  }

  public void setCodeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
    this.codeupgradetasks = codeupgradetasks;
  }

  public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties codeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters) {
    this.codeupgradetaskfilters = codeupgradetaskfilters;
    return this;
  }

   /**
   * Get codeupgradetaskfilters
   * @return codeupgradetaskfilters
  **/
  @Valid
  public ConfigNodePropertyArray getCodeupgradetaskfilters() {
    return codeupgradetaskfilters;
  }

  public void setCodeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters) {
    this.codeupgradetaskfilters = codeupgradetaskfilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

