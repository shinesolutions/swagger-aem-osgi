
/*
 * ComDayCqDamIdsImplIDSPoolManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamIdsImplIDSPoolManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamIdsImplIDSPoolManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamIdsImplIDSPoolManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamIdsImplIDSPoolManagerImplProperties();
    ComDayCqDamIdsImplIDSPoolManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamIdsImplIDSPoolManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxerrorstoblacklist();

	/*! \brief Set 
	 */
	void setMaxerrorstoblacklist(ConfigNodePropertyInteger maxerrorstoblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRetryintervaltowhitelist();

	/*! \brief Set 
	 */
	void setRetryintervaltowhitelist(ConfigNodePropertyInteger retryintervaltowhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnecttimeout();

	/*! \brief Set 
	 */
	void setConnecttimeout(ConfigNodePropertyInteger connecttimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSockettimeout();

	/*! \brief Set 
	 */
	void setSockettimeout(ConfigNodePropertyInteger sockettimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectionusemax();

	/*! \brief Set 
	 */
	void setConnectionusemax(ConfigNodePropertyInteger connectionusemax);


    private:
    ConfigNodePropertyInteger maxerrorstoblacklist;
    ConfigNodePropertyInteger retryintervaltowhitelist;
    ConfigNodePropertyInteger connecttimeout;
    ConfigNodePropertyInteger sockettimeout;
    ConfigNodePropertyString processlabel;
    ConfigNodePropertyInteger connectionusemax;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamIdsImplIDSPoolManagerImplProperties_H_ */
