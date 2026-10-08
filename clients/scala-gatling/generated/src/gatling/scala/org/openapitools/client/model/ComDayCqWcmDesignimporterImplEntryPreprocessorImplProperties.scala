
package org.openapitools.client.model


case class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties (
    _searchPattern: Option[ConfigNodePropertyString],
    _replacePattern: Option[ConfigNodePropertyString]
)
object ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {
    def toStringBody(var_searchPattern: Object, var_replacePattern: Object) =
        s"""
        | {
        | "searchPattern":$var_searchPattern,"replacePattern":$var_replacePattern
        | }
        """.stripMargin
}
