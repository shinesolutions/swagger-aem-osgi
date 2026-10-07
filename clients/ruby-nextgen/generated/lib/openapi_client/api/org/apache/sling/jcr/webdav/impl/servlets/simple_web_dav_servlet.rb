# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, dav_root: nil, dav_create_absolute_uri: nil, dav_realm: nil, collection_types: nil, filter_prefixes: nil, filter_types: nil, filter_uris: nil, type_collections: nil, type_noncollections: nil, type_content: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet',
          type: OpenapiClient::Models::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'dav.root' => dav_root, 'dav.create-absolute-uri' => dav_create_absolute_uri, 'dav.realm' => dav_realm, 'collection.types' => collection_types, 'filter.prefixes' => filter_prefixes, 'filter.types' => filter_types, 'filter.uris' => filter_uris, 'type.collections' => type_collections, 'type.noncollections' => type_noncollections, 'type.content' => type_content }
        )
      end
    end
  end
end
