package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmScriptingImplBVPManagerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmScriptingImplBVPManagerProperties   {
  private ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines;

  public ComDayCqWcmScriptingImplBVPManagerProperties() {
  }

  /**
   **/
  public ComDayCqWcmScriptingImplBVPManagerProperties comDayCqWcmScriptingBvpScriptEngines(ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines) {
    this.comDayCqWcmScriptingBvpScriptEngines = comDayCqWcmScriptingBvpScriptEngines;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.day.cq.wcm.scripting.bvp.script.engines")
  @Valid public ConfigNodePropertyArray getComDayCqWcmScriptingBvpScriptEngines() {
    return comDayCqWcmScriptingBvpScriptEngines;
  }

  @JsonProperty("com.day.cq.wcm.scripting.bvp.script.engines")
  public void setComDayCqWcmScriptingBvpScriptEngines(ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines) {
    this.comDayCqWcmScriptingBvpScriptEngines = comDayCqWcmScriptingBvpScriptEngines;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
