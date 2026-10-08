
package org.openapitools.client.model


case class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties (
    _eventTopics: Option[ConfigNodePropertyString],
    _eventFilter: Option[ConfigNodePropertyString],
    _translateListenerType: Option[ConfigNodePropertyArray],
    _translatePropertyList: Option[ConfigNodePropertyArray],
    _poolSize: Option[ConfigNodePropertyInteger],
    _maxPoolSize: Option[ConfigNodePropertyInteger],
    _queueSize: Option[ConfigNodePropertyInteger],
    _keepAliveTime: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {
    def toStringBody(var_eventTopics: Object, var_eventFilter: Object, var_translateListenerType: Object, var_translatePropertyList: Object, var_poolSize: Object, var_maxPoolSize: Object, var_queueSize: Object, var_keepAliveTime: Object) =
        s"""
        | {
        | "eventTopics":$var_eventTopics,"eventFilter":$var_eventFilter,"translateListenerType":$var_translateListenerType,"translatePropertyList":$var_translatePropertyList,"poolSize":$var_poolSize,"maxPoolSize":$var_maxPoolSize,"queueSize":$var_queueSize,"keepAliveTime":$var_keepAliveTime
        | }
        """.stripMargin
}
