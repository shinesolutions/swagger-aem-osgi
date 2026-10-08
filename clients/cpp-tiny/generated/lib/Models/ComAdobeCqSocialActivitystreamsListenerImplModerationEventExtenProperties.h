
/*
 * ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties();
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAccepted();

	/*! \brief Set 
	 */
	void setAccepted(ConfigNodePropertyBoolean accepted);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRanked();

	/*! \brief Set 
	 */
	void setRanked(ConfigNodePropertyInteger ranked);


    private:
    ConfigNodePropertyBoolean accepted;
    ConfigNodePropertyInteger ranked;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties_H_ */
