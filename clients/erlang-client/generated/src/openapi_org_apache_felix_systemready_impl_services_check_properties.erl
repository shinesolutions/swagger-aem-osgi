-module(openapi_org_apache_felix_systemready_impl_services_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_systemready_impl_services_check_properties/0]).

-type openapi_org_apache_felix_systemready_impl_services_check_properties() ::
    #{ 'services_list' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'type' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'services_list' := ServicesList,
          'type' := Type
        }) ->
    #{ 'services.list' => ServicesList,
       'type' => Type
     }.
