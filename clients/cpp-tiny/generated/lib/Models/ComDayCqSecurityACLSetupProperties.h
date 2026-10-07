
/*
 * ComDayCqSecurityACLSetupProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqSecurityACLSetupProperties_H_
#define TINY_CPP_CLIENT_ComDayCqSecurityACLSetupProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqSecurityACLSetupProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqSecurityACLSetupProperties();
    ComDayCqSecurityACLSetupProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqSecurityACLSetupProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqaclsetuprules();

	/*! \brief Set 
	 */
	void setCqaclsetuprules(ConfigNodePropertyArray cqaclsetuprules);


    private:
    ConfigNodePropertyArray cqaclsetuprules;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqSecurityACLSetupProperties_H_ */
