package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingStartupfilterImplStartupFilterImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingStartupfilterImplStartupFilterImplProperties   {
  @JsonProperty("active.by.default")
  private ConfigNodePropertyBoolean activeByDefault = null;

  @JsonProperty("default.message")
  private ConfigNodePropertyString defaultMessage = null;

  public OrgApacheSlingStartupfilterImplStartupFilterImplProperties activeByDefault(ConfigNodePropertyBoolean activeByDefault) {
    this.activeByDefault = activeByDefault;
    return this;
  }

   /**
   * Get activeByDefault
   * @return activeByDefault
  **/
  @Valid
  public ConfigNodePropertyBoolean getActiveByDefault() {
    return activeByDefault;
  }

  public void setActiveByDefault(ConfigNodePropertyBoolean activeByDefault) {
    this.activeByDefault = activeByDefault;
  }

  public OrgApacheSlingStartupfilterImplStartupFilterImplProperties defaultMessage(ConfigNodePropertyString defaultMessage) {
    this.defaultMessage = defaultMessage;
    return this;
  }

   /**
   * Get defaultMessage
   * @return defaultMessage
  **/
  @Valid
  public ConfigNodePropertyString getDefaultMessage() {
    return defaultMessage;
  }

  public void setDefaultMessage(ConfigNodePropertyString defaultMessage) {
    this.defaultMessage = defaultMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties orgApacheSlingStartupfilterImplStartupFilterImplProperties = (OrgApacheSlingStartupfilterImplStartupFilterImplProperties) o;
    return Objects.equals(activeByDefault, orgApacheSlingStartupfilterImplStartupFilterImplProperties.activeByDefault) &&
        Objects.equals(defaultMessage, orgApacheSlingStartupfilterImplStartupFilterImplProperties.defaultMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeByDefault, defaultMessage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingStartupfilterImplStartupFilterImplProperties {\n");
    
    sb.append("    activeByDefault: ").append(toIndentedString(activeByDefault)).append("\n");
    sb.append("    defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
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

