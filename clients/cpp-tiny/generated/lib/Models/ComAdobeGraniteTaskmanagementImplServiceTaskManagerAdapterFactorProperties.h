
/*
 * ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties_H_


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

class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties();
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAdaptercondition();

	/*! \brief Set 
	 */
	void setAdaptercondition(ConfigNodePropertyString adaptercondition);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTaskmanageradmingroups();

	/*! \brief Set 
	 */
	void setTaskmanageradmingroups(ConfigNodePropertyArray taskmanageradmingroups);


    private:
    ConfigNodePropertyString adaptercondition;
    ConfigNodePropertyArray taskmanageradmingroups;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties_H_ */
