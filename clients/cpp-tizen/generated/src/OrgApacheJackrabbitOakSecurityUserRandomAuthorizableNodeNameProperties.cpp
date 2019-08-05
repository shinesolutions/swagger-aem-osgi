#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::~OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::__init()
{
	//length = new ConfigNodePropertyInteger();
}

void
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::__cleanup()
{
	//if(length != NULL) {
	//
	//delete length;
	//length = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *lengthKey = "length";
	node = json_object_get_member(pJsonObject, lengthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&length, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&length);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLength();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lengthKey = "length";
	json_object_set_member(pJsonObject, lengthKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::getLength()
{
	return length;
}

void
OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties::setLength(ConfigNodePropertyInteger  length)
{
	this->length = length;
}


