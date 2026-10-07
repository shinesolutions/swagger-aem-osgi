#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties()
{
	//__init();
}

ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::~ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::__init()
{
	//offloadingoffloaderenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::__cleanup()
{
	//if(offloadingoffloaderenabled != NULL) {
	//
	//delete offloadingoffloaderenabled;
	//offloadingoffloaderenabled = NULL;
	//}
	//
}

void
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offloadingoffloaderenabledKey = "offloading.offloader.enabled";
	node = json_object_get_member(pJsonObject, offloadingoffloaderenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&offloadingoffloaderenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&offloadingoffloaderenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOffloadingoffloaderenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOffloadingoffloaderenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offloadingoffloaderenabledKey = "offloading.offloader.enabled";
	json_object_set_member(pJsonObject, offloadingoffloaderenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::getOffloadingoffloaderenabled()
{
	return offloadingoffloaderenabled;
}

void
ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties::setOffloadingoffloaderenabled(ConfigNodePropertyBoolean  offloadingoffloaderenabled)
{
	this->offloadingoffloaderenabled = offloadingoffloaderenabled;
}


