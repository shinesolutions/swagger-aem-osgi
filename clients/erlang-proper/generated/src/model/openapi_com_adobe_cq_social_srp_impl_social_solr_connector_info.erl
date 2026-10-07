-module(openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info/0]).

-export([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info/1]).

-export_type([openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info/0]).

-type openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties:openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties() }
  ].


openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info() ->
    openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info([]).

openapi_com_adobe_cq_social_srp_impl_social_solr_connector_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties:openapi_com_adobe_cq_social_srp_impl_social_solr_connector_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

