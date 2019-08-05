-module(openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties/0]).

-type openapi_com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_properties() ::
    #{ 'full_gc_days' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'full_gc_days' := FullGcDays
        }) ->
    #{ 'full.gc.days' => FullGcDays
     }.
