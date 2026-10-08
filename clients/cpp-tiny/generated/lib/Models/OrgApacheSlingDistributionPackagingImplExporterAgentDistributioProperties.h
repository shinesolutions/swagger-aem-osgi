
/*
 * OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties_H_


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

class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties();
    OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getQueue();

	/*! \brief Set 
	 */
	void setQueue(ConfigNodePropertyString queue);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDropinvaliditems();

	/*! \brief Set 
	 */
	void setDropinvaliditems(ConfigNodePropertyBoolean dropinvaliditems);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAgenttarget();

	/*! \brief Set 
	 */
	void setAgenttarget(ConfigNodePropertyString agenttarget);


    private:
    ConfigNodePropertyString name;
    ConfigNodePropertyString queue;
    ConfigNodePropertyBoolean dropinvaliditems;
    ConfigNodePropertyString agenttarget;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties_H_ */
