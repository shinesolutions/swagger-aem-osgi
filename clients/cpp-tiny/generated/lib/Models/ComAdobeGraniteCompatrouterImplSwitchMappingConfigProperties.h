
/*
 * ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties();
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getGroup();

	/*! \brief Set 
	 */
	void setGroup(ConfigNodePropertyString group);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIds();

	/*! \brief Set 
	 */
	void setIds(ConfigNodePropertyArray ids);


    private:
    ConfigNodePropertyString group;
    ConfigNodePropertyArray ids;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties_H_ */
