
package org.openapitools.client.model


case class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _pathPrefix: Option[ConfigNodePropertyString],
    _createVersion: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {
    def toStringBody(var_serviceRanking: Object, var_pathPrefix: Object, var_createVersion: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"pathPrefix":$var_pathPrefix,"createVersion":$var_createVersion
        | }
        """.stripMargin
}
