/*
 * ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_
#define _ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_


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

class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties();
	ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportagenttoworkerprefix();

	/*! \brief Set 
	 */
	void setDefaulttransportagenttoworkerprefix(ConfigNodePropertyString  defaulttransportagenttoworkerprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportagenttomasterprefix();

	/*! \brief Set 
	 */
	void setDefaulttransportagenttomasterprefix(ConfigNodePropertyString  defaulttransportagenttomasterprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportinputpackage();

	/*! \brief Set 
	 */
	void setDefaulttransportinputpackage(ConfigNodePropertyString  defaulttransportinputpackage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportoutputpackage();

	/*! \brief Set 
	 */
	void setDefaulttransportoutputpackage(ConfigNodePropertyString  defaulttransportoutputpackage);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaulttransportreplicationsynchronous();

	/*! \brief Set 
	 */
	void setDefaulttransportreplicationsynchronous(ConfigNodePropertyBoolean  defaulttransportreplicationsynchronous);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaulttransportcontentpackage();

	/*! \brief Set 
	 */
	void setDefaulttransportcontentpackage(ConfigNodePropertyBoolean  defaulttransportcontentpackage);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingtransporterdefaultenabled();

	/*! \brief Set 
	 */
	void setOffloadingtransporterdefaultenabled(ConfigNodePropertyBoolean  offloadingtransporterdefaultenabled);

private:
	ConfigNodePropertyString defaulttransportagenttoworkerprefix;
	ConfigNodePropertyString defaulttransportagenttomasterprefix;
	ConfigNodePropertyString defaulttransportinputpackage;
	ConfigNodePropertyString defaulttransportoutputpackage;
	ConfigNodePropertyBoolean defaulttransportreplicationsynchronous;
	ConfigNodePropertyBoolean defaulttransportcontentpackage;
	ConfigNodePropertyBoolean offloadingtransporterdefaultenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_ */
