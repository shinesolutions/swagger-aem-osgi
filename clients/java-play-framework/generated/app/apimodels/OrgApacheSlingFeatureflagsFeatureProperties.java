package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingFeatureflagsFeatureProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingFeatureflagsFeatureProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("description")
  private ConfigNodePropertyString description = null;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  public OrgApacheSlingFeatureflagsFeatureProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingFeatureflagsFeatureProperties description(ConfigNodePropertyString description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Valid
  public ConfigNodePropertyString getDescription() {
    return description;
  }

  public void setDescription(ConfigNodePropertyString description) {
    this.description = description;
  }

  public OrgApacheSlingFeatureflagsFeatureProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingFeatureflagsFeatureProperties orgApacheSlingFeatureflagsFeatureProperties = (OrgApacheSlingFeatureflagsFeatureProperties) o;
    return Objects.equals(name, orgApacheSlingFeatureflagsFeatureProperties.name) &&
        Objects.equals(description, orgApacheSlingFeatureflagsFeatureProperties.description) &&
        Objects.equals(enabled, orgApacheSlingFeatureflagsFeatureProperties.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, enabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingFeatureflagsFeatureProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

