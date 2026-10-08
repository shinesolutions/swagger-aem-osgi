
package org.openapitools.client.model


case class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties (
    _defaultExternalizerDomain: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {
    def toStringBody(var_defaultExternalizerDomain: Object) =
        s"""
        | {
        | "defaultExternalizerDomain":$var_defaultExternalizerDomain
        | }
        """.stripMargin
}
