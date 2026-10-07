
package org.openapitools.client.model


case class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties (
    _cqDamMissingmetadataNotificationSchedulerIstimebased: Option[ConfigNodePropertyBoolean],
    _cqDamMissingmetadataNotificationSchedulerTimebasedRule: Option[ConfigNodePropertyString],
    _cqDamMissingmetadataNotificationSchedulerPeriodRule: Option[ConfigNodePropertyInteger],
    _cqDamMissingmetadataNotificationRecipient: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {
    def toStringBody(var_cqDamMissingmetadataNotificationSchedulerIstimebased: Object, var_cqDamMissingmetadataNotificationSchedulerTimebasedRule: Object, var_cqDamMissingmetadataNotificationSchedulerPeriodRule: Object, var_cqDamMissingmetadataNotificationRecipient: Object) =
        s"""
        | {
        | "cqDamMissingmetadataNotificationSchedulerIstimebased":$var_cqDamMissingmetadataNotificationSchedulerIstimebased,"cqDamMissingmetadataNotificationSchedulerTimebasedRule":$var_cqDamMissingmetadataNotificationSchedulerTimebasedRule,"cqDamMissingmetadataNotificationSchedulerPeriodRule":$var_cqDamMissingmetadataNotificationSchedulerPeriodRule,"cqDamMissingmetadataNotificationRecipient":$var_cqDamMissingmetadataNotificationRecipient
        | }
        """.stripMargin
}
