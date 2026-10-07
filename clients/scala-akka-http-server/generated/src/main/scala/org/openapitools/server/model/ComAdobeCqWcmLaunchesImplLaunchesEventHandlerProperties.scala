package org.openapitools.server.model


/**
 * @param eventFilter  for example: ''null''
 * @param launchesEventhandlerThreadpoolMaxsize  for example: ''null''
 * @param launchesEventhandlerThreadpoolPriority  for example: ''null''
 * @param launchesEventhandlerUpdatelastmodification  for example: ''null''
*/
final case class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties (
  eventFilter: Option[ConfigNodePropertyString] = None,
  launchesEventhandlerThreadpoolMaxsize: Option[ConfigNodePropertyInteger] = None,
  launchesEventhandlerThreadpoolPriority: Option[ConfigNodePropertyDropDown] = None,
  launchesEventhandlerUpdatelastmodification: Option[ConfigNodePropertyBoolean] = None
)

