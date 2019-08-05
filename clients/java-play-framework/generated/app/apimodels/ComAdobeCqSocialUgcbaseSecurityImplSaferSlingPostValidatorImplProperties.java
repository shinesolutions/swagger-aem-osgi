package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties   {
  @JsonProperty("parameter.whitelist")
  private ConfigNodePropertyArray parameterWhitelist = null;

  @JsonProperty("parameter.whitelist.prefixes")
  private ConfigNodePropertyArray parameterWhitelistPrefixes = null;

  @JsonProperty("binary.parameter.whitelist")
  private ConfigNodePropertyArray binaryParameterWhitelist = null;

  @JsonProperty("modifier.whitelist")
  private ConfigNodePropertyArray modifierWhitelist = null;

  @JsonProperty("operation.whitelist")
  private ConfigNodePropertyArray operationWhitelist = null;

  @JsonProperty("operation.whitelist.prefixes")
  private ConfigNodePropertyArray operationWhitelistPrefixes = null;

  @JsonProperty("typehint.whitelist")
  private ConfigNodePropertyArray typehintWhitelist = null;

  @JsonProperty("resourcetype.whitelist")
  private ConfigNodePropertyArray resourcetypeWhitelist = null;

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
    return this;
  }

   /**
   * Get parameterWhitelist
   * @return parameterWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getParameterWhitelist() {
    return parameterWhitelist;
  }

  public void setParameterWhitelist(ConfigNodePropertyArray parameterWhitelist) {
    this.parameterWhitelist = parameterWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties parameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
    return this;
  }

   /**
   * Get parameterWhitelistPrefixes
   * @return parameterWhitelistPrefixes
  **/
  @Valid
  public ConfigNodePropertyArray getParameterWhitelistPrefixes() {
    return parameterWhitelistPrefixes;
  }

  public void setParameterWhitelistPrefixes(ConfigNodePropertyArray parameterWhitelistPrefixes) {
    this.parameterWhitelistPrefixes = parameterWhitelistPrefixes;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties binaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
    return this;
  }

   /**
   * Get binaryParameterWhitelist
   * @return binaryParameterWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getBinaryParameterWhitelist() {
    return binaryParameterWhitelist;
  }

  public void setBinaryParameterWhitelist(ConfigNodePropertyArray binaryParameterWhitelist) {
    this.binaryParameterWhitelist = binaryParameterWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties modifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
    return this;
  }

   /**
   * Get modifierWhitelist
   * @return modifierWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getModifierWhitelist() {
    return modifierWhitelist;
  }

  public void setModifierWhitelist(ConfigNodePropertyArray modifierWhitelist) {
    this.modifierWhitelist = modifierWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
    return this;
  }

   /**
   * Get operationWhitelist
   * @return operationWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getOperationWhitelist() {
    return operationWhitelist;
  }

  public void setOperationWhitelist(ConfigNodePropertyArray operationWhitelist) {
    this.operationWhitelist = operationWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties operationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
    return this;
  }

   /**
   * Get operationWhitelistPrefixes
   * @return operationWhitelistPrefixes
  **/
  @Valid
  public ConfigNodePropertyArray getOperationWhitelistPrefixes() {
    return operationWhitelistPrefixes;
  }

  public void setOperationWhitelistPrefixes(ConfigNodePropertyArray operationWhitelistPrefixes) {
    this.operationWhitelistPrefixes = operationWhitelistPrefixes;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties typehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
    return this;
  }

   /**
   * Get typehintWhitelist
   * @return typehintWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getTypehintWhitelist() {
    return typehintWhitelist;
  }

  public void setTypehintWhitelist(ConfigNodePropertyArray typehintWhitelist) {
    this.typehintWhitelist = typehintWhitelist;
  }

  public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties resourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
    return this;
  }

   /**
   * Get resourcetypeWhitelist
   * @return resourcetypeWhitelist
  **/
  @Valid
  public ConfigNodePropertyArray getResourcetypeWhitelist() {
    return resourcetypeWhitelist;
  }

  public void setResourcetypeWhitelist(ConfigNodePropertyArray resourcetypeWhitelist) {
    this.resourcetypeWhitelist = resourcetypeWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties = (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties) o;
    return Objects.equals(parameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelist) &&
        Objects.equals(parameterWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.parameterWhitelistPrefixes) &&
        Objects.equals(binaryParameterWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.binaryParameterWhitelist) &&
        Objects.equals(modifierWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.modifierWhitelist) &&
        Objects.equals(operationWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelist) &&
        Objects.equals(operationWhitelistPrefixes, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.operationWhitelistPrefixes) &&
        Objects.equals(typehintWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.typehintWhitelist) &&
        Objects.equals(resourcetypeWhitelist, comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.resourcetypeWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterWhitelist, parameterWhitelistPrefixes, binaryParameterWhitelist, modifierWhitelist, operationWhitelist, operationWhitelistPrefixes, typehintWhitelist, resourcetypeWhitelist);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

