package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel;
 /**
   * Get orgApacheSlingScriptingJavascriptRhinoOptLevel
   * @return orgApacheSlingScriptingJavascriptRhinoOptLevel
  **/
  @JsonProperty("org.apache.sling.scripting.javascript.rhino.optLevel")
  public ConfigNodePropertyInteger getOrgApacheSlingScriptingJavascriptRhinoOptLevel() {
    return orgApacheSlingScriptingJavascriptRhinoOptLevel;
  }

  public void setOrgApacheSlingScriptingJavascriptRhinoOptLevel(ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel) {
    this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
  }

  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties orgApacheSlingScriptingJavascriptRhinoOptLevel(ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel) {
    this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
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
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties = (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties) o;
    return Objects.equals(this.orgApacheSlingScriptingJavascriptRhinoOptLevel, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.orgApacheSlingScriptingJavascriptRhinoOptLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingScriptingJavascriptRhinoOptLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {\n");
    
    sb.append("    orgApacheSlingScriptingJavascriptRhinoOptLevel: ").append(toIndentedString(orgApacheSlingScriptingJavascriptRhinoOptLevel)).append("\n");
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

