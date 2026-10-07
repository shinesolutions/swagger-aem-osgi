-module(openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties/0]).

-type openapi_com_adobe_cq_social_forum_dispatcher_impl_flush_operations_properties() ::
    #{ 'extension_order' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'flush_forumontopic' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'extension_order' := ExtensionOrder,
          'flush_forumontopic' := FlushForumontopic
        }) ->
    #{ 'extension.order' => ExtensionOrder,
       'flush.forumontopic' => FlushForumontopic
     }.
