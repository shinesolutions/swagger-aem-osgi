#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties()
{
	//__init();
}

ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::~ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties()
{
	//__cleanup();
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::__init()
{
	//inboximpltypeproviderregistrypaths = new ConfigNodePropertyArray();
	//inboximpltypeproviderlegacypaths = new ConfigNodePropertyArray();
	//inboximpltypeproviderdefaulturlfailureitem = new ConfigNodePropertyString();
	//inboximpltypeproviderdefaulturlworkitem = new ConfigNodePropertyString();
	//inboximpltypeproviderdefaulturltask = new ConfigNodePropertyString();
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::__cleanup()
{
	//if(inboximpltypeproviderregistrypaths != NULL) {
	//
	//delete inboximpltypeproviderregistrypaths;
	//inboximpltypeproviderregistrypaths = NULL;
	//}
	//if(inboximpltypeproviderlegacypaths != NULL) {
	//
	//delete inboximpltypeproviderlegacypaths;
	//inboximpltypeproviderlegacypaths = NULL;
	//}
	//if(inboximpltypeproviderdefaulturlfailureitem != NULL) {
	//
	//delete inboximpltypeproviderdefaulturlfailureitem;
	//inboximpltypeproviderdefaulturlfailureitem = NULL;
	//}
	//if(inboximpltypeproviderdefaulturlworkitem != NULL) {
	//
	//delete inboximpltypeproviderdefaulturlworkitem;
	//inboximpltypeproviderdefaulturlworkitem = NULL;
	//}
	//if(inboximpltypeproviderdefaulturltask != NULL) {
	//
	//delete inboximpltypeproviderdefaulturltask;
	//inboximpltypeproviderdefaulturltask = NULL;
	//}
	//
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *inboximpltypeproviderregistrypathsKey = "inbox.impl.typeprovider.registrypaths";
	node = json_object_get_member(pJsonObject, inboximpltypeproviderregistrypathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&inboximpltypeproviderregistrypaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&inboximpltypeproviderregistrypaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inboximpltypeproviderlegacypathsKey = "inbox.impl.typeprovider.legacypaths";
	node = json_object_get_member(pJsonObject, inboximpltypeproviderlegacypathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&inboximpltypeproviderlegacypaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&inboximpltypeproviderlegacypaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inboximpltypeproviderdefaulturlfailureitemKey = "inbox.impl.typeprovider.defaulturl.failureitem";
	node = json_object_get_member(pJsonObject, inboximpltypeproviderdefaulturlfailureitemKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&inboximpltypeproviderdefaulturlfailureitem, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&inboximpltypeproviderdefaulturlfailureitem);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inboximpltypeproviderdefaulturlworkitemKey = "inbox.impl.typeprovider.defaulturl.workitem";
	node = json_object_get_member(pJsonObject, inboximpltypeproviderdefaulturlworkitemKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&inboximpltypeproviderdefaulturlworkitem, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&inboximpltypeproviderdefaulturlworkitem);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *inboximpltypeproviderdefaulturltaskKey = "inbox.impl.typeprovider.defaulturl.task";
	node = json_object_get_member(pJsonObject, inboximpltypeproviderdefaulturltaskKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&inboximpltypeproviderdefaulturltask, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&inboximpltypeproviderdefaulturltask);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getInboximpltypeproviderregistrypaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getInboximpltypeproviderregistrypaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inboximpltypeproviderregistrypathsKey = "inbox.impl.typeprovider.registrypaths";
	json_object_set_member(pJsonObject, inboximpltypeproviderregistrypathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getInboximpltypeproviderlegacypaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getInboximpltypeproviderlegacypaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inboximpltypeproviderlegacypathsKey = "inbox.impl.typeprovider.legacypaths";
	json_object_set_member(pJsonObject, inboximpltypeproviderlegacypathsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getInboximpltypeproviderdefaulturlfailureitem();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getInboximpltypeproviderdefaulturlfailureitem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inboximpltypeproviderdefaulturlfailureitemKey = "inbox.impl.typeprovider.defaulturl.failureitem";
	json_object_set_member(pJsonObject, inboximpltypeproviderdefaulturlfailureitemKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getInboximpltypeproviderdefaulturlworkitem();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getInboximpltypeproviderdefaulturlworkitem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inboximpltypeproviderdefaulturlworkitemKey = "inbox.impl.typeprovider.defaulturl.workitem";
	json_object_set_member(pJsonObject, inboximpltypeproviderdefaulturlworkitemKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getInboximpltypeproviderdefaulturltask();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getInboximpltypeproviderdefaulturltask());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *inboximpltypeproviderdefaulturltaskKey = "inbox.impl.typeprovider.defaulturl.task";
	json_object_set_member(pJsonObject, inboximpltypeproviderdefaulturltaskKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderregistrypaths()
{
	return inboximpltypeproviderregistrypaths;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderregistrypaths(ConfigNodePropertyArray  inboximpltypeproviderregistrypaths)
{
	this->inboximpltypeproviderregistrypaths = inboximpltypeproviderregistrypaths;
}

ConfigNodePropertyArray
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderlegacypaths()
{
	return inboximpltypeproviderlegacypaths;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderlegacypaths(ConfigNodePropertyArray  inboximpltypeproviderlegacypaths)
{
	this->inboximpltypeproviderlegacypaths = inboximpltypeproviderlegacypaths;
}

ConfigNodePropertyString
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderdefaulturlfailureitem()
{
	return inboximpltypeproviderdefaulturlfailureitem;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderdefaulturlfailureitem(ConfigNodePropertyString  inboximpltypeproviderdefaulturlfailureitem)
{
	this->inboximpltypeproviderdefaulturlfailureitem = inboximpltypeproviderdefaulturlfailureitem;
}

ConfigNodePropertyString
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderdefaulturlworkitem()
{
	return inboximpltypeproviderdefaulturlworkitem;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderdefaulturlworkitem(ConfigNodePropertyString  inboximpltypeproviderdefaulturlworkitem)
{
	this->inboximpltypeproviderdefaulturlworkitem = inboximpltypeproviderdefaulturlworkitem;
}

ConfigNodePropertyString
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::getInboximpltypeproviderdefaulturltask()
{
	return inboximpltypeproviderdefaulturltask;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties::setInboximpltypeproviderdefaulturltask(ConfigNodePropertyString  inboximpltypeproviderdefaulturltask)
{
	this->inboximpltypeproviderdefaulturltask = inboximpltypeproviderdefaulturltask;
}


