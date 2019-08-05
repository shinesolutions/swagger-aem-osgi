package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplLightboxLightboxServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplLightboxLightboxServletProperties   {
  @JsonProperty("sling.servlet.paths")
  private ConfigNodePropertyString slingServletPaths = null;

  @JsonProperty("sling.servlet.methods")
  private ConfigNodePropertyArray slingServletMethods = null;

  @JsonProperty("cq.dam.enable.anonymous")
  private ConfigNodePropertyBoolean cqDamEnableAnonymous = null;

  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

   /**
   * Get slingServletPaths
   * @return slingServletPaths
  **/
  @Valid
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

   /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @Valid
  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamCoreImplLightboxLightboxServletProperties cqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
    return this;
  }

   /**
   * Get cqDamEnableAnonymous
   * @return cqDamEnableAnonymous
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamEnableAnonymous() {
    return cqDamEnableAnonymous;
  }

  public void setCqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplLightboxLightboxServletProperties comDayCqDamCoreImplLightboxLightboxServletProperties = (ComDayCqDamCoreImplLightboxLightboxServletProperties) o;
    return Objects.equals(slingServletPaths, comDayCqDamCoreImplLightboxLightboxServletProperties.slingServletPaths) &&
        Objects.equals(slingServletMethods, comDayCqDamCoreImplLightboxLightboxServletProperties.slingServletMethods) &&
        Objects.equals(cqDamEnableAnonymous, comDayCqDamCoreImplLightboxLightboxServletProperties.cqDamEnableAnonymous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletPaths, slingServletMethods, cqDamEnableAnonymous);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplLightboxLightboxServletProperties {\n");
    
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    cqDamEnableAnonymous: ").append(toIndentedString(cqDamEnableAnonymous)).append("\n");
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

