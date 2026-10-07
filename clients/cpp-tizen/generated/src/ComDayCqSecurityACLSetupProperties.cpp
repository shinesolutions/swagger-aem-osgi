#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqSecurityACLSetupProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqSecurityACLSetupProperties::ComDayCqSecurityACLSetupProperties()
{
	//__init();
}

ComDayCqSecurityACLSetupProperties::~ComDayCqSecurityACLSetupProperties()
{
	//__cleanup();
}

void
ComDayCqSecurityACLSetupProperties::__init()
{
	//cqaclsetuprules = new ConfigNodePropertyArray();
}

void
ComDayCqSecurityACLSetupProperties::__cleanup()
{
	//if(cqaclsetuprules != NULL) {
	//
	//delete cqaclsetuprules;
	//cqaclsetuprules = NULL;
	//}
	//
}

void
ComDayCqSecurityACLSetupProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqaclsetuprulesKey = "cq.aclsetup.rules";
	node = json_object_get_member(pJsonObject, cqaclsetuprulesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqaclsetuprules, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqaclsetuprules);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqSecurityACLSetupProperties::ComDayCqSecurityACLSetupProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqSecurityACLSetupProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqaclsetuprules();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqaclsetuprules());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqaclsetuprulesKey = "cq.aclsetup.rules";
	json_object_set_member(pJsonObject, cqaclsetuprulesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqSecurityACLSetupProperties::getCqaclsetuprules()
{
	return cqaclsetuprules;
}

void
ComDayCqSecurityACLSetupProperties::setCqaclsetuprules(ConfigNodePropertyArray  cqaclsetuprules)
{
	this->cqaclsetuprules = cqaclsetuprules;
}


