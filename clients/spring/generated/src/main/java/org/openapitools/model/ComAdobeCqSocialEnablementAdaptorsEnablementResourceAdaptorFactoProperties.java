package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties
 */

@JsonTypeName("comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean isMemberCheck;

  public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties isMemberCheck(@Nullable ConfigNodePropertyBoolean isMemberCheck) {
    this.isMemberCheck = isMemberCheck;
    return this;
  }

  /**
   * Get isMemberCheck
   * @return isMemberCheck
   */
  @Valid 
  @Schema(name = "isMemberCheck", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isMemberCheck")
  public @Nullable ConfigNodePropertyBoolean getIsMemberCheck() {
    return isMemberCheck;
  }

  @JsonProperty("isMemberCheck")
  public void setIsMemberCheck(@Nullable ConfigNodePropertyBoolean isMemberCheck) {
    this.isMemberCheck = isMemberCheck;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties = (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties) o;
    return Objects.equals(this.isMemberCheck, comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.isMemberCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMemberCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties {\n");
    sb.append("    isMemberCheck: ").append(toIndentedString(isMemberCheck)).append("\n");
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

