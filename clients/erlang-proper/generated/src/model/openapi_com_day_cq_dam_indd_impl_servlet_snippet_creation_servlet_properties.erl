-module(openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties/0]).

-export([openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties/0]).

-type openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties() ::
  [ {'snippetcreation_maxcollections', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties() ->
    openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties([]).

openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties(Fields) ->
  Default = [ {'snippetcreation.maxcollections', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

