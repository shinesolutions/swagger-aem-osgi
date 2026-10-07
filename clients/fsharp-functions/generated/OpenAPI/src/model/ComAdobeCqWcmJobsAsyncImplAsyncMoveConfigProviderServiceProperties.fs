namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties =

  //#region ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties

  [<CLIMutable>]
  type ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties = {
    [<JsonProperty(PropertyName = "threshold")>]
    Threshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "jobTopicName")>]
    JobTopicName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "emailEnabled")>]
    EmailEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
