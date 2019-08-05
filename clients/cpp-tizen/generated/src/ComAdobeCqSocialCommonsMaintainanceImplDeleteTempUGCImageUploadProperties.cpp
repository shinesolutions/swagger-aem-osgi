#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::~ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::__init()
{
	//numberOfDays = new ConfigNodePropertyInteger();
	//ageOfFile = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::__cleanup()
{
	//if(numberOfDays != NULL) {
	//
	//delete numberOfDays;
	//numberOfDays = NULL;
	//}
	//if(ageOfFile != NULL) {
	//
	//delete ageOfFile;
	//ageOfFile = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *numberOfDaysKey = "numberOfDays";
	node = json_object_get_member(pJsonObject, numberOfDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&numberOfDays, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&numberOfDays);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ageOfFileKey = "ageOfFile";
	node = json_object_get_member(pJsonObject, ageOfFileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&ageOfFile, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&ageOfFile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getNumberOfDays();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getNumberOfDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *numberOfDaysKey = "numberOfDays";
	json_object_set_member(pJsonObject, numberOfDaysKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAgeOfFile();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAgeOfFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ageOfFileKey = "ageOfFile";
	json_object_set_member(pJsonObject, ageOfFileKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::getNumberOfDays()
{
	return numberOfDays;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::setNumberOfDays(ConfigNodePropertyInteger  numberOfDays)
{
	this->numberOfDays = numberOfDays;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::getAgeOfFile()
{
	return ageOfFile;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::setAgeOfFile(ConfigNodePropertyInteger  ageOfFile)
{
	this->ageOfFile = ageOfFile;
}


