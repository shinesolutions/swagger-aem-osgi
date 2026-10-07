package org.openapitools.server.model


/**
 * @param groupListingPaginationEnable  for example: ''null''
 * @param groupListingLazyloadingEnable  for example: ''null''
 * @param pageSize  for example: ''null''
 * @param priority  for example: ''null''
*/
final case class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties (
  groupListingPaginationEnable: Option[ConfigNodePropertyBoolean] = None,
  groupListingLazyloadingEnable: Option[ConfigNodePropertyBoolean] = None,
  pageSize: Option[ConfigNodePropertyInteger] = None,
  priority: Option[ConfigNodePropertyInteger] = None
)

