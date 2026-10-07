#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties()
{
	//__init();
}

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::~ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::__init()
{
	//contentReferenceConfigresourceTypes = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::__cleanup()
{
	//if(contentReferenceConfigresourceTypes != NULL) {
	//
	//delete contentReferenceConfigresourceTypes;
	//contentReferenceConfigresourceTypes = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contentReferenceConfigresourceTypesKey = "contentReferenceConfig.resourceTypes";
	node = json_object_get_member(pJsonObject, contentReferenceConfigresourceTypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&contentReferenceConfigresourceTypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&contentReferenceConfigresourceTypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getContentReferenceConfigresourceTypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getContentReferenceConfigresourceTypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentReferenceConfigresourceTypesKey = "contentReferenceConfig.resourceTypes";
	json_object_set_member(pJsonObject, contentReferenceConfigresourceTypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::getContentReferenceConfigresourceTypes()
{
	return contentReferenceConfigresourceTypes;
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties::setContentReferenceConfigresourceTypes(ConfigNodePropertyArray  contentReferenceConfigresourceTypes)
{
	this->contentReferenceConfigresourceTypes = contentReferenceConfigresourceTypes;
}


