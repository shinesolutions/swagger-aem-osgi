
/*
 * OrgApacheFelixScrScrServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixScrScrServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixScrScrServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixScrScrServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixScrScrServiceProperties();
    OrgApacheFelixScrScrServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixScrScrServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getDsloglevel();

	/*! \brief Set 
	 */
	void setDsloglevel(ConfigNodePropertyDropDown dsloglevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDsfactoryenabled();

	/*! \brief Set 
	 */
	void setDsfactoryenabled(ConfigNodePropertyBoolean dsfactoryenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDsdelayedkeepInstances();

	/*! \brief Set 
	 */
	void setDsdelayedkeepInstances(ConfigNodePropertyBoolean dsdelayedkeepInstances);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDslocktimeoutmilliseconds();

	/*! \brief Set 
	 */
	void setDslocktimeoutmilliseconds(ConfigNodePropertyInteger dslocktimeoutmilliseconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDsstoptimeoutmilliseconds();

	/*! \brief Set 
	 */
	void setDsstoptimeoutmilliseconds(ConfigNodePropertyInteger dsstoptimeoutmilliseconds);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDsglobalextender();

	/*! \brief Set 
	 */
	void setDsglobalextender(ConfigNodePropertyBoolean dsglobalextender);


    private:
    ConfigNodePropertyDropDown dsloglevel;
    ConfigNodePropertyBoolean dsfactoryenabled;
    ConfigNodePropertyBoolean dsdelayedkeepInstances;
    ConfigNodePropertyInteger dslocktimeoutmilliseconds;
    ConfigNodePropertyInteger dsstoptimeoutmilliseconds;
    ConfigNodePropertyBoolean dsglobalextender;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixScrScrServiceProperties_H_ */
