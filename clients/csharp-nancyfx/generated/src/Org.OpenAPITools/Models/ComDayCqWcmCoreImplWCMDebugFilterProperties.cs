using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplWCMDebugFilterProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplWCMDebugFilterProperties:  IEquatable<ComDayCqWcmCoreImplWCMDebugFilterProperties>
    { 
        /// <summary>
        /// WcmdbgfilterEnabled
        /// </summary>
        public ConfigNodePropertyBoolean WcmdbgfilterEnabled { get; private set; }

        /// <summary>
        /// WcmdbgfilterJspDebug
        /// </summary>
        public ConfigNodePropertyBoolean WcmdbgfilterJspDebug { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplWCMDebugFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplWCMDebugFilterProperties()
        {
        }

        private ComDayCqWcmCoreImplWCMDebugFilterProperties(ConfigNodePropertyBoolean WcmdbgfilterEnabled, ConfigNodePropertyBoolean WcmdbgfilterJspDebug)
        {
            
            this.WcmdbgfilterEnabled = WcmdbgfilterEnabled;
            
            this.WcmdbgfilterJspDebug = WcmdbgfilterJspDebug;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplWCMDebugFilterProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder With()
        {
            return Builder()
                .WcmdbgfilterEnabled(WcmdbgfilterEnabled)
                .WcmdbgfilterJspDebug(WcmdbgfilterJspDebug);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplWCMDebugFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplWCMDebugFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDebugFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDebugFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplWCMDebugFilterProperties left, ComDayCqWcmCoreImplWCMDebugFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplWCMDebugFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDebugFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDebugFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplWCMDebugFilterProperties left, ComDayCqWcmCoreImplWCMDebugFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplWCMDebugFilterProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _WcmdbgfilterEnabled;
            private ConfigNodePropertyBoolean _WcmdbgfilterJspDebug;

            internal ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterProperties.WcmdbgfilterEnabled property.
            /// </summary>
            /// <param name="value">WcmdbgfilterEnabled</param>
            public ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder WcmdbgfilterEnabled(ConfigNodePropertyBoolean value)
            {
                _WcmdbgfilterEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDebugFilterProperties.WcmdbgfilterJspDebug property.
            /// </summary>
            /// <param name="value">WcmdbgfilterJspDebug</param>
            public ComDayCqWcmCoreImplWCMDebugFilterPropertiesBuilder WcmdbgfilterJspDebug(ConfigNodePropertyBoolean value)
            {
                _WcmdbgfilterJspDebug = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplWCMDebugFilterProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplWCMDebugFilterProperties</returns>
            public ComDayCqWcmCoreImplWCMDebugFilterProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplWCMDebugFilterProperties(
                    WcmdbgfilterEnabled: _WcmdbgfilterEnabled,
                    WcmdbgfilterJspDebug: _WcmdbgfilterJspDebug
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}