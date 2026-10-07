
package org.openapitools.client.model


case class GuideLocalizationServiceProperties (
    _supportedLocales: Option[ConfigNodePropertyArray],
    _localizableProperties: Option[ConfigNodePropertyArray]
)
object GuideLocalizationServiceProperties {
    def toStringBody(var_supportedLocales: Object, var_localizableProperties: Object) =
        s"""
        | {
        | "supportedLocales":$var_supportedLocales,"localizableProperties":$var_localizableProperties
        | }
        """.stripMargin
}
