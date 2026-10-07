

#include "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties()
{
	handlername = ConfigNodePropertyString();
	userexpirationTime = ConfigNodePropertyString();
	userautoMembership = ConfigNodePropertyArray();
	userpropertyMapping = ConfigNodePropertyArray();
	userpathPrefix = ConfigNodePropertyString();
	usermembershipExpTime = ConfigNodePropertyString();
	usermembershipNestingDepth = ConfigNodePropertyInteger();
	userdynamicMembership = ConfigNodePropertyBoolean();
	userdisableMissing = ConfigNodePropertyBoolean();
	groupexpirationTime = ConfigNodePropertyString();
	groupautoMembership = ConfigNodePropertyArray();
	grouppropertyMapping = ConfigNodePropertyArray();
	grouppathPrefix = ConfigNodePropertyString();
	enableRFC7613UsercaseMappedProfile = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::~OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties()
{

}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *handlernameKey = "handler.name";

    if(object.has_key(handlernameKey))
    {
        bourne::json value = object[handlernameKey];




        ConfigNodePropertyString* obj = &handlername;
		obj->fromJson(value.dump());

    }

    const char *userexpirationTimeKey = "user.expirationTime";

    if(object.has_key(userexpirationTimeKey))
    {
        bourne::json value = object[userexpirationTimeKey];




        ConfigNodePropertyString* obj = &userexpirationTime;
		obj->fromJson(value.dump());

    }

    const char *userautoMembershipKey = "user.autoMembership";

    if(object.has_key(userautoMembershipKey))
    {
        bourne::json value = object[userautoMembershipKey];




        ConfigNodePropertyArray* obj = &userautoMembership;
		obj->fromJson(value.dump());

    }

    const char *userpropertyMappingKey = "user.propertyMapping";

    if(object.has_key(userpropertyMappingKey))
    {
        bourne::json value = object[userpropertyMappingKey];




        ConfigNodePropertyArray* obj = &userpropertyMapping;
		obj->fromJson(value.dump());

    }

    const char *userpathPrefixKey = "user.pathPrefix";

    if(object.has_key(userpathPrefixKey))
    {
        bourne::json value = object[userpathPrefixKey];




        ConfigNodePropertyString* obj = &userpathPrefix;
		obj->fromJson(value.dump());

    }

    const char *usermembershipExpTimeKey = "user.membershipExpTime";

    if(object.has_key(usermembershipExpTimeKey))
    {
        bourne::json value = object[usermembershipExpTimeKey];




        ConfigNodePropertyString* obj = &usermembershipExpTime;
		obj->fromJson(value.dump());

    }

    const char *usermembershipNestingDepthKey = "user.membershipNestingDepth";

    if(object.has_key(usermembershipNestingDepthKey))
    {
        bourne::json value = object[usermembershipNestingDepthKey];




        ConfigNodePropertyInteger* obj = &usermembershipNestingDepth;
		obj->fromJson(value.dump());

    }

    const char *userdynamicMembershipKey = "user.dynamicMembership";

    if(object.has_key(userdynamicMembershipKey))
    {
        bourne::json value = object[userdynamicMembershipKey];




        ConfigNodePropertyBoolean* obj = &userdynamicMembership;
		obj->fromJson(value.dump());

    }

    const char *userdisableMissingKey = "user.disableMissing";

    if(object.has_key(userdisableMissingKey))
    {
        bourne::json value = object[userdisableMissingKey];




        ConfigNodePropertyBoolean* obj = &userdisableMissing;
		obj->fromJson(value.dump());

    }

    const char *groupexpirationTimeKey = "group.expirationTime";

    if(object.has_key(groupexpirationTimeKey))
    {
        bourne::json value = object[groupexpirationTimeKey];




        ConfigNodePropertyString* obj = &groupexpirationTime;
		obj->fromJson(value.dump());

    }

    const char *groupautoMembershipKey = "group.autoMembership";

    if(object.has_key(groupautoMembershipKey))
    {
        bourne::json value = object[groupautoMembershipKey];




        ConfigNodePropertyArray* obj = &groupautoMembership;
		obj->fromJson(value.dump());

    }

    const char *grouppropertyMappingKey = "group.propertyMapping";

    if(object.has_key(grouppropertyMappingKey))
    {
        bourne::json value = object[grouppropertyMappingKey];




        ConfigNodePropertyArray* obj = &grouppropertyMapping;
		obj->fromJson(value.dump());

    }

    const char *grouppathPrefixKey = "group.pathPrefix";

    if(object.has_key(grouppathPrefixKey))
    {
        bourne::json value = object[grouppathPrefixKey];




        ConfigNodePropertyString* obj = &grouppathPrefix;
		obj->fromJson(value.dump());

    }

    const char *enableRFC7613UsercaseMappedProfileKey = "enableRFC7613UsercaseMappedProfile";

    if(object.has_key(enableRFC7613UsercaseMappedProfileKey))
    {
        bourne::json value = object[enableRFC7613UsercaseMappedProfileKey];




        ConfigNodePropertyBoolean* obj = &enableRFC7613UsercaseMappedProfile;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["handlername"] = getHandlername().toJson();






	object["userexpirationTime"] = getUserexpirationTime().toJson();






	object["userautoMembership"] = getUserautoMembership().toJson();






	object["userpropertyMapping"] = getUserpropertyMapping().toJson();






	object["userpathPrefix"] = getUserpathPrefix().toJson();






	object["usermembershipExpTime"] = getUsermembershipExpTime().toJson();






	object["usermembershipNestingDepth"] = getUsermembershipNestingDepth().toJson();






	object["userdynamicMembership"] = getUserdynamicMembership().toJson();






	object["userdisableMissing"] = getUserdisableMissing().toJson();






	object["groupexpirationTime"] = getGroupexpirationTime().toJson();






	object["groupautoMembership"] = getGroupautoMembership().toJson();






	object["grouppropertyMapping"] = getGrouppropertyMapping().toJson();






	object["grouppathPrefix"] = getGrouppathPrefix().toJson();






	object["enableRFC7613UsercaseMappedProfile"] = getEnableRFC7613UsercaseMappedProfile().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getHandlername()
{
	return handlername;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setHandlername(ConfigNodePropertyString handlername)
{
	this->handlername = handlername;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserexpirationTime()
{
	return userexpirationTime;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserexpirationTime(ConfigNodePropertyString userexpirationTime)
{
	this->userexpirationTime = userexpirationTime;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserautoMembership()
{
	return userautoMembership;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserautoMembership(ConfigNodePropertyArray userautoMembership)
{
	this->userautoMembership = userautoMembership;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserpropertyMapping()
{
	return userpropertyMapping;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserpropertyMapping(ConfigNodePropertyArray userpropertyMapping)
{
	this->userpropertyMapping = userpropertyMapping;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserpathPrefix()
{
	return userpathPrefix;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserpathPrefix(ConfigNodePropertyString userpathPrefix)
{
	this->userpathPrefix = userpathPrefix;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUsermembershipExpTime()
{
	return usermembershipExpTime;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUsermembershipExpTime(ConfigNodePropertyString usermembershipExpTime)
{
	this->usermembershipExpTime = usermembershipExpTime;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUsermembershipNestingDepth()
{
	return usermembershipNestingDepth;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUsermembershipNestingDepth(ConfigNodePropertyInteger usermembershipNestingDepth)
{
	this->usermembershipNestingDepth = usermembershipNestingDepth;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserdynamicMembership()
{
	return userdynamicMembership;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserdynamicMembership(ConfigNodePropertyBoolean userdynamicMembership)
{
	this->userdynamicMembership = userdynamicMembership;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getUserdisableMissing()
{
	return userdisableMissing;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setUserdisableMissing(ConfigNodePropertyBoolean userdisableMissing)
{
	this->userdisableMissing = userdisableMissing;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGroupexpirationTime()
{
	return groupexpirationTime;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGroupexpirationTime(ConfigNodePropertyString groupexpirationTime)
{
	this->groupexpirationTime = groupexpirationTime;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGroupautoMembership()
{
	return groupautoMembership;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGroupautoMembership(ConfigNodePropertyArray groupautoMembership)
{
	this->groupautoMembership = groupautoMembership;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGrouppropertyMapping()
{
	return grouppropertyMapping;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGrouppropertyMapping(ConfigNodePropertyArray grouppropertyMapping)
{
	this->grouppropertyMapping = grouppropertyMapping;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getGrouppathPrefix()
{
	return grouppathPrefix;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setGrouppathPrefix(ConfigNodePropertyString grouppathPrefix)
{
	this->grouppathPrefix = grouppathPrefix;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::getEnableRFC7613UsercaseMappedProfile()
{
	return enableRFC7613UsercaseMappedProfile;
}

void
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties::setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile)
{
	this->enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
}



