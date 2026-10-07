require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixHttpSslfilterSslFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, ssl_forward_header : String? = nil, ssl_forward_value : String? = nil, ssl_forward_cert_header : String? = nil, rewrite_absolute_urls : Bool? = nil) : Response(OpenAPIClient::OrgApacheFelixHttpSslfilterSslFilterInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixHttpSslfilterSslFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "ssl-forward.header" => ssl_forward_header, "ssl-forward.value" => ssl_forward_value, "ssl-forward-cert.header" => ssl_forward_cert_header, "rewrite.absolute.urls" => rewrite_absolute_urls },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
