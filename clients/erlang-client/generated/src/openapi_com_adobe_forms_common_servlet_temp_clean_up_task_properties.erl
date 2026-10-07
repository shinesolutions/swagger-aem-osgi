-module(openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties/0]).

-type openapi_com_adobe_forms_common_servlet_temp_clean_up_task_properties() ::
    #{ 'scheduler_expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'Duration_for_Temporary_Storage' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'Duration_for_Anonymous_Storage' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'scheduler_expression' := SchedulerExpression,
          'Duration_for_Temporary_Storage' := DurationForTemporaryStorage,
          'Duration_for_Anonymous_Storage' := DurationForAnonymousStorage
        }) ->
    #{ 'scheduler.expression' => SchedulerExpression,
       'Duration for Temporary Storage' => DurationForTemporaryStorage,
       'Duration for Anonymous Storage' => DurationForAnonymousStorage
     }.
