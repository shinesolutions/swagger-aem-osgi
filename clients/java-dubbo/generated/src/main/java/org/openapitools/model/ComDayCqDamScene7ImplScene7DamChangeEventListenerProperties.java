package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.dam.scene7.damchangeeventlistener.enabled")
  private ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled;

  @JsonProperty("cq.dam.scene7.damchangeeventlistener.observed.paths")
  private ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths;

  /**
   * 
   * @return cqDamScene7DamchangeeventlistenerEnabled
   */
  public ConfigNodePropertyBoolean getCqDamScene7DamchangeeventlistenerEnabled() {
    return cqDamScene7DamchangeeventlistenerEnabled;
  }

  public void setCqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
    this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
  }

  /**
   * 
   * @return cqDamScene7DamchangeeventlistenerObservedPaths
   */
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
