#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDatasourceDataSourceFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDatasourceDataSourceFactoryProperties::OrgApacheSlingDatasourceDataSourceFactoryProperties()
{
	//__init();
}

OrgApacheSlingDatasourceDataSourceFactoryProperties::~OrgApacheSlingDatasourceDataSourceFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::__init()
{
	//datasourcename = new ConfigNodePropertyString();
	//datasourcesvcpropname = new ConfigNodePropertyString();
	//driverClassName = new ConfigNodePropertyString();
	//url = new ConfigNodePropertyString();
	//username = new ConfigNodePropertyString();
	//password = new ConfigNodePropertyString();
	//defaultAutoCommit = new ConfigNodePropertyDropDown();
	//defaultReadOnly = new ConfigNodePropertyDropDown();
	//defaultTransactionIsolation = new ConfigNodePropertyDropDown();
	//defaultCatalog = new ConfigNodePropertyString();
	//maxActive = new ConfigNodePropertyInteger();
	//maxIdle = new ConfigNodePropertyInteger();
	//minIdle = new ConfigNodePropertyInteger();
	//initialSize = new ConfigNodePropertyInteger();
	//maxWait = new ConfigNodePropertyInteger();
	//maxAge = new ConfigNodePropertyInteger();
	//testOnBorrow = new ConfigNodePropertyBoolean();
	//testOnReturn = new ConfigNodePropertyBoolean();
	//testWhileIdle = new ConfigNodePropertyBoolean();
	//validationQuery = new ConfigNodePropertyString();
	//validationQueryTimeout = new ConfigNodePropertyInteger();
	//timeBetweenEvictionRunsMillis = new ConfigNodePropertyInteger();
	//minEvictableIdleTimeMillis = new ConfigNodePropertyInteger();
	//connectionProperties = new ConfigNodePropertyString();
	//initSQL = new ConfigNodePropertyString();
	//jdbcInterceptors = new ConfigNodePropertyString();
	//validationInterval = new ConfigNodePropertyInteger();
	//logValidationErrors = new ConfigNodePropertyBoolean();
	//datasourcesvcproperties = new ConfigNodePropertyArray();
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::__cleanup()
{
	//if(datasourcename != NULL) {
	//
	//delete datasourcename;
	//datasourcename = NULL;
	//}
	//if(datasourcesvcpropname != NULL) {
	//
	//delete datasourcesvcpropname;
	//datasourcesvcpropname = NULL;
	//}
	//if(driverClassName != NULL) {
	//
	//delete driverClassName;
	//driverClassName = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(password != NULL) {
	//
	//delete password;
	//password = NULL;
	//}
	//if(defaultAutoCommit != NULL) {
	//
	//delete defaultAutoCommit;
	//defaultAutoCommit = NULL;
	//}
	//if(defaultReadOnly != NULL) {
	//
	//delete defaultReadOnly;
	//defaultReadOnly = NULL;
	//}
	//if(defaultTransactionIsolation != NULL) {
	//
	//delete defaultTransactionIsolation;
	//defaultTransactionIsolation = NULL;
	//}
	//if(defaultCatalog != NULL) {
	//
	//delete defaultCatalog;
	//defaultCatalog = NULL;
	//}
	//if(maxActive != NULL) {
	//
	//delete maxActive;
	//maxActive = NULL;
	//}
	//if(maxIdle != NULL) {
	//
	//delete maxIdle;
	//maxIdle = NULL;
	//}
	//if(minIdle != NULL) {
	//
	//delete minIdle;
	//minIdle = NULL;
	//}
	//if(initialSize != NULL) {
	//
	//delete initialSize;
	//initialSize = NULL;
	//}
	//if(maxWait != NULL) {
	//
	//delete maxWait;
	//maxWait = NULL;
	//}
	//if(maxAge != NULL) {
	//
	//delete maxAge;
	//maxAge = NULL;
	//}
	//if(testOnBorrow != NULL) {
	//
	//delete testOnBorrow;
	//testOnBorrow = NULL;
	//}
	//if(testOnReturn != NULL) {
	//
	//delete testOnReturn;
	//testOnReturn = NULL;
	//}
	//if(testWhileIdle != NULL) {
	//
	//delete testWhileIdle;
	//testWhileIdle = NULL;
	//}
	//if(validationQuery != NULL) {
	//
	//delete validationQuery;
	//validationQuery = NULL;
	//}
	//if(validationQueryTimeout != NULL) {
	//
	//delete validationQueryTimeout;
	//validationQueryTimeout = NULL;
	//}
	//if(timeBetweenEvictionRunsMillis != NULL) {
	//
	//delete timeBetweenEvictionRunsMillis;
	//timeBetweenEvictionRunsMillis = NULL;
	//}
	//if(minEvictableIdleTimeMillis != NULL) {
	//
	//delete minEvictableIdleTimeMillis;
	//minEvictableIdleTimeMillis = NULL;
	//}
	//if(connectionProperties != NULL) {
	//
	//delete connectionProperties;
	//connectionProperties = NULL;
	//}
	//if(initSQL != NULL) {
	//
	//delete initSQL;
	//initSQL = NULL;
	//}
	//if(jdbcInterceptors != NULL) {
	//
	//delete jdbcInterceptors;
	//jdbcInterceptors = NULL;
	//}
	//if(validationInterval != NULL) {
	//
	//delete validationInterval;
	//validationInterval = NULL;
	//}
	//if(logValidationErrors != NULL) {
	//
	//delete logValidationErrors;
	//logValidationErrors = NULL;
	//}
	//if(datasourcesvcproperties != NULL) {
	//
	//delete datasourcesvcproperties;
	//datasourcesvcproperties = NULL;
	//}
	//
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *datasourcenameKey = "datasource.name";
	node = json_object_get_member(pJsonObject, datasourcenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&datasourcename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&datasourcename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *datasourcesvcpropnameKey = "datasource.svc.prop.name";
	node = json_object_get_member(pJsonObject, datasourcesvcpropnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&datasourcesvcpropname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&datasourcesvcpropname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *driverClassNameKey = "driverClassName";
	node = json_object_get_member(pJsonObject, driverClassNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&driverClassName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&driverClassName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&url, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&url);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&username, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&username);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordKey = "password";
	node = json_object_get_member(pJsonObject, passwordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&password, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&password);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultAutoCommitKey = "defaultAutoCommit";
	node = json_object_get_member(pJsonObject, defaultAutoCommitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&defaultAutoCommit, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&defaultAutoCommit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultReadOnlyKey = "defaultReadOnly";
	node = json_object_get_member(pJsonObject, defaultReadOnlyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&defaultReadOnly, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&defaultReadOnly);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultTransactionIsolationKey = "defaultTransactionIsolation";
	node = json_object_get_member(pJsonObject, defaultTransactionIsolationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&defaultTransactionIsolation, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&defaultTransactionIsolation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultCatalogKey = "defaultCatalog";
	node = json_object_get_member(pJsonObject, defaultCatalogKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultCatalog, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultCatalog);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxActiveKey = "maxActive";
	node = json_object_get_member(pJsonObject, maxActiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxActive, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxActive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxIdleKey = "maxIdle";
	node = json_object_get_member(pJsonObject, maxIdleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxIdle, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxIdle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minIdleKey = "minIdle";
	node = json_object_get_member(pJsonObject, minIdleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minIdle, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minIdle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *initialSizeKey = "initialSize";
	node = json_object_get_member(pJsonObject, initialSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&initialSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&initialSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxWaitKey = "maxWait";
	node = json_object_get_member(pJsonObject, maxWaitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxWait, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxWait);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxAgeKey = "maxAge";
	node = json_object_get_member(pJsonObject, maxAgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxAge, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxAge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *testOnBorrowKey = "testOnBorrow";
	node = json_object_get_member(pJsonObject, testOnBorrowKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&testOnBorrow, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&testOnBorrow);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *testOnReturnKey = "testOnReturn";
	node = json_object_get_member(pJsonObject, testOnReturnKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&testOnReturn, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&testOnReturn);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *testWhileIdleKey = "testWhileIdle";
	node = json_object_get_member(pJsonObject, testWhileIdleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&testWhileIdle, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&testWhileIdle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *validationQueryKey = "validationQuery";
	node = json_object_get_member(pJsonObject, validationQueryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&validationQuery, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&validationQuery);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *validationQueryTimeoutKey = "validationQueryTimeout";
	node = json_object_get_member(pJsonObject, validationQueryTimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&validationQueryTimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&validationQueryTimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *timeBetweenEvictionRunsMillisKey = "timeBetweenEvictionRunsMillis";
	node = json_object_get_member(pJsonObject, timeBetweenEvictionRunsMillisKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&timeBetweenEvictionRunsMillis, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&timeBetweenEvictionRunsMillis);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minEvictableIdleTimeMillisKey = "minEvictableIdleTimeMillis";
	node = json_object_get_member(pJsonObject, minEvictableIdleTimeMillisKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minEvictableIdleTimeMillis, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minEvictableIdleTimeMillis);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *connectionPropertiesKey = "connectionProperties";
	node = json_object_get_member(pJsonObject, connectionPropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&connectionProperties, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&connectionProperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *initSQLKey = "initSQL";
	node = json_object_get_member(pJsonObject, initSQLKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&initSQL, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&initSQL);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jdbcInterceptorsKey = "jdbcInterceptors";
	node = json_object_get_member(pJsonObject, jdbcInterceptorsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jdbcInterceptors, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jdbcInterceptors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *validationIntervalKey = "validationInterval";
	node = json_object_get_member(pJsonObject, validationIntervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&validationInterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&validationInterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logValidationErrorsKey = "logValidationErrors";
	node = json_object_get_member(pJsonObject, logValidationErrorsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&logValidationErrors, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&logValidationErrors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *datasourcesvcpropertiesKey = "datasource.svc.properties";
	node = json_object_get_member(pJsonObject, datasourcesvcpropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&datasourcesvcproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&datasourcesvcproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDatasourceDataSourceFactoryProperties::OrgApacheSlingDatasourceDataSourceFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDatasourceDataSourceFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDatasourcename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDatasourcename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datasourcenameKey = "datasource.name";
	json_object_set_member(pJsonObject, datasourcenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDatasourcesvcpropname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDatasourcesvcpropname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datasourcesvcpropnameKey = "datasource.svc.prop.name";
	json_object_set_member(pJsonObject, datasourcesvcpropnameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDriverClassName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDriverClassName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *driverClassNameKey = "driverClassName";
	json_object_set_member(pJsonObject, driverClassNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUrl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUsername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUsername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordKey = "password";
	json_object_set_member(pJsonObject, passwordKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getDefaultAutoCommit();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getDefaultAutoCommit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultAutoCommitKey = "defaultAutoCommit";
	json_object_set_member(pJsonObject, defaultAutoCommitKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getDefaultReadOnly();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getDefaultReadOnly());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultReadOnlyKey = "defaultReadOnly";
	json_object_set_member(pJsonObject, defaultReadOnlyKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getDefaultTransactionIsolation();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getDefaultTransactionIsolation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultTransactionIsolationKey = "defaultTransactionIsolation";
	json_object_set_member(pJsonObject, defaultTransactionIsolationKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultCatalog();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultCatalog());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultCatalogKey = "defaultCatalog";
	json_object_set_member(pJsonObject, defaultCatalogKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxActive();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxActive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxActiveKey = "maxActive";
	json_object_set_member(pJsonObject, maxActiveKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxIdle();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxIdle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxIdleKey = "maxIdle";
	json_object_set_member(pJsonObject, maxIdleKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinIdle();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinIdle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minIdleKey = "minIdle";
	json_object_set_member(pJsonObject, minIdleKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getInitialSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getInitialSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *initialSizeKey = "initialSize";
	json_object_set_member(pJsonObject, initialSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxWait();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxWait());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxWaitKey = "maxWait";
	json_object_set_member(pJsonObject, maxWaitKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxAge();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxAge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxAgeKey = "maxAge";
	json_object_set_member(pJsonObject, maxAgeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getTestOnBorrow();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getTestOnBorrow());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *testOnBorrowKey = "testOnBorrow";
	json_object_set_member(pJsonObject, testOnBorrowKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getTestOnReturn();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getTestOnReturn());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *testOnReturnKey = "testOnReturn";
	json_object_set_member(pJsonObject, testOnReturnKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getTestWhileIdle();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getTestWhileIdle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *testWhileIdleKey = "testWhileIdle";
	json_object_set_member(pJsonObject, testWhileIdleKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getValidationQuery();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getValidationQuery());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *validationQueryKey = "validationQuery";
	json_object_set_member(pJsonObject, validationQueryKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getValidationQueryTimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getValidationQueryTimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *validationQueryTimeoutKey = "validationQueryTimeout";
	json_object_set_member(pJsonObject, validationQueryTimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTimeBetweenEvictionRunsMillis();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTimeBetweenEvictionRunsMillis());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeBetweenEvictionRunsMillisKey = "timeBetweenEvictionRunsMillis";
	json_object_set_member(pJsonObject, timeBetweenEvictionRunsMillisKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinEvictableIdleTimeMillis();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinEvictableIdleTimeMillis());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minEvictableIdleTimeMillisKey = "minEvictableIdleTimeMillis";
	json_object_set_member(pJsonObject, minEvictableIdleTimeMillisKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getConnectionProperties();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getConnectionProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectionPropertiesKey = "connectionProperties";
	json_object_set_member(pJsonObject, connectionPropertiesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getInitSQL();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getInitSQL());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *initSQLKey = "initSQL";
	json_object_set_member(pJsonObject, initSQLKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJdbcInterceptors();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJdbcInterceptors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jdbcInterceptorsKey = "jdbcInterceptors";
	json_object_set_member(pJsonObject, jdbcInterceptorsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getValidationInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getValidationInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *validationIntervalKey = "validationInterval";
	json_object_set_member(pJsonObject, validationIntervalKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLogValidationErrors();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLogValidationErrors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logValidationErrorsKey = "logValidationErrors";
	json_object_set_member(pJsonObject, logValidationErrorsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDatasourcesvcproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDatasourcesvcproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datasourcesvcpropertiesKey = "datasource.svc.properties";
	json_object_set_member(pJsonObject, datasourcesvcpropertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDatasourcename()
{
	return datasourcename;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDatasourcename(ConfigNodePropertyString  datasourcename)
{
	this->datasourcename = datasourcename;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDatasourcesvcpropname()
{
	return datasourcesvcpropname;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDatasourcesvcpropname(ConfigNodePropertyString  datasourcesvcpropname)
{
	this->datasourcesvcpropname = datasourcesvcpropname;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDriverClassName()
{
	return driverClassName;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDriverClassName(ConfigNodePropertyString  driverClassName)
{
	this->driverClassName = driverClassName;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getUrl()
{
	return url;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setUrl(ConfigNodePropertyString  url)
{
	this->url = url;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getUsername()
{
	return username;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setUsername(ConfigNodePropertyString  username)
{
	this->username = username;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getPassword()
{
	return password;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setPassword(ConfigNodePropertyString  password)
{
	this->password = password;
}

ConfigNodePropertyDropDown
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultAutoCommit()
{
	return defaultAutoCommit;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultAutoCommit(ConfigNodePropertyDropDown  defaultAutoCommit)
{
	this->defaultAutoCommit = defaultAutoCommit;
}

ConfigNodePropertyDropDown
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultReadOnly()
{
	return defaultReadOnly;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultReadOnly(ConfigNodePropertyDropDown  defaultReadOnly)
{
	this->defaultReadOnly = defaultReadOnly;
}

ConfigNodePropertyDropDown
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultTransactionIsolation()
{
	return defaultTransactionIsolation;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultTransactionIsolation(ConfigNodePropertyDropDown  defaultTransactionIsolation)
{
	this->defaultTransactionIsolation = defaultTransactionIsolation;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDefaultCatalog()
{
	return defaultCatalog;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDefaultCatalog(ConfigNodePropertyString  defaultCatalog)
{
	this->defaultCatalog = defaultCatalog;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxActive()
{
	return maxActive;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxActive(ConfigNodePropertyInteger  maxActive)
{
	this->maxActive = maxActive;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxIdle()
{
	return maxIdle;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxIdle(ConfigNodePropertyInteger  maxIdle)
{
	this->maxIdle = maxIdle;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMinIdle()
{
	return minIdle;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMinIdle(ConfigNodePropertyInteger  minIdle)
{
	this->minIdle = minIdle;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getInitialSize()
{
	return initialSize;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setInitialSize(ConfigNodePropertyInteger  initialSize)
{
	this->initialSize = initialSize;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxWait()
{
	return maxWait;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxWait(ConfigNodePropertyInteger  maxWait)
{
	this->maxWait = maxWait;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMaxAge()
{
	return maxAge;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMaxAge(ConfigNodePropertyInteger  maxAge)
{
	this->maxAge = maxAge;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTestOnBorrow()
{
	return testOnBorrow;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTestOnBorrow(ConfigNodePropertyBoolean  testOnBorrow)
{
	this->testOnBorrow = testOnBorrow;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTestOnReturn()
{
	return testOnReturn;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTestOnReturn(ConfigNodePropertyBoolean  testOnReturn)
{
	this->testOnReturn = testOnReturn;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTestWhileIdle()
{
	return testWhileIdle;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTestWhileIdle(ConfigNodePropertyBoolean  testWhileIdle)
{
	this->testWhileIdle = testWhileIdle;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getValidationQuery()
{
	return validationQuery;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setValidationQuery(ConfigNodePropertyString  validationQuery)
{
	this->validationQuery = validationQuery;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getValidationQueryTimeout()
{
	return validationQueryTimeout;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setValidationQueryTimeout(ConfigNodePropertyInteger  validationQueryTimeout)
{
	this->validationQueryTimeout = validationQueryTimeout;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getTimeBetweenEvictionRunsMillis()
{
	return timeBetweenEvictionRunsMillis;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setTimeBetweenEvictionRunsMillis(ConfigNodePropertyInteger  timeBetweenEvictionRunsMillis)
{
	this->timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getMinEvictableIdleTimeMillis()
{
	return minEvictableIdleTimeMillis;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setMinEvictableIdleTimeMillis(ConfigNodePropertyInteger  minEvictableIdleTimeMillis)
{
	this->minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getConnectionProperties()
{
	return connectionProperties;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setConnectionProperties(ConfigNodePropertyString  connectionProperties)
{
	this->connectionProperties = connectionProperties;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getInitSQL()
{
	return initSQL;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setInitSQL(ConfigNodePropertyString  initSQL)
{
	this->initSQL = initSQL;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceDataSourceFactoryProperties::getJdbcInterceptors()
{
	return jdbcInterceptors;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setJdbcInterceptors(ConfigNodePropertyString  jdbcInterceptors)
{
	this->jdbcInterceptors = jdbcInterceptors;
}

ConfigNodePropertyInteger
OrgApacheSlingDatasourceDataSourceFactoryProperties::getValidationInterval()
{
	return validationInterval;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setValidationInterval(ConfigNodePropertyInteger  validationInterval)
{
	this->validationInterval = validationInterval;
}

ConfigNodePropertyBoolean
OrgApacheSlingDatasourceDataSourceFactoryProperties::getLogValidationErrors()
{
	return logValidationErrors;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setLogValidationErrors(ConfigNodePropertyBoolean  logValidationErrors)
{
	this->logValidationErrors = logValidationErrors;
}

ConfigNodePropertyArray
OrgApacheSlingDatasourceDataSourceFactoryProperties::getDatasourcesvcproperties()
{
	return datasourcesvcproperties;
}

void
OrgApacheSlingDatasourceDataSourceFactoryProperties::setDatasourcesvcproperties(ConfigNodePropertyArray  datasourcesvcproperties)
{
	this->datasourcesvcproperties = datasourcesvcproperties;
}


