package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties   {
  @JsonProperty("java.classdebuginfo")
  @Valid

  private ConfigNodePropertyBoolean javaClassdebuginfo;

  @JsonProperty("java.javaEncoding")
  @Valid

  private ConfigNodePropertyString javaJavaEncoding;

  @JsonProperty("java.compilerSourceVM")
  @Valid

  private ConfigNodePropertyString javaCompilerSourceVM;

  @JsonProperty("java.compilerTargetVM")
  @Valid

  private ConfigNodePropertyString javaCompilerTargetVM;

  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaClassdebuginfo(ConfigNodePropertyBoolean javaClassdebuginfo) {
    this.javaClassdebuginfo = javaClassdebuginfo;
    return this;
  }

   /**
   * Get javaClassdebuginfo
   * @return javaClassdebuginfo
  **/
  public ConfigNodePropertyBoolean getJavaClassdebuginfo() {
    return javaClassdebuginfo;
  }

  public void setJavaClassdebuginfo(ConfigNodePropertyBoolean javaClassdebuginfo) {
    this.javaClassdebuginfo = javaClassdebuginfo;
  }

  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaJavaEncoding(ConfigNodePropertyString javaJavaEncoding) {
    this.javaJavaEncoding = javaJavaEncoding;
    return this;
  }

   /**
   * Get javaJavaEncoding
   * @return javaJavaEncoding
  **/
  public ConfigNodePropertyString getJavaJavaEncoding() {
    return javaJavaEncoding;
  }

  public void setJavaJavaEncoding(ConfigNodePropertyString javaJavaEncoding) {
    this.javaJavaEncoding = javaJavaEncoding;
  }

  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaCompilerSourceVM(ConfigNodePropertyString javaCompilerSourceVM) {
    this.javaCompilerSourceVM = javaCompilerSourceVM;
    return this;
  }

   /**
   * Get javaCompilerSourceVM
   * @return javaCompilerSourceVM
  **/
  public ConfigNodePropertyString getJavaCompilerSourceVM() {
    return javaCompilerSourceVM;
  }

  public void setJavaCompilerSourceVM(ConfigNodePropertyString javaCompilerSourceVM) {
    this.javaCompilerSourceVM = javaCompilerSourceVM;
  }

  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaCompilerTargetVM(ConfigNodePropertyString javaCompilerTargetVM) {
    this.javaCompilerTargetVM = javaCompilerTargetVM;
    return this;
  }

   /**
   * Get javaCompilerTargetVM
   * @return javaCompilerTargetVM
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

