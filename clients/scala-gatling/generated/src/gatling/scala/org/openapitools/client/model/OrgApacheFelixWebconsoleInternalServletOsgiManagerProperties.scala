
package org.openapitools.client.model


case class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties (
    _managerRoot: Option[ConfigNodePropertyString],
    _httpServiceFilter: Option[ConfigNodePropertyString],
    _defaultRender: Option[ConfigNodePropertyString],
    _realm: Option[ConfigNodePropertyString],
    _username: Option[ConfigNodePropertyString],
    _password: Option[ConfigNodePropertyString],
    _category: Option[ConfigNodePropertyString],
    _locale: Option[ConfigNodePropertyString],
    _loglevel: Option[ConfigNodePropertyDropDown],
    _plugins: Option[ConfigNodePropertyDropDown]
)
object OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {
    def toStringBody(var_managerRoot: Object, var_httpServiceFilter: Object, var_defaultRender: Object, var_realm: Object, var_username: Object, var_password: Object, var_category: Object, var_locale: Object, var_loglevel: Object, var_plugins: Object) =
        s"""
        | {
        | "managerRoot":$var_managerRoot,"httpServiceFilter":$var_httpServiceFilter,"defaultRender":$var_defaultRender,"realm":$var_realm,"username":$var_username,"password":$var_password,"category":$var_category,"locale":$var_locale,"loglevel":$var_loglevel,"plugins":$var_plugins
        | }
        """.stripMargin
}
