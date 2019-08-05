-module(openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties() ::
    #{ 'referencesearchservlet_maxReferencesPerPage' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'referencesearchservlet_maxPages' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'referencesearchservlet_maxReferencesPerPage' := ReferencesearchservletMaxReferencesPerPage,
          'referencesearchservlet_maxPages' := ReferencesearchservletMaxPages
        }) ->
    #{ 'referencesearchservlet.maxReferencesPerPage' => ReferencesearchservletMaxReferencesPerPage,
       'referencesearchservlet.maxPages' => ReferencesearchservletMaxPages
     }.
