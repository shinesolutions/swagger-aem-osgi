#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::~OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::__init()
{
	//usersPath = new ConfigNodePropertyString();
	//groupsPath = new ConfigNodePropertyString();
	//systemRelativePath = new ConfigNodePropertyString();
	//defaultDepth = new ConfigNodePropertyInteger();
	//importBehavior = new ConfigNodePropertyDropDown();
	//passwordHashAlgorithm = new ConfigNodePropertyString();
	//passwordHashIterations = new ConfigNodePropertyInteger();
	//passwordSaltSize = new ConfigNodePropertyInteger();
	//omitAdminPw = new ConfigNodePropertyBoolean();
	//supportAutoSave = new ConfigNodePropertyBoolean();
	//passwordMaxAge = new ConfigNodePropertyInteger();
	//initialPasswordChange = new ConfigNodePropertyBoolean();
	//passwordHistorySize = new ConfigNodePropertyInteger();
	//passwordExpiryForAdmin = new ConfigNodePropertyBoolean();
	//cacheExpiration = new ConfigNodePropertyInteger();
	//enableRFC7613UsercaseMappedProfile = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::__cleanup()
{
	//if(usersPath != NULL) {
	//
	//delete usersPath;
	//usersPath = NULL;
	//}
	//if(groupsPath != NULL) {
	//
	//delete groupsPath;
	//groupsPath = NULL;
	//}
	//if(systemRelativePath != NULL) {
	//
	//delete systemRelativePath;
	//systemRelativePath = NULL;
	//}
	//if(defaultDepth != NULL) {
	//
	//delete defaultDepth;
	//defaultDepth = NULL;
	//}
	//if(importBehavior != NULL) {
	//
	//delete importBehavior;
	//importBehavior = NULL;
	//}
	//if(passwordHashAlgorithm != NULL) {
	//
	//delete passwordHashAlgorithm;
	//passwordHashAlgorithm = NULL;
	//}
	//if(passwordHashIterations != NULL) {
	//
	//delete passwordHashIterations;
	//passwordHashIterations = NULL;
	//}
	//if(passwordSaltSize != NULL) {
	//
	//delete passwordSaltSize;
	//passwordSaltSize = NULL;
	//}
	//if(omitAdminPw != NULL) {
	//
	//delete omitAdminPw;
	//omitAdminPw = NULL;
	//}
	//if(supportAutoSave != NULL) {
	//
	//delete supportAutoSave;
	//supportAutoSave = NULL;
	//}
	//if(passwordMaxAge != NULL) {
	//
	//delete passwordMaxAge;
	//passwordMaxAge = NULL;
	//}
	//if(initialPasswordChange != NULL) {
	//
	//delete initialPasswordChange;
	//initialPasswordChange = NULL;
	//}
	//if(passwordHistorySize != NULL) {
	//
	//delete passwordHistorySize;
	//passwordHistorySize = NULL;
	//}
	//if(passwordExpiryForAdmin != NULL) {
	//
	//delete passwordExpiryForAdmin;
	//passwordExpiryForAdmin = NULL;
	//}
	//if(cacheExpiration != NULL) {
	//
	//delete cacheExpiration;
	//cacheExpiration = NULL;
	//}
	//if(enableRFC7613UsercaseMappedProfile != NULL) {
	//
	//delete enableRFC7613UsercaseMappedProfile;
	//enableRFC7613UsercaseMappedProfile = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *usersPathKey = "usersPath";
	node = json_object_get_member(pJsonObject, usersPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&usersPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&usersPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupsPathKey = "groupsPath";
	node = json_object_get_member(pJsonObject, groupsPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&groupsPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&groupsPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *systemRelativePathKey = "systemRelativePath";
	node = json_object_get_member(pJsonObject, systemRelativePathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&systemRelativePath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&systemRelativePath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultDepthKey = "defaultDepth";
	node = json_object_get_member(pJsonObject, defaultDepthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&defaultDepth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&defaultDepth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *importBehaviorKey = "importBehavior";
	node = json_object_get_member(pJsonObject, importBehaviorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&importBehavior, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&importBehavior);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordHashAlgorithmKey = "passwordHashAlgorithm";
	node = json_object_get_member(pJsonObject, passwordHashAlgorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&passwordHashAlgorithm, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&passwordHashAlgorithm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordHashIterationsKey = "passwordHashIterations";
	node = json_object_get_member(pJsonObject, passwordHashIterationsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&passwordHashIterations, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&passwordHashIterations);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordSaltSizeKey = "passwordSaltSize";
	node = json_object_get_member(pJsonObject, passwordSaltSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&passwordSaltSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&passwordSaltSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *omitAdminPwKey = "omitAdminPw";
	node = json_object_get_member(pJsonObject, omitAdminPwKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&omitAdminPw, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&omitAdminPw);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportAutoSaveKey = "supportAutoSave";
	node = json_object_get_member(pJsonObject, supportAutoSaveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&supportAutoSave, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&supportAutoSave);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordMaxAgeKey = "passwordMaxAge";
	node = json_object_get_member(pJsonObject, passwordMaxAgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&passwordMaxAge, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&passwordMaxAge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *initialPasswordChangeKey = "initialPasswordChange";
	node = json_object_get_member(pJsonObject, initialPasswordChangeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&initialPasswordChange, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&initialPasswordChange);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordHistorySizeKey = "passwordHistorySize";
	node = json_object_get_member(pJsonObject, passwordHistorySizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&passwordHistorySize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&passwordHistorySize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *passwordExpiryForAdminKey = "passwordExpiryForAdmin";
	node = json_object_get_member(pJsonObject, passwordExpiryForAdminKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&passwordExpiryForAdmin, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&passwordExpiryForAdmin);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cacheExpirationKey = "cacheExpiration";
	node = json_object_get_member(pJsonObject, cacheExpirationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cacheExpiration, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cacheExpiration);
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

OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUsersPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUsersPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usersPathKey = "usersPath";
	json_object_set_member(pJsonObject, usersPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroupsPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroupsPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupsPathKey = "groupsPath";
	json_object_set_member(pJsonObject, groupsPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSystemRelativePath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSystemRelativePath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *systemRelativePathKey = "systemRelativePath";
	json_object_set_member(pJsonObject, systemRelativePathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDefaultDepth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDefaultDepth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultDepthKey = "defaultDepth";
	json_object_set_member(pJsonObject, defaultDepthKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getImportBehavior();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getImportBehavior());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importBehaviorKey = "importBehavior";
	json_object_set_member(pJsonObject, importBehaviorKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPasswordHashAlgorithm();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPasswordHashAlgorithm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordHashAlgorithmKey = "passwordHashAlgorithm";
	json_object_set_member(pJsonObject, passwordHashAlgorithmKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPasswordHashIterations();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPasswordHashIterations());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordHashIterationsKey = "passwordHashIterations";
	json_object_set_member(pJsonObject, passwordHashIterationsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPasswordSaltSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPasswordSaltSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordSaltSizeKey = "passwordSaltSize";
	json_object_set_member(pJsonObject, passwordSaltSizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOmitAdminPw();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOmitAdminPw());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *omitAdminPwKey = "omitAdminPw";
	json_object_set_member(pJsonObject, omitAdminPwKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSupportAutoSave();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSupportAutoSave());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportAutoSaveKey = "supportAutoSave";
	json_object_set_member(pJsonObject, supportAutoSaveKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPasswordMaxAge();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPasswordMaxAge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordMaxAgeKey = "passwordMaxAge";
	json_object_set_member(pJsonObject, passwordMaxAgeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getInitialPasswordChange();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getInitialPasswordChange());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *initialPasswordChangeKey = "initialPasswordChange";
	json_object_set_member(pJsonObject, initialPasswordChangeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPasswordHistorySize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPasswordHistorySize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordHistorySizeKey = "passwordHistorySize";
	json_object_set_member(pJsonObject, passwordHistorySizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPasswordExpiryForAdmin();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPasswordExpiryForAdmin());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *passwordExpiryForAdminKey = "passwordExpiryForAdmin";
	json_object_set_member(pJsonObject, passwordExpiryForAdminKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCacheExpiration();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCacheExpiration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cacheExpirationKey = "cacheExpiration";
	json_object_set_member(pJsonObject, cacheExpirationKey, node);
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
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getUsersPath()
{
	return usersPath;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setUsersPath(ConfigNodePropertyString  usersPath)
{
	this->usersPath = usersPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getGroupsPath()
{
	return groupsPath;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setGroupsPath(ConfigNodePropertyString  groupsPath)
{
	this->groupsPath = groupsPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getSystemRelativePath()
{
	return systemRelativePath;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setSystemRelativePath(ConfigNodePropertyString  systemRelativePath)
{
	this->systemRelativePath = systemRelativePath;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getDefaultDepth()
{
	return defaultDepth;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setDefaultDepth(ConfigNodePropertyInteger  defaultDepth)
{
	this->defaultDepth = defaultDepth;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getImportBehavior()
{
	return importBehavior;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setImportBehavior(ConfigNodePropertyDropDown  importBehavior)
{
	this->importBehavior = importBehavior;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordHashAlgorithm()
{
	return passwordHashAlgorithm;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordHashAlgorithm(ConfigNodePropertyString  passwordHashAlgorithm)
{
	this->passwordHashAlgorithm = passwordHashAlgorithm;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordHashIterations()
{
	return passwordHashIterations;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordHashIterations(ConfigNodePropertyInteger  passwordHashIterations)
{
	this->passwordHashIterations = passwordHashIterations;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordSaltSize()
{
	return passwordSaltSize;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordSaltSize(ConfigNodePropertyInteger  passwordSaltSize)
{
	this->passwordSaltSize = passwordSaltSize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getOmitAdminPw()
{
	return omitAdminPw;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setOmitAdminPw(ConfigNodePropertyBoolean  omitAdminPw)
{
	this->omitAdminPw = omitAdminPw;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getSupportAutoSave()
{
	return supportAutoSave;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setSupportAutoSave(ConfigNodePropertyBoolean  supportAutoSave)
{
	this->supportAutoSave = supportAutoSave;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordMaxAge()
{
	return passwordMaxAge;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordMaxAge(ConfigNodePropertyInteger  passwordMaxAge)
{
	this->passwordMaxAge = passwordMaxAge;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getInitialPasswordChange()
{
	return initialPasswordChange;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setInitialPasswordChange(ConfigNodePropertyBoolean  initialPasswordChange)
{
	this->initialPasswordChange = initialPasswordChange;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordHistorySize()
{
	return passwordHistorySize;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordHistorySize(ConfigNodePropertyInteger  passwordHistorySize)
{
	this->passwordHistorySize = passwordHistorySize;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getPasswordExpiryForAdmin()
{
	return passwordExpiryForAdmin;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setPasswordExpiryForAdmin(ConfigNodePropertyBoolean  passwordExpiryForAdmin)
{
	this->passwordExpiryForAdmin = passwordExpiryForAdmin;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getCacheExpiration()
{
	return cacheExpiration;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setCacheExpiration(ConfigNodePropertyInteger  cacheExpiration)
{
	this->cacheExpiration = cacheExpiration;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::getEnableRFC7613UsercaseMappedProfile()
{
	return enableRFC7613UsercaseMappedProfile;
}

void
OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties::setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean  enableRFC7613UsercaseMappedProfile)
{
	this->enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
}


