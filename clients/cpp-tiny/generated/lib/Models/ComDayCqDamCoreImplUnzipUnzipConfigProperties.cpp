

#include "ComDayCqDamCoreImplUnzipUnzipConfigProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplUnzipUnzipConfigProperties::ComDayCqDamCoreImplUnzipUnzipConfigProperties()
{
	cqdamconfigunzipmaxuncompressedsize = ConfigNodePropertyInteger();
	cqdamconfigunzipencoding = ConfigNodePropertyString();
}

ComDayCqDamCoreImplUnzipUnzipConfigProperties::ComDayCqDamCoreImplUnzipUnzipConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplUnzipUnzipConfigProperties::~ComDayCqDamCoreImplUnzipUnzipConfigProperties()
{

}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamconfigunzipmaxuncompressedsizeKey = "cq.dam.config.unzip.maxuncompressedsize";

    if(object.has_key(cqdamconfigunzipmaxuncompressedsizeKey))
    {
        bourne::json value = object[cqdamconfigunzipmaxuncompressedsizeKey];




        ConfigNodePropertyInteger* obj = &cqdamconfigunzipmaxuncompressedsize;
		obj->fromJson(value.dump());

    }

    const char *cqdamconfigunzipencodingKey = "cq.dam.config.unzip.encoding";

    if(object.has_key(cqdamconfigunzipencodingKey))
    {
        bourne::json value = object[cqdamconfigunzipencodingKey];




        ConfigNodePropertyString* obj = &cqdamconfigunzipencoding;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplUnzipUnzipConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamconfigunzipmaxuncompressedsize"] = getCqdamconfigunzipmaxuncompressedsize().toJson();






	object["cqdamconfigunzipencoding"] = getCqdamconfigunzipencoding().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCoreImplUnzipUnzipConfigProperties::getCqdamconfigunzipmaxuncompressedsize()
{
	return cqdamconfigunzipmaxuncompressedsize;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::setCqdamconfigunzipmaxuncompressedsize(ConfigNodePropertyInteger cqdamconfigunzipmaxuncompressedsize)
{
	this->cqdamconfigunzipmaxuncompressedsize = cqdamconfigunzipmaxuncompressedsize;
}

ConfigNodePropertyString
ComDayCqDamCoreImplUnzipUnzipConfigProperties::getCqdamconfigunzipencoding()
{
	return cqdamconfigunzipencoding;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigProperties::setCqdamconfigunzipencoding(ConfigNodePropertyString cqdamconfigunzipencoding)
{
	this->cqdamconfigunzipencoding = cqdamconfigunzipencoding;
}



