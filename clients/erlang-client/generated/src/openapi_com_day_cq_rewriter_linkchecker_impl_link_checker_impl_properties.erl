-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties() ::
    #{ 'scheduler_period' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'scheduler_concurrent' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'service_bad_link_tolerance_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'service_check_override_patterns' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'service_cache_broken_internal_links' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'service_special_link_prefix' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'service_special_link_patterns' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'scheduler_period' := SchedulerPeriod,
          'scheduler_concurrent' := SchedulerConcurrent,
          'service_bad_link_tolerance_interval' := ServiceBadLinkToleranceInterval,
          'service_check_override_patterns' := ServiceCheckOverridePatterns,
          'service_cache_broken_internal_links' := ServiceCacheBrokenInternalLinks,
          'service_special_link_prefix' := ServiceSpecialLinkPrefix,
          'service_special_link_patterns' := ServiceSpecialLinkPatterns
        }) ->
    #{ 'scheduler.period' => SchedulerPeriod,
       'scheduler.concurrent' => SchedulerConcurrent,
       'service.bad_link_tolerance_interval' => ServiceBadLinkToleranceInterval,
       'service.check_override_patterns' => ServiceCheckOverridePatterns,
       'service.cache_broken_internal_links' => ServiceCacheBrokenInternalLinks,
       'service.special_link_prefix' => ServiceSpecialLinkPrefix,
       'service.special_link_patterns' => ServiceSpecialLinkPatterns
     }.
