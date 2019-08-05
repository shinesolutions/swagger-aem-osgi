package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties   {
  @JsonProperty("org.apache.sling.scripting.sightly.js.bindings")
  private ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings = null;

  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties orgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
    return this;
  }

   /**
   * Get orgApacheSlingScriptingSightlyJsBindings
   * @return orgApacheSlingScriptingSightlyJsBindings
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getOrgApacheSlingScriptingSightlyJsBindings() {
    return orgApacheSlingScriptingSightlyJsBindings;
  }

  public void setOrgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties = (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties) o;
    return Objects.equals(this.orgApacheSlingScriptingSightlyJsBindings, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.orgApacheSlingScriptingSightlyJsBindings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingScriptingSightlyJsBindings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {\n");
    
    sb.append("    orgApacheSlingScriptingSightlyJsBindings: ").append(toIndentedString(orgApacheSlingScriptingSightlyJsBindings)).append("\n");
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

