-module(openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties/0]).

-export([openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties/1]).

-export_type([openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties/0]).

-type openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties() ::
  [ {'sling_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_description', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties() ->
    openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties([]).

openapi_org_apache_sling_settings_impl_sling_settings_service_impl_properties(Fields) ->
  Default = [ {'sling.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.description', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

