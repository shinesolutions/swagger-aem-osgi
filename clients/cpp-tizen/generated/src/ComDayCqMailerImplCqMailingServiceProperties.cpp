#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqMailerImplCqMailingServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqMailerImplCqMailingServiceProperties::ComDayCqMailerImplCqMailingServiceProperties()
{
	//__init();
}

ComDayCqMailerImplCqMailingServiceProperties::~ComDayCqMailerImplCqMailingServiceProperties()
{
	//__cleanup();
}

void
ComDayCqMailerImplCqMailingServiceProperties::__init()
{
	//maxrecipientcount = new ConfigNodePropertyString();
}

void
ComDayCqMailerImplCqMailingServiceProperties::__cleanup()
{
	//if(maxrecipientcount != NULL) {
	//
	//delete maxrecipientcount;
	//maxrecipientcount = NULL;
	//}
	//
}

void
ComDayCqMailerImplCqMailingServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxrecipientcountKey = "max.recipient.count";
	node = json_object_get_member(pJsonObject, maxrecipientcountKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maxrecipientcount, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maxrecipientcount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqMailerImplCqMailingServiceProperties::ComDayCqMailerImplCqMailingServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqMailerImplCqMailingServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaxrecipientcount();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaxrecipientcount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxrecipientcountKey = "max.recipient.count";
	json_object_set_member(pJsonObject, maxrecipientcountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqMailerImplCqMailingServiceProperties::getMaxrecipientcount()
{
	return maxrecipientcount;
}

void
ComDayCqMailerImplCqMailingServiceProperties::setMaxrecipientcount(ConfigNodePropertyString  maxrecipientcount)
{
	this->maxrecipientcount = maxrecipientcount;
}


