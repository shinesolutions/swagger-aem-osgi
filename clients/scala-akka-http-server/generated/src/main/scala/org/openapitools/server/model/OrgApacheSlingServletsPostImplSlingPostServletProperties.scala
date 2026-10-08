package org.openapitools.server.model


/**
 * @param servletPostDateFormats  for example: ''null''
 * @param servletPostNodeNameHints  for example: ''null''
 * @param servletPostNodeNameMaxLength  for example: ''null''
 * @param servletPostCheckinNewVersionableNodes  for example: ''null''
 * @param servletPostAutoCheckout  for example: ''null''
 * @param servletPostAutoCheckin  for example: ''null''
 * @param servletPostIgnorePattern  for example: ''null''
*/
final case class OrgApacheSlingServletsPostImplSlingPostServletProperties (
  servletPostDateFormats: Option[ConfigNodePropertyArray] = None,
  servletPostNodeNameHints: Option[ConfigNodePropertyArray] = None,
  servletPostNodeNameMaxLength: Option[ConfigNodePropertyInteger] = None,
  servletPostCheckinNewVersionableNodes: Option[ConfigNodePropertyBoolean] = None,
  servletPostAutoCheckout: Option[ConfigNodePropertyBoolean] = None,
  servletPostAutoCheckin: Option[ConfigNodePropertyBoolean] = None,
  servletPostIgnorePattern: Option[ConfigNodePropertyString] = None
)

