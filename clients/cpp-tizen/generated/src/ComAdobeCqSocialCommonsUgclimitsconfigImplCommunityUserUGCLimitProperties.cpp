#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::~ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::__init()
{
	//enable = new ConfigNodePropertyBoolean();
	//uGCLimit = new ConfigNodePropertyInteger();
	//ugcLimitDuration = new ConfigNodePropertyInteger();
	//domains = new ConfigNodePropertyArray();
	//toList = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::__cleanup()
{
	//if(enable != NULL) {
	//
	//delete enable;
	//enable = NULL;
	//}
	//if(uGCLimit != NULL) {
	//
	//delete uGCLimit;
	//uGCLimit = NULL;
	//}
	//if(ugcLimitDuration != NULL) {
	//
	//delete ugcLimitDuration;
	//ugcLimitDuration = NULL;
	//}
	//if(domains != NULL) {
	//
	//delete domains;
	//domains = NULL;
	//}
	//if(toList != NULL) {
	//
	//delete toList;
	//toList = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enableKey = "enable";
	node = json_object_get_member(pJsonObject, enableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *uGCLimitKey = "UGCLimit";
	node = json_object_get_member(pJsonObject, uGCLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&uGCLimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&uGCLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ugcLimitDurationKey = "ugcLimitDuration";
	node = json_object_get_member(pJsonObject, ugcLimitDurationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&ugcLimitDuration, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&ugcLimitDuration);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *domainsKey = "domains";
	node = json_object_get_member(pJsonObject, domainsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&domains, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&domains);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *toListKey = "toList";
	node = json_object_get_member(pJsonObject, toListKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&toList, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&toList);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableKey = "enable";
	json_object_set_member(pJsonObject, enableKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getUGCLimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getUGCLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *uGCLimitKey = "UGCLimit";
	json_object_set_member(pJsonObject, uGCLimitKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getUgcLimitDuration();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getUgcLimitDuration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ugcLimitDurationKey = "ugcLimitDuration";
	json_object_set_member(pJsonObject, ugcLimitDurationKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDomains();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDomains());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *domainsKey = "domains";
	json_object_set_member(pJsonObject, domainsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getToList();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getToList());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *toListKey = "toList";
	json_object_set_member(pJsonObject, toListKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setEnable(ConfigNodePropertyBoolean  enable)
{
	this->enable = enable;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getUGCLimit()
{
	return uGCLimit;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setUGCLimit(ConfigNodePropertyInteger  uGCLimit)
{
	this->uGCLimit = uGCLimit;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getUgcLimitDuration()
{
	return ugcLimitDuration;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setUgcLimitDuration(ConfigNodePropertyInteger  ugcLimitDuration)
{
	this->ugcLimitDuration = ugcLimitDuration;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getDomains()
{
	return domains;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setDomains(ConfigNodePropertyArray  domains)
{
	this->domains = domains;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::getToList()
{
	return toList;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties::setToList(ConfigNodePropertyArray  toList)
{
	this->toList = toList;
}


