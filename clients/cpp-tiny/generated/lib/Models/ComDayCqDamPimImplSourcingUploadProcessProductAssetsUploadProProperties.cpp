

#include "ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.h"

using namespace Tiny;

ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties()
{
	deletezipfile = ConfigNodePropertyBoolean();
}

ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::~ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties()
{

}

void
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deletezipfileKey = "delete.zip.file";

    if(object.has_key(deletezipfileKey))
    {
        bourne::json value = object[deletezipfileKey];




        ConfigNodePropertyBoolean* obj = &deletezipfile;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["deletezipfile"] = getDeletezipfile().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::getDeletezipfile()
{
	return deletezipfile;
}

void
ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties::setDeletezipfile(ConfigNodePropertyBoolean deletezipfile)
{
	this->deletezipfile = deletezipfile;
}



