package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties   {
  @JsonProperty("enable")
  private ConfigNodePropertyBoolean enable = null;

  @JsonProperty("ttl1")
  private ConfigNodePropertyInteger ttl1 = null;

  @JsonProperty("ttl2")
  private ConfigNodePropertyInteger ttl2 = null;

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Valid
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl1(ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
    return this;
  }

   /**
   * Get ttl1
   * @return ttl1
  **/
  @Valid
  public ConfigNodePropertyInteger getTtl1() {
    return ttl1;
  }

  public void setTtl1(ConfigNodePropertyInteger ttl1) {
    this.ttl1 = ttl1;
  }

  public ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties ttl2(ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
    return this;
  }

   /**
   * Get ttl2
   * @return ttl2
  **/
  @Valid
  public ConfigNodePropertyInteger getTtl2() {
    return ttl2;
  }

  public void setTtl2(ConfigNodePropertyInteger ttl2) {
    this.ttl2 = ttl2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties = (ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties) o;
    return Objects.equals(enable, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.enable) &&
        Objects.equals(ttl1, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl1) &&
        Objects.equals(ttl2, comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.ttl2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, ttl1, ttl2);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ttl1: ").append(toIndentedString(ttl1)).append("\n");
    sb.append("    ttl2: ").append(toIndentedString(ttl2)).append("\n");
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

