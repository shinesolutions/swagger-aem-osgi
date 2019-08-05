using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties:  IEquatable<ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties>
    { 
        /// <summary>
        /// CqDamS7damDamchangeeventlistenerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqDamS7damDamchangeeventlistenerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties()
        {
        }

        private ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(ConfigNodePropertyBoolean CqDamS7damDamchangeeventlistenerEnabled)
        {
            
            this.CqDamS7damDamchangeeventlistenerEnabled = CqDamS7damDamchangeeventlistenerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder With()
        {
            return Builder()
                .CqDamS7damDamchangeeventlistenerEnabled(CqDamS7damDamchangeeventlistenerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties left, ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties left, ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamS7damDamchangeeventlistenerEnabled;

            internal ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.CqDamS7damDamchangeeventlistenerEnabled property.
            /// </summary>
            /// <param name="value">CqDamS7damDamchangeeventlistenerEnabled</param>
            public ComDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesBuilder CqDamS7damDamchangeeventlistenerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqDamS7damDamchangeeventlistenerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties</returns>
            public ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(
                    CqDamS7damDamchangeeventlistenerEnabled: _CqDamS7damDamchangeeventlistenerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}