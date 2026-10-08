
/*
 * ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties();
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriorityOrder();

	/*! \brief Set 
	 */
	void setPriorityOrder(ConfigNodePropertyInteger priorityOrder);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReplyEmailPatterns();

	/*! \brief Set 
	 */
	void setReplyEmailPatterns(ConfigNodePropertyArray replyEmailPatterns);


    private:
    ConfigNodePropertyInteger priorityOrder;
    ConfigNodePropertyArray replyEmailPatterns;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties_H_ */
