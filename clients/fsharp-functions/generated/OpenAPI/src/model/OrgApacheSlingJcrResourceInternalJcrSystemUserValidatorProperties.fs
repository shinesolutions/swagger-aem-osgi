namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties =

  //#region OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties = {
    [<JsonProperty(PropertyName = "allow.only.system.user")>]
    AllowOnlySystemUser : ConfigNodePropertyBoolean;
  }

  //#endregion
