

#include "ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.h"

using namespace Tiny;

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties()
{
	comdaycqdamcoreimplioSpecialFilesHandlerfilepatters = ConfigNodePropertyArray();
}

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::~ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties()
{

}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comdaycqdamcoreimplioSpecialFilesHandlerfilepattersKey = "com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters";

    if(object.has_key(comdaycqdamcoreimplioSpecialFilesHandlerfilepattersKey))
    {
        bourne::json value = object[comdaycqdamcoreimplioSpecialFilesHandlerfilepattersKey];




        ConfigNodePropertyArray* obj = &comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comdaycqdamcoreimplioSpecialFilesHandlerfilepatters"] = getComdaycqdamcoreimplioSpecialFilesHandlerfilepatters().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::getComdaycqdamcoreimplioSpecialFilesHandlerfilepatters()
{
	return comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties::setComdaycqdamcoreimplioSpecialFilesHandlerfilepatters(ConfigNodePropertyArray comdaycqdamcoreimplioSpecialFilesHandlerfilepatters)
{
	this->comdaycqdamcoreimplioSpecialFilesHandlerfilepatters = comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
}



