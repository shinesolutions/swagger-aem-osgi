-module(openapi_org_apache_sling_servlets_get_default_get_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_servlets_get_default_get_servlet_properties/0]).

-type openapi_org_apache_sling_servlets_get_default_get_servlet_properties() ::
    #{ 'aliases' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'index' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'index_files' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enable_html' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'enable_json' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'enable_txt' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'enable_xml' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'json_maximumresults' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'ecmaSuport' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'aliases' := Aliases,
          'index' := Index,
          'index_files' := IndexFiles,
          'enable_html' := EnableHtml,
          'enable_json' := EnableJson,
          'enable_txt' := EnableTxt,
          'enable_xml' := EnableXml,
          'json_maximumresults' := JsonMaximumresults,
          'ecmaSuport' := EcmaSuport
        }) ->
    #{ 'aliases' => Aliases,
       'index' => Index,
       'index.files' => IndexFiles,
       'enable.html' => EnableHtml,
       'enable.json' => EnableJson,
       'enable.txt' => EnableTxt,
       'enable.xml' => EnableXml,
       'json.maximumresults' => JsonMaximumresults,
       'ecmaSuport' => EcmaSuport
     }.
