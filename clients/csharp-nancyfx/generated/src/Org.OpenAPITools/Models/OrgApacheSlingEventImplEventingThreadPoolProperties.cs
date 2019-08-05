using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingEventImplEventingThreadPoolProperties
    /// </summary>
    public sealed class OrgApacheSlingEventImplEventingThreadPoolProperties:  IEquatable<OrgApacheSlingEventImplEventingThreadPoolProperties>
    { 
        /// <summary>
        /// MinPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MinPoolSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingEventImplEventingThreadPoolProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingEventImplEventingThreadPoolProperties()
        {
        }

        private OrgApacheSlingEventImplEventingThreadPoolProperties(ConfigNodePropertyInteger MinPoolSize)
        {
            
            this.MinPoolSize = MinPoolSize;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingEventImplEventingThreadPoolProperties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder</returns>
        public static OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder Builder()
        {
            return new OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder</returns>
        public OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder With()
        {
            return Builder()
                .MinPoolSize(MinPoolSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingEventImplEventingThreadPoolProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingEventImplEventingThreadPoolProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplEventingThreadPoolProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplEventingThreadPoolProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingEventImplEventingThreadPoolProperties left, OrgApacheSlingEventImplEventingThreadPoolProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingEventImplEventingThreadPoolProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingEventImplEventingThreadPoolProperties</param>
        /// <param name="right">Compared (OrgApacheSlingEventImplEventingThreadPoolProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingEventImplEventingThreadPoolProperties left, OrgApacheSlingEventImplEventingThreadPoolProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingEventImplEventingThreadPoolProperties.
        /// </summary>
        public sealed class OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MinPoolSize;

            internal OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingEventImplEventingThreadPoolProperties.MinPoolSize property.
            /// </summary>
            /// <param name="value">MinPoolSize</param>
            public OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder MinPoolSize(ConfigNodePropertyInteger value)
            {
                _MinPoolSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingEventImplEventingThreadPoolProperties.
            /// </summary>
            /// <returns>OrgApacheSlingEventImplEventingThreadPoolProperties</returns>
            public OrgApacheSlingEventImplEventingThreadPoolProperties Build()
            {
                Validate();
                return new OrgApacheSlingEventImplEventingThreadPoolProperties(
                    MinPoolSize: _MinPoolSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}