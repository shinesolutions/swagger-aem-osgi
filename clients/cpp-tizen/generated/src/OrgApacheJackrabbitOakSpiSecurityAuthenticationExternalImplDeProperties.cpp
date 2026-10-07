#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::__init()
{
	//handlername = new ConfigNodePropertyString();
	//userexpirationTime = new ConfigNodePropertyString();
	//userautoMembership = new ConfigNodePropertyArray();
	//userpropertyMapping = new ConfigNodePropertyArray();
	//userpathPrefix = new ConfigNodePropertyString();
	//usermembershipExpTime = new ConfigNodePropertyString();
	//usermembershipNestingDepth = new ConfigNodePropertyInteger();
	//userdynamicMembership = new ConfigNodePropertyBoolean();
	//userdisableMissing = new ConfigNodePropertyBoolean();
	//groupexpirationTime = new ConfigNodePropertyString();
	//groupautoMembership = new ConfigNodePropertyArray();
	//grouppropertyMapping = new ConfigNodePropertyArray();
	//grouppathPrefix = new ConfigNodePropertyString();
	//enableRFC7613UsercaseMappedProfile = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::__cleanup()
{
	//if(handlername != NULL) {
	//
	//delete handlername;
	//handlername = NULL;
	//}
	//if(userexpirationTime != NULL) {
	//
	//delete userexpirationTime;
	//userexpirationTime = NULL;
	//}
	//if(userautoMembership != NULL) {
	//
	//delete userautoMembership;
	//userautoMembership = NULL;
	//}
	//if(userpropertyMapping != NULL) {
	//
	//delete userpropertyMapping;
	//userpropertyMapping = NULL;
	//}
	//if(userpathPrefix != NULL) {
	//
	//delete userpathPrefix;
	//userpathPrefix = NULL;
	//}
	//if(usermembershipExpTime != NULL) {
	//
	//delete usermembershipExpTime;
	//usermembershipExpTime = NULL;
	//}
	//if(usermembershipNestingDepth != NULL) {
	//
	//delete usermembershipNestingDepth;
	//usermembershipNestingDepth = NULL;
	//}
	//if(userdynamicMembership != NULL) {
	//
	//delete userdynamicMembership;
	//userdynamicMembership = NULL;
	//}
	//if(userdisableMissing != NULL) {
	//
	//delete userdisableMissing;
	//userdisableMissing = NULL;
	//}
	//if(groupexpirationTime != NULL) {
	//
	//delete groupexpirationTime;
	//groupexpirationTime = NULL;
	//}
	//if(groupautoMembership != NULL) {
	//
	//delete groupautoMembership;
	//groupautoMembership = NULL;
	//}
	//if(grouppropertyMapping != NULL) {
	//
	//delete grouppropertyMapping;
	//grouppropertyMapping = NULL;
	//}
	//if(grouppathPrefix != NULL) {
	//
	//delete grouppathPrefix;
	//grouppathPrefix = NULL;
	//}
	//if(enableRFC7613UsercaseMappedProfile != NULL) {
	//
	//delete enableRFC7613UsercaseMappedProfile;
	//enableRFC7613UsercaseMappedProfile = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *handlernameKey = "handler.name";
	node = json_object_get_member(pJsonObject, handlernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&handlername, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&handlername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userexpirationTimeKey = "user.expirationTime";
	node = json_object_get_member(pJsonObject, userexpirationTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userexpirationTime, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userexpirationTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userautoMembershipKey = "user.autoMembership";
	node = json_object_get_member(pJsonObject, userautoMembershipKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&userautoMembership, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&userautoMembership);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userpropertyMappingKey = "user.propertyMapping";
	node = json_object_get_member(pJsonObject, userpropertyMappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&userpropertyMapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&userpropertyMapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userpathPrefixKey = "user.pathPrefix";
	node = json_object_get_member(pJsonObject, userpathPrefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userpathPrefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userpathPrefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usermembershipExpTimeKey = "user.membershipExpTime";
	node = json_object_get_member(pJsonObject, usermembershipExpTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&usermembershipExpTime, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&usermembershipExpTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usermembershipNestingDepthKey = "user.membershipNestingDepth";
	node = json_object_get_member(pJsonObject, usermembershipNestingDepthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&usermembershipNestingDepth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&usermembershipNestingDepth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userdynamicMembershipKey = "user.dynamicMembership";
	node = json_object_get_member(pJsonObject, userdynamicMembershipKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&userdynamicMembership, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&userdynamicMembership);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userdisableMissingKey = "user.disableMissing";
	node = json_object_get_member(pJsonObject, userdisableMissingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&userdisableMissing, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&userdisableMissing);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupexpirationTimeKey = "group.expirationTime";
	node = json_object_get_member(pJsonObject, groupexpirationTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&groupexpirationTime, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&groupexpirationTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupautoMembershipKey = "group.autoMembership";
	node = json_object_get_member(pJsonObject, groupautoMembershipKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&groupautoMembership, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&groupautoMembership);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *grouppropertyMappingKey = "group.propertyMapping";
	node = json_object_get_member(pJsonObject, grouppropertyMappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&grouppropertyMapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&grouppropertyMapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *grouppathPrefixKey = "group.pathPrefix";
	node = json_object_get_member(pJsonObject, grouppathPrefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&grouppathPrefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&grouppathPrefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableRFC7613UsercaseMappedProfileKey = "enableRFC7613UsercaseMappedProfile";
	node = json_object_get_member(pJsonObject, enableRFC7613UsercaseMappedProfileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableRFC7613UsercaseMappedProfile, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableRFC7613UsercaseMappedProfile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHandlername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHandlername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *handlernameKey = "handler.name";
	json_object_set_member(pJsonObject, handlernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserexpirationTime();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserexpirationTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userexpirationTimeKey = "user.expirationTime";
	json_object_set_member(pJsonObject, userexpirationTimeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUserautoMembership();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUserautoMembership());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userautoMembershipKey = "user.autoMembership";
	json_object_set_member(pJsonObject, userautoMembershipKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUserpropertyMapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUserpropertyMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userpropertyMappingKey = "user.propertyMapping";
	json_object_set_member(pJsonObject, userpropertyMappingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserpathPrefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserpathPrefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userpathPrefixKey = "user.pathPrefix";
	json_object_set_member(pJsonObject, userpathPrefixKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUsermembershipExpTime();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUsermembershipExpTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usermembershipExpTimeKey = "user.membershipExpTime";
	json_object_set_member(pJsonObject, usermembershipExpTimeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getUsermembershipNestingDepth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getUsermembershipNestingDepth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usermembershipNestingDepthKey = "user.membershipNestingDepth";
	json_object_set_member(pJsonObject, usermembershipNestingDepthKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUserdynamicMembership();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUserdynamicMembership());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userdynamicMembershipKey = "user.dynamicMembership";
	json_object_set_member(pJsonObject, userdynamicMembershipKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUserdisableMissing();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUserdisableMissing());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userdisableMissingKey = "user.disableMissing";
	json_object_set_member(pJsonObject, userdisableMissingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroupexpirationTime();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroupexpirationTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupexpirationTimeKey = "group.expirationTime";
	json_object_set_member(pJsonObject, groupexpirationTimeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGroupautoMembership();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGroupautoMembership());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupautoMembershipKey = "group.autoMembership";
	json_object_set_member(pJsonObject, groupautoMembershipKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGrouppropertyMapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGrouppropertyMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *grouppropertyMappingKey = "group.propertyMapping";
	json_object_set_member(pJsonObject, grouppropertyMappingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGrouppathPrefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGrouppathPrefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *grouppathPrefixKey = "group.pathPrefix";
	json_object_set_member(pJsonObject, grouppathPrefixKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableRFC7613UsercaseMappedProfile();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableRFC7613UsercaseMappedProfile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableRFC7613UsercaseMappedProfileKey = "enableRFC7613UsercaseMappedProfile";
	json_object_set_member(pJsonObject, enableRFC7613UsercaseMappedProfileKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getHandlername()
{
	return handlername;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setHandlername(ConfigNodePropertyString  handlername)
{
	this->handlername = handlername;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserexpirationTime()
{
	return userexpirationTime;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserexpirationTime(ConfigNodePropertyString  userexpirationTime)
{
	this->userexpirationTime = userexpirationTime;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserautoMembership()
{
	return userautoMembership;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserautoMembership(ConfigNodePropertyArray  userautoMembership)
{
	this->userautoMembership = userautoMembership;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserpropertyMapping()
{
	return userpropertyMapping;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserpropertyMapping(ConfigNodePropertyArray  userpropertyMapping)
{
	this->userpropertyMapping = userpropertyMapping;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserpathPrefix()
{
	return userpathPrefix;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserpathPrefix(ConfigNodePropertyString  userpathPrefix)
{
	this->userpathPrefix = userpathPrefix;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUsermembershipExpTime()
{
	return usermembershipExpTime;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUsermembershipExpTime(ConfigNodePropertyString  usermembershipExpTime)
{
	this->usermembershipExpTime = usermembershipExpTime;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUsermembershipNestingDepth()
{
	return usermembershipNestingDepth;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUsermembershipNestingDepth(ConfigNodePropertyInteger  usermembershipNestingDepth)
{
	this->usermembershipNestingDepth = usermembershipNestingDepth;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserdynamicMembership()
{
	return userdynamicMembership;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserdynamicMembership(ConfigNodePropertyBoolean  userdynamicMembership)
{
	this->userdynamicMembership = userdynamicMembership;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserdisableMissing()
{
	return userdisableMissing;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserdisableMissing(ConfigNodePropertyBoolean  userdisableMissing)
{
	this->userdisableMissing = userdisableMissing;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGroupexpirationTime()
{
	return groupexpirationTime;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGroupexpirationTime(ConfigNodePropertyString  groupexpirationTime)
{
	this->groupexpirationTime = groupexpirationTime;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGroupautoMembership()
{
	return groupautoMembership;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGroupautoMembership(ConfigNodePropertyArray  groupautoMembership)
{
	this->groupautoMembership = groupautoMembership;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGrouppropertyMapping()
{
	return grouppropertyMapping;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGrouppropertyMapping(ConfigNodePropertyArray  grouppropertyMapping)
{
	this->grouppropertyMapping = grouppropertyMapping;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGrouppathPrefix()
{
	return grouppathPrefix;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGrouppathPrefix(ConfigNodePropertyString  grouppathPrefix)
{
	this->grouppathPrefix = grouppathPrefix;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getEnableRFC7613UsercaseMappedProfile()
{
	return enableRFC7613UsercaseMappedProfile;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean  enableRFC7613UsercaseMappedProfile)
{
	this->enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
}


