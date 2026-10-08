
package org.openapitools.client.model


case class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties (
    _alias: Option[ConfigNodePropertyString],
    _davCreateAbsoluteUri: Option[ConfigNodePropertyBoolean],
    _davProtectedhandlers: Option[ConfigNodePropertyString]
)
object OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {
    def toStringBody(var_alias: Object, var_davCreateAbsoluteUri: Object, var_davProtectedhandlers: Object) =
        s"""
        | {
        | "alias":$var_alias,"davCreateAbsoluteUri":$var_davCreateAbsoluteUri,"davProtectedhandlers":$var_davProtectedhandlers
        | }
        """.stripMargin
}
