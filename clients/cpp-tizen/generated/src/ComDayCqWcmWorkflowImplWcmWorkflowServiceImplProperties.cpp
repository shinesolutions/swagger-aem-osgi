#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties()
{
	//__init();
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::~ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::__init()
{
	//eventfilter = new ConfigNodePropertyString();
	//minThreadPoolSize = new ConfigNodePropertyInteger();
	//maxThreadPoolSize = new ConfigNodePropertyInteger();
	//cqwcmworkflowterminateonactivate = new ConfigNodePropertyBoolean();
	//cqwcmworklfowterminateexclusionlist = new ConfigNodePropertyArray();
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::__cleanup()
{
	//if(eventfilter != NULL) {
	//
	//delete eventfilter;
	//eventfilter = NULL;
	//}
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
	//if(cqwcmworkflowterminateonactivate != NULL) {
	//
	//delete cqwcmworkflowterminateonactivate;
	//cqwcmworkflowterminateonactivate = NULL;
	//}
	//if(cqwcmworklfowterminateexclusionlist != NULL) {
	//
	//delete cqwcmworklfowterminateexclusionlist;
	//cqwcmworklfowterminateexclusionlist = NULL;
	//}
	//
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *eventfilterKey = "event.filter";
	node = json_object_get_member(pJsonObject, eventfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&eventfilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&eventfilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
	const gchar *cqwcmworkflowterminateonactivateKey = "cq.wcm.workflow.terminate.on.activate";
	node = json_object_get_member(pJsonObject, cqwcmworkflowterminateonactivateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqwcmworkflowterminateonactivate, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqwcmworkflowterminateonactivate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqwcmworklfowterminateexclusionlistKey = "cq.wcm.worklfow.terminate.exclusion.list";
	node = json_object_get_member(pJsonObject, cqwcmworklfowterminateexclusionlistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqwcmworklfowterminateexclusionlist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqwcmworklfowterminateexclusionlist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEventfilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEventfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eventfilterKey = "event.filter";
	json_object_set_member(pJsonObject, eventfilterKey, node);
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqwcmworkflowterminateonactivate();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqwcmworkflowterminateonactivate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmworkflowterminateonactivateKey = "cq.wcm.workflow.terminate.on.activate";
	json_object_set_member(pJsonObject, cqwcmworkflowterminateonactivateKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqwcmworklfowterminateexclusionlist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqwcmworklfowterminateexclusionlist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqwcmworklfowterminateexclusionlistKey = "cq.wcm.worklfow.terminate.exclusion.list";
	json_object_set_member(pJsonObject, cqwcmworklfowterminateexclusionlistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setEventfilter(ConfigNodePropertyString  eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyInteger
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getMinThreadPoolSize()
{
	return minThreadPoolSize;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setMinThreadPoolSize(ConfigNodePropertyInteger  minThreadPoolSize)
{
	this->minThreadPoolSize = minThreadPoolSize;
}

ConfigNodePropertyInteger
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getMaxThreadPoolSize()
{
	return maxThreadPoolSize;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setMaxThreadPoolSize(ConfigNodePropertyInteger  maxThreadPoolSize)
{
	this->maxThreadPoolSize = maxThreadPoolSize;
}

ConfigNodePropertyBoolean
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getCqwcmworkflowterminateonactivate()
{
	return cqwcmworkflowterminateonactivate;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setCqwcmworkflowterminateonactivate(ConfigNodePropertyBoolean  cqwcmworkflowterminateonactivate)
{
	this->cqwcmworkflowterminateonactivate = cqwcmworkflowterminateonactivate;
}

ConfigNodePropertyArray
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getCqwcmworklfowterminateexclusionlist()
{
	return cqwcmworklfowterminateexclusionlist;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setCqwcmworklfowterminateexclusionlist(ConfigNodePropertyArray  cqwcmworklfowterminateexclusionlist)
{
	this->cqwcmworklfowterminateexclusionlist = cqwcmworklfowterminateexclusionlist;
}


