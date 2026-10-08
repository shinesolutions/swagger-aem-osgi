require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dav_root : String? = nil, dav_create_absolute_uri : Bool? = nil, dav_realm : String? = nil, collection_types : Array(String)? = nil, filter_prefixes : Array(String)? = nil, filter_types : String? = nil, filter_uris : String? = nil, type_collections : String? = nil, type_noncollections : String? = nil, type_content : String? = nil) : Response(OpenAPIClient::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dav.root" => dav_root, "dav.create-absolute-uri" => dav_create_absolute_uri, "dav.realm" => dav_realm, "collection.types" => collection_types, "filter.prefixes" => filter_prefixes, "filter.types" => filter_types, "filter.uris" => filter_uris, "type.collections" => type_collections, "type.noncollections" => type_noncollections, "type.content" => type_content },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
