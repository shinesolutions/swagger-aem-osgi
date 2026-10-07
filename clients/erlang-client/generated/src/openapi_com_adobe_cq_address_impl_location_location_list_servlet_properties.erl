-module(openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties/0]).

-type openapi_com_adobe_cq_address_impl_location_location_list_servlet_properties() ::
    #{ 'cq_address_location_default_maxResults' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'cq_address_location_default_maxResults' := CqAddressLocationDefaultMaxResults
        }) ->
    #{ 'cq.address.location.default.maxResults' => CqAddressLocationDefaultMaxResults
     }.
