
/*
 * OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties_H_


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

class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties();
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLength();

	/*! \brief Set 
	 */
	void setLength(ConfigNodePropertyInteger length);


    private:
    ConfigNodePropertyInteger length;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties_H_ */
