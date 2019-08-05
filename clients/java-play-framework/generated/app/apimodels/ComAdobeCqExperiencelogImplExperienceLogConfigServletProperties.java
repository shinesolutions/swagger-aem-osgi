package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties   {
  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled = null;

  @JsonProperty("disabledForGroups")
  private ConfigNodePropertyArray disabledForGroups = null;

  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties disabledForGroups(ConfigNodePropertyArray disabledForGroups) {
    this.disabledForGroups = disabledForGroups;
    return this;
  }

   /**
   * Get disabledForGroups
   * @return disabledForGroups
  **/
  @Valid
  public ConfigNodePropertyArray getDisabledForGroups() {
    return disabledForGroups;
  }

  public void setDisabledForGroups(ConfigNodePropertyArray disabledForGroups) {
    this.disabledForGroups = disabledForGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties comAdobeCqExperiencelogImplExperienceLogConfigServletProperties = (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties) o;
    return Objects.equals(enabled, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties.enabled) &&
        Objects.equals(disabledForGroups, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties.disabledForGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, disabledForGroups);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    disabledForGroups: ").append(toIndentedString(disabledForGroups)).append("\n");
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

