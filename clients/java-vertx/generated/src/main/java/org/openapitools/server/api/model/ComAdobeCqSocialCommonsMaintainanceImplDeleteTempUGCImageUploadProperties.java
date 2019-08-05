package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties   {
  
  private ConfigNodePropertyInteger numberOfDays = null;
  private ConfigNodePropertyInteger ageOfFile = null;

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties () {

  }

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties (ConfigNodePropertyInteger numberOfDays, ConfigNodePropertyInteger ageOfFile) {
    this.numberOfDays = numberOfDays;
    this.ageOfFile = ageOfFile;
  }

    
  @JsonProperty("numberOfDays")
  public ConfigNodePropertyInteger getNumberOfDays() {
    return numberOfDays;
  }
  public void setNumberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

    
  @JsonProperty("ageOfFile")
  public ConfigNodePropertyInteger getAgeOfFile() {
    return ageOfFile;
  }
  public void setAgeOfFile(ConfigNodePropertyInteger ageOfFile) {
    this.ageOfFile = ageOfFile;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
