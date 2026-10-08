
/*
 * ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo();
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo_H_ */
