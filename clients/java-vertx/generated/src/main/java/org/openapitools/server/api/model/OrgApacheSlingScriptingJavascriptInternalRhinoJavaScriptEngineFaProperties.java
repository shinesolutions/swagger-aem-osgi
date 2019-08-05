package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties   {
  
  private ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel = null;

  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties () {

  }

  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties (ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel) {
    this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
  }

    
  @JsonProperty("org.apache.sling.scripting.javascript.rhino.optLevel")
  public ConfigNodePropertyInteger getOrgApacheSlingScriptingJavascriptRhinoOptLevel() {
    return orgApacheSlingScriptingJavascriptRhinoOptLevel;
  }
  public void setOrgApacheSlingScriptingJavascriptRhinoOptLevel(ConfigNodePropertyInteger orgApacheSlingScriptingJavascriptRhinoOptLevel) {
    this.orgApacheSlingScriptingJavascriptRhinoOptLevel = orgApacheSlingScriptingJavascriptRhinoOptLevel;
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
    return Objects.equals(orgApacheSlingScriptingJavascriptRhinoOptLevel, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.orgApacheSlingScriptingJavascriptRhinoOptLevel);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
