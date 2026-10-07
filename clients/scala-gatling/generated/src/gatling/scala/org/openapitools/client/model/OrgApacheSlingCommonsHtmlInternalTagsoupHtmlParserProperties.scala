
package org.openapitools.client.model


case class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties (
    _parserFeatures: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties {
    def toStringBody(var_parserFeatures: Object) =
        s"""
        | {
        | "parserFeatures":$var_parserFeatures
        | }
        """.stripMargin
}
