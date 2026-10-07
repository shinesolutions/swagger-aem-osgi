
/*
 * ComDayCqReplicationImplReplicationReceiverImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplReplicationReceiverImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplReplicationReceiverImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationImplReplicationReceiverImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplReplicationReceiverImplProperties();
    ComDayCqReplicationImplReplicationReceiverImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplReplicationReceiverImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReceivertmpfilethreshold();

	/*! \brief Set 
	 */
	void setReceivertmpfilethreshold(ConfigNodePropertyInteger receivertmpfilethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getReceiverpackagesuseinstall();

	/*! \brief Set 
	 */
	void setReceiverpackagesuseinstall(ConfigNodePropertyBoolean receiverpackagesuseinstall);


    private:
    ConfigNodePropertyInteger receivertmpfilethreshold;
    ConfigNodePropertyBoolean receiverpackagesuseinstall;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplReplicationReceiverImplProperties_H_ */
