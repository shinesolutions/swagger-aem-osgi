package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteCsrfImplCSRFFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteCsrfImplCSRFFilterProperties   {
  @JsonProperty("filter.methods")
  private ConfigNodePropertyArray filterMethods = null;

  @JsonProperty("filter.enable.safe.user.agents")
  private ConfigNodePropertyBoolean filterEnableSafeUserAgents = null;

  @JsonProperty("filter.safe.user.agents")
  private ConfigNodePropertyArray filterSafeUserAgents = null;

  @JsonProperty("filter.excluded.paths")
  private ConfigNodePropertyArray filterExcludedPaths = null;

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
    return this;
  }

   /**
   * Get filterMethods
   * @return filterMethods
  **/
  @Valid
  public ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }

  public void setFilterMethods(ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterEnableSafeUserAgents(ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
    return this;
  }

   /**
   * Get filterEnableSafeUserAgents
   * @return filterEnableSafeUserAgents
  **/
  @Valid
  public ConfigNodePropertyBoolean getFilterEnableSafeUserAgents() {
    return filterEnableSafeUserAgents;
  }

  public void setFilterEnableSafeUserAgents(ConfigNodePropertyBoolean filterEnableSafeUserAgents) {
    this.filterEnableSafeUserAgents = filterEnableSafeUserAgents;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterSafeUserAgents(ConfigNodePropertyArray filterSafeUserAgents) {
    this.filterSafeUserAgents = filterSafeUserAgents;
    return this;
  }

   /**
   * Get filterSafeUserAgents
   * @return filterSafeUserAgents
  **/
  @Valid
  public ConfigNodePropertyArray getFilterSafeUserAgents() {
    return filterSafeUserAgents;
  }

  public void setFilterSafeUserAgents(ConfigNodePropertyArray filterSafeUserAgents) {
    this.filterSafeUserAgents = filterSafeUserAgents;
  }

  public ComAdobeGraniteCsrfImplCSRFFilterProperties filterExcludedPaths(ConfigNodePropertyArray filterExcludedPaths) {
    this.filterExcludedPaths = filterExcludedPaths;
    return this;
  }

   /**
   * Get filterExcludedPaths
   * @return filterExcludedPaths
  **/
  @Valid
  public ConfigNodePropertyArray getFilterExcludedPaths() {
    return filterExcludedPaths;
  }

  public void setFilterExcludedPaths(ConfigNodePropertyArray filterExcludedPaths) {
    this.filterExcludedPaths = filterExcludedPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCsrfImplCSRFFilterProperties comAdobeGraniteCsrfImplCSRFFilterProperties = (ComAdobeGraniteCsrfImplCSRFFilterProperties) o;
    return Objects.equals(filterMethods, comAdobeGraniteCsrfImplCSRFFilterProperties.filterMethods) &&
        Objects.equals(filterEnableSafeUserAgents, comAdobeGraniteCsrfImplCSRFFilterProperties.filterEnableSafeUserAgents) &&
        Objects.equals(filterSafeUserAgents, comAdobeGraniteCsrfImplCSRFFilterProperties.filterSafeUserAgents) &&
        Objects.equals(filterExcludedPaths, comAdobeGraniteCsrfImplCSRFFilterProperties.filterExcludedPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterMethods, filterEnableSafeUserAgents, filterSafeUserAgents, filterExcludedPaths);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCsrfImplCSRFFilterProperties {\n");
    
    sb.append("    filterMethods: ").append(toIndentedString(filterMethods)).append("\n");
    sb.append("    filterEnableSafeUserAgents: ").append(toIndentedString(filterEnableSafeUserAgents)).append("\n");
    sb.append("    filterSafeUserAgents: ").append(toIndentedString(filterSafeUserAgents)).append("\n");
    sb.append("    filterExcludedPaths: ").append(toIndentedString(filterExcludedPaths)).append("\n");
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

