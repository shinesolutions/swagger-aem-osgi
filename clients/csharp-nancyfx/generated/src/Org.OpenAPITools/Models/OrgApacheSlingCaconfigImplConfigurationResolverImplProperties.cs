using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplConfigurationResolverImplProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties:  IEquatable<OrgApacheSlingCaconfigImplConfigurationResolverImplProperties>
    { 
        /// <summary>
        /// ConfigBucketNames
        /// </summary>
        public ConfigNodePropertyArray ConfigBucketNames { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties()
        {
        }

        private OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(ConfigNodePropertyArray ConfigBucketNames)
        {
            
            this.ConfigBucketNames = ConfigBucketNames;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder With()
        {
            return Builder()
                .ConfigBucketNames(ConfigBucketNames);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigImplConfigurationResolverImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties left, OrgApacheSlingCaconfigImplConfigurationResolverImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties left, OrgApacheSlingCaconfigImplConfigurationResolverImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ConfigBucketNames;

            internal OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.ConfigBucketNames property.
            /// </summary>
            /// <param name="value">ConfigBucketNames</param>
            public OrgApacheSlingCaconfigImplConfigurationResolverImplPropertiesBuilder ConfigBucketNames(ConfigNodePropertyArray value)
            {
                _ConfigBucketNames = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplConfigurationResolverImplProperties</returns>
            public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(
                    ConfigBucketNames: _ConfigBucketNames
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}