
/*
 * ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties();
    ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrti();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrti(ConfigNodePropertyString scene7FlashTemplatesrti);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrsi();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrsi(ConfigNodePropertyString scene7FlashTemplatesrsi);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrb();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrb(ConfigNodePropertyString scene7FlashTemplatesrb);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplatesrurl();

	/*! \brief Set 
	 */
	void setScene7FlashTemplatesrurl(ConfigNodePropertyString scene7FlashTemplatesrurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getScene7FlashTemplateurlFormatParameter();

	/*! \brief Set 
	 */
	void setScene7FlashTemplateurlFormatParameter(ConfigNodePropertyString scene7FlashTemplateurlFormatParameter);


    private:
    ConfigNodePropertyString scene7FlashTemplatesrti;
    ConfigNodePropertyString scene7FlashTemplatesrsi;
    ConfigNodePropertyString scene7FlashTemplatesrb;
    ConfigNodePropertyString scene7FlashTemplatesrurl;
    ConfigNodePropertyString scene7FlashTemplateurlFormatParameter;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties_H_ */
