
/*
 * ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties();
    ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDisabledciphersuites();

	/*! \brief Set 
	 */
	void setDisabledciphersuites(ConfigNodePropertyArray disabledciphersuites);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEnabledciphersuites();

	/*! \brief Set 
	 */
	void setEnabledciphersuites(ConfigNodePropertyArray enabledciphersuites);


    private:
    ConfigNodePropertyArray disabledciphersuites;
    ConfigNodePropertyArray enabledciphersuites;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties_H_ */
