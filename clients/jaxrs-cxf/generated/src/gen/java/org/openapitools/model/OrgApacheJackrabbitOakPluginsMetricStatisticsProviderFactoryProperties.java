package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyDropDown providerType;
 /**
   * Get providerType
   * @return providerType
  **/
  @JsonProperty("providerType")
  public ConfigNodePropertyDropDown getProviderType() {
    return providerType;
  }

  public void setProviderType(ConfigNodePropertyDropDown providerType) {
    this.providerType = providerType;
  }

  public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties providerType(ConfigNodePropertyDropDown providerType) {
    this.providerType = providerType;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties = (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties) o;
    return Objects.equals(this.providerType, orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.providerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties {\n");
    
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

