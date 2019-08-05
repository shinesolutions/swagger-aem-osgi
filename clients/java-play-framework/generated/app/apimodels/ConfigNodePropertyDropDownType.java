package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ConfigNodePropertyDropDownType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConfigNodePropertyDropDownType   {
  @JsonProperty("labels")
  private Object labels = null;

  @JsonProperty("values")
  private Object values = null;

  public ConfigNodePropertyDropDownType labels(Object labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Drop Down label
   * @return labels
  **/
    public Object getLabels() {
    return labels;
  }

  public void setLabels(Object labels) {
    this.labels = labels;
  }

  public ConfigNodePropertyDropDownType values(Object values) {
    this.values = values;
    return this;
  }

   /**
   * Drown Down value
   * @return values
  **/
    public Object getValues() {
    return values;
  }

  public void setValues(Object values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigNodePropertyDropDownType configNodePropertyDropDownType = (ConfigNodePropertyDropDownType) o;
    return Objects.equals(labels, configNodePropertyDropDownType.labels) &&
        Objects.equals(values, configNodePropertyDropDownType.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, values);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

