# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path_desc_field: nil, path_child_field: nil, path_parent_field: nil, path_exact_field: nil, catch_all_field: nil, collapsed_path_field: nil, path_depth_field: nil, commit_policy: nil, rows: nil, path_restrictions: nil, property_restrictions: nil, primarytypes_restrictions: nil, ignored_properties: nil, used_properties: nil, type_mappings: nil, property_mappings: nil, collapse_jcrcontent_nodes: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConHbbcdbd4e,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path.desc.field' => path_desc_field, 'path.child.field' => path_child_field, 'path.parent.field' => path_parent_field, 'path.exact.field' => path_exact_field, 'catch.all.field' => catch_all_field, 'collapsed.path.field' => collapsed_path_field, 'path.depth.field' => path_depth_field, 'commit.policy' => commit_policy, 'rows' => rows, 'path.restrictions' => path_restrictions, 'property.restrictions' => property_restrictions, 'primarytypes.restrictions' => primarytypes_restrictions, 'ignored.properties' => ignored_properties, 'used.properties' => used_properties, 'type.mappings' => type_mappings, 'property.mappings' => property_mappings, 'collapse.jcrcontent.nodes' => collapse_jcrcontent_nodes }
        )
      end
    end
  end
end
