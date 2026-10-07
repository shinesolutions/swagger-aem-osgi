
package org.openapitools.client.model


case class ComDayCqReplicationContentStaticContentBuilderProperties (
    _host: Option[ConfigNodePropertyString],
    _port: Option[ConfigNodePropertyInteger]
)
object ComDayCqReplicationContentStaticContentBuilderProperties {
    def toStringBody(var_host: Object, var_port: Object) =
        s"""
        | {
        | "host":$var_host,"port":$var_port
        | }
        """.stripMargin
}
