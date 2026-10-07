-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties/0]).

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties() ::
  [ {'scheduler_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'scheduler_concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'good_link_test_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'bad_link_test_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'link_unused_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'connection_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties() ->
    openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties([]).

openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties(Fields) ->
  Default = [ {'scheduler.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'scheduler.concurrent', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'good_link_test_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'bad_link_test_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'link_unused_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'connection.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

