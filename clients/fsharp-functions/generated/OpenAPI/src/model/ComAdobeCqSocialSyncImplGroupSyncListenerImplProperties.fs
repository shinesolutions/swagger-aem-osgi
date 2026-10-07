namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties =

  //#region ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties = {
    [<JsonProperty(PropertyName = "nodetypes")>]
    Nodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "ignorableprops")>]
    Ignorableprops : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "ignorablenodes")>]
    Ignorablenodes : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "distfolders")>]
    Distfolders : ConfigNodePropertyString;
  }

  //#endregion
