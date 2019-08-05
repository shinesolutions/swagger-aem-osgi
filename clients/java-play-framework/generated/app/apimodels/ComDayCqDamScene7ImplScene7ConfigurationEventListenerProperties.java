package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties   {
  @JsonProperty("cq.dam.scene7.configurationeventlistener.enabled")
  private ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled = null;

  public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties cqDamScene7ConfigurationeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled) {
    this.cqDamScene7ConfigurationeventlistenerEnabled = cqDamScene7ConfigurationeventlistenerEnabled;
    return this;
  }

   /**
   * Get cqDamScene7ConfigurationeventlistenerEnabled
   * @return cqDamScene7ConfigurationeventlistenerEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamScene7ConfigurationeventlistenerEnabled() {
    return cqDamScene7ConfigurationeventlistenerEnabled;
  }

  public void setCqDamScene7ConfigurationeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7ConfigurationeventlistenerEnabled) {
    this.cqDamScene7ConfigurationeventlistenerEnabled = cqDamScene7ConfigurationeventlistenerEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties = (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties) o;
    return Objects.equals(cqDamScene7ConfigurationeventlistenerEnabled, comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.cqDamScene7ConfigurationeventlistenerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7ConfigurationeventlistenerEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {\n");
    
    sb.append("    cqDamScene7ConfigurationeventlistenerEnabled: ").append(toIndentedString(cqDamScene7ConfigurationeventlistenerEnabled)).append("\n");
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

