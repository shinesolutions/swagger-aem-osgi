package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.cqDamDrmEnable, comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.cqDamDrmEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamDrmEnable);
  }

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

