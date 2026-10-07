#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties()
{
	//__init();
}

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::~ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::__init()
{
	//cqpagesupdatehandlerimageresourcetypes = new ConfigNodePropertyArray();
	//cqpagesupdatehandlerproductresourcetypes = new ConfigNodePropertyArray();
	//cqpagesupdatehandlervideoresourcetypes = new ConfigNodePropertyArray();
	//cqpagesupdatehandlerdynamicsequenceresourcetypes = new ConfigNodePropertyArray();
	//cqpagesupdatehandlerpreviewmodepaths = new ConfigNodePropertyArray();
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::__cleanup()
{
	//if(cqpagesupdatehandlerimageresourcetypes != NULL) {
	//
	//delete cqpagesupdatehandlerimageresourcetypes;
	//cqpagesupdatehandlerimageresourcetypes = NULL;
	//}
	//if(cqpagesupdatehandlerproductresourcetypes != NULL) {
	//
	//delete cqpagesupdatehandlerproductresourcetypes;
	//cqpagesupdatehandlerproductresourcetypes = NULL;
	//}
	//if(cqpagesupdatehandlervideoresourcetypes != NULL) {
	//
	//delete cqpagesupdatehandlervideoresourcetypes;
	//cqpagesupdatehandlervideoresourcetypes = NULL;
	//}
	//if(cqpagesupdatehandlerdynamicsequenceresourcetypes != NULL) {
	//
	//delete cqpagesupdatehandlerdynamicsequenceresourcetypes;
	//cqpagesupdatehandlerdynamicsequenceresourcetypes = NULL;
	//}
	//if(cqpagesupdatehandlerpreviewmodepaths != NULL) {
	//
	//delete cqpagesupdatehandlerpreviewmodepaths;
	//cqpagesupdatehandlerpreviewmodepaths = NULL;
	//}
	//
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqpagesupdatehandlerimageresourcetypesKey = "cq.pagesupdatehandler.imageresourcetypes";
	node = json_object_get_member(pJsonObject, cqpagesupdatehandlerimageresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqpagesupdatehandlerimageresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqpagesupdatehandlerimageresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqpagesupdatehandlerproductresourcetypesKey = "cq.pagesupdatehandler.productresourcetypes";
	node = json_object_get_member(pJsonObject, cqpagesupdatehandlerproductresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqpagesupdatehandlerproductresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqpagesupdatehandlerproductresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqpagesupdatehandlervideoresourcetypesKey = "cq.pagesupdatehandler.videoresourcetypes";
	node = json_object_get_member(pJsonObject, cqpagesupdatehandlervideoresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqpagesupdatehandlervideoresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqpagesupdatehandlervideoresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqpagesupdatehandlerdynamicsequenceresourcetypesKey = "cq.pagesupdatehandler.dynamicsequenceresourcetypes";
	node = json_object_get_member(pJsonObject, cqpagesupdatehandlerdynamicsequenceresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqpagesupdatehandlerdynamicsequenceresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqpagesupdatehandlerdynamicsequenceresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqpagesupdatehandlerpreviewmodepathsKey = "cq.pagesupdatehandler.previewmodepaths";
	node = json_object_get_member(pJsonObject, cqpagesupdatehandlerpreviewmodepathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqpagesupdatehandlerpreviewmodepaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqpagesupdatehandlerpreviewmodepaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqpagesupdatehandlerimageresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqpagesupdatehandlerimageresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqpagesupdatehandlerimageresourcetypesKey = "cq.pagesupdatehandler.imageresourcetypes";
	json_object_set_member(pJsonObject, cqpagesupdatehandlerimageresourcetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqpagesupdatehandlerproductresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqpagesupdatehandlerproductresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqpagesupdatehandlerproductresourcetypesKey = "cq.pagesupdatehandler.productresourcetypes";
	json_object_set_member(pJsonObject, cqpagesupdatehandlerproductresourcetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqpagesupdatehandlervideoresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqpagesupdatehandlervideoresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqpagesupdatehandlervideoresourcetypesKey = "cq.pagesupdatehandler.videoresourcetypes";
	json_object_set_member(pJsonObject, cqpagesupdatehandlervideoresourcetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqpagesupdatehandlerdynamicsequenceresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqpagesupdatehandlerdynamicsequenceresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqpagesupdatehandlerdynamicsequenceresourcetypesKey = "cq.pagesupdatehandler.dynamicsequenceresourcetypes";
	json_object_set_member(pJsonObject, cqpagesupdatehandlerdynamicsequenceresourcetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqpagesupdatehandlerpreviewmodepaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqpagesupdatehandlerpreviewmodepaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqpagesupdatehandlerpreviewmodepathsKey = "cq.pagesupdatehandler.previewmodepaths";
	json_object_set_member(pJsonObject, cqpagesupdatehandlerpreviewmodepathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerimageresourcetypes()
{
	return cqpagesupdatehandlerimageresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerimageresourcetypes)
{
	this->cqpagesupdatehandlerimageresourcetypes = cqpagesupdatehandlerimageresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerproductresourcetypes()
{
	return cqpagesupdatehandlerproductresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerproductresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerproductresourcetypes)
{
	this->cqpagesupdatehandlerproductresourcetypes = cqpagesupdatehandlerproductresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlervideoresourcetypes()
{
	return cqpagesupdatehandlervideoresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlervideoresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlervideoresourcetypes)
{
	this->cqpagesupdatehandlervideoresourcetypes = cqpagesupdatehandlervideoresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerdynamicsequenceresourcetypes()
{
	return cqpagesupdatehandlerdynamicsequenceresourcetypes;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerdynamicsequenceresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerdynamicsequenceresourcetypes)
{
	this->cqpagesupdatehandlerdynamicsequenceresourcetypes = cqpagesupdatehandlerdynamicsequenceresourcetypes;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::getCqpagesupdatehandlerpreviewmodepaths()
{
	return cqpagesupdatehandlerpreviewmodepaths;
}

void
ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties::setCqpagesupdatehandlerpreviewmodepaths(ConfigNodePropertyArray  cqpagesupdatehandlerpreviewmodepaths)
{
	this->cqpagesupdatehandlerpreviewmodepaths = cqpagesupdatehandlerpreviewmodepaths;
}


