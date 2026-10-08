
package org.openapitools.client.model


case class ApacheSlingHealthCheckResultHTMLSerializerProperties (
    _styleString: Option[ConfigNodePropertyString]
)
object ApacheSlingHealthCheckResultHTMLSerializerProperties {
    def toStringBody(var_styleString: Object) =
        s"""
        | {
        | "styleString":$var_styleString
        | }
        """.stripMargin
}
