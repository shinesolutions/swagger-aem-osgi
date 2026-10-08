-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties/0]).

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties() ::
  [ {'scheduler_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'scheduler_concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'service_bad_link_tolerance_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'service_check_override_patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'service_cache_broken_internal_links', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'service_special_link_prefix', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'service_special_link_patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties() ->
    openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties([]).

openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties(Fields) ->
  Default = [ {'scheduler.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'scheduler.concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'service.bad_link_tolerance_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'service.check_override_patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'service.cache_broken_internal_links', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'service.special_link_prefix', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'service.special_link_patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

