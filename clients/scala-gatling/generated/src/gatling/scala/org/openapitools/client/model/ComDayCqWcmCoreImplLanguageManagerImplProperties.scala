
package org.openapitools.client.model


case class ComDayCqWcmCoreImplLanguageManagerImplProperties (
    _langmgrListPath: Option[ConfigNodePropertyString],
    _langmgrCountryDefault: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplLanguageManagerImplProperties {
    def toStringBody(var_langmgrListPath: Object, var_langmgrCountryDefault: Object) =
        s"""
        | {
        | "langmgrListPath":$var_langmgrListPath,"langmgrCountryDefault":$var_langmgrCountryDefault
        | }
        """.stripMargin
}
