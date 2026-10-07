#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties()
{
	//__init();
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::~OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::__init()
{
	//usermapping = new ConfigNodePropertyArray();
	//userdefault = new ConfigNodePropertyString();
	//userenabledefaultmapping = new ConfigNodePropertyBoolean();
	//requirevalidation = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::__cleanup()
{
	//if(usermapping != NULL) {
	//
	//delete usermapping;
	//usermapping = NULL;
	//}
	//if(userdefault != NULL) {
	//
	//delete userdefault;
	//userdefault = NULL;
	//}
	//if(userenabledefaultmapping != NULL) {
	//
	//delete userenabledefaultmapping;
	//userenabledefaultmapping = NULL;
	//}
	//if(requirevalidation != NULL) {
	//
	//delete requirevalidation;
	//requirevalidation = NULL;
	//}
	//
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *usermappingKey = "user.mapping";
	node = json_object_get_member(pJsonObject, usermappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&usermapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&usermapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userdefaultKey = "user.default";
	node = json_object_get_member(pJsonObject, userdefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userdefault, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userdefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userenabledefaultmappingKey = "user.enable.default.mapping";
	node = json_object_get_member(pJsonObject, userenabledefaultmappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&userenabledefaultmapping, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&userenabledefaultmapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requirevalidationKey = "require.validation";
	node = json_object_get_member(pJsonObject, requirevalidationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&requirevalidation, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&requirevalidation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUsermapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUsermapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usermappingKey = "user.mapping";
	json_object_set_member(pJsonObject, usermappingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserdefault();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserdefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userdefaultKey = "user.default";
	json_object_set_member(pJsonObject, userdefaultKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUserenabledefaultmapping();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUserenabledefaultmapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userenabledefaultmappingKey = "user.enable.default.mapping";
	json_object_set_member(pJsonObject, userenabledefaultmappingKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRequirevalidation();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRequirevalidation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requirevalidationKey = "require.validation";
	json_object_set_member(pJsonObject, requirevalidationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getUsermapping()
{
	return usermapping;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setUsermapping(ConfigNodePropertyArray  usermapping)
{
	this->usermapping = usermapping;
}

ConfigNodePropertyString
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getUserdefault()
{
	return userdefault;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setUserdefault(ConfigNodePropertyString  userdefault)
{
	this->userdefault = userdefault;
}

ConfigNodePropertyBoolean
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getUserenabledefaultmapping()
{
	return userenabledefaultmapping;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setUserenabledefaultmapping(ConfigNodePropertyBoolean  userenabledefaultmapping)
{
	this->userenabledefaultmapping = userenabledefaultmapping;
}

ConfigNodePropertyBoolean
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::getRequirevalidation()
{
	return requirevalidation;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties::setRequirevalidation(ConfigNodePropertyBoolean  requirevalidation)
{
	this->requirevalidation = requirevalidation;
}


