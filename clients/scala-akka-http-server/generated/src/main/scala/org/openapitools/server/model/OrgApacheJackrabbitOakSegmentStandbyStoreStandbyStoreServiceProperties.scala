package org.openapitools.server.model


/**
 * @param orgApacheSlingInstallerConfigurationPersist  for example: ''null''
 * @param mode  for example: ''null''
 * @param port  for example: ''null''
 * @param primaryHost  for example: ''null''
 * @param interval  for example: ''null''
 * @param primaryAllowedClientIpRanges  for example: ''null''
 * @param secure  for example: ''null''
 * @param standbyReadtimeout  for example: ''null''
 * @param standbyAutoclean  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties (
  orgApacheSlingInstallerConfigurationPersist: Option[ConfigNodePropertyBoolean] = None,
  mode: Option[ConfigNodePropertyDropDown] = None,
  port: Option[ConfigNodePropertyInteger] = None,
  primaryHost: Option[ConfigNodePropertyString] = None,
  interval: Option[ConfigNodePropertyInteger] = None,
  primaryAllowedClientIpRanges: Option[ConfigNodePropertyArray] = None,
  secure: Option[ConfigNodePropertyBoolean] = None,
  standbyReadtimeout: Option[ConfigNodePropertyInteger] = None,
  standbyAutoclean: Option[ConfigNodePropertyBoolean] = None
)

