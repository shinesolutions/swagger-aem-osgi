-module(openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties/0]).

-type openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties() ::
    #{ 'com_adobe_granite_jetty_ssl_port' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'com_adobe_granite_jetty_ssl_keystore_user' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_granite_jetty_ssl_keystore_password' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'com_adobe_granite_jetty_ssl_ciphersuites_excluded' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'com_adobe_granite_jetty_ssl_ciphersuites_included' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'com_adobe_granite_jetty_ssl_client_certificate' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'com_adobe_granite_jetty_ssl_port' := ComAdobeGraniteJettySslPort,
          'com_adobe_granite_jetty_ssl_keystore_user' := ComAdobeGraniteJettySslKeystoreUser,
          'com_adobe_granite_jetty_ssl_keystore_password' := ComAdobeGraniteJettySslKeystorePassword,
          'com_adobe_granite_jetty_ssl_ciphersuites_excluded' := ComAdobeGraniteJettySslCiphersuitesExcluded,
          'com_adobe_granite_jetty_ssl_ciphersuites_included' := ComAdobeGraniteJettySslCiphersuitesIncluded,
          'com_adobe_granite_jetty_ssl_client_certificate' := ComAdobeGraniteJettySslClientCertificate
        }) ->
    #{ 'com.adobe.granite.jetty.ssl.port' => ComAdobeGraniteJettySslPort,
       'com.adobe.granite.jetty.ssl.keystore.user' => ComAdobeGraniteJettySslKeystoreUser,
       'com.adobe.granite.jetty.ssl.keystore.password' => ComAdobeGraniteJettySslKeystorePassword,
       'com.adobe.granite.jetty.ssl.ciphersuites.excluded' => ComAdobeGraniteJettySslCiphersuitesExcluded,
       'com.adobe.granite.jetty.ssl.ciphersuites.included' => ComAdobeGraniteJettySslCiphersuitesIncluded,
       'com.adobe.granite.jetty.ssl.client.certificate' => ComAdobeGraniteJettySslClientCertificate
     }.
