#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::~ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::__init()
{
	//largeindexcriticalthreshold = new ConfigNodePropertyInteger();
	//largeindexwarnthreshold = new ConfigNodePropertyInteger();
	//hctags = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::__cleanup()
{
	//if(largeindexcriticalthreshold != NULL) {
	//
	//delete largeindexcriticalthreshold;
	//largeindexcriticalthreshold = NULL;
	//}
	//if(largeindexwarnthreshold != NULL) {
	//
	//delete largeindexwarnthreshold;
	//largeindexwarnthreshold = NULL;
	//}
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *largeindexcriticalthresholdKey = "large.index.critical.threshold";
	node = json_object_get_member(pJsonObject, largeindexcriticalthresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&largeindexcriticalthreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&largeindexcriticalthreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *largeindexwarnthresholdKey = "large.index.warn.threshold";
	node = json_object_get_member(pJsonObject, largeindexwarnthresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&largeindexwarnthreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&largeindexwarnthreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLargeindexcriticalthreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLargeindexcriticalthreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *largeindexcriticalthresholdKey = "large.index.critical.threshold";
	json_object_set_member(pJsonObject, largeindexcriticalthresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLargeindexwarnthreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLargeindexwarnthreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *largeindexwarnthresholdKey = "large.index.warn.threshold";
	json_object_set_member(pJsonObject, largeindexwarnthresholdKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::getLargeindexcriticalthreshold()
{
	return largeindexcriticalthreshold;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::setLargeindexcriticalthreshold(ConfigNodePropertyInteger  largeindexcriticalthreshold)
{
	this->largeindexcriticalthreshold = largeindexcriticalthreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::getLargeindexwarnthreshold()
{
	return largeindexwarnthreshold;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::setLargeindexwarnthreshold(ConfigNodePropertyInteger  largeindexwarnthreshold)
{
	this->largeindexwarnthreshold = largeindexwarnthreshold;
}

ConfigNodePropertyArray
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}


