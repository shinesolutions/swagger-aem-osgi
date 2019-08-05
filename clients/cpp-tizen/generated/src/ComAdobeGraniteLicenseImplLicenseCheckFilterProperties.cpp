#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::ComAdobeGraniteLicenseImplLicenseCheckFilterProperties()
{
	//__init();
}

ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::~ComAdobeGraniteLicenseImplLicenseCheckFilterProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::__init()
{
	//checkInternval = new ConfigNodePropertyInteger();
	//excludeIds = new ConfigNodePropertyArray();
	//encryptPing = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::__cleanup()
{
	//if(checkInternval != NULL) {
	//
	//delete checkInternval;
	//checkInternval = NULL;
	//}
	//if(excludeIds != NULL) {
	//
	//delete excludeIds;
	//excludeIds = NULL;
	//}
	//if(encryptPing != NULL) {
	//
	//delete encryptPing;
	//encryptPing = NULL;
	//}
	//
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *checkInternvalKey = "checkInternval";
	node = json_object_get_member(pJsonObject, checkInternvalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&checkInternval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&checkInternval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *excludeIdsKey = "excludeIds";
	node = json_object_get_member(pJsonObject, excludeIdsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&excludeIds, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&excludeIds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *encryptPingKey = "encryptPing";
	node = json_object_get_member(pJsonObject, encryptPingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&encryptPing, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&encryptPing);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCheckInternval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCheckInternval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *checkInternvalKey = "checkInternval";
	json_object_set_member(pJsonObject, checkInternvalKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExcludeIds();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExcludeIds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *excludeIdsKey = "excludeIds";
	json_object_set_member(pJsonObject, excludeIdsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEncryptPing();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEncryptPing());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *encryptPingKey = "encryptPing";
	json_object_set_member(pJsonObject, encryptPingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::getCheckInternval()
{
	return checkInternval;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::setCheckInternval(ConfigNodePropertyInteger  checkInternval)
{
	this->checkInternval = checkInternval;
}

ConfigNodePropertyArray
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::getExcludeIds()
{
	return excludeIds;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::setExcludeIds(ConfigNodePropertyArray  excludeIds)
{
	this->excludeIds = excludeIds;
}

ConfigNodePropertyBoolean
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::getEncryptPing()
{
	return encryptPing;
}

void
ComAdobeGraniteLicenseImplLicenseCheckFilterProperties::setEncryptPing(ConfigNodePropertyBoolean  encryptPing)
{
	this->encryptPing = encryptPing;
}


