package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties   {
  
  private ConfigNodePropertyBoolean javaClassdebuginfo = null;
  private ConfigNodePropertyString javaJavaEncoding = null;
  private ConfigNodePropertyString javaCompilerSourceVM = null;
  private ConfigNodePropertyString javaCompilerTargetVM = null;

  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties () {

  }

  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties (ConfigNodePropertyBoolean javaClassdebuginfo, ConfigNodePropertyString javaJavaEncoding, ConfigNodePropertyString javaCompilerSourceVM, ConfigNodePropertyString javaCompilerTargetVM) {
    this.javaClassdebuginfo = javaClassdebuginfo;
    this.javaJavaEncoding = javaJavaEncoding;
    this.javaCompilerSourceVM = javaCompilerSourceVM;
    this.javaCompilerTargetVM = javaCompilerTargetVM;
  }

    
  @JsonProperty("java.classdebuginfo")
  public ConfigNodePropertyBoolean getJavaClassdebuginfo() {
    return javaClassdebuginfo;
  }
  public void setJavaClassdebuginfo(ConfigNodePropertyBoolean javaClassdebuginfo) {
    this.javaClassdebuginfo = javaClassdebuginfo;
  }

    
  @JsonProperty("java.javaEncoding")
  public ConfigNodePropertyString getJavaJavaEncoding() {
    return javaJavaEncoding;
  }
  public void setJavaJavaEncoding(ConfigNodePropertyString javaJavaEncoding) {
    this.javaJavaEncoding = javaJavaEncoding;
  }

    
  @JsonProperty("java.compilerSourceVM")
  public ConfigNodePropertyString getJavaCompilerSourceVM() {
    return javaCompilerSourceVM;
  }
  public void setJavaCompilerSourceVM(ConfigNodePropertyString javaCompilerSourceVM) {
    this.javaCompilerSourceVM = javaCompilerSourceVM;
  }

    
  @JsonProperty("java.compilerTargetVM")
  public ConfigNodePropertyString getJavaCompilerTargetVM() {
    return javaCompilerTargetVM;
  }
  public void setJavaCompilerTargetVM(ConfigNodePropertyString javaCompilerTargetVM) {
    this.javaCompilerTargetVM = javaCompilerTargetVM;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties = (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties) o;
    return Objects.equals(javaClassdebuginfo, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.javaClassdebuginfo) &&
        Objects.equals(javaJavaEncoding, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.javaJavaEncoding) &&
        Objects.equals(javaCompilerSourceVM, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.javaCompilerSourceVM) &&
        Objects.equals(javaCompilerTargetVM, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.javaCompilerTargetVM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(javaClassdebuginfo, javaJavaEncoding, javaCompilerSourceVM, javaCompilerTargetVM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {\n");
    
    sb.append("    javaClassdebuginfo: ").append(toIndentedString(javaClassdebuginfo)).append("\n");
    sb.append("    javaJavaEncoding: ").append(toIndentedString(javaJavaEncoding)).append("\n");
    sb.append("    javaCompilerSourceVM: ").append(toIndentedString(javaCompilerSourceVM)).append("\n");
    sb.append("    javaCompilerTargetVM: ").append(toIndentedString(javaCompilerTargetVM)).append("\n");
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
