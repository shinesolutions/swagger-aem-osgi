-module(openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties/0]).

-type openapi_com_adobe_granite_workflow_core_job_external_process_job_handler_properties() ::
    #{ 'default_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'max_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'default_period' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'default_timeout' := DefaultTimeout,
          'max_timeout' := MaxTimeout,
          'default_period' := DefaultPeriod
        }) ->
    #{ 'default.timeout' => DefaultTimeout,
       'max.timeout' => MaxTimeout,
       'default.period' => DefaultPeriod
     }.
