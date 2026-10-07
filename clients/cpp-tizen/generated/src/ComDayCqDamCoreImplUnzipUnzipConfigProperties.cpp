#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplUnzipUnzipConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplUnzipUnzipConfigProperties::ComDayCqDamCoreImplUnzipUnzipConfigProperties()
{
	//__init();
}

ComDayCqDamCoreImplUnzipUnzipConfigProperties::~ComDayCqDamCoreImplUnzipUnzipConfigProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::__init()
{
	//cqdamconfigunzipmaxuncompressedsize = new ConfigNodePropertyInteger();
	//cqdamconfigunzipencoding = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::__cleanup()
{
	//if(cqdamconfigunzipmaxuncompressedsize != NULL) {
	//
	//delete cqdamconfigunzipmaxuncompressedsize;
	//cqdamconfigunzipmaxuncompressedsize = NULL;
	//}
	//if(cqdamconfigunzipencoding != NULL) {
	//
	//delete cqdamconfigunzipencoding;
	//cqdamconfigunzipencoding = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamconfigunzipmaxuncompressedsizeKey = "cq.dam.config.unzip.maxuncompressedsize";
	node = json_object_get_member(pJsonObject, cqdamconfigunzipmaxuncompressedsizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamconfigunzipmaxuncompressedsize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamconfigunzipmaxuncompressedsize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamconfigunzipencodingKey = "cq.dam.config.unzip.encoding";
	node = json_object_get_member(pJsonObject, cqdamconfigunzipencodingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&cqdamconfigunzipencoding, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&cqdamconfigunzipencoding);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplUnzipUnzipConfigProperties::ComDayCqDamCoreImplUnzipUnzipConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplUnzipUnzipConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamconfigunzipmaxuncompressedsize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamconfigunzipmaxuncompressedsize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigunzipmaxuncompressedsizeKey = "cq.dam.config.unzip.maxuncompressedsize";
	json_object_set_member(pJsonObject, cqdamconfigunzipmaxuncompressedsizeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCqdamconfigunzipencoding();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCqdamconfigunzipencoding());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamconfigunzipencodingKey = "cq.dam.config.unzip.encoding";
	json_object_set_member(pJsonObject, cqdamconfigunzipencodingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplUnzipUnzipConfigProperties::getCqdamconfigunzipmaxuncompressedsize()
{
	return cqdamconfigunzipmaxuncompressedsize;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::setCqdamconfigunzipmaxuncompressedsize(ConfigNodePropertyInteger  cqdamconfigunzipmaxuncompressedsize)
{
	this->cqdamconfigunzipmaxuncompressedsize = cqdamconfigunzipmaxuncompressedsize;
}

ConfigNodePropertyString
ComDayCqDamCoreImplUnzipUnzipConfigProperties::getCqdamconfigunzipencoding()
{
	return cqdamconfigunzipencoding;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::setCqdamconfigunzipencoding(ConfigNodePropertyString  cqdamconfigunzipencoding)
{
	this->cqdamconfigunzipencoding = cqdamconfigunzipencoding;
}


