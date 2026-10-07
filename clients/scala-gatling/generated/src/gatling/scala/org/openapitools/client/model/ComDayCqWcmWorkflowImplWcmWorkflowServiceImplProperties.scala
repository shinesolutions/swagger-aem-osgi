
package org.openapitools.client.model


case class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties (
    _eventFilter: Option[ConfigNodePropertyString],
    _minThreadPoolSize: Option[ConfigNodePropertyInteger],
    _maxThreadPoolSize: Option[ConfigNodePropertyInteger],
    _cqWcmWorkflowTerminateOnActivate: Option[ConfigNodePropertyBoolean],
    _cqWcmWorklfowTerminateExclusionList: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {
    def toStringBody(var_eventFilter: Object, var_minThreadPoolSize: Object, var_maxThreadPoolSize: Object, var_cqWcmWorkflowTerminateOnActivate: Object, var_cqWcmWorklfowTerminateExclusionList: Object) =
        s"""
        | {
        | "eventFilter":$var_eventFilter,"minThreadPoolSize":$var_minThreadPoolSize,"maxThreadPoolSize":$var_maxThreadPoolSize,"cqWcmWorkflowTerminateOnActivate":$var_cqWcmWorkflowTerminateOnActivate,"cqWcmWorklfowTerminateExclusionList":$var_cqWcmWorklfowTerminateExclusionList
        | }
        """.stripMargin
}
