

#include "OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties()
{
	usersPath = ConfigNodePropertyString();
	groupsPath = ConfigNodePropertyString();
	systemRelativePath = ConfigNodePropertyString();
	defaultDepth = ConfigNodePropertyInteger();
	importBehavior = ConfigNodePropertyDropDown();
	passwordHashAlgorithm = ConfigNodePropertyString();
	passwordHashIterations = ConfigNodePropertyInteger();
	passwordSaltSize = ConfigNodePropertyInteger();
	omitAdminPw = ConfigNodePropertyBoolean();
	supportAutoSave = ConfigNodePropertyBoolean();
	passwordMaxAge = ConfigNodePropertyInteger();
	initialPasswordChange = ConfigNodePropertyBoolean();
	passwordHistorySize = ConfigNodePropertyInteger();
	passwordExpiryForAdmin = ConfigNodePropertyBoolean();
	cacheExpiration = ConfigNodePropertyInteger();
	enableRFC7613UsercaseMappedProfile = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::~OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties()
{

}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *usersPathKey = "usersPath";

    if(object.has_key(usersPathKey))
    {
        bourne::json value = object[usersPathKey];




        ConfigNodePropertyString* obj = &usersPath;
		obj->fromJson(value.dump());

    }

    const char *groupsPathKey = "groupsPath";

    if(object.has_key(groupsPathKey))
    {
        bourne::json value = object[groupsPathKey];




        ConfigNodePropertyString* obj = &groupsPath;
		obj->fromJson(value.dump());

    }

    const char *systemRelativePathKey = "systemRelativePath";

    if(object.has_key(systemRelativePathKey))
    {
        bourne::json value = object[systemRelativePathKey];




        ConfigNodePropertyString* obj = &systemRelativePath;
		obj->fromJson(value.dump());

    }

    const char *defaultDepthKey = "defaultDepth";

    if(object.has_key(defaultDepthKey))
    {
        bourne::json value = object[defaultDepthKey];




        ConfigNodePropertyInteger* obj = &defaultDepth;
		obj->fromJson(value.dump());

    }

    const char *importBehaviorKey = "importBehavior";

    if(object.has_key(importBehaviorKey))
    {
        bourne::json value = object[importBehaviorKey];




        ConfigNodePropertyDropDown* obj = &importBehavior;
		obj->fromJson(value.dump());

    }

    const char *passwordHashAlgorithmKey = "passwordHashAlgorithm";

    if(object.has_key(passwordHashAlgorithmKey))
    {
        bourne::json value = object[passwordHashAlgorithmKey];




        ConfigNodePropertyString* obj = &passwordHashAlgorithm;
		obj->fromJson(value.dump());

    }

    const char *passwordHashIterationsKey = "passwordHashIterations";

    if(object.has_key(passwordHashIterationsKey))
    {
        bourne::json value = object[passwordHashIterationsKey];




        ConfigNodePropertyInteger* obj = &passwordHashIterations;
		obj->fromJson(value.dump());

    }

    const char *passwordSaltSizeKey = "passwordSaltSize";

    if(object.has_key(passwordSaltSizeKey))
    {
        bourne::json value = object[passwordSaltSizeKey];




        ConfigNodePropertyInteger* obj = &passwordSaltSize;
		obj->fromJson(value.dump());

    }

    const char *omitAdminPwKey = "omitAdminPw";

    if(object.has_key(omitAdminPwKey))
    {
        bourne::json value = object[omitAdminPwKey];




        ConfigNodePropertyBoolean* obj = &omitAdminPw;
		obj->fromJson(value.dump());

    }

    const char *supportAutoSaveKey = "supportAutoSave";

    if(object.has_key(supportAutoSaveKey))
    {
        bourne::json value = object[supportAutoSaveKey];




        ConfigNodePropertyBoolean* obj = &supportAutoSave;
		obj->fromJson(value.dump());

    }

    const char *passwordMaxAgeKey = "passwordMaxAge";

    if(object.has_key(passwordMaxAgeKey))
    {
        bourne::json value = object[passwordMaxAgeKey];




        ConfigNodePropertyInteger* obj = &passwordMaxAge;
		obj->fromJson(value.dump());

    }

    const char *initialPasswordChangeKey = "initialPasswordChange";

    if(object.has_key(initialPasswordChangeKey))
    {
        bourne::json value = object[initialPasswordChangeKey];




        ConfigNodePropertyBoolean* obj = &initialPasswordChange;
		obj->fromJson(value.dump());

    }

    const char *passwordHistorySizeKey = "passwordHistorySize";

    if(object.has_key(passwordHistorySizeKey))
    {
        bourne::json value = object[passwordHistorySizeKey];




        ConfigNodePropertyInteger* obj = &passwordHistorySize;
		obj->fromJson(value.dump());

    }

    const char *passwordExpiryForAdminKey = "passwordExpiryForAdmin";

    if(object.has_key(passwordExpiryForAdminKey))
    {
        bourne::json value = object[passwordExpiryForAdminKey];




        ConfigNodePropertyBoolean* obj = &passwordExpiryForAdmin;
		obj->fromJson(value.dump());

    }

    const char *cacheExpirationKey = "cacheExpiration";

    if(object.has_key(cacheExpirationKey))
    {
        bourne::json value = object[cacheExpirationKey];




        ConfigNodePropertyInteger* obj = &cacheExpiration;
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
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["usersPath"] = getUsersPath().toJson();






	object["groupsPath"] = getGroupsPath().toJson();






	object["systemRelativePath"] = getSystemRelativePath().toJson();






	object["defaultDepth"] = getDefaultDepth().toJson();






	object["importBehavior"] = getImportBehavior().toJson();






	object["passwordHashAlgorithm"] = getPasswordHashAlgorithm().toJson();






	object["passwordHashIterations"] = getPasswordHashIterations().toJson();






	object["passwordSaltSize"] = getPasswordSaltSize().toJson();






	object["omitAdminPw"] = getOmitAdminPw().toJson();






	object["supportAutoSave"] = getSupportAutoSave().toJson();






	object["passwordMaxAge"] = getPasswordMaxAge().toJson();






	object["initialPasswordChange"] = getInitialPasswordChange().toJson();






	object["passwordHistorySize"] = getPasswordHistorySize().toJson();






	object["passwordExpiryForAdmin"] = getPasswordExpiryForAdmin().toJson();






	object["cacheExpiration"] = getCacheExpiration().toJson();






	object["enableRFC7613UsercaseMappedProfile"] = getEnableRFC7613UsercaseMappedProfile().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getUsersPath()
{
	return usersPath;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setUsersPath(ConfigNodePropertyString usersPath)
{
	this->usersPath = usersPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getGroupsPath()
{
	return groupsPath;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setGroupsPath(ConfigNodePropertyString groupsPath)
{
	this->groupsPath = groupsPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getSystemRelativePath()
{
	return systemRelativePath;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setSystemRelativePath(ConfigNodePropertyString systemRelativePath)
{
	this->systemRelativePath = systemRelativePath;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getDefaultDepth()
{
	return defaultDepth;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setDefaultDepth(ConfigNodePropertyInteger defaultDepth)
{
	this->defaultDepth = defaultDepth;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getImportBehavior()
{
	return importBehavior;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setImportBehavior(ConfigNodePropertyDropDown importBehavior)
{
	this->importBehavior = importBehavior;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordHashAlgorithm()
{
	return passwordHashAlgorithm;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm)
{
	this->passwordHashAlgorithm = passwordHashAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordHashIterations()
{
	return passwordHashIterations;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations)
{
	this->passwordHashIterations = passwordHashIterations;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordSaltSize()
{
	return passwordSaltSize;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize)
{
	this->passwordSaltSize = passwordSaltSize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getOmitAdminPw()
{
	return omitAdminPw;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setOmitAdminPw(ConfigNodePropertyBoolean omitAdminPw)
{
	this->omitAdminPw = omitAdminPw;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getSupportAutoSave()
{
	return supportAutoSave;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setSupportAutoSave(ConfigNodePropertyBoolean supportAutoSave)
{
	this->supportAutoSave = supportAutoSave;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordMaxAge()
{
	return passwordMaxAge;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordMaxAge(ConfigNodePropertyInteger passwordMaxAge)
{
	this->passwordMaxAge = passwordMaxAge;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getInitialPasswordChange()
{
	return initialPasswordChange;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setInitialPasswordChange(ConfigNodePropertyBoolean initialPasswordChange)
{
	this->initialPasswordChange = initialPasswordChange;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordHistorySize()
{
	return passwordHistorySize;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordHistorySize(ConfigNodePropertyInteger passwordHistorySize)
{
	this->passwordHistorySize = passwordHistorySize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordExpiryForAdmin()
{
	return passwordExpiryForAdmin;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordExpiryForAdmin(ConfigNodePropertyBoolean passwordExpiryForAdmin)
{
	this->passwordExpiryForAdmin = passwordExpiryForAdmin;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getCacheExpiration()
{
	return cacheExpiration;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setCacheExpiration(ConfigNodePropertyInteger cacheExpiration)
{
	this->cacheExpiration = cacheExpiration;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getEnableRFC7613UsercaseMappedProfile()
{
	return enableRFC7613UsercaseMappedProfile;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile)
{
	this->enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
}



