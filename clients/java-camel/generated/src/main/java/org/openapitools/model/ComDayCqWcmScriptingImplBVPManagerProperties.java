package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmScriptingImplBVPManagerProperties
 */

@JsonTypeName("comDayCqWcmScriptingImplBVPManagerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmScriptingImplBVPManagerProperties {

  private ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines;

  public ComDayCqWcmScriptingImplBVPManagerProperties comDayCqWcmScriptingBvpScriptEngines(ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines) {
    this.comDayCqWcmScriptingBvpScriptEngines = comDayCqWcmScriptingBvpScriptEngines;
    return this;
  }

  /**
   * Get comDayCqWcmScriptingBvpScriptEngines
   * @return comDayCqWcmScriptingBvpScriptEngines
   */
  @Valid 
  @Schema(name = "com.day.cq.wcm.scripting.bvp.script.engines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.day.cq.wcm.scripting.bvp.script.engines")
  public ConfigNodePropertyArray getComDayCqWcmScriptingBvpScriptEngines() {
    return comDayCqWcmScriptingBvpScriptEngines;
  }

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

