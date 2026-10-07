
/*
 * ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCrxSecurityTokenImplTokenCleanupTaskProperties_H_
#define TINY_CPP_CLIENT_ComDayCrxSecurityTokenImplTokenCleanupTaskProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties();
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCrxSecurityTokenImplTokenCleanupTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabletokencleanuptask();

	/*! \brief Set 
	 */
	void setEnabletokencleanuptask(ConfigNodePropertyBoolean enabletokencleanuptask);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBatchsize();

	/*! \brief Set 
	 */
	void setBatchsize(ConfigNodePropertyInteger batchsize);


    private:
    ConfigNodePropertyBoolean enabletokencleanuptask;
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyInteger batchsize;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCrxSecurityTokenImplTokenCleanupTaskProperties_H_ */
