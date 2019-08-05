package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties   {
  @JsonProperty("cq.dam.drm.enable")
  private ConfigNodePropertyBoolean cqDamDrmEnable = null;

  public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties cqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
    return this;
  }

   /**
   * Get cqDamDrmEnable
   * @return cqDamDrmEnable
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamDrmEnable() {
    return cqDamDrmEnable;
  }

  public void setCqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties = (ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties) o;
    return Objects.equals(cqDamDrmEnable, comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.cqDamDrmEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamDrmEnable);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties {\n");
    
    sb.append("    cqDamDrmEnable: ").append(toIndentedString(cqDamDrmEnable)).append("\n");
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

