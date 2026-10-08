namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties =

  //#region ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties

  [<CLIMutable>]
  type ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
