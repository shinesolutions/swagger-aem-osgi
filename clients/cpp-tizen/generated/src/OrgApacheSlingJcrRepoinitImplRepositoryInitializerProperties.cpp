#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties()
{
	//__init();
}

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::~OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::__init()
{
	//references = new ConfigNodePropertyArray();
}

void
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::__cleanup()
{
	//if(references != NULL) {
	//
	//delete references;
	//references = NULL;
	//}
	//
}

void
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::fromJson(char* jsonStr)
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
}

OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::getReferences()
{
	return references;
}

void
OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties::setReferences(ConfigNodePropertyArray  references)
{
	this->references = references;
}


