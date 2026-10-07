#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties()
{
	//__init();
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::~OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::__init()
{
	//totalWidth = new ConfigNodePropertyInteger();
	//colWidthName = new ConfigNodePropertyInteger();
	//colWidthResult = new ConfigNodePropertyInteger();
	//colWidthTiming = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::__cleanup()
{
	//if(totalWidth != NULL) {
	//
	//delete totalWidth;
	//totalWidth = NULL;
	//}
	//if(colWidthName != NULL) {
	//
	//delete colWidthName;
	//colWidthName = NULL;
	//}
	//if(colWidthResult != NULL) {
	//
	//delete colWidthResult;
	//colWidthResult = NULL;
	//}
	//if(colWidthTiming != NULL) {
	//
	//delete colWidthTiming;
	//colWidthTiming = NULL;
	//}
	//
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *totalWidthKey = "totalWidth";
	node = json_object_get_member(pJsonObject, totalWidthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&totalWidth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&totalWidth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *colWidthNameKey = "colWidthName";
	node = json_object_get_member(pJsonObject, colWidthNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&colWidthName, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&colWidthName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *colWidthResultKey = "colWidthResult";
	node = json_object_get_member(pJsonObject, colWidthResultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&colWidthResult, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&colWidthResult);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *colWidthTimingKey = "colWidthTiming";
	node = json_object_get_member(pJsonObject, colWidthTimingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&colWidthTiming, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&colWidthTiming);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTotalWidth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTotalWidth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *totalWidthKey = "totalWidth";
	json_object_set_member(pJsonObject, totalWidthKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getColWidthName();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getColWidthName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *colWidthNameKey = "colWidthName";
	json_object_set_member(pJsonObject, colWidthNameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getColWidthResult();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getColWidthResult());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *colWidthResultKey = "colWidthResult";
	json_object_set_member(pJsonObject, colWidthResultKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getColWidthTiming();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getColWidthTiming());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *colWidthTimingKey = "colWidthTiming";
	json_object_set_member(pJsonObject, colWidthTimingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getTotalWidth()
{
	return totalWidth;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setTotalWidth(ConfigNodePropertyInteger  totalWidth)
{
	this->totalWidth = totalWidth;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthName()
{
	return colWidthName;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthName(ConfigNodePropertyInteger  colWidthName)
{
	this->colWidthName = colWidthName;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthResult()
{
	return colWidthResult;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthResult(ConfigNodePropertyInteger  colWidthResult)
{
	this->colWidthResult = colWidthResult;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthTiming()
{
	return colWidthTiming;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthTiming(ConfigNodePropertyInteger  colWidthTiming)
{
	this->colWidthTiming = colWidthTiming;
}


