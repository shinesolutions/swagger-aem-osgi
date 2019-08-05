-module(openapi_com_day_cq_replication_impl_replication_receiver_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_replication_impl_replication_receiver_impl_properties/0]).

-type openapi_com_day_cq_replication_impl_replication_receiver_impl_properties() ::
    #{ 'receiver_tmpfile_threshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'receiver_packages_use_install' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'receiver_tmpfile_threshold' := ReceiverTmpfileThreshold,
          'receiver_packages_use_install' := ReceiverPackagesUseInstall
        }) ->
    #{ 'receiver.tmpfile.threshold' => ReceiverTmpfileThreshold,
       'receiver.packages.use.install' => ReceiverPackagesUseInstall
     }.
