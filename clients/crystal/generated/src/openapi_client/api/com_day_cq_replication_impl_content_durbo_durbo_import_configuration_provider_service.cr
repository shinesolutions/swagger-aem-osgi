require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, preserve_hierarchy_nodes : Bool? = nil, ignore_versioning : Bool? = nil, import_acl : Bool? = nil, save_threshold : Int32? = nil, preserve_user_paths : Bool? = nil, preserve_uuid : Bool? = nil, preserve_uuid_nodetypes : Array(String)? = nil, preserve_uuid_subtrees : Array(String)? = nil, auto_commit : Bool? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "preserve.hierarchy.nodes" => preserve_hierarchy_nodes, "ignore.versioning" => ignore_versioning, "import.acl" => import_acl, "save.threshold" => save_threshold, "preserve.user.paths" => preserve_user_paths, "preserve.uuid" => preserve_uuid, "preserve.uuid.nodetypes" => preserve_uuid_nodetypes, "preserve.uuid.subtrees" => preserve_uuid_subtrees, "auto.commit" => auto_commit },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
