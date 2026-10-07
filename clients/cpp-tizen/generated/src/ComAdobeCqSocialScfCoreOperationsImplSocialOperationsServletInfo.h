/*
 * ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo_H_
#define _ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo_H_


#include <string>
#include "ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.h"
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

class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo();
	ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo();

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
	ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo_H_ */
