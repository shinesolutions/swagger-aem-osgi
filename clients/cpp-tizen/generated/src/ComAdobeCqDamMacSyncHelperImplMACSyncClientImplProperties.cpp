#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties()
{
	//__init();
}

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::~ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::__init()
{
	//comadobedammacsyncclientsotimeout = new ConfigNodePropertyInteger();
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::__cleanup()
{
	//if(comadobedammacsyncclientsotimeout != NULL) {
	//
	//delete comadobedammacsyncclientsotimeout;
	//comadobedammacsyncclientsotimeout = NULL;
	//}
	//
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobedammacsyncclientsotimeoutKey = "com.adobe.dam.mac.sync.client.so.timeout";
	node = json_object_get_member(pJsonObject, comadobedammacsyncclientsotimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&comadobedammacsyncclientsotimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&comadobedammacsyncclientsotimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getComadobedammacsyncclientsotimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getComadobedammacsyncclientsotimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobedammacsyncclientsotimeoutKey = "com.adobe.dam.mac.sync.client.so.timeout";
	json_object_set_member(pJsonObject, comadobedammacsyncclientsotimeoutKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::getComadobedammacsyncclientsotimeout()
{
	return comadobedammacsyncclientsotimeout;
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties::setComadobedammacsyncclientsotimeout(ConfigNodePropertyInteger  comadobedammacsyncclientsotimeout)
{
	this->comadobedammacsyncclientsotimeout = comadobedammacsyncclientsotimeout;
}


