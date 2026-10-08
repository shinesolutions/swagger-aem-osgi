# Load the gem
require 'swagger_aem_osgi'

# Setup authorization
SwaggerAemOsgiClient.configure do |config|
  config.host = 'localhost:4502'
  config.username = 'admin'
  config.password = 'admin'
end

api_instance = SwaggerAemOsgiClient::ConfigmgrApi.new

begin
  # Get Apache Sling DavEx Servlet configuration
  result = api_instance.org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet
  p result
rescue SwaggerAemOsgiClient::ApiError => e
  puts "Exception when calling ConfigmgrApi->org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet: #{e}"
  raise
end
