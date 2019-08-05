#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties()
{
	//__init();
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::~ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::__init()
{
	//securitypreferencesname = new ConfigNodePropertyString();
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::__cleanup()
{
	//if(securitypreferencesname != NULL) {
	//
	//delete securitypreferencesname;
	//securitypreferencesname = NULL;
	//}
	//
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *securitypreferencesnameKey = "security.preferences.name";
	node = json_object_get_member(pJsonObject, securitypreferencesnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&securitypreferencesname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&securitypreferencesname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSecuritypreferencesname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSecuritypreferencesname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *securitypreferencesnameKey = "security.preferences.name";
	json_object_set_member(pJsonObject, securitypreferencesnameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::getSecuritypreferencesname()
{
	return securitypreferencesname;
}

void
ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties::setSecuritypreferencesname(ConfigNodePropertyString  securitypreferencesname)
{
	this->securitypreferencesname = securitypreferencesname;
}


