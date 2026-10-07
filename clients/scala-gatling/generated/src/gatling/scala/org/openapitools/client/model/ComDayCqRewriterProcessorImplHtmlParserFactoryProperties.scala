
package org.openapitools.client.model


case class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties (
    _htmlparserProcessTags: Option[ConfigNodePropertyArray],
    _htmlparserPreserveCamelCase: Option[ConfigNodePropertyBoolean]
)
object ComDayCqRewriterProcessorImplHtmlParserFactoryProperties {
    def toStringBody(var_htmlparserProcessTags: Object, var_htmlparserPreserveCamelCase: Object) =
        s"""
        | {
        | "htmlparserProcessTags":$var_htmlparserProcessTags,"htmlparserPreserveCamelCase":$var_htmlparserPreserveCamelCase
        | }
        """.stripMargin
}
