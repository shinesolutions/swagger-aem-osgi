package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties   {
  @JsonProperty("providerType")
  private ConfigNodePropertyDropDown providerType = null;

  public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties providerType(ConfigNodePropertyDropDown providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * Get providerType
   * @return providerType
  **/
  @Valid
  public ConfigNodePropertyDropDown getProviderType() {
    return providerType;
  }

  public void setProviderType(ConfigNodePropertyDropDown providerType) {
    this.providerType = providerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

