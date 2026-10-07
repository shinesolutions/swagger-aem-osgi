#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties()
{
	//__init();
}

OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::~OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::__init()
{
	//mimetypes = new ConfigNodePropertyArray();
}

void
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::__cleanup()
{
	//if(mimetypes != NULL) {
	//
	//delete mimetypes;
	//mimetypes = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *mimetypesKey = "mime.types";
	node = json_object_get_member(pJsonObject, mimetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&mimetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&mimetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getMimetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getMimetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mimetypesKey = "mime.types";
	json_object_set_member(pJsonObject, mimetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::getMimetypes()
{
	return mimetypes;
}

void
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::setMimetypes(ConfigNodePropertyArray  mimetypes)
{
	this->mimetypes = mimetypes;
}


