-module(openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties/0]).

-type openapi_org_apache_sling_event_impl_jobs_default_job_manager_properties() ::
    #{ 'queue_priority' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'queue_retries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queue_retrydelay' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queue_maxparallel' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'queue_priority' := QueuePriority,
          'queue_retries' := QueueRetries,
          'queue_retrydelay' := QueueRetrydelay,
          'queue_maxparallel' := QueueMaxparallel
        }) ->
    #{ 'queue.priority' => QueuePriority,
       'queue.retries' => QueueRetries,
       'queue.retrydelay' => QueueRetrydelay,
       'queue.maxparallel' => QueueMaxparallel
     }.
