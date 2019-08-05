package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ConfigNodePropertyInteger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConfigNodePropertyInteger   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optional")
  private Boolean optional = null;

  @JsonProperty("is_set")
  private Boolean isSet = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("description")
  private String description = null;

  public ConfigNodePropertyInteger name(String name) {
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

  public ConfigNodePropertyInteger optional(Boolean optional) {
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

  public ConfigNodePropertyInteger isSet(Boolean isSet) {
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

  public ConfigNodePropertyInteger type(Integer type) {
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

  public ConfigNodePropertyInteger value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Property value
   * @return value
  **/
    public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ConfigNodePropertyInteger description(String description) {
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
    ConfigNodePropertyInteger configNodePropertyInteger = (ConfigNodePropertyInteger) o;
    return Objects.equals(name, configNodePropertyInteger.name) &&
        Objects.equals(optional, configNodePropertyInteger.optional) &&
        Objects.equals(isSet, configNodePropertyInteger.isSet) &&
        Objects.equals(type, configNodePropertyInteger.type) &&
        Objects.equals(value, configNodePropertyInteger.value) &&
        Objects.equals(description, configNodePropertyInteger.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, isSet, type, value, description);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigNodePropertyInteger {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    isSet: ").append(toIndentedString(isSet)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

