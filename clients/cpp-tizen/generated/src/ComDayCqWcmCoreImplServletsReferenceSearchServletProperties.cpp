#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::ComDayCqWcmCoreImplServletsReferenceSearchServletProperties()
{
	//__init();
}

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::~ComDayCqWcmCoreImplServletsReferenceSearchServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::__init()
{
	//referencesearchservletmaxReferencesPerPage = new ConfigNodePropertyInteger();
	//referencesearchservletmaxPages = new ConfigNodePropertyInteger();
}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::__cleanup()
{
	//if(referencesearchservletmaxReferencesPerPage != NULL) {
	//
	//delete referencesearchservletmaxReferencesPerPage;
	//referencesearchservletmaxReferencesPerPage = NULL;
	//}
	//if(referencesearchservletmaxPages != NULL) {
	//
	//delete referencesearchservletmaxPages;
	//referencesearchservletmaxPages = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *referencesearchservletmaxReferencesPerPageKey = "referencesearchservlet.maxReferencesPerPage";
	node = json_object_get_member(pJsonObject, referencesearchservletmaxReferencesPerPageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&referencesearchservletmaxReferencesPerPage, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&referencesearchservletmaxReferencesPerPage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *referencesearchservletmaxPagesKey = "referencesearchservlet.maxPages";
	node = json_object_get_member(pJsonObject, referencesearchservletmaxPagesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&referencesearchservletmaxPages, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&referencesearchservletmaxPages);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getReferencesearchservletmaxReferencesPerPage();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getReferencesearchservletmaxReferencesPerPage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *referencesearchservletmaxReferencesPerPageKey = "referencesearchservlet.maxReferencesPerPage";
	json_object_set_member(pJsonObject, referencesearchservletmaxReferencesPerPageKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getReferencesearchservletmaxPages();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getReferencesearchservletmaxPages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *referencesearchservletmaxPagesKey = "referencesearchservlet.maxPages";
	json_object_set_member(pJsonObject, referencesearchservletmaxPagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::getReferencesearchservletmaxReferencesPerPage()
{
	return referencesearchservletmaxReferencesPerPage;
}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::setReferencesearchservletmaxReferencesPerPage(ConfigNodePropertyInteger  referencesearchservletmaxReferencesPerPage)
{
	this->referencesearchservletmaxReferencesPerPage = referencesearchservletmaxReferencesPerPage;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::getReferencesearchservletmaxPages()
{
	return referencesearchservletmaxPages;
}

void
ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::setReferencesearchservletmaxPages(ConfigNodePropertyInteger  referencesearchservletmaxPages)
{
	this->referencesearchservletmaxPages = referencesearchservletmaxPages;
}


