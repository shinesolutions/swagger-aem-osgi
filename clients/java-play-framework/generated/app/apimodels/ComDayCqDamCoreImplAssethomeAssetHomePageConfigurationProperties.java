package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties   {
  @JsonProperty("isEnabled")
  @Valid

  private ConfigNodePropertyBoolean isEnabled;

  public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties isEnabled(ConfigNodePropertyBoolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
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
    return Objects.equals(isEnabled, comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

