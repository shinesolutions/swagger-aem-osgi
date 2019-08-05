#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties()
{
	//__init();
}

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::~ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::__init()
{
	//translationFactory = new ConfigNodePropertyString();
	//defaultConnectorLabel = new ConfigNodePropertyString();
	//defaultConnectorAttribution = new ConfigNodePropertyString();
	//defaultConnectorWorkspaceId = new ConfigNodePropertyString();
	//defaultConnectorSubscriptionKey = new ConfigNodePropertyString();
	//languageMapLocation = new ConfigNodePropertyString();
	//categoryMapLocation = new ConfigNodePropertyString();
	//retryAttempts = new ConfigNodePropertyInteger();
	//timeoutCount = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::__cleanup()
{
	//if(translationFactory != NULL) {
	//
	//delete translationFactory;
	//translationFactory = NULL;
	//}
	//if(defaultConnectorLabel != NULL) {
	//
	//delete defaultConnectorLabel;
	//defaultConnectorLabel = NULL;
	//}
	//if(defaultConnectorAttribution != NULL) {
	//
	//delete defaultConnectorAttribution;
	//defaultConnectorAttribution = NULL;
	//}
	//if(defaultConnectorWorkspaceId != NULL) {
	//
	//delete defaultConnectorWorkspaceId;
	//defaultConnectorWorkspaceId = NULL;
	//}
	//if(defaultConnectorSubscriptionKey != NULL) {
	//
	//delete defaultConnectorSubscriptionKey;
	//defaultConnectorSubscriptionKey = NULL;
	//}
	//if(languageMapLocation != NULL) {
	//
	//delete languageMapLocation;
	//languageMapLocation = NULL;
	//}
	//if(categoryMapLocation != NULL) {
	//
	//delete categoryMapLocation;
	//categoryMapLocation = NULL;
	//}
	//if(retryAttempts != NULL) {
	//
	//delete retryAttempts;
	//retryAttempts = NULL;
	//}
	//if(timeoutCount != NULL) {
	//
	//delete timeoutCount;
	//timeoutCount = NULL;
	//}
	//
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *translationFactoryKey = "translationFactory";
	node = json_object_get_member(pJsonObject, translationFactoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&translationFactory, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&translationFactory);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultConnectorLabelKey = "defaultConnectorLabel";
	node = json_object_get_member(pJsonObject, defaultConnectorLabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultConnectorLabel, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultConnectorLabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultConnectorAttributionKey = "defaultConnectorAttribution";
	node = json_object_get_member(pJsonObject, defaultConnectorAttributionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultConnectorAttribution, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultConnectorAttribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultConnectorWorkspaceIdKey = "defaultConnectorWorkspaceId";
	node = json_object_get_member(pJsonObject, defaultConnectorWorkspaceIdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultConnectorWorkspaceId, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultConnectorWorkspaceId);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultConnectorSubscriptionKeyKey = "defaultConnectorSubscriptionKey";
	node = json_object_get_member(pJsonObject, defaultConnectorSubscriptionKeyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&defaultConnectorSubscriptionKey, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&defaultConnectorSubscriptionKey);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *languageMapLocationKey = "languageMapLocation";
	node = json_object_get_member(pJsonObject, languageMapLocationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&languageMapLocation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&languageMapLocation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *categoryMapLocationKey = "categoryMapLocation";
	node = json_object_get_member(pJsonObject, categoryMapLocationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&categoryMapLocation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&categoryMapLocation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *retryAttemptsKey = "retryAttempts";
	node = json_object_get_member(pJsonObject, retryAttemptsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&retryAttempts, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&retryAttempts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *timeoutCountKey = "timeoutCount";
	node = json_object_get_member(pJsonObject, timeoutCountKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&timeoutCount, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&timeoutCount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTranslationFactory();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTranslationFactory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translationFactoryKey = "translationFactory";
	json_object_set_member(pJsonObject, translationFactoryKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultConnectorLabel();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultConnectorLabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultConnectorLabelKey = "defaultConnectorLabel";
	json_object_set_member(pJsonObject, defaultConnectorLabelKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultConnectorAttribution();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultConnectorAttribution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultConnectorAttributionKey = "defaultConnectorAttribution";
	json_object_set_member(pJsonObject, defaultConnectorAttributionKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultConnectorWorkspaceId();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultConnectorWorkspaceId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultConnectorWorkspaceIdKey = "defaultConnectorWorkspaceId";
	json_object_set_member(pJsonObject, defaultConnectorWorkspaceIdKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDefaultConnectorSubscriptionKey();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDefaultConnectorSubscriptionKey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultConnectorSubscriptionKeyKey = "defaultConnectorSubscriptionKey";
	json_object_set_member(pJsonObject, defaultConnectorSubscriptionKeyKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLanguageMapLocation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLanguageMapLocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *languageMapLocationKey = "languageMapLocation";
	json_object_set_member(pJsonObject, languageMapLocationKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCategoryMapLocation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCategoryMapLocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *categoryMapLocationKey = "categoryMapLocation";
	json_object_set_member(pJsonObject, categoryMapLocationKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRetryAttempts();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRetryAttempts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *retryAttemptsKey = "retryAttempts";
	json_object_set_member(pJsonObject, retryAttemptsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTimeoutCount();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTimeoutCount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timeoutCountKey = "timeoutCount";
	json_object_set_member(pJsonObject, timeoutCountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getTranslationFactory()
{
	return translationFactory;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setTranslationFactory(ConfigNodePropertyString  translationFactory)
{
	this->translationFactory = translationFactory;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorLabel()
{
	return defaultConnectorLabel;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorLabel(ConfigNodePropertyString  defaultConnectorLabel)
{
	this->defaultConnectorLabel = defaultConnectorLabel;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorAttribution()
{
	return defaultConnectorAttribution;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorAttribution(ConfigNodePropertyString  defaultConnectorAttribution)
{
	this->defaultConnectorAttribution = defaultConnectorAttribution;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorWorkspaceId()
{
	return defaultConnectorWorkspaceId;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorWorkspaceId(ConfigNodePropertyString  defaultConnectorWorkspaceId)
{
	this->defaultConnectorWorkspaceId = defaultConnectorWorkspaceId;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getDefaultConnectorSubscriptionKey()
{
	return defaultConnectorSubscriptionKey;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setDefaultConnectorSubscriptionKey(ConfigNodePropertyString  defaultConnectorSubscriptionKey)
{
	this->defaultConnectorSubscriptionKey = defaultConnectorSubscriptionKey;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getLanguageMapLocation()
{
	return languageMapLocation;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setLanguageMapLocation(ConfigNodePropertyString  languageMapLocation)
{
	this->languageMapLocation = languageMapLocation;
}

ConfigNodePropertyString
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getCategoryMapLocation()
{
	return categoryMapLocation;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setCategoryMapLocation(ConfigNodePropertyString  categoryMapLocation)
{
	this->categoryMapLocation = categoryMapLocation;
}

ConfigNodePropertyInteger
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getRetryAttempts()
{
	return retryAttempts;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setRetryAttempts(ConfigNodePropertyInteger  retryAttempts)
{
	this->retryAttempts = retryAttempts;
}

ConfigNodePropertyInteger
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::getTimeoutCount()
{
	return timeoutCount;
}

void
ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties::setTimeoutCount(ConfigNodePropertyInteger  timeoutCount)
{
	this->timeoutCount = timeoutCount;
}


