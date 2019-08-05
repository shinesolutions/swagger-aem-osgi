-module(openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties/0]).

-type openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties() ::
    #{ 'image_quality' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'image_supported_resolutions' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'image_quality' := ImageQuality,
          'image_supported_resolutions' := ImageSupportedResolutions
        }) ->
    #{ 'image.quality' => ImageQuality,
       'image.supported.resolutions' => ImageSupportedResolutions
     }.
