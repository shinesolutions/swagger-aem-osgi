#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties()
{
	//__init();
}

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::~ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::__init()
{
	//enable = new ConfigNodePropertyBoolean();
	//ttl1 = new ConfigNodePropertyInteger();
	//ttl2 = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::__cleanup()
{
	//if(enable != NULL) {
	//
	//delete enable;
	//enable = NULL;
	//}
	//if(ttl1 != NULL) {
	//
	//delete ttl1;
	//ttl1 = NULL;
	//}
	//if(ttl2 != NULL) {
	//
	//delete ttl2;
	//ttl2 = NULL;
	//}
	//
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::fromJson(char* jsonStr)
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
	const gchar *ttl1Key = "ttl1";
	node = json_object_get_member(pJsonObject, ttl1Key);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&ttl1, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&ttl1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ttl2Key = "ttl2";
	node = json_object_get_member(pJsonObject, ttl2Key);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&ttl2, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&ttl2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::toJson()
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
		ConfigNodePropertyInteger obj = getTtl1();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTtl1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ttl1Key = "ttl1";
	json_object_set_member(pJsonObject, ttl1Key, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTtl2();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTtl2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ttl2Key = "ttl2";
	json_object_set_member(pJsonObject, ttl2Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::getEnable()
{
	return enable;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::setEnable(ConfigNodePropertyBoolean  enable)
{
	this->enable = enable;
}

ConfigNodePropertyInteger
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::getTtl1()
{
	return ttl1;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::setTtl1(ConfigNodePropertyInteger  ttl1)
{
	this->ttl1 = ttl1;
}

ConfigNodePropertyInteger
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::getTtl2()
{
	return ttl2;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties::setTtl2(ConfigNodePropertyInteger  ttl2)
{
	this->ttl2 = ttl2;
}


