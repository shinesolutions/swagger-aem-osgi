
/*
 * ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyFloat.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties();
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGlobalsize();

	/*! \brief Set 
	 */
	void setGlobalsize(ConfigNodePropertyInteger globalsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxdiskusage();

	/*! \brief Set 
	 */
	void setMaxdiskusage(ConfigNodePropertyInteger maxdiskusage);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPersistenceenabled();

	/*! \brief Set 
	 */
	void setPersistenceenabled(ConfigNodePropertyBoolean persistenceenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getThreadpoolmaxsize();

	/*! \brief Set 
	 */
	void setThreadpoolmaxsize(ConfigNodePropertyInteger threadpoolmaxsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getScheduledthreadpoolmaxsize();

	/*! \brief Set 
	 */
	void setScheduledthreadpoolmaxsize(ConfigNodePropertyInteger scheduledthreadpoolmaxsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGracefulshutdowntimeout();

	/*! \brief Set 
	 */
	void setGracefulshutdowntimeout(ConfigNodePropertyInteger gracefulshutdowntimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getQueues();

	/*! \brief Set 
	 */
	void setQueues(ConfigNodePropertyArray queues);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTopics();

	/*! \brief Set 
	 */
	void setTopics(ConfigNodePropertyArray topics);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAddressesmaxdeliveryattempts();

	/*! \brief Set 
	 */
	void setAddressesmaxdeliveryattempts(ConfigNodePropertyInteger addressesmaxdeliveryattempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAddressesexpirydelay();

	/*! \brief Set 
	 */
	void setAddressesexpirydelay(ConfigNodePropertyInteger addressesexpirydelay);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getAddressesaddressfullmessagepolicy();

	/*! \brief Set 
	 */
	void setAddressesaddressfullmessagepolicy(ConfigNodePropertyDropDown addressesaddressfullmessagepolicy);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAddressesmaxsizebytes();

	/*! \brief Set 
	 */
	void setAddressesmaxsizebytes(ConfigNodePropertyInteger addressesmaxsizebytes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAddressespagesizebytes();

	/*! \brief Set 
	 */
	void setAddressespagesizebytes(ConfigNodePropertyInteger addressespagesizebytes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAddressespagecachemaxsize();

	/*! \brief Set 
	 */
	void setAddressespagecachemaxsize(ConfigNodePropertyInteger addressespagecachemaxsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getClusteruser();

	/*! \brief Set 
	 */
	void setClusteruser(ConfigNodePropertyString clusteruser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getClusterpassword();

	/*! \brief Set 
	 */
	void setClusterpassword(ConfigNodePropertyString clusterpassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClustercalltimeout();

	/*! \brief Set 
	 */
	void setClustercalltimeout(ConfigNodePropertyInteger clustercalltimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClustercallfailovertimeout();

	/*! \brief Set 
	 */
	void setClustercallfailovertimeout(ConfigNodePropertyInteger clustercallfailovertimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterclientfailurecheckperiod();

	/*! \brief Set 
	 */
	void setClusterclientfailurecheckperiod(ConfigNodePropertyInteger clusterclientfailurecheckperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusternotificationattempts();

	/*! \brief Set 
	 */
	void setClusternotificationattempts(ConfigNodePropertyInteger clusternotificationattempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusternotificationinterval();

	/*! \brief Set 
	 */
	void setClusternotificationinterval(ConfigNodePropertyInteger clusternotificationinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getIdcachesize();

	/*! \brief Set 
	 */
	void setIdcachesize(ConfigNodePropertyInteger idcachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterconfirmationwindowsize();

	/*! \brief Set 
	 */
	void setClusterconfirmationwindowsize(ConfigNodePropertyInteger clusterconfirmationwindowsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterconnectionttl();

	/*! \brief Set 
	 */
	void setClusterconnectionttl(ConfigNodePropertyInteger clusterconnectionttl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getClusterduplicatedetection();

	/*! \brief Set 
	 */
	void setClusterduplicatedetection(ConfigNodePropertyBoolean clusterduplicatedetection);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterinitialconnectattempts();

	/*! \brief Set 
	 */
	void setClusterinitialconnectattempts(ConfigNodePropertyInteger clusterinitialconnectattempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClustermaxretryinterval();

	/*! \brief Set 
	 */
	void setClustermaxretryinterval(ConfigNodePropertyInteger clustermaxretryinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterminlargemessagesize();

	/*! \brief Set 
	 */
	void setClusterminlargemessagesize(ConfigNodePropertyInteger clusterminlargemessagesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterproducerwindowsize();

	/*! \brief Set 
	 */
	void setClusterproducerwindowsize(ConfigNodePropertyInteger clusterproducerwindowsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterreconnectattempts();

	/*! \brief Set 
	 */
	void setClusterreconnectattempts(ConfigNodePropertyInteger clusterreconnectattempts);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getClusterretryinterval();

	/*! \brief Set 
	 */
	void setClusterretryinterval(ConfigNodePropertyInteger clusterretryinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getClusterretryintervalmultiplier();

	/*! \brief Set 
	 */
	void setClusterretryintervalmultiplier(ConfigNodePropertyFloat clusterretryintervalmultiplier);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyInteger globalsize;
    ConfigNodePropertyInteger maxdiskusage;
    ConfigNodePropertyBoolean persistenceenabled;
    ConfigNodePropertyInteger threadpoolmaxsize;
    ConfigNodePropertyInteger scheduledthreadpoolmaxsize;
    ConfigNodePropertyInteger gracefulshutdowntimeout;
    ConfigNodePropertyArray queues;
    ConfigNodePropertyArray topics;
    ConfigNodePropertyInteger addressesmaxdeliveryattempts;
    ConfigNodePropertyInteger addressesexpirydelay;
    ConfigNodePropertyDropDown addressesaddressfullmessagepolicy;
    ConfigNodePropertyInteger addressesmaxsizebytes;
    ConfigNodePropertyInteger addressespagesizebytes;
    ConfigNodePropertyInteger addressespagecachemaxsize;
    ConfigNodePropertyString clusteruser;
    ConfigNodePropertyString clusterpassword;
    ConfigNodePropertyInteger clustercalltimeout;
    ConfigNodePropertyInteger clustercallfailovertimeout;
    ConfigNodePropertyInteger clusterclientfailurecheckperiod;
    ConfigNodePropertyInteger clusternotificationattempts;
    ConfigNodePropertyInteger clusternotificationinterval;
    ConfigNodePropertyInteger idcachesize;
    ConfigNodePropertyInteger clusterconfirmationwindowsize;
    ConfigNodePropertyInteger clusterconnectionttl;
    ConfigNodePropertyBoolean clusterduplicatedetection;
    ConfigNodePropertyInteger clusterinitialconnectattempts;
    ConfigNodePropertyInteger clustermaxretryinterval;
    ConfigNodePropertyInteger clusterminlargemessagesize;
    ConfigNodePropertyInteger clusterproducerwindowsize;
    ConfigNodePropertyInteger clusterreconnectattempts;
    ConfigNodePropertyInteger clusterretryinterval;
    ConfigNodePropertyFloat clusterretryintervalmultiplier;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties_H_ */
