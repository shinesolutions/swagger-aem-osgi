namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties

module ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo =

  //#region ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties;
  }

  //#endregion
