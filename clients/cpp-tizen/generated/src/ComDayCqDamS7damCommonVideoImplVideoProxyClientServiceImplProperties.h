/*
 * ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties_H_
#define _ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
	ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicemultipartuploadminsizename();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicemultipartuploadminsizename(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicemultipartuploadminsizename);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicemultipartuploadpartsizename();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicemultipartuploadpartsizename(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicemultipartuploadpartsizename);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicemultipartuploadnumthreadname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicemultipartuploadnumthreadname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicemultipartuploadnumthreadname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicehttpreadtimeoutname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicehttpreadtimeoutname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicehttpreadtimeoutname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicehttpconnectiontimeoutname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicehttpconnectiontimeoutname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicehttpconnectiontimeoutname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientservicehttpmaxretrycountname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientservicehttpmaxretrycountname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientservicehttpmaxretrycountname);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdams7damvideoproxyclientserviceuploadprogressintervalname();

	/*! \brief Set 
	 */
	void setCqdams7damvideoproxyclientserviceuploadprogressintervalname(ConfigNodePropertyInteger  cqdams7damvideoproxyclientserviceuploadprogressintervalname);

private:
	ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadminsizename;
	ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadpartsizename;
	ConfigNodePropertyInteger cqdams7damvideoproxyclientservicemultipartuploadnumthreadname;
	ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpreadtimeoutname;
	ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpconnectiontimeoutname;
	ConfigNodePropertyInteger cqdams7damvideoproxyclientservicehttpmaxretrycountname;
	ConfigNodePropertyInteger cqdams7damvideoproxyclientserviceuploadprogressintervalname;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties_H_ */
