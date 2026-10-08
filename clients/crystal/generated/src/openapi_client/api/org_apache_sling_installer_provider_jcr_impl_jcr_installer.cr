require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingInstallerProviderJcrImplJcrInstaller
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, handler_schemes : Array(String)? = nil, sling_jcrinstall_folder_name_regexp : String? = nil, sling_jcrinstall_folder_max_depth : Int32? = nil, sling_jcrinstall_search_path : Array(String)? = nil, sling_jcrinstall_new_config_path : String? = nil, sling_jcrinstall_signal_path : String? = nil, sling_jcrinstall_enable_writeback : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "handler.schemes" => handler_schemes, "sling.jcrinstall.folder.name.regexp" => sling_jcrinstall_folder_name_regexp, "sling.jcrinstall.folder.max.depth" => sling_jcrinstall_folder_max_depth, "sling.jcrinstall.search.path" => sling_jcrinstall_search_path, "sling.jcrinstall.new.config.path" => sling_jcrinstall_new_config_path, "sling.jcrinstall.signal.path" => sling_jcrinstall_signal_path, "sling.jcrinstall.enable.writeback" => sling_jcrinstall_enable_writeback },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
