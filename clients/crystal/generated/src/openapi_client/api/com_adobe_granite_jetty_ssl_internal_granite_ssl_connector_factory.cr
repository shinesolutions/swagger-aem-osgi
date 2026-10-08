require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_granite_jetty_ssl_port : Int32? = nil, com_adobe_granite_jetty_ssl_keystore_user : String? = nil, com_adobe_granite_jetty_ssl_keystore_password : String? = nil, com_adobe_granite_jetty_ssl_ciphersuites_excluded : Array(String)? = nil, com_adobe_granite_jetty_ssl_ciphersuites_included : Array(String)? = nil, com_adobe_granite_jetty_ssl_client_certificate : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.granite.jetty.ssl.port" => com_adobe_granite_jetty_ssl_port, "com.adobe.granite.jetty.ssl.keystore.user" => com_adobe_granite_jetty_ssl_keystore_user, "com.adobe.granite.jetty.ssl.keystore.password" => com_adobe_granite_jetty_ssl_keystore_password, "com.adobe.granite.jetty.ssl.ciphersuites.excluded" => com_adobe_granite_jetty_ssl_ciphersuites_excluded, "com.adobe.granite.jetty.ssl.ciphersuites.included" => com_adobe_granite_jetty_ssl_ciphersuites_included, "com.adobe.granite.jetty.ssl.client.certificate" => com_adobe_granite_jetty_ssl_client_certificate },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
