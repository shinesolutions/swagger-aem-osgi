
/*
 * ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties();
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPoolSize();

	/*! \brief Set 
	 */
	void setPoolSize(ConfigNodePropertyInteger poolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxPoolSize();

	/*! \brief Set 
	 */
	void setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueueSize();

	/*! \brief Set 
	 */
	void setQueueSize(ConfigNodePropertyInteger queueSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getKeepAliveTime();

	/*! \brief Set 
	 */
	void setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime);


    private:
    ConfigNodePropertyInteger poolSize;
    ConfigNodePropertyInteger maxPoolSize;
    ConfigNodePropertyInteger queueSize;
    ConfigNodePropertyInteger keepAliveTime;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties_H_ */
