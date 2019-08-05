#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqHistoryImplHistoryRequestFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqHistoryImplHistoryRequestFilterProperties::ComAdobeCqHistoryImplHistoryRequestFilterProperties()
{
	//__init();
}

ComAdobeCqHistoryImplHistoryRequestFilterProperties::~ComAdobeCqHistoryImplHistoryRequestFilterProperties()
{
	//__cleanup();
}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::__init()
{
	//historyrequestFilterexcludedSelectors = new ConfigNodePropertyArray();
	//historyrequestFilterexcludedExtensions = new ConfigNodePropertyArray();
}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::__cleanup()
{
	//if(historyrequestFilterexcludedSelectors != NULL) {
	//
	//delete historyrequestFilterexcludedSelectors;
	//historyrequestFilterexcludedSelectors = NULL;
	//}
	//if(historyrequestFilterexcludedExtensions != NULL) {
	//
	//delete historyrequestFilterexcludedExtensions;
	//historyrequestFilterexcludedExtensions = NULL;
	//}
	//
}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *historyrequestFilterexcludedSelectorsKey = "history.requestFilter.excludedSelectors";
	node = json_object_get_member(pJsonObject, historyrequestFilterexcludedSelectorsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&historyrequestFilterexcludedSelectors, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&historyrequestFilterexcludedSelectors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *historyrequestFilterexcludedExtensionsKey = "history.requestFilter.excludedExtensions";
	node = json_object_get_member(pJsonObject, historyrequestFilterexcludedExtensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&historyrequestFilterexcludedExtensions, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&historyrequestFilterexcludedExtensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqHistoryImplHistoryRequestFilterProperties::ComAdobeCqHistoryImplHistoryRequestFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqHistoryImplHistoryRequestFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHistoryrequestFilterexcludedSelectors();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHistoryrequestFilterexcludedSelectors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *historyrequestFilterexcludedSelectorsKey = "history.requestFilter.excludedSelectors";
	json_object_set_member(pJsonObject, historyrequestFilterexcludedSelectorsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHistoryrequestFilterexcludedExtensions();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHistoryrequestFilterexcludedExtensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *historyrequestFilterexcludedExtensionsKey = "history.requestFilter.excludedExtensions";
	json_object_set_member(pJsonObject, historyrequestFilterexcludedExtensionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryRequestFilterProperties::getHistoryrequestFilterexcludedSelectors()
{
	return historyrequestFilterexcludedSelectors;
}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::setHistoryrequestFilterexcludedSelectors(ConfigNodePropertyArray  historyrequestFilterexcludedSelectors)
{
	this->historyrequestFilterexcludedSelectors = historyrequestFilterexcludedSelectors;
}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryRequestFilterProperties::getHistoryrequestFilterexcludedExtensions()
{
	return historyrequestFilterexcludedExtensions;
}

void
ComAdobeCqHistoryImplHistoryRequestFilterProperties::setHistoryrequestFilterexcludedExtensions(ConfigNodePropertyArray  historyrequestFilterexcludedExtensions)
{
	this->historyrequestFilterexcludedExtensions = historyrequestFilterexcludedExtensions;
}


