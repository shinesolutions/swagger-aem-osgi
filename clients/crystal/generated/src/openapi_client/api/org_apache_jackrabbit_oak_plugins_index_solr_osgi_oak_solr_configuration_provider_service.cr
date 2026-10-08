require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path_desc_field : String? = nil, path_child_field : String? = nil, path_parent_field : String? = nil, path_exact_field : String? = nil, catch_all_field : String? = nil, collapsed_path_field : String? = nil, path_depth_field : String? = nil, commit_policy : String? = nil, rows : Int32? = nil, path_restrictions : Bool? = nil, property_restrictions : Bool? = nil, primarytypes_restrictions : Bool? = nil, ignored_properties : Array(String)? = nil, used_properties : Array(String)? = nil, type_mappings : Array(String)? = nil, property_mappings : Array(String)? = nil, collapse_jcrcontent_nodes : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path.desc.field" => path_desc_field, "path.child.field" => path_child_field, "path.parent.field" => path_parent_field, "path.exact.field" => path_exact_field, "catch.all.field" => catch_all_field, "collapsed.path.field" => collapsed_path_field, "path.depth.field" => path_depth_field, "commit.policy" => commit_policy, "rows" => rows, "path.restrictions" => path_restrictions, "property.restrictions" => property_restrictions, "primarytypes.restrictions" => primarytypes_restrictions, "ignored.properties" => ignored_properties, "used.properties" => used_properties, "type.mappings" => type_mappings, "property.mappings" => property_mappings, "collapse.jcrcontent.nodes" => collapse_jcrcontent_nodes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
