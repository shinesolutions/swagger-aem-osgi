using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreWCMRequestFilterProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreWCMRequestFilterProperties:  IEquatable<ComDayCqWcmCoreWCMRequestFilterProperties>
    { 
        /// <summary>
        /// WcmfilterMode
        /// </summary>
        public ConfigNodePropertyDropDown WcmfilterMode { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreWCMRequestFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreWCMRequestFilterProperties()
        {
        }

        private ComDayCqWcmCoreWCMRequestFilterProperties(ConfigNodePropertyDropDown WcmfilterMode)
        {
            
            this.WcmfilterMode = WcmfilterMode;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreWCMRequestFilterProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder</returns>
        public static ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder</returns>
        public ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder With()
        {
            return Builder()
                .WcmfilterMode(WcmfilterMode);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreWCMRequestFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreWCMRequestFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreWCMRequestFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreWCMRequestFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreWCMRequestFilterProperties left, ComDayCqWcmCoreWCMRequestFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreWCMRequestFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreWCMRequestFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreWCMRequestFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreWCMRequestFilterProperties left, ComDayCqWcmCoreWCMRequestFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreWCMRequestFilterProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _WcmfilterMode;

            internal ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreWCMRequestFilterProperties.WcmfilterMode property.
            /// </summary>
            /// <param name="value">WcmfilterMode</param>
            public ComDayCqWcmCoreWCMRequestFilterPropertiesBuilder WcmfilterMode(ConfigNodePropertyDropDown value)
            {
                _WcmfilterMode = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreWCMRequestFilterProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreWCMRequestFilterProperties</returns>
            public ComDayCqWcmCoreWCMRequestFilterProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreWCMRequestFilterProperties(
                    WcmfilterMode: _WcmfilterMode
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}