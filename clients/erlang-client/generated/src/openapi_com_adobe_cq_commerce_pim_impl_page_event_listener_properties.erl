-module(openapi_com_adobe_cq_commerce_pim_impl_page_event_listener_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_commerce_pim_impl_page_event_listener_properties/0]).

-type openapi_com_adobe_cq_commerce_pim_impl_page_event_listener_properties() ::
    #{ 'cq_commerce_pageeventlistener_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_commerce_pageeventlistener_enabled' := CqCommercePageeventlistenerEnabled
        }) ->
    #{ 'cq.commerce.pageeventlistener.enabled' => CqCommercePageeventlistenerEnabled
     }.
