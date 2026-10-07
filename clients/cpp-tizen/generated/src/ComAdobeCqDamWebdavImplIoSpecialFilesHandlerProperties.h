/*
 * ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties_H_
#define _ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties();
	ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComdaycqdamcoreimplioSpecialFilesHandlerfilepatters();

	/*! \brief Set 
	 */
	void setComdaycqdamcoreimplioSpecialFilesHandlerfilepatters(ConfigNodePropertyArray  comdaycqdamcoreimplioSpecialFilesHandlerfilepatters);

private:
	ConfigNodePropertyArray comdaycqdamcoreimplioSpecialFilesHandlerfilepatters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties_H_ */
