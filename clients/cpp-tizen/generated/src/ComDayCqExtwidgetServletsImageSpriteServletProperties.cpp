#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqExtwidgetServletsImageSpriteServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqExtwidgetServletsImageSpriteServletProperties::ComDayCqExtwidgetServletsImageSpriteServletProperties()
{
	//__init();
}

ComDayCqExtwidgetServletsImageSpriteServletProperties::~ComDayCqExtwidgetServletsImageSpriteServletProperties()
{
	//__cleanup();
}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::__init()
{
	//maxWidth = new ConfigNodePropertyInteger();
	//maxHeight = new ConfigNodePropertyInteger();
}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::__cleanup()
{
	//if(maxWidth != NULL) {
	//
	//delete maxWidth;
	//maxWidth = NULL;
	//}
	//if(maxHeight != NULL) {
	//
	//delete maxHeight;
	//maxHeight = NULL;
	//}
	//
}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxWidthKey = "maxWidth";
	node = json_object_get_member(pJsonObject, maxWidthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxWidth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxWidth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxHeightKey = "maxHeight";
	node = json_object_get_member(pJsonObject, maxHeightKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxHeight, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxHeight);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqExtwidgetServletsImageSpriteServletProperties::ComDayCqExtwidgetServletsImageSpriteServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqExtwidgetServletsImageSpriteServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxWidth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxWidth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxWidthKey = "maxWidth";
	json_object_set_member(pJsonObject, maxWidthKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxHeight();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxHeight());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxHeightKey = "maxHeight";
	json_object_set_member(pJsonObject, maxHeightKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqExtwidgetServletsImageSpriteServletProperties::getMaxWidth()
{
	return maxWidth;
}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::setMaxWidth(ConfigNodePropertyInteger  maxWidth)
{
	this->maxWidth = maxWidth;
}

ConfigNodePropertyInteger
ComDayCqExtwidgetServletsImageSpriteServletProperties::getMaxHeight()
{
	return maxHeight;
}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::setMaxHeight(ConfigNodePropertyInteger  maxHeight)
{
	this->maxHeight = maxHeight;
}


