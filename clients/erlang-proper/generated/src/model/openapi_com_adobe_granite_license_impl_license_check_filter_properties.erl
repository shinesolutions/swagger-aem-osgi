-module(openapi_com_adobe_granite_license_impl_license_check_filter_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_license_impl_license_check_filter_properties/0]).

-export([openapi_com_adobe_granite_license_impl_license_check_filter_properties/1]).

-export_type([openapi_com_adobe_granite_license_impl_license_check_filter_properties/0]).

-type openapi_com_adobe_granite_license_impl_license_check_filter_properties() ::
  [ {'checkInternval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'excludeIds', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'encryptPing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_license_impl_license_check_filter_properties() ->
    openapi_com_adobe_granite_license_impl_license_check_filter_properties([]).

openapi_com_adobe_granite_license_impl_license_check_filter_properties(Fields) ->
  Default = [ {'checkInternval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'excludeIds', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'encryptPing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

