namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties =

  //#region ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties = {
    [<JsonProperty(PropertyName = "parameter.whitelist")>]
    ParameterWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "parameter.whitelist.prefixes")>]
    ParameterWhitelistPrefixes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "binary.parameter.whitelist")>]
    BinaryParameterWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "modifier.whitelist")>]
    ModifierWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "operation.whitelist")>]
    OperationWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "operation.whitelist.prefixes")>]
    OperationWhitelistPrefixes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "typehint.whitelist")>]
    TypehintWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resourcetype.whitelist")>]
    ResourcetypeWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
