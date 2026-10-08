namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties =

  //#region ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties

  [<CLIMutable>]
  type ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties = {
    [<JsonProperty(PropertyName = "threshold")>]
    Threshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "jobTopicName")>]
    JobTopicName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "emailEnabled")>]
    EmailEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
