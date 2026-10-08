namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties =

  //#region ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties

  [<CLIMutable>]
  type ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties = {
    [<JsonProperty(PropertyName = "mailer.email.embed")>]
    MailerEmailEmbed : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "mailer.email.charset")>]
    MailerEmailCharset : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "mailer.email.retrieverUserID")>]
    MailerEmailRetrieverUserID : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "mailer.email.retrieverUserPWD")>]
    MailerEmailRetrieverUserPWD : ConfigNodePropertyString;
  }

  //#endregion
