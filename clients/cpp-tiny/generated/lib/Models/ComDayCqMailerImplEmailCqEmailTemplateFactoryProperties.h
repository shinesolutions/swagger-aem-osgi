
/*
 * ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties_H_


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

class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties();
    ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaileremailcharset();

	/*! \brief Set 
	 */
	void setMaileremailcharset(ConfigNodePropertyString maileremailcharset);


    private:
    ConfigNodePropertyString maileremailcharset;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties_H_ */
