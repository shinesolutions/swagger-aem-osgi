-module(openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties/0]).

-export([openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties/1]).

-export_type([openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties/0]).

-type openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties() ::
  [ {'full_gc_days', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties() ->
    openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties([]).

openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties(Fields) ->
  Default = [ {'full.gc.days', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

