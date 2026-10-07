namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties

module ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo =

  //#region ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties;
  }

  //#endregion
