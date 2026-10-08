

#include "ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties()
{
	cqdamallowallmime = ConfigNodePropertyBoolean();
	cqdamallowedassetmimes = ConfigNodePropertyArray();
}

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::~ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties()
{

}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamallowallmimeKey = "cq.dam.allow.all.mime";

    if(object.has_key(cqdamallowallmimeKey))
    {
        bourne::json value = object[cqdamallowallmimeKey];




        ConfigNodePropertyBoolean* obj = &cqdamallowallmime;
		obj->fromJson(value.dump());

    }

    const char *cqdamallowedassetmimesKey = "cq.dam.allowed.asset.mimes";

    if(object.has_key(cqdamallowedassetmimesKey))
    {
        bourne::json value = object[cqdamallowedassetmimesKey];




        ConfigNodePropertyArray* obj = &cqdamallowedassetmimes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamallowallmime"] = getCqdamallowallmime().toJson();






	object["cqdamallowedassetmimes"] = getCqdamallowedassetmimes().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::getCqdamallowallmime()
{
	return cqdamallowallmime;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::setCqdamallowallmime(ConfigNodePropertyBoolean cqdamallowallmime)
{
	this->cqdamallowallmime = cqdamallowallmime;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::getCqdamallowedassetmimes()
{
	return cqdamallowedassetmimes;
}

void
ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties::setCqdamallowedassetmimes(ConfigNodePropertyArray cqdamallowedassetmimes)
{
	this->cqdamallowedassetmimes = cqdamallowedassetmimes;
}



