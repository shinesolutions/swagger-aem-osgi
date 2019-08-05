using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties:  IEquatable<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// TypeCollections
        /// </summary>
        public ConfigNodePropertyString TypeCollections { get; private set; }

        /// <summary>
        /// TypeNoncollections
        /// </summary>
        public ConfigNodePropertyString TypeNoncollections { get; private set; }

        /// <summary>
        /// TypeContent
        /// </summary>
        public ConfigNodePropertyString TypeContent { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties()
        {
        }

        private OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString TypeCollections, ConfigNodePropertyString TypeNoncollections, ConfigNodePropertyString TypeContent)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.TypeCollections = TypeCollections;
            
            this.TypeNoncollections = TypeNoncollections;
            
            this.TypeContent = TypeContent;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder</returns>
        public static OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder</returns>
        public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .TypeCollections(TypeCollections)
                .TypeNoncollections(TypeNoncollections)
                .TypeContent(TypeContent);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties left, OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties left, OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _TypeCollections;
            private ConfigNodePropertyString _TypeNoncollections;
            private ConfigNodePropertyString _TypeContent;

            internal OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.TypeCollections property.
            /// </summary>
            /// <param name="value">TypeCollections</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder TypeCollections(ConfigNodePropertyString value)
            {
                _TypeCollections = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.TypeNoncollections property.
            /// </summary>
            /// <param name="value">TypeNoncollections</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder TypeNoncollections(ConfigNodePropertyString value)
            {
                _TypeNoncollections = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.TypeContent property.
            /// </summary>
            /// <param name="value">TypeContent</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesBuilder TypeContent(ConfigNodePropertyString value)
            {
                _TypeContent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties</returns>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(
                    ServiceRanking: _ServiceRanking,
                    TypeCollections: _TypeCollections,
                    TypeNoncollections: _TypeNoncollections,
                    TypeContent: _TypeContent
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}