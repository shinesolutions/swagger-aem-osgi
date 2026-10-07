
/*
 * ComDayCqWcmCoreImplWCMDebugFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplWCMDebugFilterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplWCMDebugFilterProperties_H_


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

class ComDayCqWcmCoreImplWCMDebugFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplWCMDebugFilterProperties();
    ComDayCqWcmCoreImplWCMDebugFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplWCMDebugFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWcmdbgfilterenabled();

	/*! \brief Set 
	 */
	void setWcmdbgfilterenabled(ConfigNodePropertyBoolean wcmdbgfilterenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWcmdbgfilterjspDebug();

	/*! \brief Set 
	 */
	void setWcmdbgfilterjspDebug(ConfigNodePropertyBoolean wcmdbgfilterjspDebug);


    private:
    ConfigNodePropertyBoolean wcmdbgfilterenabled;
    ConfigNodePropertyBoolean wcmdbgfilterjspDebug;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplWCMDebugFilterProperties_H_ */
