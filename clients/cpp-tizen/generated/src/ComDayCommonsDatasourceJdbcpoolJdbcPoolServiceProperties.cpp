#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties()
{
	//__init();
}

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::~ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties()
{
	//__cleanup();
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::__init()
{
	//jdbcdriverclass = new ConfigNodePropertyString();
	//jdbcconnectionuri = new ConfigNodePropertyString();
	//jdbcusername = new ConfigNodePropertyString();
	//jdbcpassword = new ConfigNodePropertyString();
	//jdbcvalidationquery = new ConfigNodePropertyString();
	//defaultreadonly = new ConfigNodePropertyBoolean();
	//defaultautocommit = new ConfigNodePropertyBoolean();
	//poolsize = new ConfigNodePropertyInteger();
	//poolmaxwaitmsec = new ConfigNodePropertyInteger();
	//datasourcename = new ConfigNodePropertyString();
	//datasourcesvcproperties = new ConfigNodePropertyArray();
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::__cleanup()
{
	//if(jdbcdriverclass != NULL) {
	//
	//delete jdbcdriverclass;
	//jdbcdriverclass = NULL;
	//}
	//if(jdbcconnectionuri != NULL) {
	//
	//delete jdbcconnectionuri;
	//jdbcconnectionuri = NULL;
	//}
	//if(jdbcusername != NULL) {
	//
	//delete jdbcusername;
	//jdbcusername = NULL;
	//}
	//if(jdbcpassword != NULL) {
	//
	//delete jdbcpassword;
	//jdbcpassword = NULL;
	//}
	//if(jdbcvalidationquery != NULL) {
	//
	//delete jdbcvalidationquery;
	//jdbcvalidationquery = NULL;
	//}
	//if(defaultreadonly != NULL) {
	//
	//delete defaultreadonly;
	//defaultreadonly = NULL;
	//}
	//if(defaultautocommit != NULL) {
	//
	//delete defaultautocommit;
	//defaultautocommit = NULL;
	//}
	//if(poolsize != NULL) {
	//
	//delete poolsize;
	//poolsize = NULL;
	//}
	//if(poolmaxwaitmsec != NULL) {
	//
	//delete poolmaxwaitmsec;
	//poolmaxwaitmsec = NULL;
	//}
	//if(datasourcename != NULL) {
	//
	//delete datasourcename;
	//datasourcename = NULL;
	//}
	//if(datasourcesvcproperties != NULL) {
	//
	//delete datasourcesvcproperties;
	//datasourcesvcproperties = NULL;
	//}
	//
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jdbcdriverclassKey = "jdbc.driver.class";
	node = json_object_get_member(pJsonObject, jdbcdriverclassKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jdbcdriverclass, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jdbcdriverclass);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jdbcconnectionuriKey = "jdbc.connection.uri";
	node = json_object_get_member(pJsonObject, jdbcconnectionuriKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jdbcconnectionuri, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jdbcconnectionuri);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jdbcusernameKey = "jdbc.username";
	node = json_object_get_member(pJsonObject, jdbcusernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jdbcusername, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jdbcusername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jdbcpasswordKey = "jdbc.password";
	node = json_object_get_member(pJsonObject, jdbcpasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jdbcpassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jdbcpassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jdbcvalidationqueryKey = "jdbc.validation.query";
	node = json_object_get_member(pJsonObject, jdbcvalidationqueryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jdbcvalidationquery, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jdbcvalidationquery);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultreadonlyKey = "default.readonly";
	node = json_object_get_member(pJsonObject, defaultreadonlyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&defaultreadonly, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&defaultreadonly);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultautocommitKey = "default.autocommit";
	node = json_object_get_member(pJsonObject, defaultautocommitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&defaultautocommit, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&defaultautocommit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *poolsizeKey = "pool.size";
	node = json_object_get_member(pJsonObject, poolsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&poolsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&poolsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *poolmaxwaitmsecKey = "pool.max.wait.msec";
	node = json_object_get_member(pJsonObject, poolmaxwaitmsecKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&poolmaxwaitmsec, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&poolmaxwaitmsec);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJdbcdriverclass();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJdbcdriverclass());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jdbcdriverclassKey = "jdbc.driver.class";
	json_object_set_member(pJsonObject, jdbcdriverclassKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJdbcconnectionuri();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJdbcconnectionuri());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jdbcconnectionuriKey = "jdbc.connection.uri";
	json_object_set_member(pJsonObject, jdbcconnectionuriKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJdbcusername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJdbcusername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jdbcusernameKey = "jdbc.username";
	json_object_set_member(pJsonObject, jdbcusernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJdbcpassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJdbcpassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jdbcpasswordKey = "jdbc.password";
	json_object_set_member(pJsonObject, jdbcpasswordKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJdbcvalidationquery();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJdbcvalidationquery());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jdbcvalidationqueryKey = "jdbc.validation.query";
	json_object_set_member(pJsonObject, jdbcvalidationqueryKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDefaultreadonly();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDefaultreadonly());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultreadonlyKey = "default.readonly";
	json_object_set_member(pJsonObject, defaultreadonlyKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDefaultautocommit();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDefaultautocommit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultautocommitKey = "default.autocommit";
	json_object_set_member(pJsonObject, defaultautocommitKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPoolsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPoolsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *poolsizeKey = "pool.size";
	json_object_set_member(pJsonObject, poolsizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPoolmaxwaitmsec();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPoolmaxwaitmsec());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *poolmaxwaitmsecKey = "pool.max.wait.msec";
	json_object_set_member(pJsonObject, poolmaxwaitmsecKey, node);
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
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcdriverclass()
{
	return jdbcdriverclass;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcdriverclass(ConfigNodePropertyString  jdbcdriverclass)
{
	this->jdbcdriverclass = jdbcdriverclass;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcconnectionuri()
{
	return jdbcconnectionuri;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcconnectionuri(ConfigNodePropertyString  jdbcconnectionuri)
{
	this->jdbcconnectionuri = jdbcconnectionuri;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcusername()
{
	return jdbcusername;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcusername(ConfigNodePropertyString  jdbcusername)
{
	this->jdbcusername = jdbcusername;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcpassword()
{
	return jdbcpassword;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcpassword(ConfigNodePropertyString  jdbcpassword)
{
	this->jdbcpassword = jdbcpassword;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getJdbcvalidationquery()
{
	return jdbcvalidationquery;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setJdbcvalidationquery(ConfigNodePropertyString  jdbcvalidationquery)
{
	this->jdbcvalidationquery = jdbcvalidationquery;
}

ConfigNodePropertyBoolean
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDefaultreadonly()
{
	return defaultreadonly;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDefaultreadonly(ConfigNodePropertyBoolean  defaultreadonly)
{
	this->defaultreadonly = defaultreadonly;
}

ConfigNodePropertyBoolean
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDefaultautocommit()
{
	return defaultautocommit;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDefaultautocommit(ConfigNodePropertyBoolean  defaultautocommit)
{
	this->defaultautocommit = defaultautocommit;
}

ConfigNodePropertyInteger
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getPoolsize()
{
	return poolsize;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setPoolsize(ConfigNodePropertyInteger  poolsize)
{
	this->poolsize = poolsize;
}

ConfigNodePropertyInteger
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getPoolmaxwaitmsec()
{
	return poolmaxwaitmsec;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setPoolmaxwaitmsec(ConfigNodePropertyInteger  poolmaxwaitmsec)
{
	this->poolmaxwaitmsec = poolmaxwaitmsec;
}

ConfigNodePropertyString
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDatasourcename()
{
	return datasourcename;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDatasourcename(ConfigNodePropertyString  datasourcename)
{
	this->datasourcename = datasourcename;
}

ConfigNodePropertyArray
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::getDatasourcesvcproperties()
{
	return datasourcesvcproperties;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties::setDatasourcesvcproperties(ConfigNodePropertyArray  datasourcesvcproperties)
{
	this->datasourcesvcproperties = datasourcesvcproperties;
}


