package org.openapitools.server.model


/**
 * @param dsLoglevel  for example: ''null''
 * @param dsFactoryEnabled  for example: ''null''
 * @param dsDelayedKeepInstances  for example: ''null''
 * @param dsLockTimeoutMilliseconds  for example: ''null''
 * @param dsStopTimeoutMilliseconds  for example: ''null''
 * @param dsGlobalExtender  for example: ''null''
*/
final case class OrgApacheFelixScrScrServiceProperties (
  dsLoglevel: Option[ConfigNodePropertyDropDown] = None,
  dsFactoryEnabled: Option[ConfigNodePropertyBoolean] = None,
  dsDelayedKeepInstances: Option[ConfigNodePropertyBoolean] = None,
  dsLockTimeoutMilliseconds: Option[ConfigNodePropertyInteger] = None,
  dsStopTimeoutMilliseconds: Option[ConfigNodePropertyInteger] = None,
  dsGlobalExtender: Option[ConfigNodePropertyBoolean] = None
)

