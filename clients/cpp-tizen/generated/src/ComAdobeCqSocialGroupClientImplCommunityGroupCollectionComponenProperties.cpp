#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties()
{
	//__init();
}

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::~ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::__init()
{
	//grouplistingpaginationenable = new ConfigNodePropertyBoolean();
	//grouplistinglazyloadingenable = new ConfigNodePropertyBoolean();
	//pagesize = new ConfigNodePropertyInteger();
	//priority = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::__cleanup()
{
	//if(grouplistingpaginationenable != NULL) {
	//
	//delete grouplistingpaginationenable;
	//grouplistingpaginationenable = NULL;
	//}
	//if(grouplistinglazyloadingenable != NULL) {
	//
	//delete grouplistinglazyloadingenable;
	//grouplistinglazyloadingenable = NULL;
	//}
	//if(pagesize != NULL) {
	//
	//delete pagesize;
	//pagesize = NULL;
	//}
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *grouplistingpaginationenableKey = "group.listing.pagination.enable";
	node = json_object_get_member(pJsonObject, grouplistingpaginationenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&grouplistingpaginationenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&grouplistingpaginationenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *grouplistinglazyloadingenableKey = "group.listing.lazyloading.enable";
	node = json_object_get_member(pJsonObject, grouplistinglazyloadingenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&grouplistinglazyloadingenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&grouplistinglazyloadingenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pagesizeKey = "page.size";
	node = json_object_get_member(pJsonObject, pagesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&pagesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&pagesize);
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

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGrouplistingpaginationenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGrouplistingpaginationenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *grouplistingpaginationenableKey = "group.listing.pagination.enable";
	json_object_set_member(pJsonObject, grouplistingpaginationenableKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGrouplistinglazyloadingenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGrouplistinglazyloadingenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *grouplistinglazyloadingenableKey = "group.listing.lazyloading.enable";
	json_object_set_member(pJsonObject, grouplistinglazyloadingenableKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPagesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPagesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pagesizeKey = "page.size";
	json_object_set_member(pJsonObject, pagesizeKey, node);
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

ConfigNodePropertyBoolean
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getGrouplistingpaginationenable()
{
	return grouplistingpaginationenable;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setGrouplistingpaginationenable(ConfigNodePropertyBoolean  grouplistingpaginationenable)
{
	this->grouplistingpaginationenable = grouplistingpaginationenable;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getGrouplistinglazyloadingenable()
{
	return grouplistinglazyloadingenable;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setGrouplistinglazyloadingenable(ConfigNodePropertyBoolean  grouplistinglazyloadingenable)
{
	this->grouplistinglazyloadingenable = grouplistinglazyloadingenable;
}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getPagesize()
{
	return pagesize;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setPagesize(ConfigNodePropertyInteger  pagesize)
{
	this->pagesize = pagesize;
}

ConfigNodePropertyInteger
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties::setPriority(ConfigNodePropertyInteger  priority)
{
	this->priority = priority;
}


