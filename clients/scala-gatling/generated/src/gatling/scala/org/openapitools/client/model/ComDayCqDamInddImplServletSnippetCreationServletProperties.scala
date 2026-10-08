
package org.openapitools.client.model


case class ComDayCqDamInddImplServletSnippetCreationServletProperties (
    _snippetcreationMaxcollections: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamInddImplServletSnippetCreationServletProperties {
    def toStringBody(var_snippetcreationMaxcollections: Object) =
        s"""
        | {
        | "snippetcreationMaxcollections":$var_snippetcreationMaxcollections
        | }
        """.stripMargin
}
