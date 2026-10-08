package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {

  private ConfigNodePropertyInteger numberOfDays;

  private ConfigNodePropertyInteger ageOfFile;

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties numberOfDays(ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }

  /**
   * Get numberOfDays
   * @return numberOfDays
   */
  @Valid 
  @Schema(name = "numberOfDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfDays")
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
   */
  @Valid 
  @Schema(name = "ageOfFile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.numberOfDays, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.numberOfDays) &&
        Objects.equals(this.ageOfFile, comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.ageOfFile);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

