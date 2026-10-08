var NodeSwaggerAemOsgi = require('node-swagger-aem-osgi');

var defaultClient = NodeSwaggerAemOsgi.ApiClient.instance;
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'admin';
aemAuth.password = 'admin';

var api = new NodeSwaggerAemOsgi.ConfigmgrApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + JSON.stringify(data));
  }
};
api.orgApacheSlingJcrDavexImplServletsSlingDavExServlet({}, callback);
