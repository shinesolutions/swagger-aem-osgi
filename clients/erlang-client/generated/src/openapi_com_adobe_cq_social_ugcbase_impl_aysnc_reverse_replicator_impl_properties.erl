-module(openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_properties() ::
    #{ 'poolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'queueSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'keepAliveTime' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'poolSize' := PoolSize,
          'maxPoolSize' := MaxPoolSize,
          'queueSize' := QueueSize,
          'keepAliveTime' := KeepAliveTime
        }) ->
    #{ 'poolSize' => PoolSize,
       'maxPoolSize' => MaxPoolSize,
       'queueSize' => QueueSize,
       'keepAliveTime' => KeepAliveTime
     }.
