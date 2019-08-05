#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties()
{
	//__init();
}

ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::~ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties()
{
	//__cleanup();
}

void
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::__init()
{
	//deletezipfile = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::__cleanup()
{
	//if(deletezipfile != NULL) {
	//
	//delete deletezipfile;
	//deletezipfile = NULL;
	//}
	//
}

void
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deletezipfileKey = "delete.zip.file";
	node = json_object_get_member(pJsonObject, deletezipfileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&deletezipfile, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&deletezipfile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDeletezipfile();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDeletezipfile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deletezipfileKey = "delete.zip.file";
	json_object_set_member(pJsonObject, deletezipfileKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::getDeletezipfile()
{
	return deletezipfile;
}

void
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::setDeletezipfile(ConfigNodePropertyBoolean  deletezipfile)
{
	this->deletezipfile = deletezipfile;
}


