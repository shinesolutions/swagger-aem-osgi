
/*
 * ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_


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

class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties();
    ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getReplicationcontentuseFileStorage();

	/*! \brief Set 
	 */
	void setReplicationcontentuseFileStorage(ConfigNodePropertyBoolean replicationcontentuseFileStorage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReplicationcontentmaxCommitAttempts();

	/*! \brief Set 
	 */
	void setReplicationcontentmaxCommitAttempts(ConfigNodePropertyInteger replicationcontentmaxCommitAttempts);


    private:
    ConfigNodePropertyBoolean replicationcontentuseFileStorage;
    ConfigNodePropertyInteger replicationcontentmaxCommitAttempts;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties_H_ */
