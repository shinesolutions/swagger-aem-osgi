package org.openapitools.server.model


/**
 * @param nodetypes  for example: ''null''
 * @param ignorableprops  for example: ''null''
 * @param ignorablenodes  for example: ''null''
 * @param enabled  for example: ''null''
 * @param distfolders  for example: ''null''
*/
final case class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties (
  nodetypes: Option[ConfigNodePropertyArray] = None,
  ignorableprops: Option[ConfigNodePropertyArray] = None,
  ignorablenodes: Option[ConfigNodePropertyArray] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None,
  distfolders: Option[ConfigNodePropertyArray] = None
)

