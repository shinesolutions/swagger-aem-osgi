
package org.openapitools.client.model


case class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties (
    _syncTranslationStateSchedulingFormat: Option[ConfigNodePropertyString],
    _schedulingRepeatTranslationSchedulingFormat: Option[ConfigNodePropertyString],
    _syncTranslationStateLockTimeoutInMinutes: Option[ConfigNodePropertyString],
    _exportFormat: Option[ConfigNodePropertyDropDown]
)
object ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
    def toStringBody(var_syncTranslationStateSchedulingFormat: Object, var_schedulingRepeatTranslationSchedulingFormat: Object, var_syncTranslationStateLockTimeoutInMinutes: Object, var_exportFormat: Object) =
        s"""
        | {
        | "syncTranslationStateSchedulingFormat":$var_syncTranslationStateSchedulingFormat,"schedulingRepeatTranslationSchedulingFormat":$var_schedulingRepeatTranslationSchedulingFormat,"syncTranslationStateLockTimeoutInMinutes":$var_syncTranslationStateLockTimeoutInMinutes,"exportFormat":$var_exportFormat
        | }
        """.stripMargin
}
