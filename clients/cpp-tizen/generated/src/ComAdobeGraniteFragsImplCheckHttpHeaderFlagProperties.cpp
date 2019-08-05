#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties()
{
	//__init();
}

ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::~ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::__init()
{
	//featurename = new ConfigNodePropertyString();
	//featuredescription = new ConfigNodePropertyString();
	//httpheadername = new ConfigNodePropertyString();
	//httpheadervaluepattern = new ConfigNodePropertyString();
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::__cleanup()
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
	//if(httpheadername != NULL) {
	//
	//delete httpheadername;
	//httpheadername = NULL;
	//}
	//if(httpheadervaluepattern != NULL) {
	//
	//delete httpheadervaluepattern;
	//httpheadervaluepattern = NULL;
	//}
	//
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::fromJson(char* jsonStr)
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
	const gchar *httpheadernameKey = "http.header.name";
	node = json_object_get_member(pJsonObject, httpheadernameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&httpheadername, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&httpheadername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *httpheadervaluepatternKey = "http.header.valuepattern";
	node = json_object_get_member(pJsonObject, httpheadervaluepatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&httpheadervaluepattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&httpheadervaluepattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::toJson()
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
		ConfigNodePropertyString obj = getHttpheadername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHttpheadername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpheadernameKey = "http.header.name";
	json_object_set_member(pJsonObject, httpheadernameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHttpheadervaluepattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHttpheadervaluepattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *httpheadervaluepatternKey = "http.header.valuepattern";
	json_object_set_member(pJsonObject, httpheadervaluepatternKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getFeaturename()
{
	return featurename;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setFeaturename(ConfigNodePropertyString  featurename)
{
	this->featurename = featurename;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getFeaturedescription()
{
	return featuredescription;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setFeaturedescription(ConfigNodePropertyString  featuredescription)
{
	this->featuredescription = featuredescription;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getHttpheadername()
{
	return httpheadername;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setHttpheadername(ConfigNodePropertyString  httpheadername)
{
	this->httpheadername = httpheadername;
}

ConfigNodePropertyString
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::getHttpheadervaluepattern()
{
	return httpheadervaluepattern;
}

void
ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties::setHttpheadervaluepattern(ConfigNodePropertyString  httpheadervaluepattern)
{
	this->httpheadervaluepattern = httpheadervaluepattern;
}


