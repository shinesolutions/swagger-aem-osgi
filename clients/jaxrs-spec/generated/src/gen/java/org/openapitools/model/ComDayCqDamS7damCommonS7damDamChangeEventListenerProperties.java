package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamS7damCommonS7damDamChangeEventListenerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties   {
  private ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled;

  public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties() {
  }

  /**
   **/
  public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties cqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
    this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.s7dam.damchangeeventlistener.enabled")
  @Valid public ConfigNodePropertyBoolean getCqDamS7damDamchangeeventlistenerEnabled() {
    return cqDamS7damDamchangeeventlistenerEnabled;
  }

  @JsonProperty("cq.dam.s7dam.damchangeeventlistener.enabled")
  public void setCqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
    this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties comDayCqDamS7damCommonS7damDamChangeEventListenerProperties = (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties) o;
    return Objects.equals(this.cqDamS7damDamchangeeventlistenerEnabled, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties.cqDamS7damDamchangeeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamS7damDamchangeeventlistenerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {\n");
    
    sb.append("    cqDamS7damDamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamS7damDamchangeeventlistenerEnabled)).append("\n");
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
