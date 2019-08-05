#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties()
{
	//__init();
}

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::~ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties()
{
	//__cleanup();
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::__init()
{
	//xmpfilterapply_whitelist = new ConfigNodePropertyBoolean();
	//xmpfilterwhitelist = new ConfigNodePropertyArray();
	//xmpfilterapply_blacklist = new ConfigNodePropertyBoolean();
	//xmpfilterblacklist = new ConfigNodePropertyArray();
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::__cleanup()
{
	//if(xmpfilterapply_whitelist != NULL) {
	//
	//delete xmpfilterapply_whitelist;
	//xmpfilterapply_whitelist = NULL;
	//}
	//if(xmpfilterwhitelist != NULL) {
	//
	//delete xmpfilterwhitelist;
	//xmpfilterwhitelist = NULL;
	//}
	//if(xmpfilterapply_blacklist != NULL) {
	//
	//delete xmpfilterapply_blacklist;
	//xmpfilterapply_blacklist = NULL;
	//}
	//if(xmpfilterblacklist != NULL) {
	//
	//delete xmpfilterblacklist;
	//xmpfilterblacklist = NULL;
	//}
	//
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *xmpfilterapply_whitelistKey = "xmp.filter.apply_whitelist";
	node = json_object_get_member(pJsonObject, xmpfilterapply_whitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&xmpfilterapply_whitelist, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&xmpfilterapply_whitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *xmpfilterwhitelistKey = "xmp.filter.whitelist";
	node = json_object_get_member(pJsonObject, xmpfilterwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&xmpfilterwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&xmpfilterwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *xmpfilterapply_blacklistKey = "xmp.filter.apply_blacklist";
	node = json_object_get_member(pJsonObject, xmpfilterapply_blacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&xmpfilterapply_blacklist, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&xmpfilterapply_blacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *xmpfilterblacklistKey = "xmp.filter.blacklist";
	node = json_object_get_member(pJsonObject, xmpfilterblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&xmpfilterblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&xmpfilterblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getXmpfilterapplyWhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getXmpfilterapplyWhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xmpfilterapply_whitelistKey = "xmp.filter.apply_whitelist";
	json_object_set_member(pJsonObject, xmpfilterapply_whitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getXmpfilterwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getXmpfilterwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xmpfilterwhitelistKey = "xmp.filter.whitelist";
	json_object_set_member(pJsonObject, xmpfilterwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getXmpfilterapplyBlacklist();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getXmpfilterapplyBlacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xmpfilterapply_blacklistKey = "xmp.filter.apply_blacklist";
	json_object_set_member(pJsonObject, xmpfilterapply_blacklistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getXmpfilterblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getXmpfilterblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *xmpfilterblacklistKey = "xmp.filter.blacklist";
	json_object_set_member(pJsonObject, xmpfilterblacklistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterapplyWhitelist()
{
	return xmpfilterapply_whitelist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterapplyWhitelist(ConfigNodePropertyBoolean  xmpfilterapply_whitelist)
{
	this->xmpfilterapply_whitelist = xmpfilterapply_whitelist;
}

ConfigNodePropertyArray
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterwhitelist()
{
	return xmpfilterwhitelist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterwhitelist(ConfigNodePropertyArray  xmpfilterwhitelist)
{
	this->xmpfilterwhitelist = xmpfilterwhitelist;
}

ConfigNodePropertyBoolean
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterapplyBlacklist()
{
	return xmpfilterapply_blacklist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterapplyBlacklist(ConfigNodePropertyBoolean  xmpfilterapply_blacklist)
{
	this->xmpfilterapply_blacklist = xmpfilterapply_blacklist;
}

ConfigNodePropertyArray
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterblacklist()
{
	return xmpfilterblacklist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterblacklist(ConfigNodePropertyArray  xmpfilterblacklist)
{
	this->xmpfilterblacklist = xmpfilterblacklist;
}


