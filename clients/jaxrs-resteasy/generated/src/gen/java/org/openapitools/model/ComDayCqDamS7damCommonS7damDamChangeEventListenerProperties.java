package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties   {
  
  private ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.s7dam.damchangeeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamS7damDamchangeeventlistenerEnabled() {
    return cqDamS7damDamchangeeventlistenerEnabled;
  }
  public void setCqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamS7damDamchangeeventlistenerEnabled) {
    this.cqDamS7damDamchangeeventlistenerEnabled = cqDamS7damDamchangeeventlistenerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties comDayCqDamS7damCommonS7damDamChangeEventListenerProperties = (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties) o;
    return Objects.equals(cqDamS7damDamchangeeventlistenerEnabled, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties.cqDamS7damDamchangeeventlistenerEnabled);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

