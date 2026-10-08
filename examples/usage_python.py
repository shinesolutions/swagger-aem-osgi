import swaggeraemosgi
from swaggeraemosgi.api import configmgr_api

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = swaggeraemosgi.Configuration(
    host = "http://localhost:4502",
    username = "admin",
    password = "admin"
)

# Enter a context with an instance of the API client
with swaggeraemosgi.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = configmgr_api.ConfigmgrApi(api_client)

    try:
        # Get Apache Sling DavEx Servlet configuration
        api_response = api_instance.org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet()
        print("The response of ConfigmgrApi->org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet:\n")
        print(api_response)
    except swaggeraemosgi.ApiException as e:
        print("Exception when calling ConfigmgrApi->org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet: %s\n" % e)
        raise
