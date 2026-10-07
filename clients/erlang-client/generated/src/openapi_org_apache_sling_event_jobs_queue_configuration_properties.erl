-module(openapi_org_apache_sling_event_jobs_queue_configuration_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_event_jobs_queue_configuration_properties/0]).

-type openapi_org_apache_sling_event_jobs_queue_configuration_properties() ::
    #{ 'queue_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'queue_topics' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'queue_type' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'queue_priority' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'queue_retries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queue_retrydelay' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queue_maxparallel' => openapi_config_node_property_float:openapi_config_node_property_float(),
       'queue_keepJobs' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'queue_preferRunOnCreationInstance' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'queue_threadPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'queue_name' := QueueName,
          'queue_topics' := QueueTopics,
          'queue_type' := QueueType,
          'queue_priority' := QueuePriority,
          'queue_retries' := QueueRetries,
          'queue_retrydelay' := QueueRetrydelay,
          'queue_maxparallel' := QueueMaxparallel,
          'queue_keepJobs' := QueueKeepJobs,
          'queue_preferRunOnCreationInstance' := QueuePreferRunOnCreationInstance,
          'queue_threadPoolSize' := QueueThreadPoolSize,
          'service_ranking' := ServiceRanking
        }) ->
    #{ 'queue.name' => QueueName,
       'queue.topics' => QueueTopics,
       'queue.type' => QueueType,
       'queue.priority' => QueuePriority,
       'queue.retries' => QueueRetries,
       'queue.retrydelay' => QueueRetrydelay,
       'queue.maxparallel' => QueueMaxparallel,
       'queue.keepJobs' => QueueKeepJobs,
       'queue.preferRunOnCreationInstance' => QueuePreferRunOnCreationInstance,
       'queue.threadPoolSize' => QueueThreadPoolSize,
       'service.ranking' => ServiceRanking
     }.
