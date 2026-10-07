
/*
 * ComDayCqDamIdsImplIDSJobProcessorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamIdsImplIDSJobProcessorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamIdsImplIDSJobProcessorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamIdsImplIDSJobProcessorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamIdsImplIDSJobProcessorProperties();
    ComDayCqDamIdsImplIDSJobProcessorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamIdsImplIDSJobProcessorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablemultisession();

	/*! \brief Set 
	 */
	void setEnablemultisession(ConfigNodePropertyBoolean enablemultisession);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIdsccenable();

	/*! \brief Set 
	 */
	void setIdsccenable(ConfigNodePropertyBoolean idsccenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableretry();

	/*! \brief Set 
	 */
	void setEnableretry(ConfigNodePropertyBoolean enableretry);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableretryscripterror();

	/*! \brief Set 
	 */
	void setEnableretryscripterror(ConfigNodePropertyBoolean enableretryscripterror);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizerdomaincqhost();

	/*! \brief Set 
	 */
	void setExternalizerdomaincqhost(ConfigNodePropertyString externalizerdomaincqhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizerdomainhttp();

	/*! \brief Set 
	 */
	void setExternalizerdomainhttp(ConfigNodePropertyString externalizerdomainhttp);


    private:
    ConfigNodePropertyBoolean enablemultisession;
    ConfigNodePropertyBoolean idsccenable;
    ConfigNodePropertyBoolean enableretry;
    ConfigNodePropertyBoolean enableretryscripterror;
    ConfigNodePropertyString externalizerdomaincqhost;
    ConfigNodePropertyString externalizerdomainhttp;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamIdsImplIDSJobProcessorProperties_H_ */
