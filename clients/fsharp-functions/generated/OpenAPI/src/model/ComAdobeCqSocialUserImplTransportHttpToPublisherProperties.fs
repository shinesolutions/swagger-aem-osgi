namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialUserImplTransportHttpToPublisherProperties =

  //#region ComAdobeCqSocialUserImplTransportHttpToPublisherProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUserImplTransportHttpToPublisherProperties = {
    [<JsonProperty(PropertyName = "enable")>]
    Enable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "agent.configuration")>]
    AgentConfiguration : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "context.path")>]
    ContextPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "disabled.cipher.suites")>]
    DisabledCipherSuites : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enabled.cipher.suites")>]
    EnabledCipherSuites : ConfigNodePropertyArray;
  }

  //#endregion
