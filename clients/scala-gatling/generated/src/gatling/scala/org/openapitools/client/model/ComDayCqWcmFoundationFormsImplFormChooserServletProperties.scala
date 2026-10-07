
package org.openapitools.client.model


case class ComDayCqWcmFoundationFormsImplFormChooserServletProperties (
    _serviceName: Option[ConfigNodePropertyString],
    _slingServletResourceTypes: Option[ConfigNodePropertyString],
    _slingServletSelectors: Option[ConfigNodePropertyString],
    _slingServletMethods: Option[ConfigNodePropertyArray],
    _formsFormchooserservletAdvansesearchRequire: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmFoundationFormsImplFormChooserServletProperties {
    def toStringBody(var_serviceName: Object, var_slingServletResourceTypes: Object, var_slingServletSelectors: Object, var_slingServletMethods: Object, var_formsFormchooserservletAdvansesearchRequire: Object) =
        s"""
        | {
        | "serviceName":$var_serviceName,"slingServletResourceTypes":$var_slingServletResourceTypes,"slingServletSelectors":$var_slingServletSelectors,"slingServletMethods":$var_slingServletMethods,"formsFormchooserservletAdvansesearchRequire":$var_formsFormchooserservletAdvansesearchRequire
        | }
        """.stripMargin
}
