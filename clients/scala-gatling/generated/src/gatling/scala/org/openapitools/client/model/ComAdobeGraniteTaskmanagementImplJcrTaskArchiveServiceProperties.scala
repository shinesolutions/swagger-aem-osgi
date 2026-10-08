
package org.openapitools.client.model


case class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties (
    _archivingEnabled: Option[ConfigNodePropertyBoolean],
    _schedulerExpression: Option[ConfigNodePropertyString],
    _archiveSinceDaysCompleted: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties {
    def toStringBody(var_archivingEnabled: Object, var_schedulerExpression: Object, var_archiveSinceDaysCompleted: Object) =
        s"""
        | {
        | "archivingEnabled":$var_archivingEnabled,"schedulerExpression":$var_schedulerExpression,"archiveSinceDaysCompleted":$var_archiveSinceDaysCompleted
        | }
        """.stripMargin
}
