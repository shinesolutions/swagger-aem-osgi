
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties (
    _poolSize: Option[ConfigNodePropertyInteger],
    _maxPoolSize: Option[ConfigNodePropertyInteger],
    _queueSize: Option[ConfigNodePropertyInteger],
    _keepAliveTime: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {
    def toStringBody(var_poolSize: Object, var_maxPoolSize: Object, var_queueSize: Object, var_keepAliveTime: Object) =
        s"""
        | {
        | "poolSize":$var_poolSize,"maxPoolSize":$var_maxPoolSize,"queueSize":$var_queueSize,"keepAliveTime":$var_keepAliveTime
        | }
        """.stripMargin
}
