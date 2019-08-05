-module(openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties/0]).

-type openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties() ::
    #{ 'sling_servlet_selectors' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_servlet_extensions' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'sling_servlet_selectors' := SlingServletSelectors,
          'sling_servlet_extensions' := SlingServletExtensions
        }) ->
    #{ 'sling.servlet.selectors' => SlingServletSelectors,
       'sling.servlet.extensions' => SlingServletExtensions
     }.
