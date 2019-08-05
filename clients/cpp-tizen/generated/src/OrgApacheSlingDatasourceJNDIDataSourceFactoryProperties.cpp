#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties()
{
	//__init();
}

OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::~OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::__init()
{
	//datasourcename = new ConfigNodePropertyString();
	//datasourcesvcpropname = new ConfigNodePropertyString();
	//datasourcejndiname = new ConfigNodePropertyString();
	//jndiproperties = new ConfigNodePropertyArray();
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::__cleanup()
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
	//if(datasourcejndiname != NULL) {
	//
	//delete datasourcejndiname;
	//datasourcejndiname = NULL;
	//}
	//if(jndiproperties != NULL) {
	//
	//delete jndiproperties;
	//jndiproperties = NULL;
	//}
	//
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::fromJson(char* jsonStr)
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
	const gchar *datasourcejndinameKey = "datasource.jndi.name";
	node = json_object_get_member(pJsonObject, datasourcejndinameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&datasourcejndiname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&datasourcejndiname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jndipropertiesKey = "jndi.properties";
	node = json_object_get_member(pJsonObject, jndipropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&jndiproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&jndiproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::toJson()
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
		ConfigNodePropertyString obj = getDatasourcejndiname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDatasourcejndiname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *datasourcejndinameKey = "datasource.jndi.name";
	json_object_set_member(pJsonObject, datasourcejndinameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getJndiproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getJndiproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jndipropertiesKey = "jndi.properties";
	json_object_set_member(pJsonObject, jndipropertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getDatasourcename()
{
	return datasourcename;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setDatasourcename(ConfigNodePropertyString  datasourcename)
{
	this->datasourcename = datasourcename;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getDatasourcesvcpropname()
{
	return datasourcesvcpropname;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setDatasourcesvcpropname(ConfigNodePropertyString  datasourcesvcpropname)
{
	this->datasourcesvcpropname = datasourcesvcpropname;
}

ConfigNodePropertyString
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getDatasourcejndiname()
{
	return datasourcejndiname;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setDatasourcejndiname(ConfigNodePropertyString  datasourcejndiname)
{
	this->datasourcejndiname = datasourcejndiname;
}

ConfigNodePropertyArray
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::getJndiproperties()
{
	return jndiproperties;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties::setJndiproperties(ConfigNodePropertyArray  jndiproperties)
{
	this->jndiproperties = jndiproperties;
}


