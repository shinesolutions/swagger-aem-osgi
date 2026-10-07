namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties =

  //#region ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties

  [<CLIMutable>]
  type ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties = {
    [<JsonProperty(PropertyName = "MaxRetry")>]
    MaxRetry : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
