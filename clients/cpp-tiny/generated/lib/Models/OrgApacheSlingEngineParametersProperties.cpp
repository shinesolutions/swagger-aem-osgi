

#include "OrgApacheSlingEngineParametersProperties.h"

using namespace Tiny;

OrgApacheSlingEngineParametersProperties::OrgApacheSlingEngineParametersProperties()
{
	slingdefaultparameterencoding = ConfigNodePropertyString();
	slingdefaultmaxparameters = ConfigNodePropertyInteger();
	filelocation = ConfigNodePropertyString();
	filethreshold = ConfigNodePropertyInteger();
	filemax = ConfigNodePropertyInteger();
	requestmax = ConfigNodePropertyInteger();
	slingdefaultparametercheckForAdditionalContainerParameters = ConfigNodePropertyBoolean();
}

OrgApacheSlingEngineParametersProperties::OrgApacheSlingEngineParametersProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineParametersProperties::~OrgApacheSlingEngineParametersProperties()
{

}

void
OrgApacheSlingEngineParametersProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingdefaultparameterencodingKey = "sling.default.parameter.encoding";

    if(object.has_key(slingdefaultparameterencodingKey))
    {
        bourne::json value = object[slingdefaultparameterencodingKey];




        ConfigNodePropertyString* obj = &slingdefaultparameterencoding;
		obj->fromJson(value.dump());

    }

    const char *slingdefaultmaxparametersKey = "sling.default.max.parameters";

    if(object.has_key(slingdefaultmaxparametersKey))
    {
        bourne::json value = object[slingdefaultmaxparametersKey];




        ConfigNodePropertyInteger* obj = &slingdefaultmaxparameters;
		obj->fromJson(value.dump());

    }

    const char *filelocationKey = "file.location";

    if(object.has_key(filelocationKey))
    {
        bourne::json value = object[filelocationKey];




        ConfigNodePropertyString* obj = &filelocation;
		obj->fromJson(value.dump());

    }

    const char *filethresholdKey = "file.threshold";

    if(object.has_key(filethresholdKey))
    {
        bourne::json value = object[filethresholdKey];




        ConfigNodePropertyInteger* obj = &filethreshold;
		obj->fromJson(value.dump());

    }

    const char *filemaxKey = "file.max";

    if(object.has_key(filemaxKey))
    {
        bourne::json value = object[filemaxKey];




        ConfigNodePropertyInteger* obj = &filemax;
		obj->fromJson(value.dump());

    }

    const char *requestmaxKey = "request.max";

    if(object.has_key(requestmaxKey))
    {
        bourne::json value = object[requestmaxKey];




        ConfigNodePropertyInteger* obj = &requestmax;
		obj->fromJson(value.dump());

    }

    const char *slingdefaultparametercheckForAdditionalContainerParametersKey = "sling.default.parameter.checkForAdditionalContainerParameters";

    if(object.has_key(slingdefaultparametercheckForAdditionalContainerParametersKey))
    {
        bourne::json value = object[slingdefaultparametercheckForAdditionalContainerParametersKey];




        ConfigNodePropertyBoolean* obj = &slingdefaultparametercheckForAdditionalContainerParameters;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineParametersProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingdefaultparameterencoding"] = getSlingdefaultparameterencoding().toJson();






	object["slingdefaultmaxparameters"] = getSlingdefaultmaxparameters().toJson();






	object["filelocation"] = getFilelocation().toJson();






	object["filethreshold"] = getFilethreshold().toJson();






	object["filemax"] = getFilemax().toJson();






	object["requestmax"] = getRequestmax().toJson();






	object["slingdefaultparametercheckForAdditionalContainerParameters"] = getSlingdefaultparametercheckForAdditionalContainerParameters().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingEngineParametersProperties::getSlingdefaultparameterencoding()
{
	return slingdefaultparameterencoding;
}

void
OrgApacheSlingEngineParametersProperties::setSlingdefaultparameterencoding(ConfigNodePropertyString slingdefaultparameterencoding)
{
	this->slingdefaultparameterencoding = slingdefaultparameterencoding;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getSlingdefaultmaxparameters()
{
	return slingdefaultmaxparameters;
}

void
OrgApacheSlingEngineParametersProperties::setSlingdefaultmaxparameters(ConfigNodePropertyInteger slingdefaultmaxparameters)
{
	this->slingdefaultmaxparameters = slingdefaultmaxparameters;
}

ConfigNodePropertyString
OrgApacheSlingEngineParametersProperties::getFilelocation()
{
	return filelocation;
}

void
OrgApacheSlingEngineParametersProperties::setFilelocation(ConfigNodePropertyString filelocation)
{
	this->filelocation = filelocation;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getFilethreshold()
{
	return filethreshold;
}

void
OrgApacheSlingEngineParametersProperties::setFilethreshold(ConfigNodePropertyInteger filethreshold)
{
	this->filethreshold = filethreshold;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getFilemax()
{
	return filemax;
}

void
OrgApacheSlingEngineParametersProperties::setFilemax(ConfigNodePropertyInteger filemax)
{
	this->filemax = filemax;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineParametersProperties::getRequestmax()
{
	return requestmax;
}

void
OrgApacheSlingEngineParametersProperties::setRequestmax(ConfigNodePropertyInteger requestmax)
{
	this->requestmax = requestmax;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineParametersProperties::getSlingdefaultparametercheckForAdditionalContainerParameters()
{
	return slingdefaultparametercheckForAdditionalContainerParameters;
}

void
OrgApacheSlingEngineParametersProperties::setSlingdefaultparametercheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingdefaultparametercheckForAdditionalContainerParameters)
{
	this->slingdefaultparametercheckForAdditionalContainerParameters = slingdefaultparametercheckForAdditionalContainerParameters;
}



