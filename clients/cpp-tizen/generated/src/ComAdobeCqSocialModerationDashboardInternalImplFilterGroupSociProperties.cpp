#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties()
{
	//__init();
}

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::~ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::__init()
{
	//resourceTypefilters = new ConfigNodePropertyArray();
	//priority = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::__cleanup()
{
	//if(resourceTypefilters != NULL) {
	//
	//delete resourceTypefilters;
	//resourceTypefilters = NULL;
	//}
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resourceTypefiltersKey = "resourceType.filters";
	node = json_object_get_member(pJsonObject, resourceTypefiltersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceTypefilters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceTypefilters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *priorityKey = "priority";
	node = json_object_get_member(pJsonObject, priorityKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&priority, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&priority);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceTypefilters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceTypefilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceTypefiltersKey = "resourceType.filters";
	json_object_set_member(pJsonObject, resourceTypefiltersKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPriority();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPriority());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *priorityKey = "priority";
	json_object_set_member(pJsonObject, priorityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::getResourceTypefilters()
{
	return resourceTypefilters;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::setResourceTypefilters(ConfigNodePropertyArray  resourceTypefilters)
{
	this->resourceTypefilters = resourceTypefilters;
}

ConfigNodePropertyInteger
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::setPriority(ConfigNodePropertyInteger  priority)
{
	this->priority = priority;
}


