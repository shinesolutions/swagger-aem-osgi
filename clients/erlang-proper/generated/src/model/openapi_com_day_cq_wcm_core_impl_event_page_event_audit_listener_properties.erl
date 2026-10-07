-module(openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties() ::
  [ {'configured', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties() ->
    openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties([]).

openapi_com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties(Fields) ->
  Default = [ {'configured', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

