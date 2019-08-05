package apimodels;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ConfigNodePropertyArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConfigNodePropertyArray   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optional")
  private Boolean optional = null;

  @JsonProperty("is_set")
  private Boolean isSet = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("values")
  private List<String> values = null;

  @JsonProperty("description")
  private String description = null;

  public ConfigNodePropertyArray name(String name) {
    this.name = name;
    return this;
  }

   /**
   * property name
   * @return name
  **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigNodePropertyArray optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * True if optional
   * @return optional
  **/
    public Boolean getOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  public ConfigNodePropertyArray isSet(Boolean isSet) {
    this.isSet = isSet;
    return this;
  }

   /**
   * True if property is set
   * @return isSet
  **/
    public Boolean getIsSet() {
    return isSet;
  }

  public void setIsSet(Boolean isSet) {
    this.isSet = isSet;
  }

  public ConfigNodePropertyArray type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
   * @return type
  **/
    public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public ConfigNodePropertyArray values(List<String> values) {
    this.values = values;
    return this;
  }

  public ConfigNodePropertyArray addValuesItem(String valuesItem) {
    if (values == null) {
      values = new ArrayList<>();
    }
    values.add(valuesItem);
    return this;
  }

   /**
   * Property value
   * @return values
  **/
    public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public ConfigNodePropertyArray description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Property description
   * @return description
  **/
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigNodePropertyArray configNodePropertyArray = (ConfigNodePropertyArray) o;
    return Objects.equals(name, configNodePropertyArray.name) &&
        Objects.equals(optional, configNodePropertyArray.optional) &&
        Objects.equals(isSet, configNodePropertyArray.isSet) &&
        Objects.equals(type, configNodePropertyArray.type) &&
        Objects.equals(values, configNodePropertyArray.values) &&
        Objects.equals(description, configNodePropertyArray.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, values, description);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyArray {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

