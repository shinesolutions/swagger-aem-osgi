-module(openapi_com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config_properties/0]).

-type openapi_com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config_properties() ::
    #{ 'operation' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'emailEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'operation' := Operation,
          'emailEnabled' := EmailEnabled
        }) ->
    #{ 'operation' => Operation,
       'emailEnabled' => EmailEnabled
     }.
