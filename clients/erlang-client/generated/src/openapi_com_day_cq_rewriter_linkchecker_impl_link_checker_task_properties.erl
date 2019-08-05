-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties() ::
    #{ 'scheduler_period' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'scheduler_concurrent' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'good_link_test_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'bad_link_test_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'link_unused_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'connection_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'scheduler_period' := SchedulerPeriod,
          'scheduler_concurrent' := SchedulerConcurrent,
          'good_link_test_interval' := GoodLinkTestInterval,
          'bad_link_test_interval' := BadLinkTestInterval,
          'link_unused_interval' := LinkUnusedInterval,
          'connection_timeout' := ConnectionTimeout
        }) ->
    #{ 'scheduler.period' => SchedulerPeriod,
       'scheduler.concurrent' => SchedulerConcurrent,
       'good_link_test_interval' => GoodLinkTestInterval,
       'bad_link_test_interval' => BadLinkTestInterval,
       'link_unused_interval' => LinkUnusedInterval,
       'connection.timeout' => ConnectionTimeout
     }.
