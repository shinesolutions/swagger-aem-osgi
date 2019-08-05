-module(openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties/0]).

-type openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties() ::
    #{ 'srp_type' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'srp_type' := SrpType
        }) ->
    #{ 'srp.type' => SrpType
     }.
