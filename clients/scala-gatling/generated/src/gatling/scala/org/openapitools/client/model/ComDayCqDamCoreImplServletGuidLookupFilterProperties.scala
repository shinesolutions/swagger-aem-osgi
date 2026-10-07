
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletGuidLookupFilterProperties (
    _cqDamCoreGuidlookupfilterEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplServletGuidLookupFilterProperties {
    def toStringBody(var_cqDamCoreGuidlookupfilterEnabled: Object) =
        s"""
        | {
        | "cqDamCoreGuidlookupfilterEnabled":$var_cqDamCoreGuidlookupfilterEnabled
        | }
        """.stripMargin
}
