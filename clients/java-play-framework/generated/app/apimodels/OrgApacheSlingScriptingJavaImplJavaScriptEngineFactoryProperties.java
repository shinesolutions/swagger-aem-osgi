package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties   {
  @JsonProperty("java.classdebuginfo")
  private ConfigNodePropertyBoolean javaClassdebuginfo = null;

  @JsonProperty("java.javaEncoding")
  private ConfigNodePropertyString javaJavaEncoding = null;

  @JsonProperty("java.compilerSourceVM")
  private ConfigNodePropertyString javaCompilerSourceVM = null;

  @JsonProperty("java.compilerTargetVM")
  private ConfigNodePropertyString javaCompilerTargetVM = null;

  public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties javaClassdebuginfo(ConfigNodePropertyBoolean javaClassdebuginfo) {
    this.javaClassdebuginfo = javaClassdebuginfo;
    return this;
  }

   /**
   * Get javaClassdebuginfo
   * @return javaClassdebuginfo
  **/
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

