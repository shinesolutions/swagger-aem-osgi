-module(openapi_com_day_crx_security_token_impl_token_cleanup_task_properties).

-export([encode/1]).

-export_type([openapi_com_day_crx_security_token_impl_token_cleanup_task_properties/0]).

-type openapi_com_day_crx_security_token_impl_token_cleanup_task_properties() ::
    #{ 'enable_token_cleanup_task' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'batch_size' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'enable_token_cleanup_task' := EnableTokenCleanupTask,
          'scheduler_expression' := SchedulerExpression,
          'batch_size' := BatchSize
        }) ->
    #{ 'enable.token.cleanup.task' => EnableTokenCleanupTask,
       'scheduler.expression' => SchedulerExpression,
       'batch.size' => BatchSize
     }.
