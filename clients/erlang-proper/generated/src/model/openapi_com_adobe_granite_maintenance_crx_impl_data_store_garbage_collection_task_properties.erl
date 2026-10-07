-module(openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties/0]).

-export([openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties/1]).

-export_type([openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties/0]).

-type openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties() ::
  [ {'granite_maintenance_mandatory', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'job_topics', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties() ->
    openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties([]).

openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties(Fields) ->
  Default = [ {'granite.maintenance.mandatory', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'job.topics', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

