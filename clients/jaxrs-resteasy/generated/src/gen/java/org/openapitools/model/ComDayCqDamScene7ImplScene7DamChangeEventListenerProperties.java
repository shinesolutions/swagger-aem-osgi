package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties   {
  
  private ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled = null;
  private ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.scene7.damchangeeventlistener.enabled")
  public ConfigNodePropertyBoolean getCqDamScene7DamchangeeventlistenerEnabled() {
    return cqDamScene7DamchangeeventlistenerEnabled;
  }
  public void setCqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.scene7.damchangeeventlistener.observed.paths")
  public ConfigNodePropertyArray getCqDamScene7DamchangeeventlistenerObservedPaths() {
    return cqDamScene7DamchangeeventlistenerObservedPaths;
  }
  public void setCqDamScene7DamchangeeventlistenerObservedPaths(ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
    this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties comDayCqDamScene7ImplScene7DamChangeEventListenerProperties = (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties) o;
    return Objects.equals(cqDamScene7DamchangeeventlistenerEnabled, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.cqDamScene7DamchangeeventlistenerEnabled) &&
        Objects.equals(cqDamScene7DamchangeeventlistenerObservedPaths, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.cqDamScene7DamchangeeventlistenerObservedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7DamchangeeventlistenerEnabled, cqDamScene7DamchangeeventlistenerObservedPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {\n");
    
    sb.append("    cqDamScene7DamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerEnabled)).append("\n");
    sb.append("    cqDamScene7DamchangeeventlistenerObservedPaths: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerObservedPaths)).append("\n");
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

