
/*
 * ComDayCqDamCoreImplEventDamEventAuditListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplEventDamEventAuditListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplEventDamEventAuditListenerProperties_H_


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

class ComDayCqDamCoreImplEventDamEventAuditListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplEventDamEventAuditListenerProperties();
    ComDayCqDamCoreImplEventDamEventAuditListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplEventDamEventAuditListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);


    private:
    ConfigNodePropertyString eventfilter;
    ConfigNodePropertyBoolean enabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplEventDamEventAuditListenerProperties_H_ */
