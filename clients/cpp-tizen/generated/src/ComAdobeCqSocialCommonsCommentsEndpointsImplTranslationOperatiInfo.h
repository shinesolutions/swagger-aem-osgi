/*
 * ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo_H_
#define _ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo_H_


#include <string>
#include "ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.h"
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

class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo();
	ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo();

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
	ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo_H_ */
