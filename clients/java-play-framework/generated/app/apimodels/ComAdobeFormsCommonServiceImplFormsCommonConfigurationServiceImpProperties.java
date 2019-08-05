package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties   {
  @JsonProperty("tempStorageConfig")
  private ConfigNodePropertyDropDown tempStorageConfig = null;

  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties tempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig) {
    this.tempStorageConfig = tempStorageConfig;
    return this;
  }

   /**
   * Get tempStorageConfig
   * @return tempStorageConfig
  **/
  @Valid
  public ConfigNodePropertyDropDown getTempStorageConfig() {
    return tempStorageConfig;
  }

  public void setTempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig) {
    this.tempStorageConfig = tempStorageConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties = (ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties) o;
    return Objects.equals(tempStorageConfig, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.tempStorageConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempStorageConfig);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties {\n");
    
    sb.append("    tempStorageConfig: ").append(toIndentedString(tempStorageConfig)).append("\n");
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

