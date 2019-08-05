using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties
    /// </summary>
    public sealed class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties:  IEquatable<ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// PathPrefix
        /// </summary>
        public ConfigNodePropertyString PathPrefix { get; private set; }

        /// <summary>
        /// CreateVersion
        /// </summary>
        public ConfigNodePropertyBoolean CreateVersion { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties()
        {
        }

        private ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString PathPrefix, ConfigNodePropertyBoolean CreateVersion)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.PathPrefix = PathPrefix;
            
            this.CreateVersion = CreateVersion;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder</returns>
        public static ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder</returns>
        public ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .PathPrefix(PathPrefix)
                .CreateVersion(CreateVersion);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties left, ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties left, ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.
        /// </summary>
        public sealed class ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _PathPrefix;
            private ConfigNodePropertyBoolean _CreateVersion;

            internal ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.PathPrefix property.
            /// </summary>
            /// <param name="value">PathPrefix</param>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder PathPrefix(ConfigNodePropertyString value)
            {
                _PathPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.CreateVersion property.
            /// </summary>
            /// <param name="value">CreateVersion</param>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesBuilder CreateVersion(ConfigNodePropertyBoolean value)
            {
                _CreateVersion = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties</returns>
            public ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties Build()
            {
                Validate();
                return new ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(
                    ServiceRanking: _ServiceRanking,
                    PathPrefix: _PathPrefix,
                    CreateVersion: _CreateVersion
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}