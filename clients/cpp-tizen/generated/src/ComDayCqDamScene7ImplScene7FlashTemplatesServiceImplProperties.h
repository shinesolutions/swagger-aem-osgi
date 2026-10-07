/*
 * ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties_H_
#define _ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties_H_


#include <string>
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

class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties();
	ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrti();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrti(ConfigNodePropertyString  scene7FlashTemplatesrti);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrsi();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrsi(ConfigNodePropertyString  scene7FlashTemplatesrsi);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrb();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrb(ConfigNodePropertyString  scene7FlashTemplatesrb);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrurl();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrurl(ConfigNodePropertyString  scene7FlashTemplatesrurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplateurlFormatParameter();

	/*! \brief Set 
	 */
	void setScene7FlashTemplateurlFormatParameter(ConfigNodePropertyString  scene7FlashTemplateurlFormatParameter);

private:
	ConfigNodePropertyString scene7FlashTemplatesrti;
	ConfigNodePropertyString scene7FlashTemplatesrsi;
	ConfigNodePropertyString scene7FlashTemplatesrb;
	ConfigNodePropertyString scene7FlashTemplatesrurl;
	ConfigNodePropertyString scene7FlashTemplateurlFormatParameter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties_H_ */
