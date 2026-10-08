-module(openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties/0]).

-export([openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties/1]).

-export_type([openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties/0]).

-type openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties() ::
  [ {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sitePathFilters', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sitePackageGroup', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties() ->
    openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties([]).

openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties(Fields) ->
  Default = [ {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sitePathFilters', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sitePackageGroup', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

