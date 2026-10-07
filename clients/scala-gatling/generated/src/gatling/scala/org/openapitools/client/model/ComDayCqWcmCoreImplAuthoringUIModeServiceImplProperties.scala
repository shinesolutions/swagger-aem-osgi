
package org.openapitools.client.model


case class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties (
    _authoringUIModeServiceDefault: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties {
    def toStringBody(var_authoringUIModeServiceDefault: Object) =
        s"""
        | {
        | "authoringUIModeServiceDefault":$var_authoringUIModeServiceDefault
        | }
        """.stripMargin
}
