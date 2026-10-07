
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties (
    _threadPoolSize: Option[ConfigNodePropertyInteger],
    _delayTime: Option[ConfigNodePropertyInteger],
    _workerSleepTime: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {
    def toStringBody(var_threadPoolSize: Object, var_delayTime: Object, var_workerSleepTime: Object) =
        s"""
        | {
        | "threadPoolSize":$var_threadPoolSize,"delayTime":$var_delayTime,"workerSleepTime":$var_workerSleepTime
        | }
        """.stripMargin
}
