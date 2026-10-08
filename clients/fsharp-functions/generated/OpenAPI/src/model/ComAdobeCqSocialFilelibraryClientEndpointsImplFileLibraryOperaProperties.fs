namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties =

  //#region ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties

  [<CLIMutable>]
  type ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties = {
    [<JsonProperty(PropertyName = "fieldWhitelist")>]
    FieldWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "attachmentTypeBlacklist")>]
    AttachmentTypeBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
