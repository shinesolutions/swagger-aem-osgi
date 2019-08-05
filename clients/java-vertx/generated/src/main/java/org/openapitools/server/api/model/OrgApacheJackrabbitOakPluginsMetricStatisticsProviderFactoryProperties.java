package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties   {
  
  private ConfigNodePropertyDropDown providerType = null;

  public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties () {

  }

  public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties (ConfigNodePropertyDropDown providerType) {
    this.providerType = providerType;
  }

    
  @JsonProperty("providerType")
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
    return Objects.equals(providerType, orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.providerType);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
