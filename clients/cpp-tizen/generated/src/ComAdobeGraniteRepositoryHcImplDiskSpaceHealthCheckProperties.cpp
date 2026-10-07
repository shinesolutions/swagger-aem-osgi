#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::~ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//diskspacewarnthreshold = new ConfigNodePropertyInteger();
	//diskspaceerrorthreshold = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(diskspacewarnthreshold != NULL) {
	//
	//delete diskspacewarnthreshold;
	//diskspacewarnthreshold = NULL;
	//}
	//if(diskspaceerrorthreshold != NULL) {
	//
	//delete diskspaceerrorthreshold;
	//diskspaceerrorthreshold = NULL;
	//}
	//
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *diskspacewarnthresholdKey = "disk.space.warn.threshold";
	node = json_object_get_member(pJsonObject, diskspacewarnthresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&diskspacewarnthreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&diskspacewarnthreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *diskspaceerrorthresholdKey = "disk.space.error.threshold";
	node = json_object_get_member(pJsonObject, diskspaceerrorthresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&diskspaceerrorthreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&diskspaceerrorthreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDiskspacewarnthreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDiskspacewarnthreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *diskspacewarnthresholdKey = "disk.space.warn.threshold";
	json_object_set_member(pJsonObject, diskspacewarnthresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDiskspaceerrorthreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDiskspaceerrorthreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *diskspaceerrorthresholdKey = "disk.space.error.threshold";
	json_object_set_member(pJsonObject, diskspaceerrorthresholdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::getDiskspacewarnthreshold()
{
	return diskspacewarnthreshold;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::setDiskspacewarnthreshold(ConfigNodePropertyInteger  diskspacewarnthreshold)
{
	this->diskspacewarnthreshold = diskspacewarnthreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::getDiskspaceerrorthreshold()
{
	return diskspaceerrorthreshold;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::setDiskspaceerrorthreshold(ConfigNodePropertyInteger  diskspaceerrorthreshold)
{
	this->diskspaceerrorthreshold = diskspaceerrorthreshold;
}


