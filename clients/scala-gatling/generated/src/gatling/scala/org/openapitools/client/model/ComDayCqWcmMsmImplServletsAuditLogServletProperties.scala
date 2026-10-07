
package org.openapitools.client.model


case class ComDayCqWcmMsmImplServletsAuditLogServletProperties (
    _auditlogservletDefaultEventsCount: Option[ConfigNodePropertyInteger],
    _auditlogservletDefaultPath: Option[ConfigNodePropertyString]
)
object ComDayCqWcmMsmImplServletsAuditLogServletProperties {
    def toStringBody(var_auditlogservletDefaultEventsCount: Object, var_auditlogservletDefaultPath: Object) =
        s"""
        | {
        | "auditlogservletDefaultEventsCount":$var_auditlogservletDefaultEventsCount,"auditlogservletDefaultPath":$var_auditlogservletDefaultPath
        | }
        """.stripMargin
}
