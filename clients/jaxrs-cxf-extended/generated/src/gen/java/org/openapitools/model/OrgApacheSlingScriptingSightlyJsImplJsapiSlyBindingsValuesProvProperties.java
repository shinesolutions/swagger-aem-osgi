package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings;
 /**
  * Get orgApacheSlingScriptingSightlyJsBindings
  * @return orgApacheSlingScriptingSightlyJsBindings
  */
  @JsonProperty("org.apache.sling.scripting.sightly.js.bindings")
  public ConfigNodePropertyArray getOrgApacheSlingScriptingSightlyJsBindings() {
    return orgApacheSlingScriptingSightlyJsBindings;
  }

  /**
   * Sets the <code>orgApacheSlingScriptingSightlyJsBindings</code> property.
   */
 public void setOrgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
  }

  /**
   * Sets the <code>orgApacheSlingScriptingSightlyJsBindings</code> property.
   */
  public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties orgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray orgApacheSlingScriptingSightlyJsBindings) {
    this.orgApacheSlingScriptingSightlyJsBindings = orgApacheSlingScriptingSightlyJsBindings;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

