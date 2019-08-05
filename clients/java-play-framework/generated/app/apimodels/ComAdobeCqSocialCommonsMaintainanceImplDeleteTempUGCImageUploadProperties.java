package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties   {
  @JsonProperty("numberOfDays")
  private ConfigNodePropertyInteger numberOfDays = null;

  @JsonProperty("ageOfFile")
  private ConfigNodePropertyInteger ageOfFile = null;

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties numberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }

   /**
   * Get numberOfDays
   * @return numberOfDays
  **/
  @Valid
  public ConfigNodePropertyInteger getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties ageOfFile(ConfigNodePropertyInteger ageOfFile) {
    this.ageOfFile = ageOfFile;
    return this;
  }

   /**
   * Get ageOfFile
   * @return ageOfFile
  **/
  @Valid
  public ConfigNodePropertyInteger getAgeOfFile() {
    return ageOfFile;
  }

  public void setAgeOfFile(ConfigNodePropertyInteger ageOfFile) {
    this.ageOfFile = ageOfFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties = (ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties) o;
    return Objects.equals(numberOfDays, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.numberOfDays) &&
        Objects.equals(ageOfFile, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.ageOfFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfDays, ageOfFile);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {\n");
    
    sb.append("    numberOfDays: ").append(toIndentedString(numberOfDays)).append("\n");
    sb.append("    ageOfFile: ").append(toIndentedString(ageOfFile)).append("\n");
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

