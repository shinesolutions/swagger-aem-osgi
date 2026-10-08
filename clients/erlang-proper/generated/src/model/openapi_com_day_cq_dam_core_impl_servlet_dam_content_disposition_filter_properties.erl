-module(openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties() ::
  [ {'cq_mime_type_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cq_dam_empty_mime', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_properties(Fields) ->
  Default = [ {'cq.mime.type.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cq.dam.empty.mime', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

