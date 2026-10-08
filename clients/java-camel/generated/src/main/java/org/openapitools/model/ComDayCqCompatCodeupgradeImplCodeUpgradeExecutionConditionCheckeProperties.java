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
 * ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
 */

@JsonTypeName("comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {

  private ConfigNodePropertyArray codeupgradetasks;

  private ConfigNodePropertyArray codeupgradetaskfilters;

  public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties codeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
    this.codeupgradetasks = codeupgradetasks;
    return this;
  }

  /**
   * Get codeupgradetasks
   * @return codeupgradetasks
   */
  @Valid 
  @Schema(name = "codeupgradetasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codeupgradetasks")
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
   */
  @Valid 
  @Schema(name = "codeupgradetaskfilters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.codeupgradetasks, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.codeupgradetasks) &&
        Objects.equals(this.codeupgradetaskfilters, comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.codeupgradetaskfilters);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

