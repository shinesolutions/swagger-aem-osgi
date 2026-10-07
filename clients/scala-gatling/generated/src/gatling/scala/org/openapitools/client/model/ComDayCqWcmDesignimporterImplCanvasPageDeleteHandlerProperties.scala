
package org.openapitools.client.model


case class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties (
    _minThreadPoolSize: Option[ConfigNodePropertyInteger],
    _maxThreadPoolSize: Option[ConfigNodePropertyInteger]
)
object ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {
    def toStringBody(var_minThreadPoolSize: Object, var_maxThreadPoolSize: Object) =
        s"""
        | {
        | "minThreadPoolSize":$var_minThreadPoolSize,"maxThreadPoolSize":$var_maxThreadPoolSize
        | }
        """.stripMargin
}
