#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties()
{
	//__init();
}

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::~ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::__init()
{
	//minThreadPoolSize = new ConfigNodePropertyInteger();
	//maxThreadPoolSize = new ConfigNodePropertyInteger();
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::__cleanup()
{
	//if(minThreadPoolSize != NULL) {
	//
	//delete minThreadPoolSize;
	//minThreadPoolSize = NULL;
	//}
	//if(maxThreadPoolSize != NULL) {
	//
	//delete maxThreadPoolSize;
	//maxThreadPoolSize = NULL;
	//}
	//
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *minThreadPoolSizeKey = "minThreadPoolSize";
	node = json_object_get_member(pJsonObject, minThreadPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minThreadPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minThreadPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxThreadPoolSizeKey = "maxThreadPoolSize";
	node = json_object_get_member(pJsonObject, maxThreadPoolSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxThreadPoolSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxThreadPoolSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinThreadPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinThreadPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minThreadPoolSizeKey = "minThreadPoolSize";
	json_object_set_member(pJsonObject, minThreadPoolSizeKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxThreadPoolSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxThreadPoolSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxThreadPoolSizeKey = "maxThreadPoolSize";
	json_object_set_member(pJsonObject, maxThreadPoolSizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::getMinThreadPoolSize()
{
	return minThreadPoolSize;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::setMinThreadPoolSize(ConfigNodePropertyInteger  minThreadPoolSize)
{
	this->minThreadPoolSize = minThreadPoolSize;
}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::getMaxThreadPoolSize()
{
	return maxThreadPoolSize;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::setMaxThreadPoolSize(ConfigNodePropertyInteger  maxThreadPoolSize)
{
	this->maxThreadPoolSize = maxThreadPoolSize;
}


