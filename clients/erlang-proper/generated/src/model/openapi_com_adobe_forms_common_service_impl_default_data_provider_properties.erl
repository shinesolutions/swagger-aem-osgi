-module(openapi_com_adobe_forms_common_service_impl_default_data_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_forms_common_service_impl_default_data_provider_properties/0]).

-export([openapi_com_adobe_forms_common_service_impl_default_data_provider_properties/1]).

-export_type([openapi_com_adobe_forms_common_service_impl_default_data_provider_properties/0]).

-type openapi_com_adobe_forms_common_service_impl_default_data_provider_properties() ::
  [ {'alloweddataFileLocations', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_forms_common_service_impl_default_data_provider_properties() ->
    openapi_com_adobe_forms_common_service_impl_default_data_provider_properties([]).

openapi_com_adobe_forms_common_service_impl_default_data_provider_properties(Fields) ->
  Default = [ {'alloweddataFileLocations', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

