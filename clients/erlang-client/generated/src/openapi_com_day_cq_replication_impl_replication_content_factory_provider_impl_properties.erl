-module(openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_replication_content_factory_provider_impl_properties() ::
    #{ 'replication_content_useFileStorage' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'replication_content_maxCommitAttempts' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'replication_content_useFileStorage' := ReplicationContentUseFileStorage,
          'replication_content_maxCommitAttempts' := ReplicationContentMaxCommitAttempts
        }) ->
    #{ 'replication.content.useFileStorage' => ReplicationContentUseFileStorage,
       'replication.content.maxCommitAttempts' => ReplicationContentMaxCommitAttempts
     }.
