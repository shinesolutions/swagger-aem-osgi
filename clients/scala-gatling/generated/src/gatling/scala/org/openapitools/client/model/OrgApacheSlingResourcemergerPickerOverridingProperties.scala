
package org.openapitools.client.model


case class OrgApacheSlingResourcemergerPickerOverridingProperties (
    _mergeRoot: Option[ConfigNodePropertyString],
    _mergeReadOnly: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingResourcemergerPickerOverridingProperties {
    def toStringBody(var_mergeRoot: Object, var_mergeReadOnly: Object) =
        s"""
        | {
        | "mergeRoot":$var_mergeRoot,"mergeReadOnly":$var_mergeReadOnly
        | }
        """.stripMargin
}
