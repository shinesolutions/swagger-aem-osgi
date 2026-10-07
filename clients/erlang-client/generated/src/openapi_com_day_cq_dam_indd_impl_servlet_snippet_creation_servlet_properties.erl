-module(openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties/0]).

-type openapi_com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties() ::
    #{ 'snippetcreation_maxcollections' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'snippetcreation_maxcollections' := SnippetcreationMaxcollections
        }) ->
    #{ 'snippetcreation.maxcollections' => SnippetcreationMaxcollections
     }.
