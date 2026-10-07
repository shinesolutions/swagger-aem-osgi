
package org.openapitools.client.model


case class OrgApacheSlingXssImplXSSFilterImplProperties (
    _policyPath: Option[ConfigNodePropertyString]
)
object OrgApacheSlingXssImplXSSFilterImplProperties {
    def toStringBody(var_policyPath: Object) =
        s"""
        | {
        | "policyPath":$var_policyPath
        | }
        """.stripMargin
}
