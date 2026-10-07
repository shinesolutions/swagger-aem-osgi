namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties =

  //#region ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties

  [<CLIMutable>]
  type ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties = {
    [<JsonProperty(PropertyName = "mailer.email.charset")>]
    MailerEmailCharset : ConfigNodePropertyString;
  }

  //#endregion
