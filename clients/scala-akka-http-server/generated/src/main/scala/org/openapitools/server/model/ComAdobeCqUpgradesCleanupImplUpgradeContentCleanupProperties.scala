package org.openapitools.server.model


/**
 * @param deletePathRegexps  for example: ''null''
 * @param deleteSql2Query  for example: ''null''
*/
final case class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties (
  deletePathRegexps: Option[ConfigNodePropertyArray] = None,
  deleteSql2Query: Option[ConfigNodePropertyString] = None
)

