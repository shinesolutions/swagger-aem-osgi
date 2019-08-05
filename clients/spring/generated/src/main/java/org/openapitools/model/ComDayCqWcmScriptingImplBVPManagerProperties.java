package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqWcmScriptingImplBVPManagerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqWcmScriptingImplBVPManagerProperties   {
  @JsonProperty("com.day.cq.wcm.scripting.bvp.script.engines")
  private ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines = null;

  public ComDayCqWcmScriptingImplBVPManagerProperties comDayCqWcmScriptingBvpScriptEngines(ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines) {
    this.comDayCqWcmScriptingBvpScriptEngines = comDayCqWcmScriptingBvpScriptEngines;
    return this;
  }

  /**
   * Get comDayCqWcmScriptingBvpScriptEngines
   * @return comDayCqWcmScriptingBvpScriptEngines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getComDayCqWcmScriptingBvpScriptEngines() {
    return comDayCqWcmScriptingBvpScriptEngines;
  }

  public void setComDayCqWcmScriptingBvpScriptEngines(ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines) {
    this.comDayCqWcmScriptingBvpScriptEngines = comDayCqWcmScriptingBvpScriptEngines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmScriptingImplBVPManagerProperties comDayCqWcmScriptingImplBVPManagerProperties = (ComDayCqWcmScriptingImplBVPManagerProperties) o;
    return Objects.equals(this.comDayCqWcmScriptingBvpScriptEngines, comDayCqWcmScriptingImplBVPManagerProperties.comDayCqWcmScriptingBvpScriptEngines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comDayCqWcmScriptingBvpScriptEngines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmScriptingImplBVPManagerProperties {\n");
    
    sb.append("    comDayCqWcmScriptingBvpScriptEngines: ").append(toIndentedString(comDayCqWcmScriptingBvpScriptEngines)).append("\n");
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

