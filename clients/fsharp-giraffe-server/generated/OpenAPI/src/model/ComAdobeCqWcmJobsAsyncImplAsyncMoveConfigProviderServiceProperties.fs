namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties =

  //#region ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties


  type comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties = {
    Threshold : ConfigNodePropertyInteger;
    JobTopicName : ConfigNodePropertyString;
    EmailEnabled : ConfigNodePropertyBoolean;
  }
  //#endregion
