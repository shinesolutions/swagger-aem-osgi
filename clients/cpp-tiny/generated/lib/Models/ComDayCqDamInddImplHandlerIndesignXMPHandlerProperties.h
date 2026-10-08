
/*
 * ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H_


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

class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties();
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties();


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
	ConfigNodePropertyBoolean getExtractpages();

	/*! \brief Set 
	 */
	void setExtractpages(ConfigNodePropertyBoolean extractpages);


    private:
    ConfigNodePropertyString processlabel;
    ConfigNodePropertyBoolean extractpages;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H_ */
