namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqSocialSyncImplUserSyncListenerImplProperties =

  //#region ComAdobeCqSocialSyncImplUserSyncListenerImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialSyncImplUserSyncListenerImplProperties = {
    [<JsonProperty(PropertyName = "nodetypes")>]
    Nodetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "ignorableprops")>]
    Ignorableprops : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "ignorablenodes")>]
    Ignorablenodes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "distfolders")>]
    Distfolders : ConfigNodePropertyArray;
  }

  //#endregion
