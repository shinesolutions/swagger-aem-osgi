
package org.openapitools.client.model


case class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties (
    _illegalCharMapping: Option[ConfigNodePropertyString],
    _pageSubTreeActivationCheck: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {
    def toStringBody(var_illegalCharMapping: Object, var_pageSubTreeActivationCheck: Object) =
        s"""
        | {
        | "illegalCharMapping":$var_illegalCharMapping,"pageSubTreeActivationCheck":$var_pageSubTreeActivationCheck
        | }
        """.stripMargin
}
