package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties   {
  @JsonProperty("cq.dam.scene7.damchangeeventlistener.enabled")
  private ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled;

  @JsonProperty("cq.dam.scene7.damchangeeventlistener.observed.paths")
  private ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths;

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties cqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
    return this;
  }

  /**
   * Get cqDamScene7DamchangeeventlistenerEnabled
   * @return cqDamScene7DamchangeeventlistenerEnabled
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqDamScene7DamchangeeventlistenerEnabled() {
    return cqDamScene7DamchangeeventlistenerEnabled;
  }

  public void setCqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
  }

  public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties cqDamScene7DamchangeeventlistenerObservedPaths(ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
    this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
    return this;
  }

  /**
   * Get cqDamScene7DamchangeeventlistenerObservedPaths
   * @return cqDamScene7DamchangeeventlistenerObservedPaths
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqDamScene7DamchangeeventlistenerObservedPaths() {
    return cqDamScene7DamchangeeventlistenerObservedPaths;
  }

  public void setCqDamScene7DamchangeeventlistenerObservedPaths(ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
    this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties comDayCqDamScene7ImplScene7DamChangeEventListenerProperties = (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties) o;
    return Objects.equals(this.cqDamScene7DamchangeeventlistenerEnabled, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.cqDamScene7DamchangeeventlistenerEnabled) &&
        Objects.equals(this.cqDamScene7DamchangeeventlistenerObservedPaths, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.cqDamScene7DamchangeeventlistenerObservedPaths);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

