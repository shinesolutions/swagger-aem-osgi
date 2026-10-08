namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties =

  //#region ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties = {
    [<JsonProperty(PropertyName = "isPrimaryPublisher")>]
    IsPrimaryPublisher : ConfigNodePropertyBoolean;
  }

  //#endregion
