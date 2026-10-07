#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties()
{
	//__init();
}

ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::~ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::__init()
{
	//path = new ConfigNodePropertyArray();
	//serviceranking = new ConfigNodePropertyInteger();
	//idpUrl = new ConfigNodePropertyString();
	//idpCertAlias = new ConfigNodePropertyString();
	//idpHttpRedirect = new ConfigNodePropertyBoolean();
	//serviceProviderEntityId = new ConfigNodePropertyString();
	//assertionConsumerServiceURL = new ConfigNodePropertyString();
	//spPrivateKeyAlias = new ConfigNodePropertyString();
	//keyStorePassword = new ConfigNodePropertyString();
	//defaultRedirectUrl = new ConfigNodePropertyString();
	//userIDAttribute = new ConfigNodePropertyString();
	//useEncryption = new ConfigNodePropertyBoolean();
	//createUser = new ConfigNodePropertyBoolean();
	//userIntermediatePath = new ConfigNodePropertyString();
	//addGroupMemberships = new ConfigNodePropertyBoolean();
	//groupMembershipAttribute = new ConfigNodePropertyString();
	//defaultGroups = new ConfigNodePropertyArray();
	//nameIdFormat = new ConfigNodePropertyString();
	//synchronizeAttributes = new ConfigNodePropertyArray();
	//handleLogout = new ConfigNodePropertyBoolean();
	//logoutUrl = new ConfigNodePropertyString();
	//clockTolerance = new ConfigNodePropertyInteger();
	//digestMethod = new ConfigNodePropertyString();
	//signatureMethod = new ConfigNodePropertyString();
	//identitySyncType = new ConfigNodePropertyDropDown();
	//idpIdentifier = new ConfigNodePropertyString();
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//if(idpUrl != NULL) {
	//
	//delete idpUrl;
	//idpUrl = NULL;
	//}
	//if(idpCertAlias != NULL) {
	//
	//delete idpCertAlias;
	//idpCertAlias = NULL;
	//}
	//if(idpHttpRedirect != NULL) {
	//
	//delete idpHttpRedirect;
	//idpHttpRedirect = NULL;
	//}
	//if(serviceProviderEntityId != NULL) {
	//
	//delete serviceProviderEntityId;
	//serviceProviderEntityId = NULL;
	//}
	//if(assertionConsumerServiceURL != NULL) {
	//
	//delete assertionConsumerServiceURL;
	//assertionConsumerServiceURL = NULL;
	//}
	//if(spPrivateKeyAlias != NULL) {
	//
	//delete spPrivateKeyAlias;
	//spPrivateKeyAlias = NULL;
	//}
	//if(keyStorePassword != NULL) {
	//
	//delete keyStorePassword;
	//keyStorePassword = NULL;
	//}
	//if(defaultRedirectUrl != NULL) {
	//
	//delete defaultRedirectUrl;
	//defaultRedirectUrl = NULL;
	//}
	//if(userIDAttribute != NULL) {
	//
	//delete userIDAttribute;
	//userIDAttribute = NULL;
	//}
	//if(useEncryption != NULL) {
	//
	//delete useEncryption;
	//useEncryption = NULL;
	//}
	//if(createUser != NULL) {
	//
	//delete createUser;
	//createUser = NULL;
	//}
	//if(userIntermediatePath != NULL) {
	//
	//delete userIntermediatePath;
	//userIntermediatePath = NULL;
	//}
	//if(addGroupMemberships != NULL) {
	//
	//delete addGroupMemberships;
	//addGroupMemberships = NULL;
	//}
	//if(groupMembershipAttribute != NULL) {
	//
	//delete groupMembershipAttribute;
	//groupMembershipAttribute = NULL;
	//}
	//if(defaultGroups != NULL) {
	//
	//delete defaultGroups;
	//defaultGroups = NULL;
	//}
	//if(nameIdFormat != NULL) {
	//
	//delete nameIdFormat;
	//nameIdFormat = NULL;
	//}
	//if(synchronizeAttributes != NULL) {
	//
	//delete synchronizeAttributes;
	//synchronizeAttributes = NULL;
	//}
	//if(handleLogout != NULL) {
	//
	//delete handleLogout;
	//handleLogout = NULL;
	//}
	//if(logoutUrl != NULL) {
	//
	//delete logoutUrl;
	//logoutUrl = NULL;
	//}
	//if(clockTolerance != NULL) {
	//
	//delete clockTolerance;
	//clockTolerance = NULL;
	//}
	//if(digestMethod != NULL) {
	//
	//delete digestMethod;
	//digestMethod = NULL;
	//}
	//if(signatureMethod != NULL) {
	//
	//delete signatureMethod;
	//signatureMethod = NULL;
	//}
	//if(identitySyncType != NULL) {
	//
	//delete identitySyncType;
	//identitySyncType = NULL;
	//}
	//if(idpIdentifier != NULL) {
	//
	//delete idpIdentifier;
	//idpIdentifier = NULL;
	//}
	//
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&path, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpUrlKey = "idpUrl";
	node = json_object_get_member(pJsonObject, idpUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&idpUrl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&idpUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpCertAliasKey = "idpCertAlias";
	node = json_object_get_member(pJsonObject, idpCertAliasKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&idpCertAlias, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&idpCertAlias);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpHttpRedirectKey = "idpHttpRedirect";
	node = json_object_get_member(pJsonObject, idpHttpRedirectKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&idpHttpRedirect, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&idpHttpRedirect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceProviderEntityIdKey = "serviceProviderEntityId";
	node = json_object_get_member(pJsonObject, serviceProviderEntityIdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceProviderEntityId, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceProviderEntityId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *assertionConsumerServiceURLKey = "assertionConsumerServiceURL";
	node = json_object_get_member(pJsonObject, assertionConsumerServiceURLKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&assertionConsumerServiceURL, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&assertionConsumerServiceURL);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *spPrivateKeyAliasKey = "spPrivateKeyAlias";
	node = json_object_get_member(pJsonObject, spPrivateKeyAliasKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&spPrivateKeyAlias, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&spPrivateKeyAlias);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *keyStorePasswordKey = "keyStorePassword";
	node = json_object_get_member(pJsonObject, keyStorePasswordKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&keyStorePassword, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&keyStorePassword);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultRedirectUrlKey = "defaultRedirectUrl";
	node = json_object_get_member(pJsonObject, defaultRedirectUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultRedirectUrl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultRedirectUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userIDAttributeKey = "userIDAttribute";
	node = json_object_get_member(pJsonObject, userIDAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userIDAttribute, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userIDAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *useEncryptionKey = "useEncryption";
	node = json_object_get_member(pJsonObject, useEncryptionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&useEncryption, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&useEncryption);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *createUserKey = "createUser";
	node = json_object_get_member(pJsonObject, createUserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&createUser, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&createUser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *userIntermediatePathKey = "userIntermediatePath";
	node = json_object_get_member(pJsonObject, userIntermediatePathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&userIntermediatePath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&userIntermediatePath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *addGroupMembershipsKey = "addGroupMemberships";
	node = json_object_get_member(pJsonObject, addGroupMembershipsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&addGroupMemberships, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&addGroupMemberships);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *groupMembershipAttributeKey = "groupMembershipAttribute";
	node = json_object_get_member(pJsonObject, groupMembershipAttributeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&groupMembershipAttribute, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&groupMembershipAttribute);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultGroupsKey = "defaultGroups";
	node = json_object_get_member(pJsonObject, defaultGroupsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&defaultGroups, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&defaultGroups);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameIdFormatKey = "nameIdFormat";
	node = json_object_get_member(pJsonObject, nameIdFormatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&nameIdFormat, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&nameIdFormat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *synchronizeAttributesKey = "synchronizeAttributes";
	node = json_object_get_member(pJsonObject, synchronizeAttributesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&synchronizeAttributes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&synchronizeAttributes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *handleLogoutKey = "handleLogout";
	node = json_object_get_member(pJsonObject, handleLogoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&handleLogout, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&handleLogout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *logoutUrlKey = "logoutUrl";
	node = json_object_get_member(pJsonObject, logoutUrlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&logoutUrl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&logoutUrl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *clockToleranceKey = "clockTolerance";
	node = json_object_get_member(pJsonObject, clockToleranceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&clockTolerance, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&clockTolerance);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *digestMethodKey = "digestMethod";
	node = json_object_get_member(pJsonObject, digestMethodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&digestMethod, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&digestMethod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *signatureMethodKey = "signatureMethod";
	node = json_object_get_member(pJsonObject, signatureMethodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&signatureMethod, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&signatureMethod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *identitySyncTypeKey = "identitySyncType";
	node = json_object_get_member(pJsonObject, identitySyncTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&identitySyncType, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&identitySyncType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idpIdentifierKey = "idpIdentifier";
	node = json_object_get_member(pJsonObject, idpIdentifierKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&idpIdentifier, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&idpIdentifier);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getIdpUrl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getIdpUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpUrlKey = "idpUrl";
	json_object_set_member(pJsonObject, idpUrlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getIdpCertAlias();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getIdpCertAlias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpCertAliasKey = "idpCertAlias";
	json_object_set_member(pJsonObject, idpCertAliasKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIdpHttpRedirect();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIdpHttpRedirect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpHttpRedirectKey = "idpHttpRedirect";
	json_object_set_member(pJsonObject, idpHttpRedirectKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceProviderEntityId();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceProviderEntityId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceProviderEntityIdKey = "serviceProviderEntityId";
	json_object_set_member(pJsonObject, serviceProviderEntityIdKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAssertionConsumerServiceURL();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAssertionConsumerServiceURL());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *assertionConsumerServiceURLKey = "assertionConsumerServiceURL";
	json_object_set_member(pJsonObject, assertionConsumerServiceURLKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSpPrivateKeyAlias();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSpPrivateKeyAlias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *spPrivateKeyAliasKey = "spPrivateKeyAlias";
	json_object_set_member(pJsonObject, spPrivateKeyAliasKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getKeyStorePassword();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getKeyStorePassword());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *keyStorePasswordKey = "keyStorePassword";
	json_object_set_member(pJsonObject, keyStorePasswordKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultRedirectUrl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultRedirectUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultRedirectUrlKey = "defaultRedirectUrl";
	json_object_set_member(pJsonObject, defaultRedirectUrlKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserIDAttribute();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserIDAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userIDAttributeKey = "userIDAttribute";
	json_object_set_member(pJsonObject, userIDAttributeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUseEncryption();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUseEncryption());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useEncryptionKey = "useEncryption";
	json_object_set_member(pJsonObject, useEncryptionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCreateUser();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCreateUser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *createUserKey = "createUser";
	json_object_set_member(pJsonObject, createUserKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getUserIntermediatePath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getUserIntermediatePath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userIntermediatePathKey = "userIntermediatePath";
	json_object_set_member(pJsonObject, userIntermediatePathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAddGroupMemberships();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAddGroupMemberships());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *addGroupMembershipsKey = "addGroupMemberships";
	json_object_set_member(pJsonObject, addGroupMembershipsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroupMembershipAttribute();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroupMembershipAttribute());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *groupMembershipAttributeKey = "groupMembershipAttribute";
	json_object_set_member(pJsonObject, groupMembershipAttributeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDefaultGroups();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDefaultGroups());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultGroupsKey = "defaultGroups";
	json_object_set_member(pJsonObject, defaultGroupsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getNameIdFormat();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getNameIdFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameIdFormatKey = "nameIdFormat";
	json_object_set_member(pJsonObject, nameIdFormatKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSynchronizeAttributes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSynchronizeAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *synchronizeAttributesKey = "synchronizeAttributes";
	json_object_set_member(pJsonObject, synchronizeAttributesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHandleLogout();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHandleLogout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *handleLogoutKey = "handleLogout";
	json_object_set_member(pJsonObject, handleLogoutKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLogoutUrl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLogoutUrl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *logoutUrlKey = "logoutUrl";
	json_object_set_member(pJsonObject, logoutUrlKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getClockTolerance();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getClockTolerance());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *clockToleranceKey = "clockTolerance";
	json_object_set_member(pJsonObject, clockToleranceKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDigestMethod();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDigestMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *digestMethodKey = "digestMethod";
	json_object_set_member(pJsonObject, digestMethodKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSignatureMethod();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSignatureMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *signatureMethodKey = "signatureMethod";
	json_object_set_member(pJsonObject, signatureMethodKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getIdentitySyncType();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getIdentitySyncType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *identitySyncTypeKey = "identitySyncType";
	json_object_set_member(pJsonObject, identitySyncTypeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getIdpIdentifier();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getIdpIdentifier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idpIdentifierKey = "idpIdentifier";
	json_object_set_member(pJsonObject, idpIdentifierKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setPath(ConfigNodePropertyArray  path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpUrl()
{
	return idpUrl;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpUrl(ConfigNodePropertyString  idpUrl)
{
	this->idpUrl = idpUrl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpCertAlias()
{
	return idpCertAlias;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpCertAlias(ConfigNodePropertyString  idpCertAlias)
{
	this->idpCertAlias = idpCertAlias;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpHttpRedirect()
{
	return idpHttpRedirect;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpHttpRedirect(ConfigNodePropertyBoolean  idpHttpRedirect)
{
	this->idpHttpRedirect = idpHttpRedirect;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getServiceProviderEntityId()
{
	return serviceProviderEntityId;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setServiceProviderEntityId(ConfigNodePropertyString  serviceProviderEntityId)
{
	this->serviceProviderEntityId = serviceProviderEntityId;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getAssertionConsumerServiceURL()
{
	return assertionConsumerServiceURL;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setAssertionConsumerServiceURL(ConfigNodePropertyString  assertionConsumerServiceURL)
{
	this->assertionConsumerServiceURL = assertionConsumerServiceURL;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getSpPrivateKeyAlias()
{
	return spPrivateKeyAlias;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setSpPrivateKeyAlias(ConfigNodePropertyString  spPrivateKeyAlias)
{
	this->spPrivateKeyAlias = spPrivateKeyAlias;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getKeyStorePassword()
{
	return keyStorePassword;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setKeyStorePassword(ConfigNodePropertyString  keyStorePassword)
{
	this->keyStorePassword = keyStorePassword;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getDefaultRedirectUrl()
{
	return defaultRedirectUrl;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setDefaultRedirectUrl(ConfigNodePropertyString  defaultRedirectUrl)
{
	this->defaultRedirectUrl = defaultRedirectUrl;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getUserIDAttribute()
{
	return userIDAttribute;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setUserIDAttribute(ConfigNodePropertyString  userIDAttribute)
{
	this->userIDAttribute = userIDAttribute;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getUseEncryption()
{
	return useEncryption;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setUseEncryption(ConfigNodePropertyBoolean  useEncryption)
{
	this->useEncryption = useEncryption;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getCreateUser()
{
	return createUser;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setCreateUser(ConfigNodePropertyBoolean  createUser)
{
	this->createUser = createUser;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getUserIntermediatePath()
{
	return userIntermediatePath;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setUserIntermediatePath(ConfigNodePropertyString  userIntermediatePath)
{
	this->userIntermediatePath = userIntermediatePath;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getAddGroupMemberships()
{
	return addGroupMemberships;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setAddGroupMemberships(ConfigNodePropertyBoolean  addGroupMemberships)
{
	this->addGroupMemberships = addGroupMemberships;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getGroupMembershipAttribute()
{
	return groupMembershipAttribute;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setGroupMembershipAttribute(ConfigNodePropertyString  groupMembershipAttribute)
{
	this->groupMembershipAttribute = groupMembershipAttribute;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getDefaultGroups()
{
	return defaultGroups;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setDefaultGroups(ConfigNodePropertyArray  defaultGroups)
{
	this->defaultGroups = defaultGroups;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getNameIdFormat()
{
	return nameIdFormat;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setNameIdFormat(ConfigNodePropertyString  nameIdFormat)
{
	this->nameIdFormat = nameIdFormat;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getSynchronizeAttributes()
{
	return synchronizeAttributes;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setSynchronizeAttributes(ConfigNodePropertyArray  synchronizeAttributes)
{
	this->synchronizeAttributes = synchronizeAttributes;
}

ConfigNodePropertyBoolean
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getHandleLogout()
{
	return handleLogout;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setHandleLogout(ConfigNodePropertyBoolean  handleLogout)
{
	this->handleLogout = handleLogout;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getLogoutUrl()
{
	return logoutUrl;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setLogoutUrl(ConfigNodePropertyString  logoutUrl)
{
	this->logoutUrl = logoutUrl;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getClockTolerance()
{
	return clockTolerance;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setClockTolerance(ConfigNodePropertyInteger  clockTolerance)
{
	this->clockTolerance = clockTolerance;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getDigestMethod()
{
	return digestMethod;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setDigestMethod(ConfigNodePropertyString  digestMethod)
{
	this->digestMethod = digestMethod;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getSignatureMethod()
{
	return signatureMethod;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setSignatureMethod(ConfigNodePropertyString  signatureMethod)
{
	this->signatureMethod = signatureMethod;
}

ConfigNodePropertyDropDown
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdentitySyncType()
{
	return identitySyncType;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdentitySyncType(ConfigNodePropertyDropDown  identitySyncType)
{
	this->identitySyncType = identitySyncType;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::getIdpIdentifier()
{
	return idpIdentifier;
}

void
ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties::setIdpIdentifier(ConfigNodePropertyString  idpIdentifier)
{
	this->idpIdentifier = idpIdentifier;
}


