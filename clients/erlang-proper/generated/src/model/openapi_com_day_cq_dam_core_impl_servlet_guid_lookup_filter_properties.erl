-module(openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties() ::
  [ {'cq_dam_core_guidlookupfilter_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties(Fields) ->
  Default = [ {'cq.dam.core.guidlookupfilter.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

