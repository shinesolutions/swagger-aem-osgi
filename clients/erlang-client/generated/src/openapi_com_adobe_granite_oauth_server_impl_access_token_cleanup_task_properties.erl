-module(openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties/0]).

-type openapi_com_adobe_granite_oauth_server_impl_access_token_cleanup_task_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression
     }.
