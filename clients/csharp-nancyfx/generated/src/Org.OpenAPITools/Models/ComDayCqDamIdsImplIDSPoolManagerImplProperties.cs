using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamIdsImplIDSPoolManagerImplProperties
    /// </summary>
    public sealed class ComDayCqDamIdsImplIDSPoolManagerImplProperties:  IEquatable<ComDayCqDamIdsImplIDSPoolManagerImplProperties>
    { 
        /// <summary>
        /// MaxErrorsToBlacklist
        /// </summary>
        public ConfigNodePropertyInteger MaxErrorsToBlacklist { get; private set; }

        /// <summary>
        /// RetryIntervalToWhitelist
        /// </summary>
        public ConfigNodePropertyInteger RetryIntervalToWhitelist { get; private set; }

        /// <summary>
        /// ConnectTimeout
        /// </summary>
        public ConfigNodePropertyInteger ConnectTimeout { get; private set; }

        /// <summary>
        /// SocketTimeout
        /// </summary>
        public ConfigNodePropertyInteger SocketTimeout { get; private set; }

        /// <summary>
        /// ProcessLabel
        /// </summary>
        public ConfigNodePropertyString ProcessLabel { get; private set; }

        /// <summary>
        /// ConnectionUseMax
        /// </summary>
        public ConfigNodePropertyInteger ConnectionUseMax { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamIdsImplIDSPoolManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamIdsImplIDSPoolManagerImplProperties()
        {
        }

        private ComDayCqDamIdsImplIDSPoolManagerImplProperties(ConfigNodePropertyInteger MaxErrorsToBlacklist, ConfigNodePropertyInteger RetryIntervalToWhitelist, ConfigNodePropertyInteger ConnectTimeout, ConfigNodePropertyInteger SocketTimeout, ConfigNodePropertyString ProcessLabel, ConfigNodePropertyInteger ConnectionUseMax)
        {
            
            this.MaxErrorsToBlacklist = MaxErrorsToBlacklist;
            
            this.RetryIntervalToWhitelist = RetryIntervalToWhitelist;
            
            this.ConnectTimeout = ConnectTimeout;
            
            this.SocketTimeout = SocketTimeout;
            
            this.ProcessLabel = ProcessLabel;
            
            this.ConnectionUseMax = ConnectionUseMax;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamIdsImplIDSPoolManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder</returns>
        public static ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder</returns>
        public ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder With()
        {
            return Builder()
                .MaxErrorsToBlacklist(MaxErrorsToBlacklist)
                .RetryIntervalToWhitelist(RetryIntervalToWhitelist)
                .ConnectTimeout(ConnectTimeout)
                .SocketTimeout(SocketTimeout)
                .ProcessLabel(ProcessLabel)
                .ConnectionUseMax(ConnectionUseMax);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamIdsImplIDSPoolManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamIdsImplIDSPoolManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSPoolManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSPoolManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamIdsImplIDSPoolManagerImplProperties left, ComDayCqDamIdsImplIDSPoolManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamIdsImplIDSPoolManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamIdsImplIDSPoolManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamIdsImplIDSPoolManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamIdsImplIDSPoolManagerImplProperties left, ComDayCqDamIdsImplIDSPoolManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamIdsImplIDSPoolManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxErrorsToBlacklist;
            private ConfigNodePropertyInteger _RetryIntervalToWhitelist;
            private ConfigNodePropertyInteger _ConnectTimeout;
            private ConfigNodePropertyInteger _SocketTimeout;
            private ConfigNodePropertyString _ProcessLabel;
            private ConfigNodePropertyInteger _ConnectionUseMax;

            internal ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplProperties.MaxErrorsToBlacklist property.
            /// </summary>
            /// <param name="value">MaxErrorsToBlacklist</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder MaxErrorsToBlacklist(ConfigNodePropertyInteger value)
            {
                _MaxErrorsToBlacklist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplProperties.RetryIntervalToWhitelist property.
            /// </summary>
            /// <param name="value">RetryIntervalToWhitelist</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder RetryIntervalToWhitelist(ConfigNodePropertyInteger value)
            {
                _RetryIntervalToWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplProperties.ConnectTimeout property.
            /// </summary>
            /// <param name="value">ConnectTimeout</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder ConnectTimeout(ConfigNodePropertyInteger value)
            {
                _ConnectTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplProperties.SocketTimeout property.
            /// </summary>
            /// <param name="value">SocketTimeout</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder SocketTimeout(ConfigNodePropertyInteger value)
            {
                _SocketTimeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplProperties.ProcessLabel property.
            /// </summary>
            /// <param name="value">ProcessLabel</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder ProcessLabel(ConfigNodePropertyString value)
            {
                _ProcessLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamIdsImplIDSPoolManagerImplProperties.ConnectionUseMax property.
            /// </summary>
            /// <param name="value">ConnectionUseMax</param>
            public ComDayCqDamIdsImplIDSPoolManagerImplPropertiesBuilder ConnectionUseMax(ConfigNodePropertyInteger value)
            {
                _ConnectionUseMax = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamIdsImplIDSPoolManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamIdsImplIDSPoolManagerImplProperties</returns>
            public ComDayCqDamIdsImplIDSPoolManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqDamIdsImplIDSPoolManagerImplProperties(
                    MaxErrorsToBlacklist: _MaxErrorsToBlacklist,
                    RetryIntervalToWhitelist: _RetryIntervalToWhitelist,
                    ConnectTimeout: _ConnectTimeout,
                    SocketTimeout: _SocketTimeout,
                    ProcessLabel: _ProcessLabel,
                    ConnectionUseMax: _ConnectionUseMax
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}