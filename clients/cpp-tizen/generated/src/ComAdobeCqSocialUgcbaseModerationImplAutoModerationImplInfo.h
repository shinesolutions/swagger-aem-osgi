/*
 * ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo_H_
#define _ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo_H_


#include <string>
#include "ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.h"
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

class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo();
	ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo();

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
	ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo_H_ */
