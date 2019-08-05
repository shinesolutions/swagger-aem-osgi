/*
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H_
#define _ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H_


#include <string>
#include "ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h"
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

class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo();
	ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo();

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
	ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H_ */
