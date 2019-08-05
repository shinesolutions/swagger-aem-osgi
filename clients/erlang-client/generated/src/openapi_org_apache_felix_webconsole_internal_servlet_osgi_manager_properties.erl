-module(openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties/0]).

-type openapi_org_apache_felix_webconsole_internal_servlet_osgi_manager_properties() ::
    #{ 'manager_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'http_service_filter' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'default_render' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'realm' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'username' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'password' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'category' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'locale' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'loglevel' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'plugins' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'manager_root' := ManagerRoot,
          'http_service_filter' := HttpServiceFilter,
          'default_render' := DefaultRender,
          'realm' := Realm,
          'username' := Username,
          'password' := Password,
          'category' := Category,
          'locale' := Locale,
          'loglevel' := Loglevel,
          'plugins' := Plugins
        }) ->
    #{ 'manager.root' => ManagerRoot,
       'http.service.filter' => HttpServiceFilter,
       'default.render' => DefaultRender,
       'realm' => Realm,
       'username' => Username,
       'password' => Password,
       'category' => Category,
       'locale' => Locale,
       'loglevel' => Loglevel,
       'plugins' => Plugins
     }.
