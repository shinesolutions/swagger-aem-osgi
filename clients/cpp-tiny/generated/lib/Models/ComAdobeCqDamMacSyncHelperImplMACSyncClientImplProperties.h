
/*
 * ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties_H_


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

class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties();
    ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobedammacsyncclientsotimeout();

	/*! \brief Set 
	 */
	void setComadobedammacsyncclientsotimeout(ConfigNodePropertyInteger comadobedammacsyncclientsotimeout);


    private:
    ConfigNodePropertyInteger comadobedammacsyncclientsotimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties_H_ */
