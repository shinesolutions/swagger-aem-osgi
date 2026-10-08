
package org.openapitools.client.model


case class ComDayCqCommonsImplExternalizerImplProperties (
    _externalizerDomains: Option[ConfigNodePropertyArray],
    _externalizerHost: Option[ConfigNodePropertyString],
    _externalizerContextpath: Option[ConfigNodePropertyString],
    _externalizerEncodedpath: Option[ConfigNodePropertyBoolean]
)
object ComDayCqCommonsImplExternalizerImplProperties {
    def toStringBody(var_externalizerDomains: Object, var_externalizerHost: Object, var_externalizerContextpath: Object, var_externalizerEncodedpath: Object) =
        s"""
        | {
        | "externalizerDomains":$var_externalizerDomains,"externalizerHost":$var_externalizerHost,"externalizerContextpath":$var_externalizerContextpath,"externalizerEncodedpath":$var_externalizerEncodedpath
        | }
        """.stripMargin
}
