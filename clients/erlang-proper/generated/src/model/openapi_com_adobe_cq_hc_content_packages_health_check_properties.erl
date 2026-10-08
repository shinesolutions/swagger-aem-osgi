-module(openapi_com_adobe_cq_hc_content_packages_health_check_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_hc_content_packages_health_check_properties/0]).

-export([openapi_com_adobe_cq_hc_content_packages_health_check_properties/1]).

-export_type([openapi_com_adobe_cq_hc_content_packages_health_check_properties/0]).

-type openapi_com_adobe_cq_hc_content_packages_health_check_properties() ::
  [ {'hc_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'hc_mbean_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'package_names', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_hc_content_packages_health_check_properties() ->
    openapi_com_adobe_cq_hc_content_packages_health_check_properties([]).

openapi_com_adobe_cq_hc_content_packages_health_check_properties(Fields) ->
  Default = [ {'hc.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'hc.mbean.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'package.names', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

