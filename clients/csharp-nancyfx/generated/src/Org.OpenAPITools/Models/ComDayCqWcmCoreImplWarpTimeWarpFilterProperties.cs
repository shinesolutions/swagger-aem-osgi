using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplWarpTimeWarpFilterProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties:  IEquatable<ComDayCqWcmCoreImplWarpTimeWarpFilterProperties>
    { 
        /// <summary>
        /// FilterOrder
        /// </summary>
        public ConfigNodePropertyString FilterOrder { get; private set; }

        /// <summary>
        /// FilterScope
        /// </summary>
        public ConfigNodePropertyString FilterScope { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties()
        {
        }

        private ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(ConfigNodePropertyString FilterOrder, ConfigNodePropertyString FilterScope)
        {
            
            this.FilterOrder = FilterOrder;
            
            this.FilterScope = FilterScope;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder With()
        {
            return Builder()
                .FilterOrder(FilterOrder)
                .FilterScope(FilterScope);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplWarpTimeWarpFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties left, ComDayCqWcmCoreImplWarpTimeWarpFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplWarpTimeWarpFilterProperties left, ComDayCqWcmCoreImplWarpTimeWarpFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder
        {
            private ConfigNodePropertyString _FilterOrder;
            private ConfigNodePropertyString _FilterScope;

            internal ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.FilterOrder property.
            /// </summary>
            /// <param name="value">FilterOrder</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder FilterOrder(ConfigNodePropertyString value)
            {
                _FilterOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.FilterScope property.
            /// </summary>
            /// <param name="value">FilterScope</param>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder FilterScope(ConfigNodePropertyString value)
            {
                _FilterScope = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplWarpTimeWarpFilterProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplWarpTimeWarpFilterProperties</returns>
            public ComDayCqWcmCoreImplWarpTimeWarpFilterProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplWarpTimeWarpFilterProperties(
                    FilterOrder: _FilterOrder,
                    FilterScope: _FilterScope
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}