-module(openapi_com_adobe_cq_history_impl_history_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_history_impl_history_service_impl_properties/0]).

-type openapi_com_adobe_cq_history_impl_history_service_impl_properties() ::
    #{ 'history_service_resourceTypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'history_service_pathFilter' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'history_service_resourceTypes' := HistoryServiceResourceTypes,
          'history_service_pathFilter' := HistoryServicePathFilter
        }) ->
    #{ 'history.service.resourceTypes' => HistoryServiceResourceTypes,
       'history.service.pathFilter' => HistoryServicePathFilter
     }.
