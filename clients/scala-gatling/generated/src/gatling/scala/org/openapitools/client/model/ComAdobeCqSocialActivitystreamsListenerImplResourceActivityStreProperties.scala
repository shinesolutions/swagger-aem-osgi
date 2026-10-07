
package org.openapitools.client.model


case class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties (
    _streamPath: Option[ConfigNodePropertyString],
    _streamName: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties {
    def toStringBody(var_streamPath: Object, var_streamName: Object) =
        s"""
        | {
        | "streamPath":$var_streamPath,"streamName":$var_streamName
        | }
        """.stripMargin
}
