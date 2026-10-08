package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray parameterWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray parameterWhitelistPrefixes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray binaryParameterWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray modifierWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray operationWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray operationWhitelistPrefixes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray typehintWhitelist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray resourcetypeWhitelist;

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelist(@Nullable ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    return this;
  }

  /**
   * Get parameterWhitelist
   * @return parameterWhitelist
   */
  @Valid 
  @Schema(name = "parameter.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter.whitelist")
  public @Nullable ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }

  @JsonProperty("parameter.whitelist")
  public void setParameterWhitelist(@Nullable ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelistPrefixes(@Nullable ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    return this;
  }

  /**
   * Get parameterWhitelistPrefixes
   * @return parameterWhitelistPrefixes
   */
  @Valid 
  @Schema(name = "parameter.whitelist.prefixes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter.whitelist.prefixes")
  public @Nullable ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }

  @JsonProperty("parameter.whitelist.prefixes")
  public void setParameterWhitelistPrefixes(@Nullable ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties binaryParameterWhitelist(@Nullable ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    return this;
  }

  /**
   * Get binaryParameterWhitelist
   * @return binaryParameterWhitelist
   */
  @Valid 
  @Schema(name = "binary.parameter.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binary.parameter.whitelist")
  public @Nullable ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }

  @JsonProperty("binary.parameter.whitelist")
  public void setBinaryParameterWhitelist(@Nullable ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties modifierWhitelist(@Nullable ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
    return this;
  }

  /**
   * Get modifierWhitelist
   * @return modifierWhitelist
   */
  @Valid 
  @Schema(name = "modifier.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifier.whitelist")
  public @Nullable ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }

  @JsonProperty("modifier.whitelist")
  public void setModifierWhitelist(@Nullable ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelist(@Nullable ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
    return this;
  }

  /**
   * Get operationWhitelist
   * @return operationWhitelist
   */
  @Valid 
  @Schema(name = "operation.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation.whitelist")
  public @Nullable ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }

  @JsonProperty("operation.whitelist")
  public void setOperationWhitelist(@Nullable ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelistPrefixes(@Nullable ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    return this;
  }

  /**
   * Get operationWhitelistPrefixes
   * @return operationWhitelistPrefixes
   */
  @Valid 
  @Schema(name = "operation.whitelist.prefixes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation.whitelist.prefixes")
  public @Nullable ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }

  @JsonProperty("operation.whitelist.prefixes")
  public void setOperationWhitelistPrefixes(@Nullable ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties typehintWhitelist(@Nullable ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
    return this;
  }

  /**
   * Get typehintWhitelist
   * @return typehintWhitelist
   */
  @Valid 
  @Schema(name = "typehint.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("typehint.whitelist")
  public @Nullable ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }

  @JsonProperty("typehint.whitelist")
  public void setTypehintWhitelist(@Nullable ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties resourcetypeWhitelist(@Nullable ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
    return this;
  }

  /**
   * Get resourcetypeWhitelist
   * @return resourcetypeWhitelist
   */
  @Valid 
  @Schema(name = "resourcetype.whitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourcetype.whitelist")
  public @Nullable ConfigNodePropertyArray getResourcetypeWhitelist() {
    return resourcetypeWhitelist;
  }

  @JsonProperty("resourcetype.whitelist")
  public void setResourcetypeWhitelist(@Nullable ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties = (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties) o;
    return Objects.equals(this.parameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelist) &&
        Objects.equals(this.parameterWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelistPrefixes) &&
        Objects.equals(this.binaryParameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.binaryParameterWhitelist) &&
        Objects.equals(this.modifierWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.modifierWhitelist) &&
        Objects.equals(this.operationWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelist) &&
        Objects.equals(this.operationWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelistPrefixes) &&
        Objects.equals(this.typehintWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.typehintWhitelist) &&
        Objects.equals(this.resourcetypeWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.resourcetypeWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterWhitelist, parameterWhitelistPrefixes, binaryParameterWhitelist, modifierWhitelist, operationWhitelist, operationWhitelistPrefixes, typehintWhitelist, resourcetypeWhitelist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {\n");
    sb.append("    parameterWhitelist: ").append(toIndentedString(parameterWhitelist)).append("\n");
    sb.append("    parameterWhitelistPrefixes: ").append(toIndentedString(parameterWhitelistPrefixes)).append("\n");
    sb.append("    binaryParameterWhitelist: ").append(toIndentedString(binaryParameterWhitelist)).append("\n");
    sb.append("    modifierWhitelist: ").append(toIndentedString(modifierWhitelist)).append("\n");
    sb.append("    operationWhitelist: ").append(toIndentedString(operationWhitelist)).append("\n");
    sb.append("    operationWhitelistPrefixes: ").append(toIndentedString(operationWhitelistPrefixes)).append("\n");
    sb.append("    typehintWhitelist: ").append(toIndentedString(typehintWhitelist)).append("\n");
    sb.append("    resourcetypeWhitelist: ").append(toIndentedString(resourcetypeWhitelist)).append("\n");
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

