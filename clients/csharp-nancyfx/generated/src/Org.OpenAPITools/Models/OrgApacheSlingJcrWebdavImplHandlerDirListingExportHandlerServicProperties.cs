using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties:  IEquatable<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties()
        {
        }

        private OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties(ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder</returns>
        public static OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder</returns>
        public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties left, OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties left, OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;

            internal OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties</returns>
            public OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties(
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}