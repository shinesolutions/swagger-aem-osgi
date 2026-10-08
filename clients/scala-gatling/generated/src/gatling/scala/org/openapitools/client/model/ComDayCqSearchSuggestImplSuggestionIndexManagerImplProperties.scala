
package org.openapitools.client.model


case class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties (
    _pathBuilderTarget: Option[ConfigNodePropertyString],
    _suggestBasepath: Option[ConfigNodePropertyString]
)
object ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {
    def toStringBody(var_pathBuilderTarget: Object, var_suggestBasepath: Object) =
        s"""
        | {
        | "pathBuilderTarget":$var_pathBuilderTarget,"suggestBasepath":$var_suggestBasepath
        | }
        """.stripMargin
}
