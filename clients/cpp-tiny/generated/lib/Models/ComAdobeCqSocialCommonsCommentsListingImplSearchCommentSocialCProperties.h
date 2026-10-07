
/*
 * ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumUserLimit();

	/*! \brief Set 
	 */
	void setNumUserLimit(ConfigNodePropertyInteger numUserLimit);


    private:
    ConfigNodePropertyInteger numUserLimit;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties_H_ */
