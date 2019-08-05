-module(openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties/0]).

-type openapi_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties() ::
    #{ 'default_transport_agent_to_worker_prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'default_transport_agent_to_master_prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'default_transport_input_package' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'default_transport_output_package' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'default_transport_replication_synchronous' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'default_transport_contentpackage' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'offloading_transporter_default_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'default_transport_agent_to_worker_prefix' := DefaultTransportAgentToWorkerPrefix,
          'default_transport_agent_to_master_prefix' := DefaultTransportAgentToMasterPrefix,
          'default_transport_input_package' := DefaultTransportInputPackage,
          'default_transport_output_package' := DefaultTransportOutputPackage,
          'default_transport_replication_synchronous' := DefaultTransportReplicationSynchronous,
          'default_transport_contentpackage' := DefaultTransportContentpackage,
          'offloading_transporter_default_enabled' := OffloadingTransporterDefaultEnabled
        }) ->
    #{ 'default.transport.agent-to-worker.prefix' => DefaultTransportAgentToWorkerPrefix,
       'default.transport.agent-to-master.prefix' => DefaultTransportAgentToMasterPrefix,
       'default.transport.input.package' => DefaultTransportInputPackage,
       'default.transport.output.package' => DefaultTransportOutputPackage,
       'default.transport.replication.synchronous' => DefaultTransportReplicationSynchronous,
       'default.transport.contentpackage' => DefaultTransportContentpackage,
       'offloading.transporter.default.enabled' => OffloadingTransporterDefaultEnabled
     }.
