package org.openapitools.server.model


/**
 * @param auditlogservletDefaultEventsCount  for example: ''null''
 * @param auditlogservletDefaultPath  for example: ''null''
*/
final case class ComDayCqWcmMsmImplServletsAuditLogServletProperties (
  auditlogservletDefaultEventsCount: Option[ConfigNodePropertyInteger] = None,
  auditlogservletDefaultPath: Option[ConfigNodePropertyString] = None
)

