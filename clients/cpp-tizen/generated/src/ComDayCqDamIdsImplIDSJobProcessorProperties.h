/*
 * ComDayCqDamIdsImplIDSJobProcessorProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamIdsImplIDSJobProcessorProperties_H_
#define _ComDayCqDamIdsImplIDSJobProcessorProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
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

class ComDayCqDamIdsImplIDSJobProcessorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamIdsImplIDSJobProcessorProperties();
	ComDayCqDamIdsImplIDSJobProcessorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamIdsImplIDSJobProcessorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnablemultisession();

	/*! \brief Set 
	 */
	void setEnablemultisession(ConfigNodePropertyBoolean  enablemultisession);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIdsccenable();

	/*! \brief Set 
	 */
	void setIdsccenable(ConfigNodePropertyBoolean  idsccenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableretry();

	/*! \brief Set 
	 */
	void setEnableretry(ConfigNodePropertyBoolean  enableretry);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableretryscripterror();

	/*! \brief Set 
	 */
	void setEnableretryscripterror(ConfigNodePropertyBoolean  enableretryscripterror);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizerdomaincqhost();

	/*! \brief Set 
	 */
	void setExternalizerdomaincqhost(ConfigNodePropertyString  externalizerdomaincqhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizerdomainhttp();

	/*! \brief Set 
	 */
	void setExternalizerdomainhttp(ConfigNodePropertyString  externalizerdomainhttp);

private:
	ConfigNodePropertyBoolean enablemultisession;
	ConfigNodePropertyBoolean idsccenable;
	ConfigNodePropertyBoolean enableretry;
	ConfigNodePropertyBoolean enableretryscripterror;
	ConfigNodePropertyString externalizerdomaincqhost;
	ConfigNodePropertyString externalizerdomainhttp;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamIdsImplIDSJobProcessorProperties_H_ */
