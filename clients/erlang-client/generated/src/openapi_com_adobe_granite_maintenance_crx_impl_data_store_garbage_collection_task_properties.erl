-module(openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties/0]).

-type openapi_com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_properties() ::
    #{ 'granite_maintenance_mandatory' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'job_topics' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'granite_maintenance_mandatory' := GraniteMaintenanceMandatory,
          'job_topics' := JobTopics
        }) ->
    #{ 'granite.maintenance.mandatory' => GraniteMaintenanceMandatory,
       'job.topics' => JobTopics
     }.
