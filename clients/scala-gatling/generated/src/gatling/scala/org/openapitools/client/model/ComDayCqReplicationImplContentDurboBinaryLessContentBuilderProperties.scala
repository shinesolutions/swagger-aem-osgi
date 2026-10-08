
package org.openapitools.client.model


case class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties (
    _binaryThreshold: Option[ConfigNodePropertyInteger]
)
object ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties {
    def toStringBody(var_binaryThreshold: Object) =
        s"""
        | {
        | "binaryThreshold":$var_binaryThreshold
        | }
        """.stripMargin
}
