namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties =

  //#region ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties

  [<CLIMutable>]
  type ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties = {
    [<JsonProperty(PropertyName = "extension.order")>]
    ExtensionOrder : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "flush.forumontopic")>]
    FlushForumontopic : ConfigNodePropertyBoolean;
  }

  //#endregion
