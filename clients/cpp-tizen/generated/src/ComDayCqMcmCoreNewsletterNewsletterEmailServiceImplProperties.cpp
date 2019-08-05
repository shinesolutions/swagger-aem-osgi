#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties()
{
	//__init();
}

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::~ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::__init()
{
	//fromaddress = new ConfigNodePropertyString();
	//senderhost = new ConfigNodePropertyString();
	//maxbouncecount = new ConfigNodePropertyString();
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::__cleanup()
{
	//if(fromaddress != NULL) {
	//
	//delete fromaddress;
	//fromaddress = NULL;
	//}
	//if(senderhost != NULL) {
	//
	//delete senderhost;
	//senderhost = NULL;
	//}
	//if(maxbouncecount != NULL) {
	//
	//delete maxbouncecount;
	//maxbouncecount = NULL;
	//}
	//
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fromaddressKey = "from.address";
	node = json_object_get_member(pJsonObject, fromaddressKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&fromaddress, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&fromaddress);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *senderhostKey = "sender.host";
	node = json_object_get_member(pJsonObject, senderhostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&senderhost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&senderhost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxbouncecountKey = "max.bounce.count";
	node = json_object_get_member(pJsonObject, maxbouncecountKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maxbouncecount, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maxbouncecount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFromaddress();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFromaddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fromaddressKey = "from.address";
	json_object_set_member(pJsonObject, fromaddressKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSenderhost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSenderhost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *senderhostKey = "sender.host";
	json_object_set_member(pJsonObject, senderhostKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaxbouncecount();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaxbouncecount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxbouncecountKey = "max.bounce.count";
	json_object_set_member(pJsonObject, maxbouncecountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::getFromaddress()
{
	return fromaddress;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::setFromaddress(ConfigNodePropertyString  fromaddress)
{
	this->fromaddress = fromaddress;
}

ConfigNodePropertyString
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::getSenderhost()
{
	return senderhost;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::setSenderhost(ConfigNodePropertyString  senderhost)
{
	this->senderhost = senderhost;
}

ConfigNodePropertyString
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::getMaxbouncecount()
{
	return maxbouncecount;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::setMaxbouncecount(ConfigNodePropertyString  maxbouncecount)
{
	this->maxbouncecount = maxbouncecount;
}


