using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
    /// </summary>
    public sealed class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties:  IEquatable<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties>
    { 
        /// <summary>
        /// Codeupgradetasks
        /// </summary>
        public ConfigNodePropertyArray Codeupgradetasks { get; private set; }

        /// <summary>
        /// Codeupgradetaskfilters
        /// </summary>
        public ConfigNodePropertyArray Codeupgradetaskfilters { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties()
        {
        }

        private ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(ConfigNodePropertyArray Codeupgradetasks, ConfigNodePropertyArray Codeupgradetaskfilters)
        {
            
            this.Codeupgradetasks = Codeupgradetasks;
            
            this.Codeupgradetaskfilters = Codeupgradetaskfilters;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder</returns>
        public static ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder Builder()
        {
            return new ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder</returns>
        public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder With()
        {
            return Builder()
                .Codeupgradetasks(Codeupgradetasks)
                .Codeupgradetaskfilters(Codeupgradetaskfilters);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties left, ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</param>
        /// <param name="right">Compared (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties left, ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.
        /// </summary>
        public sealed class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder
        {
            private ConfigNodePropertyArray _Codeupgradetasks;
            private ConfigNodePropertyArray _Codeupgradetaskfilters;

            internal ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.Codeupgradetasks property.
            /// </summary>
            /// <param name="value">Codeupgradetasks</param>
            public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder Codeupgradetasks(ConfigNodePropertyArray value)
            {
                _Codeupgradetasks = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.Codeupgradetaskfilters property.
            /// </summary>
            /// <param name="value">Codeupgradetaskfilters</param>
            public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesBuilder Codeupgradetaskfilters(ConfigNodePropertyArray value)
            {
                _Codeupgradetaskfilters = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.
            /// </summary>
            /// <returns>ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties</returns>
            public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties Build()
            {
                Validate();
                return new ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(
                    Codeupgradetasks: _Codeupgradetasks,
                    Codeupgradetaskfilters: _Codeupgradetaskfilters
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}