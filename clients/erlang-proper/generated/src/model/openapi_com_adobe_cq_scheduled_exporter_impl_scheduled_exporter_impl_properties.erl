-module(openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties/0]).

-export([openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties/1]).

-export_type([openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties/0]).

-type openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties() ::
  [ {'include_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'exporter_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties() ->
    openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties([]).

openapi_com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties(Fields) ->
  Default = [ {'include.paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'exporter.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

