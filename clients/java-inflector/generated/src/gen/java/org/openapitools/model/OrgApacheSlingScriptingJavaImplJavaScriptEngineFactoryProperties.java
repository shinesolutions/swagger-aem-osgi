package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties   {
  @JsonProperty("java.classdebuginfo")
  private ConfigNodePropertyBoolean javaClassdebuginfo = null;

  @JsonProperty("java.javaEncoding")
  private ConfigNodePropertyString javaJavaEncoding = null;

  @JsonProperty("java.compilerSourceVM")
  private ConfigNodePropertyString javaCompilerSourceVM = null;

  @JsonProperty("java.compilerTargetVM")
  private ConfigNodePropertyString javaCompilerTargetVM = null;

  /**
   **/
  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaClassdebuginfo(ConfigNodePropertyBoolean javaClassdebuginfo) {
    this.javaClassdebuginfo = javaClassdebuginfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("java.classdebuginfo")
  public ConfigNodePropertyBoolean getJavaClassdebuginfo() {
    return javaClassdebuginfo;
  }
  public void setJavaClassdebuginfo(ConfigNodePropertyBoolean javaClassdebuginfo) {
    this.javaClassdebuginfo = javaClassdebuginfo;
  }

  /**
   **/
  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaJavaEncoding(ConfigNodePropertyString javaJavaEncoding) {
    this.javaJavaEncoding = javaJavaEncoding;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("java.javaEncoding")
  public ConfigNodePropertyString getJavaJavaEncoding() {
    return javaJavaEncoding;
  }
  public void setJavaJavaEncoding(ConfigNodePropertyString javaJavaEncoding) {
    this.javaJavaEncoding = javaJavaEncoding;
  }

  /**
   **/
  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaCompilerSourceVM(ConfigNodePropertyString javaCompilerSourceVM) {
    this.javaCompilerSourceVM = javaCompilerSourceVM;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("java.compilerSourceVM")
  public ConfigNodePropertyString getJavaCompilerSourceVM() {
    return javaCompilerSourceVM;
  }
  public void setJavaCompilerSourceVM(ConfigNodePropertyString javaCompilerSourceVM) {
    this.javaCompilerSourceVM = javaCompilerSourceVM;
  }

  /**
   **/
  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaCompilerTargetVM(ConfigNodePropertyString javaCompilerTargetVM) {
    this.javaCompilerTargetVM = javaCompilerTargetVM;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("java.compilerTargetVM")
  public ConfigNodePropertyString getJavaCompilerTargetVM() {
    return javaCompilerTargetVM;
  }
  public void setJavaCompilerTargetVM(ConfigNodePropertyString javaCompilerTargetVM) {
    this.javaCompilerTargetVM = javaCompilerTargetVM;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

