#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplHandlerJpegHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplHandlerJpegHandlerProperties::ComDayCqDamCoreImplHandlerJpegHandlerProperties()
{
	//__init();
}

ComDayCqDamCoreImplHandlerJpegHandlerProperties::~ComDayCqDamCoreImplHandlerJpegHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::__init()
{
	//cqdamenableextmetaextraction = new ConfigNodePropertyBoolean();
	//large_file_threshold = new ConfigNodePropertyInteger();
	//large_comment_threshold = new ConfigNodePropertyInteger();
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::__cleanup()
{
	//if(cqdamenableextmetaextraction != NULL) {
	//
	//delete cqdamenableextmetaextraction;
	//cqdamenableextmetaextraction = NULL;
	//}
	//if(large_file_threshold != NULL) {
	//
	//delete large_file_threshold;
	//large_file_threshold = NULL;
	//}
	//if(large_comment_threshold != NULL) {
	//
	//delete large_comment_threshold;
	//large_comment_threshold = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamenableextmetaextractionKey = "cq.dam.enable.ext.meta.extraction";
	node = json_object_get_member(pJsonObject, cqdamenableextmetaextractionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamenableextmetaextraction, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamenableextmetaextraction);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *large_file_thresholdKey = "large_file_threshold";
	node = json_object_get_member(pJsonObject, large_file_thresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&large_file_threshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&large_file_threshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *large_comment_thresholdKey = "large_comment_threshold";
	node = json_object_get_member(pJsonObject, large_comment_thresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&large_comment_threshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&large_comment_threshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplHandlerJpegHandlerProperties::ComDayCqDamCoreImplHandlerJpegHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplHandlerJpegHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamenableextmetaextraction();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamenableextmetaextraction());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamenableextmetaextractionKey = "cq.dam.enable.ext.meta.extraction";
	json_object_set_member(pJsonObject, cqdamenableextmetaextractionKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLargeFileThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLargeFileThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *large_file_thresholdKey = "large_file_threshold";
	json_object_set_member(pJsonObject, large_file_thresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getLargeCommentThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getLargeCommentThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *large_comment_thresholdKey = "large_comment_threshold";
	json_object_set_member(pJsonObject, large_comment_thresholdKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplHandlerJpegHandlerProperties::getCqdamenableextmetaextraction()
{
	return cqdamenableextmetaextraction;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::setCqdamenableextmetaextraction(ConfigNodePropertyBoolean  cqdamenableextmetaextraction)
{
	this->cqdamenableextmetaextraction = cqdamenableextmetaextraction;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplHandlerJpegHandlerProperties::getLargeFileThreshold()
{
	return large_file_threshold;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::setLargeFileThreshold(ConfigNodePropertyInteger  large_file_threshold)
{
	this->large_file_threshold = large_file_threshold;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplHandlerJpegHandlerProperties::getLargeCommentThreshold()
{
	return large_comment_threshold;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::setLargeCommentThreshold(ConfigNodePropertyInteger  large_comment_threshold)
{
	this->large_comment_threshold = large_comment_threshold;
}


