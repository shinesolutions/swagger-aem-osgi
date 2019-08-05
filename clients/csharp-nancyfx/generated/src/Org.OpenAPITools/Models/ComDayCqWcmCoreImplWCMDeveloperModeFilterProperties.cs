using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties:  IEquatable<ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties>
    { 
        /// <summary>
        /// WcmdevmodefilterEnabled
        /// </summary>
        public ConfigNodePropertyBoolean WcmdevmodefilterEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties()
        {
        }

        private ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(ConfigNodePropertyBoolean WcmdevmodefilterEnabled)
        {
            
            this.WcmdevmodefilterEnabled = WcmdevmodefilterEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder With()
        {
            return Builder()
                .WcmdevmodefilterEnabled(WcmdevmodefilterEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties left, ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties left, ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _WcmdevmodefilterEnabled;

            internal ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.WcmdevmodefilterEnabled property.
            /// </summary>
            /// <param name="value">WcmdevmodefilterEnabled</param>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesBuilder WcmdevmodefilterEnabled(ConfigNodePropertyBoolean value)
            {
                _WcmdevmodefilterEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties</returns>
            public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(
                    WcmdevmodefilterEnabled: _WcmdevmodefilterEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}