#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties()
{
	//__init();
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::~OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties()
{
	//__cleanup();
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::__init()
{
	//slingservletselectors = new ConfigNodePropertyArray();
	//ecmaSuport = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::__cleanup()
{
	//if(slingservletselectors != NULL) {
	//
	//delete slingservletselectors;
	//slingservletselectors = NULL;
	//}
	//if(ecmaSuport != NULL) {
	//
	//delete ecmaSuport;
	//ecmaSuport = NULL;
	//}
	//
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	node = json_object_get_member(pJsonObject, slingservletselectorsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingservletselectors, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingservletselectors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ecmaSuportKey = "ecmaSuport";
	node = json_object_get_member(pJsonObject, ecmaSuportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&ecmaSuport, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&ecmaSuport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingservletselectors();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingservletselectors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	json_object_set_member(pJsonObject, slingservletselectorsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEcmaSuport();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEcmaSuport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ecmaSuportKey = "ecmaSuport";
	json_object_set_member(pJsonObject, ecmaSuportKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::setSlingservletselectors(ConfigNodePropertyArray  slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::getEcmaSuport()
{
	return ecmaSuport;
}

void
OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties::setEcmaSuport(ConfigNodePropertyBoolean  ecmaSuport)
{
	this->ecmaSuport = ecmaSuport;
}


