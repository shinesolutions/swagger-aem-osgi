-module(openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties/0]).

-export([openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties/0]).

-type openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'disk_space_warn_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'disk_space_error_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties() ->
    openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties([]).

openapi_com_adobe_granite_repository_hc_impl_disk_space_health_check_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'disk.space.warn.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'disk.space.error.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

