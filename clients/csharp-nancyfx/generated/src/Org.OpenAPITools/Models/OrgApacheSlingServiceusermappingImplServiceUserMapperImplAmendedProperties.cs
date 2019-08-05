using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties
    /// </summary>
    public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties:  IEquatable<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// UserMapping
        /// </summary>
        public ConfigNodePropertyArray UserMapping { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties()
        {
        }

        private OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyArray UserMapping)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.UserMapping = UserMapping;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder</returns>
        public static OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder Builder()
        {
            return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder</returns>
        public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .UserMapping(UserMapping);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties left, OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.
        /// </summary>
        public sealed class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyArray _UserMapping;

            internal OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.UserMapping property.
            /// </summary>
            /// <param name="value">UserMapping</param>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesBuilder UserMapping(ConfigNodePropertyArray value)
            {
                _UserMapping = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.
            /// </summary>
            /// <returns>OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties</returns>
            public OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties Build()
            {
                Validate();
                return new OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(
                    ServiceRanking: _ServiceRanking,
                    UserMapping: _UserMapping
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}