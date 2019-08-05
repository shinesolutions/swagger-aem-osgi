-module(openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties/0]).

-type openapi_com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_properties() ::
    #{ 'operation' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'operationIcon' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'topicName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'emailEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'operation' := Operation,
          'operationIcon' := OperationIcon,
          'topicName' := TopicName,
          'emailEnabled' := EmailEnabled
        }) ->
    #{ 'operation' => Operation,
       'operationIcon' => OperationIcon,
       'topicName' => TopicName,
       'emailEnabled' => EmailEnabled
     }.
