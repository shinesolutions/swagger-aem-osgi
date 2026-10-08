package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AnyType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ConfigNodePropertyDropDownType implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Drop Down label
   */
  @JsonProperty("labels")
  private AnyType labels = null;

  /**
   * Drown Down value
   */
  @JsonProperty("values")
  private AnyType values = null;

  /**
   * Drop Down label
   * @return labels
   */
  public AnyType getLabels() {
    return labels;
  }

  public void setLabels(AnyType labels) {
    this.labels = labels;
  }

  /**
   * Drown Down value
   * @return values
   */
  public AnyType getValues() {
    return values;
  }

  public void setValues(AnyType values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigNodePropertyDropDownType configNodePropertyDropDownType = (ConfigNodePropertyDropDownType) o;
    return Objects.equals(this.labels, configNodePropertyDropDownType.labels) &&
        Objects.equals(this.values, configNodePropertyDropDownType.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyDropDownType {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
