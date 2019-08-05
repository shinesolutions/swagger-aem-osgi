using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties
    /// </summary>
    public sealed class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties:  IEquatable<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties>
    { 
        /// <summary>
        /// UpgradeTaskIgnoreList
        /// </summary>
        public ConfigNodePropertyArray UpgradeTaskIgnoreList { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties()
        {
        }

        private ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(ConfigNodePropertyArray UpgradeTaskIgnoreList)
        {
            
            this.UpgradeTaskIgnoreList = UpgradeTaskIgnoreList;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder</returns>
        public static ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder Builder()
        {
            return new ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder</returns>
        public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder With()
        {
            return Builder()
                .UpgradeTaskIgnoreList(UpgradeTaskIgnoreList);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties left, ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties left, ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.
        /// </summary>
        public sealed class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder
        {
            private ConfigNodePropertyArray _UpgradeTaskIgnoreList;

            internal ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.UpgradeTaskIgnoreList property.
            /// </summary>
            /// <param name="value">UpgradeTaskIgnoreList</param>
            public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesBuilder UpgradeTaskIgnoreList(ConfigNodePropertyArray value)
            {
                _UpgradeTaskIgnoreList = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.
            /// </summary>
            /// <returns>ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties</returns>
            public ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties Build()
            {
                Validate();
                return new ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(
                    UpgradeTaskIgnoreList: _UpgradeTaskIgnoreList
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}