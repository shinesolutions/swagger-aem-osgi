
package org.openapitools.client.model


case class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties (
    _skipBufferedcache: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {
    def toStringBody(var_skipBufferedcache: Object) =
        s"""
        | {
        | "skipBufferedcache":$var_skipBufferedcache
        | }
        """.stripMargin
}
