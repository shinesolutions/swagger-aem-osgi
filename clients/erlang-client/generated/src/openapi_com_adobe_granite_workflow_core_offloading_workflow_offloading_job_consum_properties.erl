-module(openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties/0]).

-type openapi_com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_properties() ::
    #{ 'job_topics' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'job_topics' := JobTopics
        }) ->
    #{ 'job.topics' => JobTopics
     }.
