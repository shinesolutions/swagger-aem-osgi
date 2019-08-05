-module(openapi_org_apache_felix_systemready_impl_components_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_systemready_impl_components_check_properties/0]).

-type openapi_org_apache_felix_systemready_impl_components_check_properties() ::
    #{ 'components_list' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'type' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'components_list' := ComponentsList,
          'type' := Type
        }) ->
    #{ 'components.list' => ComponentsList,
       'type' => Type
     }.
