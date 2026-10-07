-module(openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties/0]).

-export([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties/1]).

-export_type([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties/0]).

-type openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties() ::
  [ {'srp_type', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties() ->
    openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties([]).

openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties(Fields) ->
  Default = [ {'srp.type', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

