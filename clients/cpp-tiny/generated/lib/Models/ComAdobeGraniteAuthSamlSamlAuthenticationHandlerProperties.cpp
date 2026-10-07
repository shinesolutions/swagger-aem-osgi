

#include "ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties()
{
	path = ConfigNodePropertyArray();
	serviceranking = ConfigNodePropertyInteger();
	idpUrl = ConfigNodePropertyString();
	idpCertAlias = ConfigNodePropertyString();
	idpHttpRedirect = ConfigNodePropertyBoolean();
	serviceProviderEntityId = ConfigNodePropertyString();
	assertionConsumerServiceURL = ConfigNodePropertyString();
	spPrivateKeyAlias = ConfigNodePropertyString();
	keyStorePassword = ConfigNodePropertyString();
	defaultRedirectUrl = ConfigNodePropertyString();
	userIDAttribute = ConfigNodePropertyString();
	useEncryption = ConfigNodePropertyBoolean();
	createUser = ConfigNodePropertyBoolean();
	userIntermediatePath = ConfigNodePropertyString();
	addGroupMemberships = ConfigNodePropertyBoolean();
	groupMembershipAttribute = ConfigNodePropertyString();
	defaultGroups = ConfigNodePropertyArray();
	nameIdFormat = ConfigNodePropertyString();
	synchronizeAttributes = ConfigNodePropertyArray();
	handleLogout = ConfigNodePropertyBoolean();
	logoutUrl = ConfigNodePropertyString();
	clockTolerance = ConfigNodePropertyInteger();
	digestMethod = ConfigNodePropertyString();
	signatureMethod = ConfigNodePropertyString();
	identitySyncType = ConfigNodePropertyDropDown();
	idpIdentifier = ConfigNodePropertyString();
}

ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::~ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties()
{

}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyArray* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *idpUrlKey = "idpUrl";

    if(object.has_key(idpUrlKey))
    {
        bourne::json value = object[idpUrlKey];




        ConfigNodePropertyString* obj = &idpUrl;
		obj->fromJson(value.dump());

    }

    const char *idpCertAliasKey = "idpCertAlias";

    if(object.has_key(idpCertAliasKey))
    {
        bourne::json value = object[idpCertAliasKey];




        ConfigNodePropertyString* obj = &idpCertAlias;
		obj->fromJson(value.dump());

    }

    const char *idpHttpRedirectKey = "idpHttpRedirect";

    if(object.has_key(idpHttpRedirectKey))
    {
        bourne::json value = object[idpHttpRedirectKey];




        ConfigNodePropertyBoolean* obj = &idpHttpRedirect;
		obj->fromJson(value.dump());

    }

    const char *serviceProviderEntityIdKey = "serviceProviderEntityId";

    if(object.has_key(serviceProviderEntityIdKey))
    {
        bourne::json value = object[serviceProviderEntityIdKey];




        ConfigNodePropertyString* obj = &serviceProviderEntityId;
		obj->fromJson(value.dump());

    }

    const char *assertionConsumerServiceURLKey = "assertionConsumerServiceURL";

    if(object.has_key(assertionConsumerServiceURLKey))
    {
        bourne::json value = object[assertionConsumerServiceURLKey];




        ConfigNodePropertyString* obj = &assertionConsumerServiceURL;
		obj->fromJson(value.dump());

    }

    const char *spPrivateKeyAliasKey = "spPrivateKeyAlias";

    if(object.has_key(spPrivateKeyAliasKey))
    {
        bourne::json value = object[spPrivateKeyAliasKey];




        ConfigNodePropertyString* obj = &spPrivateKeyAlias;
		obj->fromJson(value.dump());

    }

    const char *keyStorePasswordKey = "keyStorePassword";

    if(object.has_key(keyStorePasswordKey))
    {
        bourne::json value = object[keyStorePasswordKey];




        ConfigNodePropertyString* obj = &keyStorePassword;
		obj->fromJson(value.dump());

    }

    const char *defaultRedirectUrlKey = "defaultRedirectUrl";

    if(object.has_key(defaultRedirectUrlKey))
    {
        bourne::json value = object[defaultRedirectUrlKey];




        ConfigNodePropertyString* obj = &defaultRedirectUrl;
		obj->fromJson(value.dump());

    }

    const char *userIDAttributeKey = "userIDAttribute";

    if(object.has_key(userIDAttributeKey))
    {
        bourne::json value = object[userIDAttributeKey];




        ConfigNodePropertyString* obj = &userIDAttribute;
		obj->fromJson(value.dump());

    }

    const char *useEncryptionKey = "useEncryption";

    if(object.has_key(useEncryptionKey))
    {
        bourne::json value = object[useEncryptionKey];




        ConfigNodePropertyBoolean* obj = &useEncryption;
		obj->fromJson(value.dump());

    }

    const char *createUserKey = "createUser";

    if(object.has_key(createUserKey))
    {
        bourne::json value = object[createUserKey];




        ConfigNodePropertyBoolean* obj = &createUser;
		obj->fromJson(value.dump());

    }

    const char *userIntermediatePathKey = "userIntermediatePath";

    if(object.has_key(userIntermediatePathKey))
    {
        bourne::json value = object[userIntermediatePathKey];




        ConfigNodePropertyString* obj = &userIntermediatePath;
		obj->fromJson(value.dump());

    }

    const char *addGroupMembershipsKey = "addGroupMemberships";

    if(object.has_key(addGroupMembershipsKey))
    {
        bourne::json value = object[addGroupMembershipsKey];




        ConfigNodePropertyBoolean* obj = &addGroupMemberships;
		obj->fromJson(value.dump());

    }

    const char *groupMembershipAttributeKey = "groupMembershipAttribute";

    if(object.has_key(groupMembershipAttributeKey))
    {
        bourne::json value = object[groupMembershipAttributeKey];




        ConfigNodePropertyString* obj = &groupMembershipAttribute;
		obj->fromJson(value.dump());

    }

    const char *defaultGroupsKey = "defaultGroups";

    if(object.has_key(defaultGroupsKey))
    {
        bourne::json value = object[defaultGroupsKey];




        ConfigNodePropertyArray* obj = &defaultGroups;
		obj->fromJson(value.dump());

    }

    const char *nameIdFormatKey = "nameIdFormat";

    if(object.has_key(nameIdFormatKey))
    {
        bourne::json value = object[nameIdFormatKey];




        ConfigNodePropertyString* obj = &nameIdFormat;
		obj->fromJson(value.dump());

    }

    const char *synchronizeAttributesKey = "synchronizeAttributes";

    if(object.has_key(synchronizeAttributesKey))
    {
        bourne::json value = object[synchronizeAttributesKey];




        ConfigNodePropertyArray* obj = &synchronizeAttributes;
		obj->fromJson(value.dump());

    }

    const char *handleLogoutKey = "handleLogout";

    if(object.has_key(handleLogoutKey))
    {
        bourne::json value = object[handleLogoutKey];




        ConfigNodePropertyBoolean* obj = &handleLogout;
		obj->fromJson(value.dump());

    }

    const char *logoutUrlKey = "logoutUrl";

    if(object.has_key(logoutUrlKey))
    {
        bourne::json value = object[logoutUrlKey];




        ConfigNodePropertyString* obj = &logoutUrl;
		obj->fromJson(value.dump());

    }

    const char *clockToleranceKey = "clockTolerance";

    if(object.has_key(clockToleranceKey))
    {
        bourne::json value = object[clockToleranceKey];




        ConfigNodePropertyInteger* obj = &clockTolerance;
		obj->fromJson(value.dump());

    }

    const char *digestMethodKey = "digestMethod";

    if(object.has_key(digestMethodKey))
    {
        bourne::json value = object[digestMethodKey];




        ConfigNodePropertyString* obj = &digestMethod;
		obj->fromJson(value.dump());

    }

    const char *signatureMethodKey = "signatureMethod";

    if(object.has_key(signatureMethodKey))
    {
        bourne::json value = object[signatureMethodKey];




        ConfigNodePropertyString* obj = &signatureMethod;
		obj->fromJson(value.dump());

    }

    const char *identitySyncTypeKey = "identitySyncType";

    if(object.has_key(identitySyncTypeKey))
    {
        bourne::json value = object[identitySyncTypeKey];




        ConfigNodePropertyDropDown* obj = &identitySyncType;
		obj->fromJson(value.dump());

    }

    const char *idpIdentifierKey = "idpIdentifier";

    if(object.has_key(idpIdentifierKey))
    {
        bourne::json value = object[idpIdentifierKey];




        ConfigNodePropertyString* obj = &idpIdentifier;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["serviceranking"] = getServiceranking().toJson();






	object["idpUrl"] = getIdpUrl().toJson();






	object["idpCertAlias"] = getIdpCertAlias().toJson();






	object["idpHttpRedirect"] = getIdpHttpRedirect().toJson();






	object["serviceProviderEntityId"] = getServiceProviderEntityId().toJson();






	object["assertionConsumerServiceURL"] = getAssertionConsumerServiceURL().toJson();






	object["spPrivateKeyAlias"] = getSpPrivateKeyAlias().toJson();






	object["keyStorePassword"] = getKeyStorePassword().toJson();






	object["defaultRedirectUrl"] = getDefaultRedirectUrl().toJson();






	object["userIDAttribute"] = getUserIDAttribute().toJson();






	object["useEncryption"] = getUseEncryption().toJson();






	object["createUser"] = getCreateUser().toJson();






	object["userIntermediatePath"] = getUserIntermediatePath().toJson();






	object["addGroupMemberships"] = getAddGroupMemberships().toJson();






	object["groupMembershipAttribute"] = getGroupMembershipAttribute().toJson();






	object["defaultGroups"] = getDefaultGroups().toJson();






	object["nameIdFormat"] = getNameIdFormat().toJson();






	object["synchronizeAttributes"] = getSynchronizeAttributes().toJson();






	object["handleLogout"] = getHandleLogout().toJson();






	object["logoutUrl"] = getLogoutUrl().toJson();






	object["clockTolerance"] = getClockTolerance().toJson();






	object["digestMethod"] = getDigestMethod().toJson();






	object["signatureMethod"] = getSignatureMethod().toJson();






	object["identitySyncType"] = getIdentitySyncType().toJson();






	object["idpIdentifier"] = getIdpIdentifier().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setPath(ConfigNodePropertyArray path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpUrl()
{
	return idpUrl;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpUrl(ConfigNodePropertyString idpUrl)
{
	this->idpUrl = idpUrl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpCertAlias()
{
	return idpCertAlias;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpCertAlias(ConfigNodePropertyString idpCertAlias)
{
	this->idpCertAlias = idpCertAlias;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpHttpRedirect()
{
	return idpHttpRedirect;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpHttpRedirect(ConfigNodePropertyBoolean idpHttpRedirect)
{
	this->idpHttpRedirect = idpHttpRedirect;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getServiceProviderEntityId()
{
	return serviceProviderEntityId;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setServiceProviderEntityId(ConfigNodePropertyString serviceProviderEntityId)
{
	this->serviceProviderEntityId = serviceProviderEntityId;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getAssertionConsumerServiceURL()
{
	return assertionConsumerServiceURL;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setAssertionConsumerServiceURL(ConfigNodePropertyString assertionConsumerServiceURL)
{
	this->assertionConsumerServiceURL = assertionConsumerServiceURL;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getSpPrivateKeyAlias()
{
	return spPrivateKeyAlias;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setSpPrivateKeyAlias(ConfigNodePropertyString spPrivateKeyAlias)
{
	this->spPrivateKeyAlias = spPrivateKeyAlias;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getKeyStorePassword()
{
	return keyStorePassword;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setKeyStorePassword(ConfigNodePropertyString keyStorePassword)
{
	this->keyStorePassword = keyStorePassword;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getDefaultRedirectUrl()
{
	return defaultRedirectUrl;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setDefaultRedirectUrl(ConfigNodePropertyString defaultRedirectUrl)
{
	this->defaultRedirectUrl = defaultRedirectUrl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getUserIDAttribute()
{
	return userIDAttribute;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setUserIDAttribute(ConfigNodePropertyString userIDAttribute)
{
	this->userIDAttribute = userIDAttribute;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getUseEncryption()
{
	return useEncryption;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setUseEncryption(ConfigNodePropertyBoolean useEncryption)
{
	this->useEncryption = useEncryption;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getCreateUser()
{
	return createUser;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setCreateUser(ConfigNodePropertyBoolean createUser)
{
	this->createUser = createUser;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getUserIntermediatePath()
{
	return userIntermediatePath;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setUserIntermediatePath(ConfigNodePropertyString userIntermediatePath)
{
	this->userIntermediatePath = userIntermediatePath;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getAddGroupMemberships()
{
	return addGroupMemberships;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setAddGroupMemberships(ConfigNodePropertyBoolean addGroupMemberships)
{
	this->addGroupMemberships = addGroupMemberships;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getGroupMembershipAttribute()
{
	return groupMembershipAttribute;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setGroupMembershipAttribute(ConfigNodePropertyString groupMembershipAttribute)
{
	this->groupMembershipAttribute = groupMembershipAttribute;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getDefaultGroups()
{
	return defaultGroups;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setDefaultGroups(ConfigNodePropertyArray defaultGroups)
{
	this->defaultGroups = defaultGroups;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getNameIdFormat()
{
	return nameIdFormat;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setNameIdFormat(ConfigNodePropertyString nameIdFormat)
{
	this->nameIdFormat = nameIdFormat;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getSynchronizeAttributes()
{
	return synchronizeAttributes;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setSynchronizeAttributes(ConfigNodePropertyArray synchronizeAttributes)
{
	this->synchronizeAttributes = synchronizeAttributes;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getHandleLogout()
{
	return handleLogout;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setHandleLogout(ConfigNodePropertyBoolean handleLogout)
{
	this->handleLogout = handleLogout;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getLogoutUrl()
{
	return logoutUrl;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setLogoutUrl(ConfigNodePropertyString logoutUrl)
{
	this->logoutUrl = logoutUrl;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getClockTolerance()
{
	return clockTolerance;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setClockTolerance(ConfigNodePropertyInteger clockTolerance)
{
	this->clockTolerance = clockTolerance;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getDigestMethod()
{
	return digestMethod;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setDigestMethod(ConfigNodePropertyString digestMethod)
{
	this->digestMethod = digestMethod;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getSignatureMethod()
{
	return signatureMethod;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setSignatureMethod(ConfigNodePropertyString signatureMethod)
{
	this->signatureMethod = signatureMethod;
}

ConfigNodePropertyDropDown
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdentitySyncType()
{
	return identitySyncType;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdentitySyncType(ConfigNodePropertyDropDown identitySyncType)
{
	this->identitySyncType = identitySyncType;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpIdentifier()
{
	return idpIdentifier;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpIdentifier(ConfigNodePropertyString idpIdentifier)
{
	this->idpIdentifier = idpIdentifier;
}



