/*
 * ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo_H_
#define _ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo_H_


#include <string>
#include "ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.h"
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

class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo();
	ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo_H_ */
