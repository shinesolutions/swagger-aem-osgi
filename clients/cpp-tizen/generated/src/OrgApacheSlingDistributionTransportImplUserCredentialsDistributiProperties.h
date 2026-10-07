/*
 * OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties_H_
#define _OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties_H_


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

class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties();
	OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUsername();

	/*! \brief Set 
	 */
	void setUsername(ConfigNodePropertyString  username);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPassword();

	/*! \brief Set 
	 */
	void setPassword(ConfigNodePropertyString  password);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString username;
	ConfigNodePropertyString password;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties_H_ */
