
package org.openapitools.client.model


case class ComDayCqDamCoreImplExpiryNotificationJobImplProperties (
    _cqDamExpiryNotificationSchedulerIstimebased: Option[ConfigNodePropertyBoolean],
    _cqDamExpiryNotificationSchedulerTimebasedRule: Option[ConfigNodePropertyString],
    _cqDamExpiryNotificationSchedulerPeriodRule: Option[ConfigNodePropertyInteger],
    _sendEmail: Option[ConfigNodePropertyBoolean],
    _assetExpiredLimit: Option[ConfigNodePropertyInteger],
    _priorNotificationSeconds: Option[ConfigNodePropertyInteger],
    _cqDamExpiryNotificationUrlProtocol: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplExpiryNotificationJobImplProperties {
    def toStringBody(var_cqDamExpiryNotificationSchedulerIstimebased: Object, var_cqDamExpiryNotificationSchedulerTimebasedRule: Object, var_cqDamExpiryNotificationSchedulerPeriodRule: Object, var_sendEmail: Object, var_assetExpiredLimit: Object, var_priorNotificationSeconds: Object, var_cqDamExpiryNotificationUrlProtocol: Object) =
        s"""
        | {
        | "cqDamExpiryNotificationSchedulerIstimebased":$var_cqDamExpiryNotificationSchedulerIstimebased,"cqDamExpiryNotificationSchedulerTimebasedRule":$var_cqDamExpiryNotificationSchedulerTimebasedRule,"cqDamExpiryNotificationSchedulerPeriodRule":$var_cqDamExpiryNotificationSchedulerPeriodRule,"sendEmail":$var_sendEmail,"assetExpiredLimit":$var_assetExpiredLimit,"priorNotificationSeconds":$var_priorNotificationSeconds,"cqDamExpiryNotificationUrlProtocol":$var_cqDamExpiryNotificationUrlProtocol
        | }
        """.stripMargin
}
