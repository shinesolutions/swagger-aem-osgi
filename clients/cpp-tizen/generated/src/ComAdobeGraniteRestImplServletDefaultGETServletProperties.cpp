#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRestImplServletDefaultGETServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRestImplServletDefaultGETServletProperties::ComAdobeGraniteRestImplServletDefaultGETServletProperties()
{
	//__init();
}

ComAdobeGraniteRestImplServletDefaultGETServletProperties::~ComAdobeGraniteRestImplServletDefaultGETServletProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::__init()
{
	//defaultlimit = new ConfigNodePropertyInteger();
	//useabsoluteuri = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::__cleanup()
{
	//if(defaultlimit != NULL) {
	//
	//delete defaultlimit;
	//defaultlimit = NULL;
	//}
	//if(useabsoluteuri != NULL) {
	//
	//delete useabsoluteuri;
	//useabsoluteuri = NULL;
	//}
	//
}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *defaultlimitKey = "default.limit";
	node = json_object_get_member(pJsonObject, defaultlimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&defaultlimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&defaultlimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *useabsoluteuriKey = "use.absolute.uri";
	node = json_object_get_member(pJsonObject, useabsoluteuriKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&useabsoluteuri, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&useabsoluteuri);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRestImplServletDefaultGETServletProperties::ComAdobeGraniteRestImplServletDefaultGETServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRestImplServletDefaultGETServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDefaultlimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDefaultlimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultlimitKey = "default.limit";
	json_object_set_member(pJsonObject, defaultlimitKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getUseabsoluteuri();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getUseabsoluteuri());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *useabsoluteuriKey = "use.absolute.uri";
	json_object_set_member(pJsonObject, useabsoluteuriKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteRestImplServletDefaultGETServletProperties::getDefaultlimit()
{
	return defaultlimit;
}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::setDefaultlimit(ConfigNodePropertyInteger  defaultlimit)
{
	this->defaultlimit = defaultlimit;
}

ConfigNodePropertyBoolean
ComAdobeGraniteRestImplServletDefaultGETServletProperties::getUseabsoluteuri()
{
	return useabsoluteuri;
}

void
ComAdobeGraniteRestImplServletDefaultGETServletProperties::setUseabsoluteuri(ConfigNodePropertyBoolean  useabsoluteuri)
{
	this->useabsoluteuri = useabsoluteuri;
}


