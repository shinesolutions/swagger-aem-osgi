/*
 * ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo_H_
#define _ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo_H_


#include <string>
#include "ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.h"
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

class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo();
	ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo();

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
	ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo_H_ */
