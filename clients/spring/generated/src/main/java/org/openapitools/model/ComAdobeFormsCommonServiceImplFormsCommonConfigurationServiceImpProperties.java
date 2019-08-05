package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

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
  @ApiModelProperty(value = "")

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
    return Objects.equals(this.tempStorageConfig, comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.tempStorageConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempStorageConfig);
  }

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

