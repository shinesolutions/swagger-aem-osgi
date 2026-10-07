
/*
 * ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventPageEventAuditListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventPageEventAuditListenerProperties_H_


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

class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplEventPageEventAuditListenerProperties();
    ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplEventPageEventAuditListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getConfigured();

	/*! \brief Set 
	 */
	void setConfigured(ConfigNodePropertyString configured);


    private:
    ConfigNodePropertyString configured;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventPageEventAuditListenerProperties_H_ */
