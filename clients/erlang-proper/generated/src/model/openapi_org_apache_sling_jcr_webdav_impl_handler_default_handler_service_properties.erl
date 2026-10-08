-module(openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties/0]).

-export([openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'type_collections', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type_noncollections', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'type_content', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties() ->
    openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties([]).

openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'type.collections', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type.noncollections', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'type.content', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

