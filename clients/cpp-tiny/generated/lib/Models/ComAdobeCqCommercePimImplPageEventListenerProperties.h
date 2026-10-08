
/*
 * ComAdobeCqCommercePimImplPageEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommercePimImplPageEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommercePimImplPageEventListenerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommercePimImplPageEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommercePimImplPageEventListenerProperties();
    ComAdobeCqCommercePimImplPageEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommercePimImplPageEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqcommercepageeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqcommercepageeventlistenerenabled(ConfigNodePropertyBoolean cqcommercepageeventlistenerenabled);


    private:
    ConfigNodePropertyBoolean cqcommercepageeventlistenerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommercePimImplPageEventListenerProperties_H_ */
