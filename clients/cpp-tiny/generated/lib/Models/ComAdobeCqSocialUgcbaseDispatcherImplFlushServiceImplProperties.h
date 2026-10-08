
/*
 * ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_


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

class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties();
    ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getThreadPoolSize();

	/*! \brief Set 
	 */
	void setThreadPoolSize(ConfigNodePropertyInteger threadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDelayTime();

	/*! \brief Set 
	 */
	void setDelayTime(ConfigNodePropertyInteger delayTime);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getWorkerSleepTime();

	/*! \brief Set 
	 */
	void setWorkerSleepTime(ConfigNodePropertyInteger workerSleepTime);


    private:
    ConfigNodePropertyInteger threadPoolSize;
    ConfigNodePropertyInteger delayTime;
    ConfigNodePropertyInteger workerSleepTime;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties_H_ */
