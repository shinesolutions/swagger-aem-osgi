-module(openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties/0]).

-export([openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties/1]).

-export_type([openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties/0]).

-type openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties() ::
  [ {'com_adobe_granite_jetty_ssl_port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_granite_jetty_ssl_keystore_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_granite_jetty_ssl_keystore_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_granite_jetty_ssl_ciphersuites_excluded', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'com_adobe_granite_jetty_ssl_ciphersuites_included', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'com_adobe_granite_jetty_ssl_client_certificate', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties() ->
    openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties([]).

openapi_com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties(Fields) ->
  Default = [ {'com.adobe.granite.jetty.ssl.port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.granite.jetty.ssl.keystore.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.granite.jetty.ssl.keystore.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.granite.jetty.ssl.ciphersuites.excluded', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'com.adobe.granite.jetty.ssl.ciphersuites.included', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'com.adobe.granite.jetty.ssl.client.certificate', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

