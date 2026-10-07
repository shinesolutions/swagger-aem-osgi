#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteCompatrouterImplRoutingConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteCompatrouterImplRoutingConfigProperties::ComAdobeGraniteCompatrouterImplRoutingConfigProperties()
{
	//__init();
}

ComAdobeGraniteCompatrouterImplRoutingConfigProperties::~ComAdobeGraniteCompatrouterImplRoutingConfigProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::__init()
{
	//id = new ConfigNodePropertyString();
	//compatPath = new ConfigNodePropertyString();
	//newPath = new ConfigNodePropertyString();
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(compatPath != NULL) {
	//
	//delete compatPath;
	//compatPath = NULL;
	//}
	//if(newPath != NULL) {
	//
	//delete newPath;
	//newPath = NULL;
	//}
	//
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&id, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *compatPathKey = "compatPath";
	node = json_object_get_member(pJsonObject, compatPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&compatPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&compatPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *newPathKey = "newPath";
	node = json_object_get_member(pJsonObject, newPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&newPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&newPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteCompatrouterImplRoutingConfigProperties::ComAdobeGraniteCompatrouterImplRoutingConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getId();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCompatPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCompatPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *compatPathKey = "compatPath";
	json_object_set_member(pJsonObject, compatPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getNewPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getNewPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *newPathKey = "newPath";
	json_object_set_member(pJsonObject, newPathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::getId()
{
	return id;
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::setId(ConfigNodePropertyString  id)
{
	this->id = id;
}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::getCompatPath()
{
	return compatPath;
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::setCompatPath(ConfigNodePropertyString  compatPath)
{
	this->compatPath = compatPath;
}

ConfigNodePropertyString
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::getNewPath()
{
	return newPath;
}

void
ComAdobeGraniteCompatrouterImplRoutingConfigProperties::setNewPath(ConfigNodePropertyString  newPath)
{
	this->newPath = newPath;
}


