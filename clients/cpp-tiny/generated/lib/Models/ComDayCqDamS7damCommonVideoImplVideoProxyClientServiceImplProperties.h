
/*
 * ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties_H_


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

class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicemultipartuploadminsizename();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicemultipartuploadminsizename(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadminsizename);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicemultipartuploadpartsizename();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicemultipartuploadpartsizename(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadpartsizename);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicemultipartuploadnumthreadname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicemultipartuploadnumthreadname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadnumthreadname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicehttpreadtimeoutname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicehttpreadtimeoutname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpreadtimeoutname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicehttpconnectiontimeoutname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicehttpconnectiontimeoutname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpconnectiontimeoutname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicehttpmaxretrycountname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicehttpmaxretrycountname(ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpmaxretrycountname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientserviceuploadprogressintervalname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientserviceuploadprogressintervalname(ConfigNodePropertyInteger cqdams7damvideoproxyclientserviceuploadprogressintervalname);


    private:
    ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadminsizename;
    ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
    ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
    ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpreadtimeoutname;
    ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
    ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpmaxretrycountname;
    ConfigNodePropertyInteger cqdams7damvideoproxyclientserviceuploadprogressintervalname;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties_H_ */
