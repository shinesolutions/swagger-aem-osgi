-module(openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties/0]).

-export([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties/1]).

-export_type([openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties/0]).

-type openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties() ::
  [ {'archiving_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'scheduler_expression', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'archive_since_days_completed', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties() ->
    openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties([]).

openapi_com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties(Fields) ->
  Default = [ {'archiving.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'scheduler.expression', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'archive.since.days.completed', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

