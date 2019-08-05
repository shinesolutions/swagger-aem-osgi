#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEngineParametersProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEngineParametersProperties::OrgApacheSlingEngineParametersProperties()
{
	//__init();
}

OrgApacheSlingEngineParametersProperties::~OrgApacheSlingEngineParametersProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEngineParametersProperties::__init()
{
	//slingdefaultparameterencoding = new ConfigNodePropertyString();
	//slingdefaultmaxparameters = new ConfigNodePropertyInteger();
	//filelocation = new ConfigNodePropertyString();
	//filethreshold = new ConfigNodePropertyInteger();
	//filemax = new ConfigNodePropertyInteger();
	//requestmax = new ConfigNodePropertyInteger();
	//slingdefaultparametercheckForAdditionalContainerParameters = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingEngineParametersProperties::__cleanup()
{
	//if(slingdefaultparameterencoding != NULL) {
	//
	//delete slingdefaultparameterencoding;
	//slingdefaultparameterencoding = NULL;
	//}
	//if(slingdefaultmaxparameters != NULL) {
	//
	//delete slingdefaultmaxparameters;
	//slingdefaultmaxparameters = NULL;
	//}
	//if(filelocation != NULL) {
	//
	//delete filelocation;
	//filelocation = NULL;
	//}
	//if(filethreshold != NULL) {
	//
	//delete filethreshold;
	//filethreshold = NULL;
	//}
	//if(filemax != NULL) {
	//
	//delete filemax;
	//filemax = NULL;
	//}
	//if(requestmax != NULL) {
	//
	//delete requestmax;
	//requestmax = NULL;
	//}
	//if(slingdefaultparametercheckForAdditionalContainerParameters != NULL) {
	//
	//delete slingdefaultparametercheckForAdditionalContainerParameters;
	//slingdefaultparametercheckForAdditionalContainerParameters = NULL;
	//}
	//
}

void
OrgApacheSlingEngineParametersProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingdefaultparameterencodingKey = "sling.default.parameter.encoding";
	node = json_object_get_member(pJsonObject, slingdefaultparameterencodingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingdefaultparameterencoding, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingdefaultparameterencoding);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingdefaultmaxparametersKey = "sling.default.max.parameters";
	node = json_object_get_member(pJsonObject, slingdefaultmaxparametersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&slingdefaultmaxparameters, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&slingdefaultmaxparameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filelocationKey = "file.location";
	node = json_object_get_member(pJsonObject, filelocationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&filelocation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&filelocation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filethresholdKey = "file.threshold";
	node = json_object_get_member(pJsonObject, filethresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&filethreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&filethreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filemaxKey = "file.max";
	node = json_object_get_member(pJsonObject, filemaxKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&filemax, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&filemax);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestmaxKey = "request.max";
	node = json_object_get_member(pJsonObject, requestmaxKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&requestmax, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&requestmax);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingdefaultparametercheckForAdditionalContainerParametersKey = "sling.default.parameter.checkForAdditionalContainerParameters";
	node = json_object_get_member(pJsonObject, slingdefaultparametercheckForAdditionalContainerParametersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&slingdefaultparametercheckForAdditionalContainerParameters, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&slingdefaultparametercheckForAdditionalContainerParameters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEngineParametersProperties::OrgApacheSlingEngineParametersProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEngineParametersProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingdefaultparameterencoding();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingdefaultparameterencoding());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingdefaultparameterencodingKey = "sling.default.parameter.encoding";
	json_object_set_member(pJsonObject, slingdefaultparameterencodingKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSlingdefaultmaxparameters();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSlingdefaultmaxparameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingdefaultmaxparametersKey = "sling.default.max.parameters";
	json_object_set_member(pJsonObject, slingdefaultmaxparametersKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFilelocation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFilelocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filelocationKey = "file.location";
	json_object_set_member(pJsonObject, filelocationKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getFilethreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getFilethreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filethresholdKey = "file.threshold";
	json_object_set_member(pJsonObject, filethresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getFilemax();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getFilemax());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filemaxKey = "file.max";
	json_object_set_member(pJsonObject, filemaxKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRequestmax();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRequestmax());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestmaxKey = "request.max";
	json_object_set_member(pJsonObject, requestmaxKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSlingdefaultparametercheckForAdditionalContainerParameters();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSlingdefaultparametercheckForAdditionalContainerParameters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingdefaultparametercheckForAdditionalContainerParametersKey = "sling.default.parameter.checkForAdditionalContainerParameters";
	json_object_set_member(pJsonObject, slingdefaultparametercheckForAdditionalContainerParametersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingEngineParametersProperties::getSlingdefaultparameterencoding()
{
	return slingdefaultparameterencoding;
}

void
OrgApacheSlingEngineParametersProperties::setSlingdefaultparameterencoding(ConfigNodePropertyString  slingdefaultparameterencoding)
{
	this->slingdefaultparameterencoding = slingdefaultparameterencoding;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getSlingdefaultmaxparameters()
{
	return slingdefaultmaxparameters;
}

void
OrgApacheSlingEngineParametersProperties::setSlingdefaultmaxparameters(ConfigNodePropertyInteger  slingdefaultmaxparameters)
{
	this->slingdefaultmaxparameters = slingdefaultmaxparameters;
}

ConfigNodePropertyString
OrgApacheSlingEngineParametersProperties::getFilelocation()
{
	return filelocation;
}

void
OrgApacheSlingEngineParametersProperties::setFilelocation(ConfigNodePropertyString  filelocation)
{
	this->filelocation = filelocation;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getFilethreshold()
{
	return filethreshold;
}

void
OrgApacheSlingEngineParametersProperties::setFilethreshold(ConfigNodePropertyInteger  filethreshold)
{
	this->filethreshold = filethreshold;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getFilemax()
{
	return filemax;
}

void
OrgApacheSlingEngineParametersProperties::setFilemax(ConfigNodePropertyInteger  filemax)
{
	this->filemax = filemax;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getRequestmax()
{
	return requestmax;
}

void
OrgApacheSlingEngineParametersProperties::setRequestmax(ConfigNodePropertyInteger  requestmax)
{
	this->requestmax = requestmax;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineParametersProperties::getSlingdefaultparametercheckForAdditionalContainerParameters()
{
	return slingdefaultparametercheckForAdditionalContainerParameters;
}

void
OrgApacheSlingEngineParametersProperties::setSlingdefaultparametercheckForAdditionalContainerParameters(ConfigNodePropertyBoolean  slingdefaultparametercheckForAdditionalContainerParameters)
{
	this->slingdefaultparametercheckForAdditionalContainerParameters = slingdefaultparametercheckForAdditionalContainerParameters;
}


