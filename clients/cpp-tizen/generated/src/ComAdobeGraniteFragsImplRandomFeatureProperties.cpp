#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteFragsImplRandomFeatureProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteFragsImplRandomFeatureProperties::ComAdobeGraniteFragsImplRandomFeatureProperties()
{
	//__init();
}

ComAdobeGraniteFragsImplRandomFeatureProperties::~ComAdobeGraniteFragsImplRandomFeatureProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::__init()
{
	//featurename = new ConfigNodePropertyString();
	//featuredescription = new ConfigNodePropertyString();
	//activepercentage = new ConfigNodePropertyString();
	//cookiename = new ConfigNodePropertyString();
	//cookiemaxAge = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::__cleanup()
{
	//if(featurename != NULL) {
	//
	//delete featurename;
	//featurename = NULL;
	//}
	//if(featuredescription != NULL) {
	//
	//delete featuredescription;
	//featuredescription = NULL;
	//}
	//if(activepercentage != NULL) {
	//
	//delete activepercentage;
	//activepercentage = NULL;
	//}
	//if(cookiename != NULL) {
	//
	//delete cookiename;
	//cookiename = NULL;
	//}
	//if(cookiemaxAge != NULL) {
	//
	//delete cookiemaxAge;
	//cookiemaxAge = NULL;
	//}
	//
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *featurenameKey = "feature.name";
	node = json_object_get_member(pJsonObject, featurenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&featurename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&featurename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *featuredescriptionKey = "feature.description";
	node = json_object_get_member(pJsonObject, featuredescriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&featuredescription, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&featuredescription);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *activepercentageKey = "active.percentage";
	node = json_object_get_member(pJsonObject, activepercentageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&activepercentage, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&activepercentage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cookienameKey = "cookie.name";
	node = json_object_get_member(pJsonObject, cookienameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cookiename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cookiename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cookiemaxAgeKey = "cookie.maxAge";
	node = json_object_get_member(pJsonObject, cookiemaxAgeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cookiemaxAge, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cookiemaxAge);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteFragsImplRandomFeatureProperties::ComAdobeGraniteFragsImplRandomFeatureProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteFragsImplRandomFeatureProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFeaturename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFeaturename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *featurenameKey = "feature.name";
	json_object_set_member(pJsonObject, featurenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFeaturedescription();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFeaturedescription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *featuredescriptionKey = "feature.description";
	json_object_set_member(pJsonObject, featuredescriptionKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getActivepercentage();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getActivepercentage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *activepercentageKey = "active.percentage";
	json_object_set_member(pJsonObject, activepercentageKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCookiename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCookiename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cookienameKey = "cookie.name";
	json_object_set_member(pJsonObject, cookienameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCookiemaxAge();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCookiemaxAge());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cookiemaxAgeKey = "cookie.maxAge";
	json_object_set_member(pJsonObject, cookiemaxAgeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getFeaturename()
{
	return featurename;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setFeaturename(ConfigNodePropertyString  featurename)
{
	this->featurename = featurename;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getFeaturedescription()
{
	return featuredescription;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setFeaturedescription(ConfigNodePropertyString  featuredescription)
{
	this->featuredescription = featuredescription;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getActivepercentage()
{
	return activepercentage;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setActivepercentage(ConfigNodePropertyString  activepercentage)
{
	this->activepercentage = activepercentage;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplRandomFeatureProperties::getCookiename()
{
	return cookiename;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setCookiename(ConfigNodePropertyString  cookiename)
{
	this->cookiename = cookiename;
}

ConfigNodePropertyInteger
ComAdobeGraniteFragsImplRandomFeatureProperties::getCookiemaxAge()
{
	return cookiemaxAge;
}

void
ComAdobeGraniteFragsImplRandomFeatureProperties::setCookiemaxAge(ConfigNodePropertyInteger  cookiemaxAge)
{
	this->cookiemaxAge = cookiemaxAge;
}


