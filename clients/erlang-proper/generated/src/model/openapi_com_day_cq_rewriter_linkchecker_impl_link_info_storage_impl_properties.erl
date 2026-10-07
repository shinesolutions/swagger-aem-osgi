-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties/0]).

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties() ::
  [ {'service_max_links_per_host', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'service_save_external_link_references', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties() ->
    openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties([]).

openapi_com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_properties(Fields) ->
  Default = [ {'service.max_links_per_host', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'service.save_external_link_references', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

