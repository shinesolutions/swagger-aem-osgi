package org.openapitools.server.model


/**
 * @param graniteMaintenanceMandatory  for example: ''null''
 * @param jobTopics  for example: ''null''
*/
final case class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties (
  graniteMaintenanceMandatory: Option[ConfigNodePropertyBoolean] = None,
  jobTopics: Option[ConfigNodePropertyString] = None
)

