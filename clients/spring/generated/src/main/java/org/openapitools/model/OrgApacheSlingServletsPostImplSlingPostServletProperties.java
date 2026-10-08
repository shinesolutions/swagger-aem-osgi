package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingServletsPostImplSlingPostServletProperties
 */

@JsonTypeName("orgApacheSlingServletsPostImplSlingPostServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingServletsPostImplSlingPostServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray servletPostDateFormats;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray servletPostNodeNameHints;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger servletPostNodeNameMaxLength;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean servletPostAutoCheckout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean servletPostAutoCheckin;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString servletPostIgnorePattern;

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostDateFormats(@Nullable ConfigNodePropertyArray servletPostDateFormats) {
    this.servletPostDateFormats = servletPostDateFormats;
    return this;
  }

  /**
   * Get servletPostDateFormats
   * @return servletPostDateFormats
   */
  @Valid 
  @Schema(name = "servlet.post.dateFormats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servlet.post.dateFormats")
  public @Nullable ConfigNodePropertyArray getServletPostDateFormats() {
    return servletPostDateFormats;
  }

  @JsonProperty("servlet.post.dateFormats")
  public void setServletPostDateFormats(@Nullable ConfigNodePropertyArray servletPostDateFormats) {
    this.servletPostDateFormats = servletPostDateFormats;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostNodeNameHints(@Nullable ConfigNodePropertyArray servletPostNodeNameHints) {
    this.servletPostNodeNameHints = servletPostNodeNameHints;
    return this;
  }

  /**
   * Get servletPostNodeNameHints
   * @return servletPostNodeNameHints
   */
  @Valid 
  @Schema(name = "servlet.post.nodeNameHints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servlet.post.nodeNameHints")
  public @Nullable ConfigNodePropertyArray getServletPostNodeNameHints() {
    return servletPostNodeNameHints;
  }

  @JsonProperty("servlet.post.nodeNameHints")
  public void setServletPostNodeNameHints(@Nullable ConfigNodePropertyArray servletPostNodeNameHints) {
    this.servletPostNodeNameHints = servletPostNodeNameHints;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostNodeNameMaxLength(@Nullable ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
    this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
    return this;
  }

  /**
   * Get servletPostNodeNameMaxLength
   * @return servletPostNodeNameMaxLength
   */
  @Valid 
  @Schema(name = "servlet.post.nodeNameMaxLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servlet.post.nodeNameMaxLength")
  public @Nullable ConfigNodePropertyInteger getServletPostNodeNameMaxLength() {
    return servletPostNodeNameMaxLength;
  }

  @JsonProperty("servlet.post.nodeNameMaxLength")
  public void setServletPostNodeNameMaxLength(@Nullable ConfigNodePropertyInteger servletPostNodeNameMaxLength) {
    this.servletPostNodeNameMaxLength = servletPostNodeNameMaxLength;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostCheckinNewVersionableNodes(@Nullable ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
    this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
    return this;
  }

  /**
   * Get servletPostCheckinNewVersionableNodes
   * @return servletPostCheckinNewVersionableNodes
   */
  @Valid 
  @Schema(name = "servlet.post.checkinNewVersionableNodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servlet.post.checkinNewVersionableNodes")
  public @Nullable ConfigNodePropertyBoolean getServletPostCheckinNewVersionableNodes() {
    return servletPostCheckinNewVersionableNodes;
  }

  @JsonProperty("servlet.post.checkinNewVersionableNodes")
  public void setServletPostCheckinNewVersionableNodes(@Nullable ConfigNodePropertyBoolean servletPostCheckinNewVersionableNodes) {
    this.servletPostCheckinNewVersionableNodes = servletPostCheckinNewVersionableNodes;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostAutoCheckout(@Nullable ConfigNodePropertyBoolean servletPostAutoCheckout) {
    this.servletPostAutoCheckout = servletPostAutoCheckout;
    return this;
  }

  /**
   * Get servletPostAutoCheckout
   * @return servletPostAutoCheckout
   */
  @Valid 
  @Schema(name = "servlet.post.autoCheckout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servlet.post.autoCheckout")
  public @Nullable ConfigNodePropertyBoolean getServletPostAutoCheckout() {
    return servletPostAutoCheckout;
  }

  @JsonProperty("servlet.post.autoCheckout")
  public void setServletPostAutoCheckout(@Nullable ConfigNodePropertyBoolean servletPostAutoCheckout) {
    this.servletPostAutoCheckout = servletPostAutoCheckout;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostAutoCheckin(@Nullable ConfigNodePropertyBoolean servletPostAutoCheckin) {
    this.servletPostAutoCheckin = servletPostAutoCheckin;
    return this;
  }

  /**
   * Get servletPostAutoCheckin
   * @return servletPostAutoCheckin
   */
  @Valid 
  @Schema(name = "servlet.post.autoCheckin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servlet.post.autoCheckin")
  public @Nullable ConfigNodePropertyBoolean getServletPostAutoCheckin() {
    return servletPostAutoCheckin;
  }

  @JsonProperty("servlet.post.autoCheckin")
  public void setServletPostAutoCheckin(@Nullable ConfigNodePropertyBoolean servletPostAutoCheckin) {
    this.servletPostAutoCheckin = servletPostAutoCheckin;
  }

  public OrgApacheSlingServletsPostImplSlingPostServletProperties servletPostIgnorePattern(@Nullable ConfigNodePropertyString servletPostIgnorePattern) {
    this.servletPostIgnorePattern = servletPostIgnorePattern;
    return this;
  }

  /**
   * Get servletPostIgnorePattern
   * @return servletPostIgnorePattern
   */
  @Valid 
  @Schema(name = "servlet.post.ignorePattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("servlet.post.ignorePattern")
  public @Nullable ConfigNodePropertyString getServletPostIgnorePattern() {
    return servletPostIgnorePattern;
  }

  @JsonProperty("servlet.post.ignorePattern")
  public void setServletPostIgnorePattern(@Nullable ConfigNodePropertyString servletPostIgnorePattern) {
    this.servletPostIgnorePattern = servletPostIgnorePattern;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsPostImplSlingPostServletProperties orgApacheSlingServletsPostImplSlingPostServletProperties = (OrgApacheSlingServletsPostImplSlingPostServletProperties) o;
    return Objects.equals(this.servletPostDateFormats, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostDateFormats) &&
        Objects.equals(this.servletPostNodeNameHints, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostNodeNameHints) &&
        Objects.equals(this.servletPostNodeNameMaxLength, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostNodeNameMaxLength) &&
        Objects.equals(this.servletPostCheckinNewVersionableNodes, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostCheckinNewVersionableNodes) &&
        Objects.equals(this.servletPostAutoCheckout, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostAutoCheckout) &&
        Objects.equals(this.servletPostAutoCheckin, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostAutoCheckin) &&
        Objects.equals(this.servletPostIgnorePattern, orgApacheSlingServletsPostImplSlingPostServletProperties.servletPostIgnorePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servletPostDateFormats, servletPostNodeNameHints, servletPostNodeNameMaxLength, servletPostCheckinNewVersionableNodes, servletPostAutoCheckout, servletPostAutoCheckin, servletPostIgnorePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsPostImplSlingPostServletProperties {\n");
    sb.append("    servletPostDateFormats: ").append(toIndentedString(servletPostDateFormats)).append("\n");
    sb.append("    servletPostNodeNameHints: ").append(toIndentedString(servletPostNodeNameHints)).append("\n");
    sb.append("    servletPostNodeNameMaxLength: ").append(toIndentedString(servletPostNodeNameMaxLength)).append("\n");
    sb.append("    servletPostCheckinNewVersionableNodes: ").append(toIndentedString(servletPostCheckinNewVersionableNodes)).append("\n");
    sb.append("    servletPostAutoCheckout: ").append(toIndentedString(servletPostAutoCheckout)).append("\n");
    sb.append("    servletPostAutoCheckin: ").append(toIndentedString(servletPostAutoCheckin)).append("\n");
    sb.append("    servletPostIgnorePattern: ").append(toIndentedString(servletPostIgnorePattern)).append("\n");
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

