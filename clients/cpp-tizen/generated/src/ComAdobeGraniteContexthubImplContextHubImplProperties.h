/*
 * ComAdobeGraniteContexthubImplContextHubImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteContexthubImplContextHubImplProperties_H_
#define _ComAdobeGraniteContexthubImplContextHubImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteContexthubImplContextHubImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteContexthubImplContextHubImplProperties();
	ComAdobeGraniteContexthubImplContextHubImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteContexthubImplContextHubImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobegranitecontexthubsilentMode();

	/*! \brief Set 
	 */
	void setComadobegranitecontexthubsilentMode(ConfigNodePropertyBoolean  comadobegranitecontexthubsilent_mode);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobegranitecontexthubshowUi();

	/*! \brief Set 
	 */
	void setComadobegranitecontexthubshowUi(ConfigNodePropertyBoolean  comadobegranitecontexthubshow_ui);

private:
	ConfigNodePropertyBoolean comadobegranitecontexthubsilent_mode;
	ConfigNodePropertyBoolean comadobegranitecontexthubshow_ui;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteContexthubImplContextHubImplProperties_H_ */
