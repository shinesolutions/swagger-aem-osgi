

#include "OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties()
{
	mimetypes = ConfigNodePropertyArray();
}

OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::~OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties()
{

}

void
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mimetypesKey = "mime.types";

    if(object.has_key(mimetypesKey))
    {
        bourne::json value = object[mimetypesKey];




        ConfigNodePropertyArray* obj = &mimetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mimetypes"] = getMimetypes().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::getMimetypes()
{
	return mimetypes;
}

void
OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties::setMimetypes(ConfigNodePropertyArray mimetypes)
{
	this->mimetypes = mimetypes;
}



