-module(openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info/0]).

-type openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties:openapi_com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_properties()
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
