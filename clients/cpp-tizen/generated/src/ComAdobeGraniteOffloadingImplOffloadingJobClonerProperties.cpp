#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties()
{
	//__init();
}

ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::~ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::__init()
{
	//offloadingjobclonerenabled = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::__cleanup()
{
	//if(offloadingjobclonerenabled != NULL) {
	//
	//delete offloadingjobclonerenabled;
	//offloadingjobclonerenabled = NULL;
	//}
	//
}

void
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *offloadingjobclonerenabledKey = "offloading.jobcloner.enabled";
	node = json_object_get_member(pJsonObject, offloadingjobclonerenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&offloadingjobclonerenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&offloadingjobclonerenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOffloadingjobclonerenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOffloadingjobclonerenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *offloadingjobclonerenabledKey = "offloading.jobcloner.enabled";
	json_object_set_member(pJsonObject, offloadingjobclonerenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::getOffloadingjobclonerenabled()
{
	return offloadingjobclonerenabled;
}

void
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties::setOffloadingjobclonerenabled(ConfigNodePropertyBoolean  offloadingjobclonerenabled)
{
	this->offloadingjobclonerenabled = offloadingjobclonerenabled;
}


