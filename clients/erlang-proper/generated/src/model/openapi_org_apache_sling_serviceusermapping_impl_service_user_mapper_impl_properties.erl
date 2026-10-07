-module(openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties/0]).

-export([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties/1]).

-export_type([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties/0]).

-type openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties() ::
  [ {'user_mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'user_default', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'user_enable_default_mapping', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'require_validation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties() ->
    openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties([]).

openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties(Fields) ->
  Default = [ {'user.mapping', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'user.default', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'user.enable.default.mapping', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'require.validation', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

