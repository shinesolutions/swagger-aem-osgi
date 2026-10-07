-module(openapi_com_adobe_granite_workflow_core_job_job_handler_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_job_job_handler_properties/0]).

-type openapi_com_adobe_granite_workflow_core_job_job_handler_properties() ::
    #{ 'job_topics' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'allow_self_process_termination' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'job_topics' := JobTopics,
          'allow_self_process_termination' := AllowSelfProcessTermination
        }) ->
    #{ 'job.topics' => JobTopics,
       'allow.self.process.termination' => AllowSelfProcessTermination
     }.
