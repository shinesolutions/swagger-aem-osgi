-module(openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties/0]).

-type openapi_com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_properties() ::
    #{ 'job_topics' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'job_topics' := JobTopics
        }) ->
    #{ 'job.topics' => JobTopics
     }.
