package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties   {
  
  private ConfigNodePropertyDropDown tempStorageConfig = null;

  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties () {

  }

  public ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties (ConfigNodePropertyDropDown tempStorageConfig) {
    this.tempStorageConfig = tempStorageConfig;
  }

    
  @JsonProperty("tempStorageConfig")
  public ConfigNodePropertyDropDown getTempStorageConfig() {
    return tempStorageConfig;
  }
  public void setTempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig) {
    this.tempStorageConfig = tempStorageConfig;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
