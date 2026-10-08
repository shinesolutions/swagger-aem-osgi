
/*
 * ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplWarpTimeWarpFilterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplWarpTimeWarpFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties();
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplWarpTimeWarpFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilterorder();

	/*! \brief Set 
	 */
	void setFilterorder(ConfigNodePropertyString filterorder);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilterscope();

	/*! \brief Set 
	 */
	void setFilterscope(ConfigNodePropertyString filterscope);


    private:
    ConfigNodePropertyString filterorder;
    ConfigNodePropertyString filterscope;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplWarpTimeWarpFilterProperties_H_ */
