-module(openapi_com_adobe_cq_social_sync_impl_user_sync_listener_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_sync_impl_user_sync_listener_impl_properties/0]).

-type openapi_com_adobe_cq_social_sync_impl_user_sync_listener_impl_properties() ::
    #{ 'nodetypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'ignorableprops' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'ignorablenodes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'distfolders' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'nodetypes' := Nodetypes,
          'ignorableprops' := Ignorableprops,
          'ignorablenodes' := Ignorablenodes,
          'enabled' := Enabled,
          'distfolders' := Distfolders
        }) ->
    #{ 'nodetypes' => Nodetypes,
       'ignorableprops' => Ignorableprops,
       'ignorablenodes' => Ignorablenodes,
       'enabled' => Enabled,
       'distfolders' => Distfolders
     }.
