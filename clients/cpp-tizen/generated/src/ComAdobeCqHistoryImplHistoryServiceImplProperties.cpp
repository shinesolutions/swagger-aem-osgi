#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqHistoryImplHistoryServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqHistoryImplHistoryServiceImplProperties::ComAdobeCqHistoryImplHistoryServiceImplProperties()
{
	//__init();
}

ComAdobeCqHistoryImplHistoryServiceImplProperties::~ComAdobeCqHistoryImplHistoryServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::__init()
{
	//historyserviceresourceTypes = new ConfigNodePropertyArray();
	//historyservicepathFilter = new ConfigNodePropertyArray();
}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::__cleanup()
{
	//if(historyserviceresourceTypes != NULL) {
	//
	//delete historyserviceresourceTypes;
	//historyserviceresourceTypes = NULL;
	//}
	//if(historyservicepathFilter != NULL) {
	//
	//delete historyservicepathFilter;
	//historyservicepathFilter = NULL;
	//}
	//
}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *historyserviceresourceTypesKey = "history.service.resourceTypes";
	node = json_object_get_member(pJsonObject, historyserviceresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&historyserviceresourceTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&historyserviceresourceTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *historyservicepathFilterKey = "history.service.pathFilter";
	node = json_object_get_member(pJsonObject, historyservicepathFilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&historyservicepathFilter, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&historyservicepathFilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqHistoryImplHistoryServiceImplProperties::ComAdobeCqHistoryImplHistoryServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqHistoryImplHistoryServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHistoryserviceresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHistoryserviceresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *historyserviceresourceTypesKey = "history.service.resourceTypes";
	json_object_set_member(pJsonObject, historyserviceresourceTypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHistoryservicepathFilter();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHistoryservicepathFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *historyservicepathFilterKey = "history.service.pathFilter";
	json_object_set_member(pJsonObject, historyservicepathFilterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryServiceImplProperties::getHistoryserviceresourceTypes()
{
	return historyserviceresourceTypes;
}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::setHistoryserviceresourceTypes(ConfigNodePropertyArray  historyserviceresourceTypes)
{
	this->historyserviceresourceTypes = historyserviceresourceTypes;
}

ConfigNodePropertyArray
ComAdobeCqHistoryImplHistoryServiceImplProperties::getHistoryservicepathFilter()
{
	return historyservicepathFilter;
}

void
ComAdobeCqHistoryImplHistoryServiceImplProperties::setHistoryservicepathFilter(ConfigNodePropertyArray  historyservicepathFilter)
{
	this->historyservicepathFilter = historyservicepathFilter;
}


