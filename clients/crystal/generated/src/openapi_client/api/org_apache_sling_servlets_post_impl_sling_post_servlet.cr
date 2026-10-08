require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingServletsPostImplSlingPostServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, servlet_post_date_formats : Array(String)? = nil, servlet_post_node_name_hints : Array(String)? = nil, servlet_post_node_name_max_length : Int32? = nil, servlet_post_checkin_new_versionable_nodes : Bool? = nil, servlet_post_auto_checkout : Bool? = nil, servlet_post_auto_checkin : Bool? = nil, servlet_post_ignore_pattern : String? = nil) : Response(OpenAPIClient::OrgApacheSlingServletsPostImplSlingPostServletInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingServletsPostImplSlingPostServletInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "servlet.post.dateFormats" => servlet_post_date_formats, "servlet.post.nodeNameHints" => servlet_post_node_name_hints, "servlet.post.nodeNameMaxLength" => servlet_post_node_name_max_length, "servlet.post.checkinNewVersionableNodes" => servlet_post_checkin_new_versionable_nodes, "servlet.post.autoCheckout" => servlet_post_auto_checkout, "servlet.post.autoCheckin" => servlet_post_auto_checkin, "servlet.post.ignorePattern" => servlet_post_ignore_pattern },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
