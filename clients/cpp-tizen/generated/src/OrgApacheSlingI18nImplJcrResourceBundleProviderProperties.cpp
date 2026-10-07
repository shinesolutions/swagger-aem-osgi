#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::OrgApacheSlingI18nImplJcrResourceBundleProviderProperties()
{
	//__init();
}

OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::~OrgApacheSlingI18nImplJcrResourceBundleProviderProperties()
{
	//__cleanup();
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::__init()
{
	//localedefault = new ConfigNodePropertyString();
	//preloadbundles = new ConfigNodePropertyBoolean();
	//invalidationdelay = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::__cleanup()
{
	//if(localedefault != NULL) {
	//
	//delete localedefault;
	//localedefault = NULL;
	//}
	//if(preloadbundles != NULL) {
	//
	//delete preloadbundles;
	//preloadbundles = NULL;
	//}
	//if(invalidationdelay != NULL) {
	//
	//delete invalidationdelay;
	//invalidationdelay = NULL;
	//}
	//
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *localedefaultKey = "locale.default";
	node = json_object_get_member(pJsonObject, localedefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&localedefault, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&localedefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preloadbundlesKey = "preload.bundles";
	node = json_object_get_member(pJsonObject, preloadbundlesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&preloadbundles, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&preloadbundles);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *invalidationdelayKey = "invalidation.delay";
	node = json_object_get_member(pJsonObject, invalidationdelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&invalidationdelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&invalidationdelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLocaledefault();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLocaledefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *localedefaultKey = "locale.default";
	json_object_set_member(pJsonObject, localedefaultKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPreloadbundles();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPreloadbundles());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preloadbundlesKey = "preload.bundles";
	json_object_set_member(pJsonObject, preloadbundlesKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getInvalidationdelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getInvalidationdelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *invalidationdelayKey = "invalidation.delay";
	json_object_set_member(pJsonObject, invalidationdelayKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getLocaledefault()
{
	return localedefault;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setLocaledefault(ConfigNodePropertyString  localedefault)
{
	this->localedefault = localedefault;
}

ConfigNodePropertyBoolean
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getPreloadbundles()
{
	return preloadbundles;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setPreloadbundles(ConfigNodePropertyBoolean  preloadbundles)
{
	this->preloadbundles = preloadbundles;
}

ConfigNodePropertyInteger
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::getInvalidationdelay()
{
	return invalidationdelay;
}

void
OrgApacheSlingI18nImplJcrResourceBundleProviderProperties::setInvalidationdelay(ConfigNodePropertyInteger  invalidationdelay)
{
	this->invalidationdelay = invalidationdelay;
}


