package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties   {
  @JsonProperty("sling.servlet.selectors")
  private ConfigNodePropertyArray slingServletSelectors = null;

  @JsonProperty("ecmaSuport")
  private ConfigNodePropertyBoolean ecmaSuport = null;

  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties slingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

   /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @Valid
  public ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties ecmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
    return this;
  }

   /**
   * Get ecmaSuport
   * @return ecmaSuport
  **/
  @Valid
  public ConfigNodePropertyBoolean getEcmaSuport() {
    return ecmaSuport;
  }

  public void setEcmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties orgApacheSlingServletsGetImplVersionVersionInfoServletProperties = (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties) o;
    return Objects.equals(slingServletSelectors, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties.slingServletSelectors) &&
        Objects.equals(ecmaSuport, orgApacheSlingServletsGetImplVersionVersionInfoServletProperties.ecmaSuport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletSelectors, ecmaSuport);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {\n");
    
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    ecmaSuport: ").append(toIndentedString(ecmaSuport)).append("\n");
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

