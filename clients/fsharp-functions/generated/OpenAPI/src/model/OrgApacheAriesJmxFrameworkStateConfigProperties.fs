namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheAriesJmxFrameworkStateConfigProperties =

  //#region OrgApacheAriesJmxFrameworkStateConfigProperties

  [<CLIMutable>]
  type OrgApacheAriesJmxFrameworkStateConfigProperties = {
    [<JsonProperty(PropertyName = "attributeChangeNotificationEnabled")>]
    AttributeChangeNotificationEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
