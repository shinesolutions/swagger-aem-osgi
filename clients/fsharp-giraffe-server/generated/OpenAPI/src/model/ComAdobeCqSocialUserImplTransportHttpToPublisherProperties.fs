namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialUserImplTransportHttpToPublisherProperties =

  //#region ComAdobeCqSocialUserImplTransportHttpToPublisherProperties


  type comAdobeCqSocialUserImplTransportHttpToPublisherProperties = {
    Enable : ConfigNodePropertyBoolean;
    AgentConfiguration : ConfigNodePropertyArray;
    ContextPath : ConfigNodePropertyString;
    DisabledCipherSuites : ConfigNodePropertyArray;
    EnabledCipherSuites : ConfigNodePropertyArray;
  }
  //#endregion
