
/*
 * ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties_H_


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

class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties();
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyonComplete();

	/*! \brief Set 
	 */
	void setNotifyonComplete(ConfigNodePropertyBoolean notifyonComplete);


    private:
    ConfigNodePropertyString processlabel;
    ConfigNodePropertyBoolean notifyonComplete;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties_H_ */
