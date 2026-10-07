-module(openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties/0]).

-type openapi_com_adobe_cq_social_accountverification_impl_account_management_config_im_properties() ::
    #{ 'enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ttl1' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'ttl2' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'enable' := Enable,
          'ttl1' := Ttl1,
          'ttl2' := Ttl2
        }) ->
    #{ 'enable' => Enable,
       'ttl1' => Ttl1,
       'ttl2' => Ttl2
     }.
