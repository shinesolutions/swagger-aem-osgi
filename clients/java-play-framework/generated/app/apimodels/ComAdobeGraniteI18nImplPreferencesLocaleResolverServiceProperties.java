package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties   {
  @JsonProperty("security.preferences.name")
  private ConfigNodePropertyString securityPreferencesName = null;

  public ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties securityPreferencesName(ConfigNodePropertyString securityPreferencesName) {
    this.securityPreferencesName = securityPreferencesName;
    return this;
  }

   /**
   * Get securityPreferencesName
   * @return securityPreferencesName
  **/
  @Valid
  public ConfigNodePropertyString getSecurityPreferencesName() {
    return securityPreferencesName;
  }

  public void setSecurityPreferencesName(ConfigNodePropertyString securityPreferencesName) {
    this.securityPreferencesName = securityPreferencesName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties = (ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties) o;
    return Objects.equals(securityPreferencesName, comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.securityPreferencesName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityPreferencesName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {\n");
    
    sb.append("    securityPreferencesName: ").append(toIndentedString(securityPreferencesName)).append("\n");
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

