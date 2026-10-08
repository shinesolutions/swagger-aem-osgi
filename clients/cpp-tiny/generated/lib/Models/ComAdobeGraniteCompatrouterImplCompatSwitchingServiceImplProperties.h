
/*
 * ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties();
    ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCompatgroups();

	/*! \brief Set 
	 */
	void setCompatgroups(ConfigNodePropertyArray compatgroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);


    private:
    ConfigNodePropertyArray compatgroups;
    ConfigNodePropertyBoolean enabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties_H_ */
