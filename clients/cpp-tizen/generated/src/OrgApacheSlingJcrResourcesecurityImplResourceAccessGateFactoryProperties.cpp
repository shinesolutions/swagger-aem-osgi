#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties()
{
	//__init();
}

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::~OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::__init()
{
	//path = new ConfigNodePropertyString();
	//checkpathprefix = new ConfigNodePropertyString();
	//jcrPath = new ConfigNodePropertyString();
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(checkpathprefix != NULL) {
	//
	//delete checkpathprefix;
	//checkpathprefix = NULL;
	//}
	//if(jcrPath != NULL) {
	//
	//delete jcrPath;
	//jcrPath = NULL;
	//}
	//
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *checkpathprefixKey = "checkpath.prefix";
	node = json_object_get_member(pJsonObject, checkpathprefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&checkpathprefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&checkpathprefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jcrPathKey = "jcrPath";
	node = json_object_get_member(pJsonObject, jcrPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jcrPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jcrPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCheckpathprefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCheckpathprefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *checkpathprefixKey = "checkpath.prefix";
	json_object_set_member(pJsonObject, checkpathprefixKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJcrPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJcrPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jcrPathKey = "jcrPath";
	json_object_set_member(pJsonObject, jcrPathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::getPath()
{
	return path;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyString
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::getCheckpathprefix()
{
	return checkpathprefix;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::setCheckpathprefix(ConfigNodePropertyString  checkpathprefix)
{
	this->checkpathprefix = checkpathprefix;
}

ConfigNodePropertyString
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::getJcrPath()
{
	return jcrPath;
}

void
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties::setJcrPath(ConfigNodePropertyString  jcrPath)
{
	this->jcrPath = jcrPath;
}


