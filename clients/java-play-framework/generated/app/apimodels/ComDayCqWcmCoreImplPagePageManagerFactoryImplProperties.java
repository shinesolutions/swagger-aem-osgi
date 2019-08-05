package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties   {
  @JsonProperty("illegalCharMapping")
  private ConfigNodePropertyString illegalCharMapping = null;

  @JsonProperty("pageSubTreeActivationCheck")
  private ConfigNodePropertyBoolean pageSubTreeActivationCheck = null;

  public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties illegalCharMapping(ConfigNodePropertyString illegalCharMapping) {
    this.illegalCharMapping = illegalCharMapping;
    return this;
  }

   /**
   * Get illegalCharMapping
   * @return illegalCharMapping
  **/
  @Valid
  public ConfigNodePropertyString getIllegalCharMapping() {
    return illegalCharMapping;
  }

  public void setIllegalCharMapping(ConfigNodePropertyString illegalCharMapping) {
    this.illegalCharMapping = illegalCharMapping;
  }

  public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties pageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
    this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
    return this;
  }

   /**
   * Get pageSubTreeActivationCheck
   * @return pageSubTreeActivationCheck
  **/
  @Valid
  public ConfigNodePropertyBoolean getPageSubTreeActivationCheck() {
    return pageSubTreeActivationCheck;
  }

  public void setPageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
    this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties comDayCqWcmCoreImplPagePageManagerFactoryImplProperties = (ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties) o;
    return Objects.equals(illegalCharMapping, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties.illegalCharMapping) &&
        Objects.equals(pageSubTreeActivationCheck, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties.pageSubTreeActivationCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(illegalCharMapping, pageSubTreeActivationCheck);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {\n");
    
    sb.append("    illegalCharMapping: ").append(toIndentedString(illegalCharMapping)).append("\n");
    sb.append("    pageSubTreeActivationCheck: ").append(toIndentedString(pageSubTreeActivationCheck)).append("\n");
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

