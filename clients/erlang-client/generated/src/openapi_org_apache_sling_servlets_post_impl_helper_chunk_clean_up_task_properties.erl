-module(openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties/0]).

-type openapi_org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'scheduler_concurrent' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'chunk_cleanup_age' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression,
          'scheduler_concurrent' := SchedulerConcurrent,
          'chunk_cleanup_age' := ChunkCleanupAge
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression,
       'scheduler.concurrent' => SchedulerConcurrent,
       'chunk.cleanup.age' => ChunkCleanupAge
     }.
