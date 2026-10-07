
package org.openapitools.client.model


case class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties (
    _mergeRoot: Option[ConfigNodePropertyString],
    _mergeReadOnly: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties {
    def toStringBody(var_mergeRoot: Object, var_mergeReadOnly: Object) =
        s"""
        | {
        | "mergeRoot":$var_mergeRoot,"mergeReadOnly":$var_mergeReadOnly
        | }
        """.stripMargin
}
