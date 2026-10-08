-module(openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties() ::
  [ {'cq_dam_sync_workflow_id', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cq_dam_sync_folder_types', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_health_check_servlet_properties(Fields) ->
  Default = [ {'cq.dam.sync.workflow.id', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cq.dam.sync.folder.types', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

