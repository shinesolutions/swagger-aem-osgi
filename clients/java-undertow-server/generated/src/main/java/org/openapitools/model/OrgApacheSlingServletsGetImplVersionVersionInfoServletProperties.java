package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties   {
  
  private ConfigNodePropertyArray slingServletSelectors = null;
  private ConfigNodePropertyBoolean ecmaSuport = null;

  /**
   **/
  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties slingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  /**
   **/
  public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties ecmaSuport(ConfigNodePropertyBoolean ecmaSuport) {
    this.ecmaSuport = ecmaSuport;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ecmaSuport")
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

