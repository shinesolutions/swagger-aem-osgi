
/*
 * ComDayCqAuthImplLoginSelectorHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAuthImplLoginSelectorHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAuthImplLoginSelectorHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqAuthImplLoginSelectorHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAuthImplLoginSelectorHandlerProperties();
    ComDayCqAuthImplLoginSelectorHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAuthImplLoginSelectorHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthloginselectormappings();

	/*! \brief Set 
	 */
	void setAuthloginselectormappings(ConfigNodePropertyArray authloginselectormappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthloginselectorchangepwmappings();

	/*! \brief Set 
	 */
	void setAuthloginselectorchangepwmappings(ConfigNodePropertyArray authloginselectorchangepwmappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthloginselectordefaultloginpage();

	/*! \brief Set 
	 */
	void setAuthloginselectordefaultloginpage(ConfigNodePropertyString authloginselectordefaultloginpage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthloginselectordefaultchangepwpage();

	/*! \brief Set 
	 */
	void setAuthloginselectordefaultchangepwpage(ConfigNodePropertyString authloginselectordefaultchangepwpage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthloginselectorhandle();

	/*! \brief Set 
	 */
	void setAuthloginselectorhandle(ConfigNodePropertyArray authloginselectorhandle);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthloginselectorhandleallextensions();

	/*! \brief Set 
	 */
	void setAuthloginselectorhandleallextensions(ConfigNodePropertyBoolean authloginselectorhandleallextensions);


    private:
    ConfigNodePropertyString path;
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyArray authloginselectormappings;
    ConfigNodePropertyArray authloginselectorchangepwmappings;
    ConfigNodePropertyString authloginselectordefaultloginpage;
    ConfigNodePropertyString authloginselectordefaultchangepwpage;
    ConfigNodePropertyArray authloginselectorhandle;
    ConfigNodePropertyBoolean authloginselectorhandleallextensions;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAuthImplLoginSelectorHandlerProperties_H_ */
