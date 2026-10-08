package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger numberOfDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger ageOfFile;

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties numberOfDays(@Nullable ConfigNodePropertyInteger numberOfDays) {
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
  public @Nullable ConfigNodePropertyInteger getNumberOfDays() {
    return numberOfDays;
  }

  @JsonProperty("numberOfDays")
  public void setNumberOfDays(@Nullable ConfigNodePropertyInteger numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties ageOfFile(@Nullable ConfigNodePropertyInteger ageOfFile) {
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
  public @Nullable ConfigNodePropertyInteger getAgeOfFile() {
    return ageOfFile;
  }

  @JsonProperty("ageOfFile")
  public void setAgeOfFile(@Nullable ConfigNodePropertyInteger ageOfFile) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

