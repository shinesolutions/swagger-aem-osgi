#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmNotificationEmailImplEmailChannelProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmNotificationEmailImplEmailChannelProperties::ComDayCqWcmNotificationEmailImplEmailChannelProperties()
{
	//__init();
}

ComDayCqWcmNotificationEmailImplEmailChannelProperties::~ComDayCqWcmNotificationEmailImplEmailChannelProperties()
{
	//__cleanup();
}

void
ComDayCqWcmNotificationEmailImplEmailChannelProperties::__init()
{
	//emailfrom = new ConfigNodePropertyString();
}

void
ComDayCqWcmNotificationEmailImplEmailChannelProperties::__cleanup()
{
	//if(emailfrom != NULL) {
	//
	//delete emailfrom;
	//emailfrom = NULL;
	//}
	//
}

void
ComDayCqWcmNotificationEmailImplEmailChannelProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailfromKey = "email.from";
	node = json_object_get_member(pJsonObject, emailfromKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emailfrom, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emailfrom);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmNotificationEmailImplEmailChannelProperties::ComDayCqWcmNotificationEmailImplEmailChannelProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmNotificationEmailImplEmailChannelProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmailfrom();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmailfrom());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailfromKey = "email.from";
	json_object_set_member(pJsonObject, emailfromKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmNotificationEmailImplEmailChannelProperties::getEmailfrom()
{
	return emailfrom;
}

void
ComDayCqWcmNotificationEmailImplEmailChannelProperties::setEmailfrom(ConfigNodePropertyString  emailfrom)
{
	this->emailfrom = emailfrom;
}


