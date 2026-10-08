
package org.openapitools.client.model


case class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties (
    _translateLanguage: Option[ConfigNodePropertyDropDown],
    _translateDisplay: Option[ConfigNodePropertyDropDown],
    _translateAttribution: Option[ConfigNodePropertyBoolean],
    _translateCaching: Option[ConfigNodePropertyDropDown],
    _translateSmartRendering: Option[ConfigNodePropertyDropDown],
    _translateCachingDuration: Option[ConfigNodePropertyString],
    _translateSessionSaveInterval: Option[ConfigNodePropertyString],
    _translateSessionSaveBatchLimit: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
    def toStringBody(var_translateLanguage: Object, var_translateDisplay: Object, var_translateAttribution: Object, var_translateCaching: Object, var_translateSmartRendering: Object, var_translateCachingDuration: Object, var_translateSessionSaveInterval: Object, var_translateSessionSaveBatchLimit: Object) =
        s"""
        | {
        | "translateLanguage":$var_translateLanguage,"translateDisplay":$var_translateDisplay,"translateAttribution":$var_translateAttribution,"translateCaching":$var_translateCaching,"translateSmartRendering":$var_translateSmartRendering,"translateCachingDuration":$var_translateCachingDuration,"translateSessionSaveInterval":$var_translateSessionSaveInterval,"translateSessionSaveBatchLimit":$var_translateSessionSaveBatchLimit
        | }
        """.stripMargin
}
