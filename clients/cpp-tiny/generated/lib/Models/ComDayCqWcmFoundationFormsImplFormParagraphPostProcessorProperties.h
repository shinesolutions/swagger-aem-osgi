
/*
 * ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties();
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsformparagraphpostprocessorenabled();

	/*! \brief Set 
	 */
	void setFormsformparagraphpostprocessorenabled(ConfigNodePropertyBoolean formsformparagraphpostprocessorenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFormsformparagraphpostprocessorformresourcetypes();

	/*! \brief Set 
	 */
	void setFormsformparagraphpostprocessorformresourcetypes(ConfigNodePropertyArray formsformparagraphpostprocessorformresourcetypes);


    private:
    ConfigNodePropertyBoolean formsformparagraphpostprocessorenabled;
    ConfigNodePropertyArray formsformparagraphpostprocessorformresourcetypes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties_H_ */
