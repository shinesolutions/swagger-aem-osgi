#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties()
{
	//__init();
}

OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::~OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties()
{
	//__cleanup();
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::__init()
{
	//felixinventoryprintername = new ConfigNodePropertyString();
	//felixinventoryprintertitle = new ConfigNodePropertyString();
	//path = new ConfigNodePropertyString();
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::__cleanup()
{
	//if(felixinventoryprintername != NULL) {
	//
	//delete felixinventoryprintername;
	//felixinventoryprintername = NULL;
	//}
	//if(felixinventoryprintertitle != NULL) {
	//
	//delete felixinventoryprintertitle;
	//felixinventoryprintertitle = NULL;
	//}
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *felixinventoryprinternameKey = "felix.inventory.printer.name";
	node = json_object_get_member(pJsonObject, felixinventoryprinternameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&felixinventoryprintername, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&felixinventoryprintername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *felixinventoryprintertitleKey = "felix.inventory.printer.title";
	node = json_object_get_member(pJsonObject, felixinventoryprintertitleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&felixinventoryprintertitle, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&felixinventoryprintertitle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFelixinventoryprintername();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFelixinventoryprintername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *felixinventoryprinternameKey = "felix.inventory.printer.name";
	json_object_set_member(pJsonObject, felixinventoryprinternameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFelixinventoryprintertitle();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFelixinventoryprintertitle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *felixinventoryprintertitleKey = "felix.inventory.printer.title";
	json_object_set_member(pJsonObject, felixinventoryprintertitleKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getFelixinventoryprintername()
{
	return felixinventoryprintername;
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setFelixinventoryprintername(ConfigNodePropertyString  felixinventoryprintername)
{
	this->felixinventoryprintername = felixinventoryprintername;
}

ConfigNodePropertyString
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getFelixinventoryprintertitle()
{
	return felixinventoryprintertitle;
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setFelixinventoryprintertitle(ConfigNodePropertyString  felixinventoryprintertitle)
{
	this->felixinventoryprintertitle = felixinventoryprintertitle;
}

ConfigNodePropertyString
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::getPath()
{
	return path;
}

void
OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}


