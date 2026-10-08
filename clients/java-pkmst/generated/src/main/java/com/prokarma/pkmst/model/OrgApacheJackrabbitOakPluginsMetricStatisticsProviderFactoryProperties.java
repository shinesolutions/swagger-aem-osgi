package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties   {
  @JsonProperty("providerType")
  private ConfigNodePropertyDropDown providerType;

  public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties providerType(ConfigNodePropertyDropDown providerType) {
    this.providerType = providerType;
    return this;
  }

  /**
   * Get providerType
   * @return providerType
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getProviderType() {
    return providerType;
  }

  public void setProviderType(ConfigNodePropertyDropDown providerType) {
    this.providerType = providerType;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

