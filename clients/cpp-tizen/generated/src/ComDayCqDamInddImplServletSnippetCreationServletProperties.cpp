#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamInddImplServletSnippetCreationServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamInddImplServletSnippetCreationServletProperties::ComDayCqDamInddImplServletSnippetCreationServletProperties()
{
	//__init();
}

ComDayCqDamInddImplServletSnippetCreationServletProperties::~ComDayCqDamInddImplServletSnippetCreationServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamInddImplServletSnippetCreationServletProperties::__init()
{
	//snippetcreationmaxcollections = new ConfigNodePropertyInteger();
}

void
ComDayCqDamInddImplServletSnippetCreationServletProperties::__cleanup()
{
	//if(snippetcreationmaxcollections != NULL) {
	//
	//delete snippetcreationmaxcollections;
	//snippetcreationmaxcollections = NULL;
	//}
	//
}

void
ComDayCqDamInddImplServletSnippetCreationServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *snippetcreationmaxcollectionsKey = "snippetcreation.maxcollections";
	node = json_object_get_member(pJsonObject, snippetcreationmaxcollectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&snippetcreationmaxcollections, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&snippetcreationmaxcollections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamInddImplServletSnippetCreationServletProperties::ComDayCqDamInddImplServletSnippetCreationServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamInddImplServletSnippetCreationServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSnippetcreationmaxcollections();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSnippetcreationmaxcollections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *snippetcreationmaxcollectionsKey = "snippetcreation.maxcollections";
	json_object_set_member(pJsonObject, snippetcreationmaxcollectionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamInddImplServletSnippetCreationServletProperties::getSnippetcreationmaxcollections()
{
	return snippetcreationmaxcollections;
}

void
ComDayCqDamInddImplServletSnippetCreationServletProperties::setSnippetcreationmaxcollections(ConfigNodePropertyInteger  snippetcreationmaxcollections)
{
	this->snippetcreationmaxcollections = snippetcreationmaxcollections;
}


