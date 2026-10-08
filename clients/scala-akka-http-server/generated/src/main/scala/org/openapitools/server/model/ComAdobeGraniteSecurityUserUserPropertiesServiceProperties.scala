package org.openapitools.server.model


/**
 * @param adapterCondition  for example: ''null''
 * @param graniteUserpropertiesNodetypes  for example: ''null''
 * @param graniteUserpropertiesResourcetypes  for example: ''null''
*/
final case class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties (
  adapterCondition: Option[ConfigNodePropertyString] = None,
  graniteUserpropertiesNodetypes: Option[ConfigNodePropertyArray] = None,
  graniteUserpropertiesResourcetypes: Option[ConfigNodePropertyArray] = None
)

