
/*
 * ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties_H_


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

class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties();
    ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingagentmanagerenabled();

	/*! \brief Set 
	 */
	void setOffloadingagentmanagerenabled(ConfigNodePropertyBoolean offloadingagentmanagerenabled);


    private:
    ConfigNodePropertyBoolean offloadingagentmanagerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties_H_ */
