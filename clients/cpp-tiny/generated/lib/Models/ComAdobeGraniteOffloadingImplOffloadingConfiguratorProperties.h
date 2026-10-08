
/*
 * ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties();
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOffloadingtransporter();

	/*! \brief Set 
	 */
	void setOffloadingtransporter(ConfigNodePropertyString offloadingtransporter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingcleanuppayload();

	/*! \brief Set 
	 */
	void setOffloadingcleanuppayload(ConfigNodePropertyBoolean offloadingcleanuppayload);


    private:
    ConfigNodePropertyString offloadingtransporter;
    ConfigNodePropertyBoolean offloadingcleanuppayload;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties_H_ */
