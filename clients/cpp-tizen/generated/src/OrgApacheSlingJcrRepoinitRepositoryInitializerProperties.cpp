#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitRepositoryInitializerProperties()
{
	//__init();
}

OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::~OrgApacheSlingJcrRepoinitRepositoryInitializerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::__init()
{
	//references = new ConfigNodePropertyArray();
	//scripts = new ConfigNodePropertyArray();
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::__cleanup()
{
	//if(references != NULL) {
	//
	//delete references;
	//references = NULL;
	//}
	//if(scripts != NULL) {
	//
	//delete scripts;
	//scripts = NULL;
	//}
	//
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *referencesKey = "references";
	node = json_object_get_member(pJsonObject, referencesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&references, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&references);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scriptsKey = "scripts";
	node = json_object_get_member(pJsonObject, scriptsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&scripts, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&scripts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getReferences();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getReferences());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *referencesKey = "references";
	json_object_set_member(pJsonObject, referencesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getScripts();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getScripts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scriptsKey = "scripts";
	json_object_set_member(pJsonObject, scriptsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::getReferences()
{
	return references;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::setReferences(ConfigNodePropertyArray  references)
{
	this->references = references;
}

ConfigNodePropertyArray
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::getScripts()
{
	return scripts;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties::setScripts(ConfigNodePropertyArray  scripts)
{
	this->scripts = scripts;
}


