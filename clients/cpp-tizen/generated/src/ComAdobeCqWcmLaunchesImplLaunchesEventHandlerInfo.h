/*
 * ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo_H_
#define _ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo_H_


#include <string>
#include "ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.h"
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

class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo();
	ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo();

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
	ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo_H_ */
