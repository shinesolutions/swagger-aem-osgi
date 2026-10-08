
package org.openapitools.client.model


case class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties (
    _comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters: Option[ConfigNodePropertyArray]
)
object ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties {
    def toStringBody(var_comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters: Object) =
        s"""
        | {
        | "comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters":$var_comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
        | }
        """.stripMargin
}
