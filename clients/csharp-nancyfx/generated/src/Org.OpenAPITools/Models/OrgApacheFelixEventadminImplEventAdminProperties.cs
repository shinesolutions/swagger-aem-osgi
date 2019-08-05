using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixEventadminImplEventAdminProperties
    /// </summary>
    public sealed class OrgApacheFelixEventadminImplEventAdminProperties:  IEquatable<OrgApacheFelixEventadminImplEventAdminProperties>
    { 
        /// <summary>
        /// OrgApacheFelixEventadminThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixEventadminThreadPoolSize { get; private set; }

        /// <summary>
        /// OrgApacheFelixEventadminAsyncToSyncThreadRatio
        /// </summary>
        public ConfigNodePropertyFloat OrgApacheFelixEventadminAsyncToSyncThreadRatio { get; private set; }

        /// <summary>
        /// OrgApacheFelixEventadminTimeout
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheFelixEventadminTimeout { get; private set; }

        /// <summary>
        /// OrgApacheFelixEventadminRequireTopic
        /// </summary>
        public ConfigNodePropertyBoolean OrgApacheFelixEventadminRequireTopic { get; private set; }

        /// <summary>
        /// OrgApacheFelixEventadminIgnoreTimeout
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixEventadminIgnoreTimeout { get; private set; }

        /// <summary>
        /// OrgApacheFelixEventadminIgnoreTopic
        /// </summary>
        public ConfigNodePropertyArray OrgApacheFelixEventadminIgnoreTopic { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixEventadminImplEventAdminProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixEventadminImplEventAdminProperties()
        {
        }

        private OrgApacheFelixEventadminImplEventAdminProperties(ConfigNodePropertyInteger OrgApacheFelixEventadminThreadPoolSize, ConfigNodePropertyFloat OrgApacheFelixEventadminAsyncToSyncThreadRatio, ConfigNodePropertyInteger OrgApacheFelixEventadminTimeout, ConfigNodePropertyBoolean OrgApacheFelixEventadminRequireTopic, ConfigNodePropertyArray OrgApacheFelixEventadminIgnoreTimeout, ConfigNodePropertyArray OrgApacheFelixEventadminIgnoreTopic)
        {
            
            this.OrgApacheFelixEventadminThreadPoolSize = OrgApacheFelixEventadminThreadPoolSize;
            
            this.OrgApacheFelixEventadminAsyncToSyncThreadRatio = OrgApacheFelixEventadminAsyncToSyncThreadRatio;
            
            this.OrgApacheFelixEventadminTimeout = OrgApacheFelixEventadminTimeout;
            
            this.OrgApacheFelixEventadminRequireTopic = OrgApacheFelixEventadminRequireTopic;
            
            this.OrgApacheFelixEventadminIgnoreTimeout = OrgApacheFelixEventadminIgnoreTimeout;
            
            this.OrgApacheFelixEventadminIgnoreTopic = OrgApacheFelixEventadminIgnoreTopic;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixEventadminImplEventAdminProperties.
        /// </summary>
        /// <returns>OrgApacheFelixEventadminImplEventAdminPropertiesBuilder</returns>
        public static OrgApacheFelixEventadminImplEventAdminPropertiesBuilder Builder()
        {
            return new OrgApacheFelixEventadminImplEventAdminPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixEventadminImplEventAdminPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixEventadminImplEventAdminPropertiesBuilder</returns>
        public OrgApacheFelixEventadminImplEventAdminPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheFelixEventadminThreadPoolSize(OrgApacheFelixEventadminThreadPoolSize)
                .OrgApacheFelixEventadminAsyncToSyncThreadRatio(OrgApacheFelixEventadminAsyncToSyncThreadRatio)
                .OrgApacheFelixEventadminTimeout(OrgApacheFelixEventadminTimeout)
                .OrgApacheFelixEventadminRequireTopic(OrgApacheFelixEventadminRequireTopic)
                .OrgApacheFelixEventadminIgnoreTimeout(OrgApacheFelixEventadminIgnoreTimeout)
                .OrgApacheFelixEventadminIgnoreTopic(OrgApacheFelixEventadminIgnoreTopic);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixEventadminImplEventAdminProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixEventadminImplEventAdminProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixEventadminImplEventAdminProperties</param>
        /// <param name="right">Compared (OrgApacheFelixEventadminImplEventAdminProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixEventadminImplEventAdminProperties left, OrgApacheFelixEventadminImplEventAdminProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixEventadminImplEventAdminProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixEventadminImplEventAdminProperties</param>
        /// <param name="right">Compared (OrgApacheFelixEventadminImplEventAdminProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixEventadminImplEventAdminProperties left, OrgApacheFelixEventadminImplEventAdminProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixEventadminImplEventAdminProperties.
        /// </summary>
        public sealed class OrgApacheFelixEventadminImplEventAdminPropertiesBuilder
        {
            private ConfigNodePropertyInteger _OrgApacheFelixEventadminThreadPoolSize;
            private ConfigNodePropertyFloat _OrgApacheFelixEventadminAsyncToSyncThreadRatio;
            private ConfigNodePropertyInteger _OrgApacheFelixEventadminTimeout;
            private ConfigNodePropertyBoolean _OrgApacheFelixEventadminRequireTopic;
            private ConfigNodePropertyArray _OrgApacheFelixEventadminIgnoreTimeout;
            private ConfigNodePropertyArray _OrgApacheFelixEventadminIgnoreTopic;

            internal OrgApacheFelixEventadminImplEventAdminPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminProperties.OrgApacheFelixEventadminThreadPoolSize property.
            /// </summary>
            /// <param name="value">OrgApacheFelixEventadminThreadPoolSize</param>
            public OrgApacheFelixEventadminImplEventAdminPropertiesBuilder OrgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixEventadminThreadPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminProperties.OrgApacheFelixEventadminAsyncToSyncThreadRatio property.
            /// </summary>
            /// <param name="value">OrgApacheFelixEventadminAsyncToSyncThreadRatio</param>
            public OrgApacheFelixEventadminImplEventAdminPropertiesBuilder OrgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat value)
            {
                _OrgApacheFelixEventadminAsyncToSyncThreadRatio = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminProperties.OrgApacheFelixEventadminTimeout property.
            /// </summary>
            /// <param name="value">OrgApacheFelixEventadminTimeout</param>
            public OrgApacheFelixEventadminImplEventAdminPropertiesBuilder OrgApacheFelixEventadminTimeout(ConfigNodePropertyInteger value)
            {
                _OrgApacheFelixEventadminTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminProperties.OrgApacheFelixEventadminRequireTopic property.
            /// </summary>
            /// <param name="value">OrgApacheFelixEventadminRequireTopic</param>
            public OrgApacheFelixEventadminImplEventAdminPropertiesBuilder OrgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean value)
            {
                _OrgApacheFelixEventadminRequireTopic = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminProperties.OrgApacheFelixEventadminIgnoreTimeout property.
            /// </summary>
            /// <param name="value">OrgApacheFelixEventadminIgnoreTimeout</param>
            public OrgApacheFelixEventadminImplEventAdminPropertiesBuilder OrgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixEventadminIgnoreTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixEventadminImplEventAdminProperties.OrgApacheFelixEventadminIgnoreTopic property.
            /// </summary>
            /// <param name="value">OrgApacheFelixEventadminIgnoreTopic</param>
            public OrgApacheFelixEventadminImplEventAdminPropertiesBuilder OrgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray value)
            {
                _OrgApacheFelixEventadminIgnoreTopic = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixEventadminImplEventAdminProperties.
            /// </summary>
            /// <returns>OrgApacheFelixEventadminImplEventAdminProperties</returns>
            public OrgApacheFelixEventadminImplEventAdminProperties Build()
            {
                Validate();
                return new OrgApacheFelixEventadminImplEventAdminProperties(
                    OrgApacheFelixEventadminThreadPoolSize: _OrgApacheFelixEventadminThreadPoolSize,
                    OrgApacheFelixEventadminAsyncToSyncThreadRatio: _OrgApacheFelixEventadminAsyncToSyncThreadRatio,
                    OrgApacheFelixEventadminTimeout: _OrgApacheFelixEventadminTimeout,
                    OrgApacheFelixEventadminRequireTopic: _OrgApacheFelixEventadminRequireTopic,
                    OrgApacheFelixEventadminIgnoreTimeout: _OrgApacheFelixEventadminIgnoreTimeout,
                    OrgApacheFelixEventadminIgnoreTopic: _OrgApacheFelixEventadminIgnoreTopic
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}