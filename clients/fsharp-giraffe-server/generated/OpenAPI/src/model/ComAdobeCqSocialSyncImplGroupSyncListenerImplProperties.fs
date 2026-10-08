namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties =

  //#region ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties


  type comAdobeCqSocialSyncImplGroupSyncListenerImplProperties = {
    Nodetypes : ConfigNodePropertyArray;
    Ignorableprops : ConfigNodePropertyArray;
    Ignorablenodes : ConfigNodePropertyString;
    Enabled : ConfigNodePropertyBoolean;
    Distfolders : ConfigNodePropertyString;
  }
  //#endregion
