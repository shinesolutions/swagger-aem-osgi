namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties =

  //#region OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties

  [<CLIMutable>]
  type OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties = {
    [<JsonProperty(PropertyName = "ignorePropertyNameRegex")>]
    IgnorePropertyNameRegex : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "configCollectionPropertiesResourceNames")>]
    ConfigCollectionPropertiesResourceNames : ConfigNodePropertyArray;
  }

  //#endregion
