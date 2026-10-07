
/*
 * ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties_H_


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

class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties();
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRanking();

	/*! \brief Set 
	 */
	void setRanking(ConfigNodePropertyInteger ranking);


    private:
    ConfigNodePropertyInteger ranking;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties_H_ */
