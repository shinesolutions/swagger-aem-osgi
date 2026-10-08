package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("isEnabled")
  private ConfigNodePropertyBoolean isEnabled;

  /**
   * 
   * @return isEnabled
   */
  public ConfigNodePropertyBoolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(ConfigNodePropertyBoolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties = (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties) o;
    return Objects.equals(this.isEnabled, comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
