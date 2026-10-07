#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties()
{
	//__init();
}

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::~OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::__init()
{
	//allowonlysystemuser = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::__cleanup()
{
	//if(allowonlysystemuser != NULL) {
	//
	//delete allowonlysystemuser;
	//allowonlysystemuser = NULL;
	//}
	//
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *allowonlysystemuserKey = "allow.only.system.user";
	node = json_object_get_member(pJsonObject, allowonlysystemuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&allowonlysystemuser, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&allowonlysystemuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAllowonlysystemuser();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAllowonlysystemuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowonlysystemuserKey = "allow.only.system.user";
	json_object_set_member(pJsonObject, allowonlysystemuserKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::getAllowonlysystemuser()
{
	return allowonlysystemuser;
}

void
OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties::setAllowonlysystemuser(ConfigNodePropertyBoolean  allowonlysystemuser)
{
	this->allowonlysystemuser = allowonlysystemuser;
}


