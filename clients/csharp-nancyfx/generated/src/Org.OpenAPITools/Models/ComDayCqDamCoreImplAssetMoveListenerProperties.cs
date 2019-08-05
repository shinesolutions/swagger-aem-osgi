using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAssetMoveListenerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplAssetMoveListenerProperties:  IEquatable<ComDayCqDamCoreImplAssetMoveListenerProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAssetMoveListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAssetMoveListenerProperties()
        {
        }

        private ComDayCqDamCoreImplAssetMoveListenerProperties(ConfigNodePropertyBoolean Enabled)
        {
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAssetMoveListenerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplAssetMoveListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAssetMoveListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetMoveListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetMoveListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAssetMoveListenerProperties left, ComDayCqDamCoreImplAssetMoveListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAssetMoveListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssetMoveListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssetMoveListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAssetMoveListenerProperties left, ComDayCqDamCoreImplAssetMoveListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAssetMoveListenerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;

            internal ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssetMoveListenerProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComDayCqDamCoreImplAssetMoveListenerPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAssetMoveListenerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAssetMoveListenerProperties</returns>
            public ComDayCqDamCoreImplAssetMoveListenerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAssetMoveListenerProperties(
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}