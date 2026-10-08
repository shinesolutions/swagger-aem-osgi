
/*
 * ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties();
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComdaycqdamcoreimplioSpecialFilesHandlerfilepatters();

	/*! \brief Set 
	 */
	void setComdaycqdamcoreimplioSpecialFilesHandlerfilepatters(ConfigNodePropertyArray comdaycqdamcoreimplioSpecialFilesHandlerfilepatters);


    private:
    ConfigNodePropertyArray comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties_H_ */
