-module(openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info/0]).

-type openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties:openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
