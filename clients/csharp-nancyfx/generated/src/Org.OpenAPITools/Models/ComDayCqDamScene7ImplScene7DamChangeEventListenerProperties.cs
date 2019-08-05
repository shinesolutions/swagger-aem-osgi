using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties:  IEquatable<ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties>
    { 
        /// <summary>
        /// CqDamScene7DamchangeeventlistenerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqDamScene7DamchangeeventlistenerEnabled { get; private set; }

        /// <summary>
        /// CqDamScene7DamchangeeventlistenerObservedPaths
        /// </summary>
        public ConfigNodePropertyArray CqDamScene7DamchangeeventlistenerObservedPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties()
        {
        }

        private ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(ConfigNodePropertyBoolean CqDamScene7DamchangeeventlistenerEnabled, ConfigNodePropertyArray CqDamScene7DamchangeeventlistenerObservedPaths)
        {
            
            this.CqDamScene7DamchangeeventlistenerEnabled = CqDamScene7DamchangeeventlistenerEnabled;
            
            this.CqDamScene7DamchangeeventlistenerObservedPaths = CqDamScene7DamchangeeventlistenerObservedPaths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder</returns>
        public static ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder</returns>
        public ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder With()
        {
            return Builder()
                .CqDamScene7DamchangeeventlistenerEnabled(CqDamScene7DamchangeeventlistenerEnabled)
                .CqDamScene7DamchangeeventlistenerObservedPaths(CqDamScene7DamchangeeventlistenerObservedPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties left, ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties left, ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamScene7DamchangeeventlistenerEnabled;
            private ConfigNodePropertyArray _CqDamScene7DamchangeeventlistenerObservedPaths;

            internal ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.CqDamScene7DamchangeeventlistenerEnabled property.
            /// </summary>
            /// <param name="value">CqDamScene7DamchangeeventlistenerEnabled</param>
            public ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder CqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqDamScene7DamchangeeventlistenerEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.CqDamScene7DamchangeeventlistenerObservedPaths property.
            /// </summary>
            /// <param name="value">CqDamScene7DamchangeeventlistenerObservedPaths</param>
            public ComDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesBuilder CqDamScene7DamchangeeventlistenerObservedPaths(ConfigNodePropertyArray value)
            {
                _CqDamScene7DamchangeeventlistenerObservedPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties</returns>
            public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(
                    CqDamScene7DamchangeeventlistenerEnabled: _CqDamScene7DamchangeeventlistenerEnabled,
                    CqDamScene7DamchangeeventlistenerObservedPaths: _CqDamScene7DamchangeeventlistenerObservedPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}