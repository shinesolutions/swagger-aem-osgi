

#include "ComDayCqDamCoreImplServletCompanionServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletCompanionServletProperties::ComDayCqDamCoreImplServletCompanionServletProperties()
{
	moreInfo = ConfigNodePropertyString();
	mntoverlaydamguicontentassetsmoreinfohtmlpath = ConfigNodePropertyString();
}

ComDayCqDamCoreImplServletCompanionServletProperties::ComDayCqDamCoreImplServletCompanionServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletCompanionServletProperties::~ComDayCqDamCoreImplServletCompanionServletProperties()
{

}

void
ComDayCqDamCoreImplServletCompanionServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *moreInfoKey = "More Info";

    if(object.has_key(moreInfoKey))
    {
        bourne::json value = object[moreInfoKey];




        ConfigNodePropertyString* obj = &moreInfo;
		obj->fromJson(value.dump());

    }

    const char *mntoverlaydamguicontentassetsmoreinfohtmlpathKey = "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}";

    if(object.has_key(mntoverlaydamguicontentassetsmoreinfohtmlpathKey))
    {
        bourne::json value = object[mntoverlaydamguicontentassetsmoreinfohtmlpathKey];




        ConfigNodePropertyString* obj = &mntoverlaydamguicontentassetsmoreinfohtmlpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletCompanionServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["moreInfo"] = getMoreInfo().toJson();






	object["mntoverlaydamguicontentassetsmoreinfohtmlpath"] = getMntoverlaydamguicontentassetsmoreinfohtmlpath().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplServletCompanionServletProperties::getMoreInfo()
{
	return moreInfo;
}

void
ComDayCqDamCoreImplServletCompanionServletProperties::setMoreInfo(ConfigNodePropertyString moreInfo)
{
	this->moreInfo = moreInfo;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletCompanionServletProperties::getMntoverlaydamguicontentassetsmoreinfohtmlpath()
{
	return mntoverlaydamguicontentassetsmoreinfohtmlpath;
}

void
ComDayCqDamCoreImplServletCompanionServletProperties::setMntoverlaydamguicontentassetsmoreinfohtmlpath(ConfigNodePropertyString mntoverlaydamguicontentassetsmoreinfohtmlpath)
{
	this->mntoverlaydamguicontentassetsmoreinfohtmlpath = mntoverlaydamguicontentassetsmoreinfohtmlpath;
}



